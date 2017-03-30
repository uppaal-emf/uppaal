package org.muml.uppaal.serialization

import org.muml.uppaal.NTA
import org.muml.uppaal.core.NamedElement
import org.muml.uppaal.declarations.ArrayInitializer
import org.muml.uppaal.declarations.CallType
import org.muml.uppaal.declarations.ChannelVariableDeclaration
import org.muml.uppaal.declarations.ClockVariableDeclaration
import org.muml.uppaal.declarations.DataVariableDeclaration
import org.muml.uppaal.declarations.DataVariablePrefix
import org.muml.uppaal.declarations.ExpressionInitializer
import org.muml.uppaal.declarations.Function
import org.muml.uppaal.declarations.FunctionDeclaration
import org.muml.uppaal.declarations.GlobalDeclarations
import org.muml.uppaal.declarations.LocalDeclarations
import org.muml.uppaal.declarations.Parameter
import org.muml.uppaal.declarations.SystemDeclarations
import org.muml.uppaal.declarations.TypeDeclaration
import org.muml.uppaal.declarations.TypeIndex
import org.muml.uppaal.declarations.ValueIndex
import org.muml.uppaal.declarations.Variable
import org.muml.uppaal.declarations.VariableDeclaration
import org.muml.uppaal.declarations.global.ChannelList
import org.muml.uppaal.declarations.global.ChannelPriority
import org.muml.uppaal.declarations.global.DefaultChannelPriority
import org.muml.uppaal.declarations.system.InstantiationList
import org.muml.uppaal.declarations.system.ProgressMeasure
import org.muml.uppaal.declarations.system.System
import org.muml.uppaal.declarations.system.TemplateDeclaration
import org.muml.uppaal.expressions.ArithmeticExpression
import org.muml.uppaal.expressions.ArithmeticOperator
import org.muml.uppaal.expressions.AssignmentExpression
import org.muml.uppaal.expressions.AssignmentOperator
import org.muml.uppaal.expressions.BitShiftExpression
import org.muml.uppaal.expressions.BitShiftOperator
import org.muml.uppaal.expressions.BitwiseExpression
import org.muml.uppaal.expressions.BitwiseOperator
import org.muml.uppaal.expressions.CompareExpression
import org.muml.uppaal.expressions.CompareOperator
import org.muml.uppaal.expressions.ConditionExpression
import org.muml.uppaal.expressions.Expression
import org.muml.uppaal.expressions.FunctionCallExpression
import org.muml.uppaal.expressions.IdentifierExpression
import org.muml.uppaal.expressions.IncrementDecrementExpression
import org.muml.uppaal.expressions.IncrementDecrementOperator
import org.muml.uppaal.expressions.IncrementDecrementPosition
import org.muml.uppaal.expressions.LiteralExpression
import org.muml.uppaal.expressions.LogicalExpression
import org.muml.uppaal.expressions.LogicalOperator
import org.muml.uppaal.expressions.MinMaxExpression
import org.muml.uppaal.expressions.MinMaxOperator
import org.muml.uppaal.expressions.MinusExpression
import org.muml.uppaal.expressions.NegationExpression
import org.muml.uppaal.expressions.PlusExpression
import org.muml.uppaal.expressions.QuantificationExpression
import org.muml.uppaal.expressions.Quantifier
import org.muml.uppaal.expressions.ScopedIdentifierExpression
import org.muml.uppaal.statements.Block
import org.muml.uppaal.statements.DoWhileLoop
import org.muml.uppaal.statements.EmptyStatement
import org.muml.uppaal.statements.ExpressionStatement
import org.muml.uppaal.statements.ForLoop
import org.muml.uppaal.statements.IfStatement
import org.muml.uppaal.statements.Iteration
import org.muml.uppaal.statements.ReturnStatement
import org.muml.uppaal.statements.WhileLoop
import org.muml.uppaal.templates.AbstractTemplate
import org.muml.uppaal.templates.Edge
import org.muml.uppaal.templates.Location
import org.muml.uppaal.templates.LocationKind
import org.muml.uppaal.templates.Selection
import org.muml.uppaal.templates.Synchronization
import org.muml.uppaal.templates.SynchronizationKind
import org.muml.uppaal.templates.Template
import org.muml.uppaal.types.DeclaredType
import org.muml.uppaal.types.RangeTypeSpecification
import org.muml.uppaal.types.ScalarTypeSpecification
import org.muml.uppaal.types.StructTypeSpecification
import org.muml.uppaal.types.Type
import org.muml.uppaal.types.TypeReference
import org.muml.uppaal.visuals.ColorKind

