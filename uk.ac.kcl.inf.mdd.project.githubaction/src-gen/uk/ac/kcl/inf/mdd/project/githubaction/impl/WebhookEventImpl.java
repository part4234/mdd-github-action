/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.WebhookEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Webhook Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class WebhookEventImpl extends EventImpl implements WebhookEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebhookEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.WEBHOOK_EVENT;
	}

} //WebhookEventImpl
