/**
 *
 * $Id$
 */
package uk.ac.kcl.inf.mdd.project.githubaction.validation;

import org.eclipse.emf.common.util.EList;

import uk.ac.kcl.inf.mdd.project.githubaction.Input;

/**
 * A sample validator interface for {@link uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WorkflowDispatchEventValidator {
	boolean validate();

	boolean validateInputs(EList<Input> value);
}
