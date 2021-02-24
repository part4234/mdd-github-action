/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.PushEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PushEventImpl extends BranchEventImpl implements PushEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.PUSH_EVENT;
	}

} //PushEventImpl
