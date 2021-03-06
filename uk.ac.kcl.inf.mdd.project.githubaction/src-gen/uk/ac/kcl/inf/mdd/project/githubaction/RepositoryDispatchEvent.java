/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Dispatch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent#getEventTypes <em>Event Types</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getRepositoryDispatchEvent()
 * @model
 * @generated
 */
public interface RepositoryDispatchEvent extends ManualEvent {
	/**
	 * Returns the value of the '<em><b>Event Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Types</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getRepositoryDispatchEvent_EventTypes()
	 * @model
	 * @generated
	 */
	EList<String> getEventTypes();

} // RepositoryDispatchEvent
