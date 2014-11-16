/*
* generated by Xtext
*/
package com.euclideanspace.whitespaceblock.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.euclideanspace.whitespaceblock.services.DemoGrammarAccess;

public class DemoParser extends AbstractContentAssistParser {
	
	@Inject
	private DemoGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.euclideanspace.whitespaceblock.ui.contentassist.antlr.internal.InternalDemoParser createParser() {
		com.euclideanspace.whitespaceblock.ui.contentassist.antlr.internal.InternalDemoParser result = new com.euclideanspace.whitespaceblock.ui.contentassist.antlr.internal.InternalDemoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRecurseAccess().getAlternatives_1(), "rule__Recurse__Alternatives_1");
					put(grammarAccess.getRecurseAccess().getGroup(), "rule__Recurse__Group__0");
					put(grammarAccess.getRecurseAccess().getGroup_1_4(), "rule__Recurse__Group_1_4__0");
					put(grammarAccess.getModelAccess().getContentsAssignment(), "rule__Model__ContentsAssignment");
					put(grammarAccess.getRecurseAccess().getNAssignment_1_0(), "rule__Recurse__NAssignment_1_0");
					put(grammarAccess.getRecurseAccess().getRAssignment_1_4_1(), "rule__Recurse__RAssignment_1_4_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.euclideanspace.whitespaceblock.ui.contentassist.antlr.internal.InternalDemoParser typedParser = (com.euclideanspace.whitespaceblock.ui.contentassist.antlr.internal.InternalDemoParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}
	
	public DemoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DemoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