class UppaalSerialization {
	var moveEdgeLabelsAway = false;
	
	def setMoveEdgeLabelsAway(boolean state) {
		moveEdgeLabelsAway = state;
	}
	
	// create root
	def main(NTA it) '''
	<?xml version="1.0" encoding="utf-8"?>
	<!DOCTYPE nta PUBLIC '-//Uppaal Team//DTD Flat System 1.1//EN' 'http://www.it.uu.se/research/group/darts/uppaal/flat-1_1.dtd'>
		<nta>
			<declaration>
	«declarations(globalDeclarations)»
			</declaration>
	«FOR i : template ?:emptyList»«template(i)»«ENDFOR»
			<system>
	«declarations(systemDeclarations)»
			</system>
		</nta>
	'''
	
	/* generate declarations */
	
	def dispatch declarations(Void it) ''''''
	
	def dispatch declarations(GlobalDeclarations it) '''
	«FOR i : declaration ?:emptyList»
		«declaration(i)»

		«ENDFOR»
	«channelPriority(channelPriority)»'''
	
	def dispatch declarations(LocalDeclarations it) '''«FOR i : declaration ?:emptyList»
		«declaration(i)»
		
		«ENDFOR»'''
	
	def dispatch declarations(SystemDeclarations it) '''«FOR i : declaration ?:emptyList»
		«declaration(i)»
		
		«ENDFOR»
	«system(system)»
	«IF progressMeasure != null»«progressMeasure(progressMeasure)»«ENDIF»'''
	
	def dispatch declaration(Void it) ''''''
	
	def dispatch declaration(FunctionDeclaration it) '''«function(function)»'''
	
	def function(Function it) '''«typedefinition(returnType)» «name»(«FOR i : parameter ?:emptyList SEPARATOR ', '»«parameter(i)»«ENDFOR») «block(block)»'''
	
	def dispatch block(Block it) '''{
	«FOR i : if (declarations == null) emptyList else (declarations.declaration ?: emptyList)»
	«declaration(i)»
	«ENDFOR»
	«FOR i : statement ?:emptyList»
	«statement(i)»
	«ENDFOR»
}'''
	
	def dispatch declaration(TypeDeclaration it) '''typedef «typedefinition(typeDefinition)» «FOR DeclaredType i : type ?:emptyList SEPARATOR ', '»«typedeclaration(i)»«ENDFOR»;'''
	
	def typedeclaration(Type it) '''«typename(it)»«FOR i : index ?:emptyList»«index(i)»«ENDFOR»'''
	
	def dispatch declaration(VariableDeclaration it) '''«declaration(it, false)»;'''
	
	def declaration(VariableDeclaration it, Boolean callByReference)'''«prefix(it)»«typedefinition(typeDefinition)» «IF callByReference»&amp;«ENDIF»«FOR i : variable ?:emptyList SEPARATOR ', '»«variable(i)»«ENDFOR»'''
	
	def dispatch prefix(ClockVariableDeclaration it) ''''''
	
	def dispatch prefix(DataVariableDeclaration it) '''«IF prefix != DataVariablePrefix::NONE»«prefix.toString()» «ENDIF»'''
	
	def dispatch prefix(ChannelVariableDeclaration it) '''«IF broadcast»broadcast «ENDIF»«IF urgent»urgent «ENDIF»'''
	
	def dispatch declaration(TemplateDeclaration it) '''«name(declaredTemplate)»«IF declaredTemplate.parameter.size > 0»(«FOR i : declaredTemplate.parameter ?:emptyList SEPARATOR ', '»«parameter(i)»«ENDFOR»)«ENDIF» = «name(declaredTemplate.referredTemplate)»(«FOR i : argument ?:emptyList SEPARATOR ', '»«expression(i)»«ENDFOR»);'''
	
	def dispatch channelPriority(ChannelPriority it) '''chan priority «FOR i : item ?:emptyList SEPARATOR ' < '»«item(i)»«ENDFOR»;'''
	
