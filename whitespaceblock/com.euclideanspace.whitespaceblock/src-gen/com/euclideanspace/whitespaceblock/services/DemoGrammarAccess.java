/*
* generated by Xtext
*/
package com.euclideanspace.whitespaceblock.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class DemoGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cContentsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cContentsRecurseParserRuleCall_0 = (RuleCall)cContentsAssignment.eContents().get(0);
		
		//Model:
		//	contents+=Recurse;
		public ParserRule getRule() { return rule; }

		//contents+=Recurse
		public Assignment getContentsAssignment() { return cContentsAssignment; }

		//Recurse
		public RuleCall getContentsRecurseParserRuleCall_0() { return cContentsRecurseParserRuleCall_0; }
	}

	public class RecurseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Recurse");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRecurseAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cNAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cNIDTerminalRuleCall_1_0_0 = (RuleCall)cNAssignment_1_0.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cSL_COMMENTTerminalRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		private final RuleCall cLINECONTINUATIONTerminalRuleCall_1_3 = (RuleCall)cAlternatives_1.eContents().get(3);
		private final Group cGroup_1_4 = (Group)cAlternatives_1.eContents().get(4);
		private final RuleCall cBEGINTerminalRuleCall_1_4_0 = (RuleCall)cGroup_1_4.eContents().get(0);
		private final Assignment cRAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final RuleCall cRRecurseParserRuleCall_1_4_1_0 = (RuleCall)cRAssignment_1_4_1.eContents().get(0);
		private final RuleCall cENDTerminalRuleCall_1_4_2 = (RuleCall)cGroup_1_4.eContents().get(2);
		
		///////////////////////////// end of temporary terminals /////////////////////////
		//Recurse:
		//	{Recurse} (n+=ID | WS | SL_COMMENT | LINECONTINUATION | BEGIN r+=Recurse END)+;
		public ParserRule getRule() { return rule; }

		//{Recurse} (n+=ID | WS | SL_COMMENT | LINECONTINUATION | BEGIN r+=Recurse END)+
		public Group getGroup() { return cGroup; }

		//{Recurse}
		public Action getRecurseAction_0() { return cRecurseAction_0; }

		//(n+=ID | WS | SL_COMMENT | LINECONTINUATION | BEGIN r+=Recurse END)+
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//n+=ID
		public Assignment getNAssignment_1_0() { return cNAssignment_1_0; }

		//ID
		public RuleCall getNIDTerminalRuleCall_1_0_0() { return cNIDTerminalRuleCall_1_0_0; }

		//WS
		public RuleCall getWSTerminalRuleCall_1_1() { return cWSTerminalRuleCall_1_1; }

		//SL_COMMENT
		public RuleCall getSL_COMMENTTerminalRuleCall_1_2() { return cSL_COMMENTTerminalRuleCall_1_2; }

		//LINECONTINUATION
		public RuleCall getLINECONTINUATIONTerminalRuleCall_1_3() { return cLINECONTINUATIONTerminalRuleCall_1_3; }

		//BEGIN r+=Recurse END
		public Group getGroup_1_4() { return cGroup_1_4; }

		//BEGIN
		public RuleCall getBEGINTerminalRuleCall_1_4_0() { return cBEGINTerminalRuleCall_1_4_0; }

		//r+=Recurse
		public Assignment getRAssignment_1_4_1() { return cRAssignment_1_4_1; }

		//Recurse
		public RuleCall getRRecurseParserRuleCall_1_4_1_0() { return cRRecurseParserRuleCall_1_4_1_0; }

		//END
		public RuleCall getENDTerminalRuleCall_1_4_2() { return cENDTerminalRuleCall_1_4_2; }
	}
	
	
	private final ModelElements pModel;
	private final TerminalRule tID;
	private final TerminalRule tINT;
	private final TerminalRule tSTRING;
	private final TerminalRule tBEGIN;
	private final TerminalRule tEND;
	private final TerminalRule tLINECONTINUATION;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tANY_OTHER;
	private final RecurseElements pRecurse;
	
	private final Grammar grammar;

	@Inject
	public DemoGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING");
		this.tBEGIN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BEGIN");
		this.tEND = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "END");
		this.tLINECONTINUATION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LINECONTINUATION");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS");
		this.tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ANY_OTHER");
		this.pRecurse = new RecurseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.euclideanspace.whitespaceblock.Demo".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Model:
	//	contents+=Recurse;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	/// *
	// * Since I don't know how to compile common2.PythonTerminals I will temporarily put the terminals here
	// * / /////////////////////////// start of temporary terminals /////////////////////////
	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return tID;
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return tINT;
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	} 

	/// * phantom tokens:
	// * TODO Should really use something other than '{' and '}' to avoid clash in Python
	// * / terminal BEGIN:
	//	"{";
	public TerminalRule getBEGINRule() {
		return tBEGIN;
	} 

	//terminal END:
	//	"}";
	public TerminalRule getENDRule() {
		return tEND;
	} 

	/// * if newline follows this then ignore indent changes * / terminal LINECONTINUATION:
	//	"\\";
	public TerminalRule getLINECONTINUATIONRule() {
		return tLINECONTINUATION;
	} 

	/// *
	// * Comments start with hash.
	// * We need to specify that here because we want to allow comments with any indent
	// * and to avoid them being wrapped in a block.
	// * / terminal SL_COMMENT:
	//	"#" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	} 

	/// *
	// * We also don't want lines that contain only whitespace to affect the indent.
	// * / terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return tWS;
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return tANY_OTHER;
	} 

	///////////////////////////// end of temporary terminals /////////////////////////
	//Recurse:
	//	{Recurse} (n+=ID | WS | SL_COMMENT | LINECONTINUATION | BEGIN r+=Recurse END)+;
	public RecurseElements getRecurseAccess() {
		return pRecurse;
	}
	
	public ParserRule getRecurseRule() {
		return getRecurseAccess().getRule();
	}
}