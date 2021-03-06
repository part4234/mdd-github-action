/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent#getActivityTypes <em>Activity Types</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getIssueEvent()
 * @model
 * @generated
 */
public interface IssueEvent extends WebhookEvent {
	/**
	 * Returns the value of the '<em><b>Activity Types</b></em>' attribute list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType}.
	 * The literals are from the enumeration {@link uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Types</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getIssueEvent_ActivityTypes()
	 * @model
	 * @generated
	 */
	EList<IssueActivityType> getActivityTypes();

} // IssueEvent