	def dispatch channelPriority(Void it) ''''''
	
	def dispatch item(Void it) ''''''
	
	def dispatch item(ChannelList it) '''«FOR IdentifierExpression i : channelExpression ?:emptyList SEPARATOR ', '»«expression(i)»«ENDFOR»'''
	
	def dispatch item(DefaultChannelPriority it) '''default'''
	
	def dispatch typedefinition(Void it) '''
	'''
	
	def dispatch typedefinition(TypeReference it) '''«typename(referredType)»'''
	
	def dispatch typedefinition(RangeTypeSpecification it) '''«baseType.toString()»[«expression(bounds.lowerBound)»,«expression(bounds.upperBound)»]'''
	
	def dispatch typedefinition(ScalarTypeSpecification it) '''scalar [«expression(sizeExpression)»]'''
	
	def dispatch typedefinition(StructTypeSpecification it) '''struct {
	«FOR DataVariableDeclaration i : declaration ?:emptyList»
	«declaration(i)»
	«ENDFOR»
}'''
	
	def typename(Type it) '''«name»'''
	
	def variable(Variable it) '''«name(it)»«FOR i : index ?:emptyList»«index(i)»«ENDFOR»«IF initializer != null» = «initializer(initializer)»«ENDIF»'''
	
	def dispatch index(Void it) ''''''
	
	def dispatch index(ValueIndex it) '''[«expression(sizeExpression)»]'''
	
	def dispatch index(TypeIndex it) '''[«typedefinition(typeDefinition)»]'''
	
	def dispatch initializer(Void it) ''''''
	
	def dispatch initializer(ExpressionInitializer it) '''«expression(expression)»'''
	
	def dispatch initializer(ArrayInitializer it) '''{«FOR i : initializer ?:emptyList SEPARATOR ','»«initializer(i)»«ENDFOR»}'''
	
	/* define templates */
	def template(Template it) '''
	<template>
	<name>«name(it)»</name>
	«IF (parameter.size > 0)»
	<parameter>
	«FOR i : parameter ?:emptyList SEPARATOR ', '»«parameter(i)»«ENDFOR»
	</parameter>
	«ENDIF»
	<declaration>
	«declarations(declarations)»
	</declaration>	
	«FOR i : location ?:emptyList»«location(i)»«ENDFOR»
	<init ref="«init.name+"_"+name»"/>
	«FOR i : edge ?:emptyList»«edge(i)»«ENDFOR»
	</template>
	'''
	
	def parameter(Parameter it) '''«declaration(variableDeclaration, callType == CallType::CALL_BY_REFERENCE)»'''
	
	def id(Location it) '''«name»_«parentTemplate.name»'''
	
	def name(NamedElement it) '''«name.replaceAll('\\.','')»'''
	
	def location(Location it) '''
	<location id="«id(it)»" x="«if (position == null) "" else position.x»" y="«if (position == null) "" else position.y»" «IF colorToString(it) != null»color="«colorToString(it)»"«ENDIF»>
		<name>«name(it)»</name>
		«IF !(invariant == null)»<label kind="invariant">«expression(invariant)»</label>«ENDIF»
		«IF locationTimeKind == LocationKind::URGENT»<urgent/>«ENDIF»
		«IF locationTimeKind == LocationKind::COMMITED»<committed/>«ENDIF»
	</location>
	'''
	
	def colorToString(Location it) {
		if (color == null)
			return null;
		switch (color) {
			case ColorKind.BLACK: return "#000000"
			case ColorKind.BLUE: return "#0000ff"
			case ColorKind.CYAN: return "#00ffff"
			case ColorKind.DARKGREY: return "#a9a9a9"
			case ColorKind.DEFAULT: return null
			case ColorKind.GREEN: return "#00ff00"
			case ColorKind.LIGHTGREY: return "#c0c0c0"
			case ColorKind.MAGENTA: return "#ff00ff"
			case ColorKind.ORANGE: return "#ffa500"
			case ColorKind.PINK: return "#ffc0cb"
			case ColorKind.RED: return "#ff0000"
			case ColorKind.SELF_DEFINED: return colorCode
			case ColorKind.WHITE: return "#ffffff"
			case ColorKind.YELLOW: return "#ffff00"
			default: return null
		}
	}
	
