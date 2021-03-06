/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Dispatch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getWorkflowDispatchEvent()
 * @model
 * @generated
 */
public interface WorkflowDispatchEvent extends ManualEvent {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.project.githubaction.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getWorkflowDispatchEvent_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

} // WorkflowDispatchEvent
