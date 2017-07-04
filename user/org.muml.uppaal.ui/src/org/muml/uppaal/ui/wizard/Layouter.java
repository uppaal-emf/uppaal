package org.muml.uppaal.ui.wizard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.muml.graphviz.blackbox.GraphvizPlainLayouter;
import org.muml.graphviz.dot.DotEdge;
import org.muml.graphviz.dot.DotFactory;
import org.muml.graphviz.dot.DotGraph;
import org.muml.graphviz.dot.DotNode;
import org.muml.graphviz.dot.DotPackage;
import org.muml.graphviz.plain.PlainEdge;
import org.muml.graphviz.plain.PlainGraph;
import org.muml.graphviz.plain.PlainNode;
import org.muml.uppaal.templates.Edge;
import org.muml.uppaal.templates.Location;
import org.muml.uppaal.templates.Template;
import org.muml.uppaal.visuals.Point;
import org.muml.uppaal.visuals.VisualsFactory;
import org.muml.uppaal.visuals.VisualsPackage;

public class Layouter {
	
	public void layoutTemplate(Template template) {
		VisualsFactory factory = VisualsPackage.eINSTANCE.getVisualsFactory();
		
		Map<String, Location> locations = new HashMap<String, Location>();
		for (Location loc : template.getLocation()) 
			locations.put(loc.getName(), loc);
		Set<Edge> unsplinedEdges = new HashSet<Edge>(template.getEdge());

		//Create graph and run layouter
		DotGraph graph = createDotGraph(template);
		PlainGraph resultGraph = runLayouter(graph);
		
		//Interpret results for nodes
		for (PlainNode node : resultGraph.getNodes()) {
			Point pt = factory.createPoint();
			pt.setX(graphvizCoordToUppaalCoord(node.getPosition().getX()));
			pt.setY(graphvizCoordToUppaalCoord(node.getPosition().getY()));
			locations.get(node.getName()).setPosition(pt);
		}
		
		//Interpret results for edges
		for (PlainEdge edge : resultGraph.getEdges()) {
			Edge edgeToRemove = null;
			//Find fitting Uppaal edge to put spline points
			for (Edge uppaalEdge : unsplinedEdges) {
				if (uppaalEdge.getSource() != locations.get(edge.getSource().getName()) || uppaalEdge.getTarget() != locations.get(edge.getTarget().getName()))
					continue;
				for (org.muml.graphviz.util.Point pt : edge.getSplinePoints()) {
					Point uppaalPoint = factory.createPoint();
					uppaalPoint.setX(graphvizCoordToUppaalCoord(pt.getX()));
					uppaalPoint.setY(graphvizCoordToUppaalCoord(pt.getY()));
					uppaalEdge.getBendPoint().add(uppaalPoint);
				}
				edgeToRemove = uppaalEdge;
				break;
			}
			
			if (edgeToRemove != null)
				unsplinedEdges.remove(edgeToRemove);
		}
	}
	
	private int graphvizCoordToUppaalCoord(double val) {
		return (int)(val*120);
	}
	
	private DotGraph createDotGraph(Template template) {
		DotFactory factory = DotPackage.eINSTANCE.getDotFactory();
		DotGraph result = factory.createDotGraph();
		result.setDirectedGraph(true);
		
		HashMap<Location, DotNode> locTrace = new HashMap<Location, DotNode>();
		for (Location loc : template.getLocation()) {
			DotNode node = factory.createDotNode();
			node.setName(loc.getName());
			
			locTrace.put(loc, node);
			result.getNodes().add(node);
		}
		
		for (Edge edge : template.getEdge()) {
			DotEdge dotEdge = factory.createDirectedDotEdge();
			dotEdge.setSource(locTrace.get(edge.getSource()));
			dotEdge.setTarget(locTrace.get(edge.getTarget()));
			
			result.getEdges().add(dotEdge);
		}
		
		return result;
	}
	
	private PlainGraph runLayouter(DotGraph graph) {
		GraphvizPlainLayouter layouter = new GraphvizPlainLayouter();
		return layouter.layout(graph);
	}
}