	def edge(Edge it) '''
	<transition>
	<source ref="«id(source)»"/>
	<target ref="«id(target)»"/>
	«IF !(selection == null)»<label kind="select"«IF moveEdgeLabelsAway» x="-100" y="-100"«ENDIF»>«FOR i : selection ?:emptyList SEPARATOR ', '»«selection(i)»«ENDFOR»</label>«ENDIF»
	«IF !(guard == null)»<label kind="guard"«IF moveEdgeLabelsAway» x="-100" y="-100"«ENDIF»>«expression(guard)»</label>«ENDIF»
	«IF !(synchronization == null)»<label kind="synchronisation"«IF moveEdgeLabelsAway» x="-100" y="-100"«ENDIF»>«synchronization(synchronization)»</label>«ENDIF»
	«IF !(update == null)»<label kind="assignment"«IF moveEdgeLabelsAway» x="-100" y="-100"«ENDIF»>«FOR i : update ?:emptyList SEPARATOR ","»
	«expression(i)»
	«ENDFOR»</label>«ENDIF»
	«IF !(bendPoint == null)»«FOR i : bendPoint ?:emptyList»
	<nail x="«i.x»" y="«i.y»"/>
	«ENDFOR»«ENDIF»
	</transition>
	'''
	
	def selection(Selection it) '''«variable(variable.get(0))» : «typedefinition(typeDefinition)»'''
	
	def synchronization(Synchronization it) '''«expression(channelExpression)»«IF kind == SynchronizationKind::RECEIVE»?«ELSE»!«ENDIF»'''
	
	def dispatch statement(Void it) ''''''
	
	def dispatch statement(Block it) '''«block(it)»'''
	
	def dispatch statement(ExpressionStatement it) '''«expression(expression)»;'''
	
	def dispatch statement(EmptyStatement it) ''';'''
	
	def dispatch statement(ForLoop it) '''for(«expression(initialization)»; «expression(condition)»; «expression(iteration)») «IF !(statement instanceof Block)»
	«ENDIF»«statement(statement)»'''
	
	def dispatch statement(Iteration it) '''for(«variable(variable.get(0))» : «typedefinition(typeDefinition)») «IF !(statement instanceof Block)»
	«ENDIF»«statement(statement)»'''
	
	def dispatch statement(WhileLoop it) '''while(«expression(expression)») «IF !(statement instanceof Block)»
	«ENDIF»«statement(statement)»'''
	
	def dispatch statement(DoWhileLoop it) '''do «statement( statement)» while («expression(expression)»);'''
	
	def dispatch statement(IfStatement it) '''if(«expression(ifExpression)») «IF !(thenStatement instanceof Block)»
		«ENDIF»«statement(thenStatement)» 
«IF elseStatement != null»else «IF !(elseStatement instanceof Block)»
	«ENDIF»«statement(elseStatement)»«ENDIF»'''
	
	def dispatch statement(ReturnStatement it) '''return «IF returnExpression != null»«expression(returnExpression)»«ENDIF»;'''
	
	/* expressions */
	
	//Creates parentheses around the supplied expression if it has lower precedence than its parent
	def expressionOptionalParentheses(Expression it) '''«IF eContainer() instanceof Expression && precedence(it) < precedence(eContainer() as Expression)»(«expression(it)»)«ELSE»«expression(it)»«ENDIF»'''
	
	//Creates parentheses around the supplied expression if its precedence is lower than its parent's or it's equal and the parent operator is not associative. For non-associative left-associative operators, use it on the right hand side expression (see expression(ArithmeticExpression it) for example)
	def expressionOptionalParenthesesNonAssoc(Expression it) '''«IF eContainer() instanceof Expression && (precedence(it) < precedence(eContainer() as Expression) || precedence(it) == precedence(eContainer() as Expression) && !isAssociative(eContainer() as Expression))»(«expression(it)»)«ELSE»«expression(it)»«ENDIF»'''
	
	def dispatch expression(Void it) ''''''
	
	def dispatch expression(AssignmentExpression it) '''«expressionOptionalParentheses(firstExpr)» «assignment(operator)» «expressionOptionalParentheses(secondExpr)»'''
	
	def dispatch expression(IdentifierExpression it) '''«name(identifier)»«IF !index.isEmpty»[«FOR i : index ?:emptyList SEPARATOR ']['»«expression(i)»«ENDFOR»]«ENDIF»'''
	
