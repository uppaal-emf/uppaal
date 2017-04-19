package nl.utwente.ewi.fmt.uppaalSMC;

import org.muml.uppaal.declarations.Parameter;
import org.muml.uppaal.expressions.Expression;
import org.muml.uppaal.serialization.UppaalSerialization;
import org.muml.uppaal.templates.Edge;
import org.muml.uppaal.templates.Location;
import org.muml.uppaal.templates.LocationKind;
import org.muml.uppaal.templates.Selection;
import org.muml.uppaal.templates.Template;
import org.muml.uppaal.types.Type;
import org.muml.uppaal.visuals.Point;

public class Serialization extends UppaalSerialization {
	@Override
	public CharSequence typename(Type t)
	{
		if (t instanceof DoubleType)
			return "double";
		return super.typename(t);
	}
	
	private CharSequence position(Point p)
	{
		if (p == null)
			return "";
		StringBuilder ret = new StringBuilder(" x=\"");
		ret.append(Integer.toString(p.getX()));
		ret.append("\" y=\"");
		ret.append(Integer.toString(p.getY()));
		ret.append('"');
		return ret;
	}
	
	@Override
	public CharSequence location(Location l)
	{
		StringBuilder b = new StringBuilder();
		if (l instanceof ChanceNode) {
			b = new StringBuilder("<branchpoint id=\"");
		} else if (l instanceof  ExponentialLocation) {
			b = new StringBuilder("<location id=\"");
		} else {
			return super.location(l);
		}
		b.append(id(l)).append('"');
		b.append(position(l.getPosition()));
		if (colorToString(l) != null) {
			b.append(" color=\"").append(colorToString(l)).append('"');
		}
		b.append('>');
		if (l instanceof ExponentialLocation) {
			b.append("<name>").append(name(l)).append("</name>");
			if (l.getInvariant() != null)
				b.append("<label kind=\"invariant\">").append(expression(l.getInvariant())).append("</label>");
			if (l.getLocationTimeKind() == LocationKind.URGENT)
				b.append("<urgent/>");
			if (l.getLocationTimeKind() == LocationKind.COMMITED)
				b.append("<committed/>");
			b.append("<label kind=\"exponentialrate\">");
			b.append(expression(((ExponentialLocation)l).getExitRate()));
			b.append("</label></location>");
		} else {
			b.append("</branchpoint>");
		}
		return b;
	}
	
	@Override
	public CharSequence edge(Edge e)
	{
		if (!(e instanceof ChanceEdge))
			return super.edge(e);
		StringBuilder ret = new StringBuilder("<transition><source ref=\"");
		ret.append(id(e.getSource()));
		ret.append("\"/><target ref=\"");
		ret.append(id(e.getTarget()));
		ret.append("\"/>");
		boolean first = true;
		if (e.getSelection() != null && !e.getSelection().isEmpty()) {
			ret.append("<label kind=\"select\">");
			for (Selection s : e.getSelection()) {
				if (!first) {
					ret.append(", ");
					first = false;
				}
				ret.append(selection(s));
			}
			ret.append("</label>");
		}
		first = true;
		if (e.getUpdate() != null && !e.getUpdate().isEmpty()) {
			ret.append("<label kind=\"assignment\">");
			for (Expression s : e.getUpdate()) {
				if (!first) {
					ret.append(", ");
					first = false;
				}
				ret.append(expression(s));
			}
			ret.append("</label>");
		}
		ret.append("<label kind=\"probability\">");
		ret.append(Integer.toString(((ChanceEdge)e).getWeight()));
		ret.append("</label></transition>");
		return ret;
	}
	
	public CharSequence template (Template t)
	{
		StringBuilder ret = new StringBuilder("<template><name>");
		ret.append(name(t));
		ret.append("</name>");
		if (!t.getParameter().isEmpty()) {
			boolean first = true;
			ret.append("<parameter>");
			for (Parameter p : t.getParameter()) {
				if (!first) {
					ret.append(", ");
					first = false;
				}
				ret.append(parameter(p));
			}
			ret.append("</parameter>");
		}
		ret.append("<declaration>");
		ret.append(declarations(t.getDeclarations()));
		ret.append("</declaration>");
		for (Location l : t.getLocation()) {
			if (!(l instanceof ChanceNode))
				ret.append(location(l));
		}
		for (Location l : t.getLocation()) {
			if (l instanceof ChanceNode)
				ret.append(location(l));
		}
		ret.append("<init ref=\"");
		ret.append(name(t.getInit()));
		ret.append('_');
		ret.append(t.getName());
		ret.append("\"/>");
		for (Edge e : t.getEdge())
			ret.append(edge(e));
		ret.append("</template>");
		return ret;
	}
}
