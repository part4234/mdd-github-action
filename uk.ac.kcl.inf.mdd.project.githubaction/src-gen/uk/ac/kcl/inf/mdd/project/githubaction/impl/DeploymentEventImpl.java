/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.kcl.inf.mdd.project.githubaction.DeploymentEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DeploymentEventImpl extends WebhookEventImpl implements DeploymentEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.DEPLOYMENT_EVENT;
	}

} //DeploymentEventImpl