	def dispatch expression(NegationExpression it) '''not «expressionOptionalParentheses(negatedExpression)»'''
	
	def dispatch expression(FunctionCallExpression it) '''«function.name»(«FOR i : argument ?:emptyList SEPARATOR ', '»«expression(i)»«ENDFOR»)'''
	
	def dispatch expression(LogicalExpression it) '''«expressionOptionalParentheses(firstExpr)» «operator.toString()» «expressionOptionalParenthesesNonAssoc(secondExpr)»'''
	
	def dispatch expression(CompareExpression it) '''«expressionOptionalParentheses(firstExpr)» «comparison(operator)» «expressionOptionalParenthesesNonAssoc(secondExpr)»'''
	
	def dispatch expression(ArithmeticExpression it) '''«expressionOptionalParentheses(firstExpr)»«arithmetic(operator)»«expressionOptionalParenthesesNonAssoc(secondExpr)»'''
	
	def dispatch expression(LiteralExpression it) '''«text»'''
	
	def dispatch expression(IncrementDecrementExpression it) '''«IF position==IncrementDecrementPosition::PRE»«operator(operator)»«ENDIF»«expressionOptionalParentheses(expression)»«IF position==IncrementDecrementPosition::POST»«operator(operator)»«ENDIF»'''
	
	def operator(IncrementDecrementOperator it) '''«IF it==IncrementDecrementOperator::INCREMENT»++«ENDIF»«IF it==IncrementDecrementOperator::DECREMENT»--«ENDIF»'''
	
	def dispatch expression(ConditionExpression it) '''«expressionOptionalParenthesesNonAssoc(ifExpression)» ? «expressionOptionalParentheses(thenExpression)» : «expressionOptionalParentheses(elseExpression)»'''
	
	def dispatch expression(ScopedIdentifierExpression it) '''«expressionOptionalParentheses(scope)».«expressionOptionalParentheses(identifier)»'''
	
	def dispatch expression(QuantificationExpression it) '''«quantifier(quantifier)» («variable(variable.get(0))» : «typedefinition(typeDefinition)») «expressionOptionalParentheses(expression)»'''
	
	def quantifier(Quantifier it) '''«IF it==Quantifier::UNIVERSAL»forall«ENDIF»«IF it==Quantifier::EXISTENTIAL»exists«ENDIF»'''
	
	def dispatch expression(PlusExpression it) '''+«expressionOptionalParentheses(confirmedExpression)»'''
	
	def dispatch expression(MinusExpression it) '''-«expressionOptionalParentheses(invertedExpression)»'''
	
	def dispatch expression(MinMaxExpression it) '''«expressionOptionalParentheses(firstExpr)» «IF operator == MinMaxOperator::MIN»<?«ENDIF»«IF operator == MinMaxOperator::MAX»>?«ENDIF» «expressionOptionalParenthesesNonAssoc(secondExpr)»'''
	
	def dispatch expression(BitwiseExpression it) '''«expressionOptionalParentheses(firstExpr)» «IF operator==BitwiseOperator::AND»&«ENDIF»«IF operator==BitwiseOperator::OR»|«ENDIF»«IF operator==BitwiseOperator::XOR»^«ENDIF» «expressionOptionalParentheses(secondExpr)»'''
	
	def dispatch expression(BitShiftExpression it) '''«expressionOptionalParentheses(firstExpr)» «IF operator==BitShiftOperator::LEFT»<<«ENDIF»«IF operator==BitShiftOperator::RIGHT»>>«ENDIF» «expressionOptionalParenthesesNonAssoc(secondExpr)»'''
	
	/* define system */
	def system(System it) '''system «FOR i : instantiationList ?:emptyList SEPARATOR ' < '»«instantiationList(i)»«ENDFOR»;'''
	
	def instantiationList(InstantiationList it) '''«FOR AbstractTemplate i : template ?:emptyList SEPARATOR ','»«name(i)»«ENDFOR»'''
	
	def progressMeasure(ProgressMeasure it) '''progress {«FOR i : expression ?:emptyList SEPARATOR ';'»«expression(i)»«ENDFOR»;}'''
	
