/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent#getActivityTypes <em>Activity Types</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getLabelEvent()
 * @model
 * @generated
 */
public interface LabelEvent extends WebhookEvent {
	/**
	 * Returns the value of the '<em><b>Activity Types</b></em>' attribute list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType}.
	 * The literals are from the enumeration {@link uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Types</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getLabelEvent_ActivityTypes()
	 * @model
	 * @generated
	 */
	EList<LabelActivityType> getActivityTypes();

} // LabelEvent