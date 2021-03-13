/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mdd.project.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.inf.mdd.project.GithubactionRuntimeModule;
import uk.ac.kcl.inf.mdd.project.GithubactionStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class GithubactionIdeSetup extends GithubactionStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new GithubactionRuntimeModule(), new GithubactionIdeModule()));
	}
	
}
