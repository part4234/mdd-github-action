/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.project.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GithubactionAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/inf/mdd/project/parser/antlr/internal/InternalGithubaction.tokens");
	}
}