	//Non-template "to-text" methods
	def assignment(AssignmentOperator op) {
		switch (op) {
			case AssignmentOperator::EQUAL : '='
			case AssignmentOperator::PLUS_EQUAL : '+='
			case AssignmentOperator::MINUS_EQUAL : '-='
			case AssignmentOperator::TIMES_EQUAL : '*='
			case AssignmentOperator::DIVIDE_EQUAL : '/='
			case AssignmentOperator::MODULO_EQUAL : '%='
			default: ""
		}
	}
	
	def comparison(CompareOperator op) {
		switch (op) {
			case CompareOperator::EQUAL : '=='
			case CompareOperator::UNEQUAL : '!='
			case CompareOperator::GREATER : '&gt;'
			case CompareOperator::GREATER_OR_EQUAL : '&gt;='
			case CompareOperator::LESS : '&lt;'
			case CompareOperator::LESS_OR_EQUAL : '&lt;='
			default: ""
		}
	}
	
	
	def arithmetic(ArithmeticOperator op) {
		switch (op) {
			case ArithmeticOperator::ADD : '+'
			case ArithmeticOperator::SUBTRACT : '-'
			case ArithmeticOperator::MULTIPLICATE : '*'
			case ArithmeticOperator::DIVIDE : '/'
			case ArithmeticOperator::MODULO : '%'
			default: ""
		}
	}
	
	//Returns false if the expression belongs to a (potentially) non-associative non-unary operator
	def boolean isAssociative(Expression it) {
		switch (it) {
			ArithmeticExpression: return operator == ArithmeticOperator::MULTIPLICATE || operator == ArithmeticOperator::ADD //left-associative
			ConditionExpression: return false //right-associative
			BitShiftExpression: return false //left-associative
			MinMaxExpression: return false //left-associative (associative for only min/only max, though)
			CompareExpression: return false //left-associative
			LogicalExpression: return operator != LogicalOperator::IMPLY //left-associative
		};
		
		return true;
	}
	
	//Operator precedence provider. Higher number implies higher precedence
	def int precedence(Expression it) {
		switch (it) { //listing 
			case it == null: return 1000
			
			case it instanceof IdentifierExpression: return 500
			case it instanceof ScopedIdentifierExpression: return 500
			case it instanceof LiteralExpression: return 500
			case it instanceof FunctionCallExpression: return 500
			
			case it instanceof IncrementDecrementExpression: return 300
			case it instanceof PlusExpression: return 300
			case it instanceof MinusExpression: return 300

			case it instanceof ArithmeticExpression && (
									(it as ArithmeticExpression).operator == ArithmeticOperator::MULTIPLICATE
									|| (it as ArithmeticExpression).operator == ArithmeticOperator::DIVIDE
									|| (it as ArithmeticExpression).operator == ArithmeticOperator::MODULO
								): return 290
			case it instanceof ArithmeticExpression && (
									(it as ArithmeticExpression).operator == ArithmeticOperator::SUBTRACT
									|| (it as ArithmeticExpression).operator == ArithmeticOperator::ADD
								): return 280
			
			
			case it instanceof BitShiftExpression: return 270
			case it instanceof MinMaxExpression: return 260
			case it instanceof CompareExpression && ((it as CompareExpression).operator == CompareOperator::EQUAL || (it as CompareExpression).operator == CompareOperator::UNEQUAL): return 250
			case it instanceof CompareExpression: return 245
			case it instanceof BitwiseExpression && (it as BitwiseExpression).operator == BitwiseOperator::AND: return 240
			case it instanceof BitwiseExpression && (it as BitwiseExpression).operator == BitwiseOperator::XOR: return 230
			case it instanceof BitwiseExpression && (it as BitwiseExpression).operator == BitwiseOperator::OR: return 220
			case it instanceof ConditionExpression: return 210
			
			case it instanceof AssignmentExpression: return 200
			
			case it instanceof NegationExpression: return 190
			case it instanceof LogicalExpression && (it as LogicalExpression).operator == LogicalOperator::AND: return 180
			case it instanceof LogicalExpression && (it as LogicalExpression).operator == LogicalOperator::OR: return 170
			case it instanceof LogicalExpression && (it as LogicalExpression).operator == LogicalOperator::IMPLY: return 170
			case it instanceof QuantificationExpression: return 160
		}
		
		return 0;
	}
}