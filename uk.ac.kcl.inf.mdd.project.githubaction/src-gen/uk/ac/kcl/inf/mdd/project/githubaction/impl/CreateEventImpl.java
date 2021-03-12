/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.kcl.inf.mdd.project.githubaction.CreateEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CreateEventImpl extends WebhookEventImpl implements CreateEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.CREATE_EVENT;
	}

} //CreateEventImpl
