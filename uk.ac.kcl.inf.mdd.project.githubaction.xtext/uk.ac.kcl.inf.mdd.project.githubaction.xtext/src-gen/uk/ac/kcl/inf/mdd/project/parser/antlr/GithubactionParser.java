/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.project.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.inf.mdd.project.parser.antlr.internal.InternalGithubactionParser;
import uk.ac.kcl.inf.mdd.project.services.GithubactionGrammarAccess;

public class GithubactionParser extends AbstractAntlrParser {

	@Inject
	private GithubactionGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGithubactionParser createParser(XtextTokenStream stream) {
		return new InternalGithubactionParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Repository";
	}

	public GithubactionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GithubactionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
