package com.euclideanspace.whitespaceblock.serializer;

import com.euclideanspace.whitespaceblock.services.DemoGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DemoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DemoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Recurse___LINECONTINUATIONTerminalRuleCall_1_3_or_SL_COMMENTTerminalRuleCall_1_2_or_WSTerminalRuleCall_1_1__a;
	protected AbstractElementAlias match_Recurse___LINECONTINUATIONTerminalRuleCall_1_3_or_SL_COMMENTTerminalRuleCall_1_2_or_WSTerminalRuleCall_1_1__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DemoGrammarAccess) access;
		match_Recurse___LINECONTINUATIONTerminalRuleCall_1_3_or_SL_COMMENTTerminalRuleCall_1_2_or_WSTerminalRuleCall_1_1__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getRecurseAccess().getLINECONTINUATIONTerminalRuleCall_1_3()), new TokenAlias(false, false, grammarAccess.getRecurseAccess().getSL_COMMENTTerminalRuleCall_1_2()), new TokenAlias(false, false, grammarAccess.getRecurseAccess().getWSTerminalRuleCall_1_1()));
		match_Recurse___LINECONTINUATIONTerminalRuleCall_1_3_or_SL_COMMENTTerminalRuleCall_1_2_or_WSTerminalRuleCall_1_1__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getRecurseAccess().getLINECONTINUATIONTerminalRuleCall_1_3()), new TokenAlias(false, false, grammarAccess.getRecurseAccess().getSL_COMMENTTerminalRuleCall_1_2()), new TokenAlias(false, false, grammarAccess.getRecurseAccess().getWSTerminalRuleCall_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLINECONTINUATIONRule())
			return getLINECONTINUATIONToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BEGIN : '{';
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal END : '}';
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal LINECONTINUATION : '\\';
	 */
	protected String getLINECONTINUATIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\\";
	}
	
	/**
	 * terminal SL_COMMENT 	: '#' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#";
	}
	
	/**
	 * terminal WS : (' '|'\t'|'\r'|'\n')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Recurse___LINECONTINUATIONTerminalRuleCall_1_3_or_SL_COMMENTTerminalRuleCall_1_2_or_WSTerminalRuleCall_1_1__a.equals(syntax))
				emit_Recurse___LINECONTINUATIONTerminalRuleCall_1_3_or_SL_COMMENTTerminalRuleCall_1_2_or_WSTerminalRuleCall_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Recurse___LINECONTINUATIONTerminalRuleCall_1_3_or_SL_COMMENTTerminalRuleCall_1_2_or_WSTerminalRuleCall_1_1__p.equals(syntax))
				emit_Recurse___LINECONTINUATIONTerminalRuleCall_1_3_or_SL_COMMENTTerminalRuleCall_1_2_or_WSTerminalRuleCall_1_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (WS | SL_COMMENT | LINECONTINUATION)*
	 */
	protected void emit_Recurse___LINECONTINUATIONTerminalRuleCall_1_3_or_SL_COMMENTTerminalRuleCall_1_2_or_WSTerminalRuleCall_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (WS | SL_COMMENT | LINECONTINUATION)+
	 */
	protected void emit_Recurse___LINECONTINUATIONTerminalRuleCall_1_3_or_SL_COMMENTTerminalRuleCall_1_2_or_WSTerminalRuleCall_1_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
