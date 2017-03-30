package org.muml.uppaal.serialization

import org.muml.uppaal.expressions.CompareOperator
import org.muml.uppaal.expressions.Expression
import org.muml.uppaal.requirements.DeadlockExpression
import org.muml.uppaal.requirements.LeadsToProperty
import org.muml.uppaal.requirements.PathQuantifier
import org.muml.uppaal.requirements.PropertyRepository
import org.muml.uppaal.requirements.TemporalOperator
import org.muml.uppaal.requirements.UnaryProperty

class UppaalPropertySerialization extends UppaalSerialization {
	def serializePropertyRepository(PropertyRepository it) '''«FOR i : properties ?:emptyList»
		«IF i.comment != null && i.comment != "\"no comment provided\"" »«comment(i.comment)»«ENDIF»
		«property(i)»
		
		«ENDFOR»'''
	
	def comment(String s) '''/*
 «s.replace("*/","* /")»
*/'''
	
	def dispatch property(LeadsToProperty it) '''«expression(leftExpression)» --> «expression(rightExpression)»'''
	
	def dispatch property(UnaryProperty it)'''«pathQuantifier(quantifier)»«temporalOperator(operator)» «expression(expression)»'''
	
	def dispatch expression(DeadlockExpression it)'''deadlock'''
	
	// set the precedence of DeadlockExpression to the precedence of identifiers
	override int precedence(Expression it) {
		switch (it) {
			case it instanceof DeadlockExpression: return 500
		}
		return super.precedence(it)
	}
	
	def temporalOperator(TemporalOperator op) {
		switch (op) {
			case TemporalOperator::FUTURE : '<>'
			case TemporalOperator::GLOBAL : '[]'
			default: ""
		}
	}
	
	def pathQuantifier(PathQuantifier op) {
		switch (op) {
			case PathQuantifier::EXISTS : 'E'
			case PathQuantifier::FORALL : 'A'
			default: ""
		}
	}
	
	override comparison(CompareOperator op) {
		switch (op) {
			case CompareOperator::EQUAL : '=='
			case CompareOperator::UNEQUAL : '!='
			case CompareOperator::GREATER : '>'
			case CompareOperator::GREATER_OR_EQUAL : '>='
			case CompareOperator::LESS : '<'
			case CompareOperator::LESS_OR_EQUAL : '<='
			default: ""
		}
	}
	
}