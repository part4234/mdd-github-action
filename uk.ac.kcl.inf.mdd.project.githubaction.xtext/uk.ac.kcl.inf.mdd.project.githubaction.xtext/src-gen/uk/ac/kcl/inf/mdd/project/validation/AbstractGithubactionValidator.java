/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mdd.project.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGithubactionValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage.eINSTANCE);
		return result;
	}
}
