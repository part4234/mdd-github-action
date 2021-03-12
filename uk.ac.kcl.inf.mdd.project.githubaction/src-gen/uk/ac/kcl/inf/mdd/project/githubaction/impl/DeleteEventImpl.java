/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.kcl.inf.mdd.project.githubaction.DeleteEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DeleteEventImpl extends WebhookEventImpl implements DeleteEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.DELETE_EVENT;
	}

} //DeleteEventImpl
