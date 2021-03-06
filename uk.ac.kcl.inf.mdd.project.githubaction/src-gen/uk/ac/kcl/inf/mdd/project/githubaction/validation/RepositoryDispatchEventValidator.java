/**
 *
 * $Id$
 */
package uk.ac.kcl.inf.mdd.project.githubaction.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RepositoryDispatchEventValidator {
	boolean validate();

	boolean validateEventTypes(EList<String> value);
}
