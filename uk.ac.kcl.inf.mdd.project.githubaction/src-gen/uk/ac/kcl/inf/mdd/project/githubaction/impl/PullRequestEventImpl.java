/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.PullRequestEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pull Request Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PullRequestEventImpl extends BranchEventImpl implements PullRequestEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PullRequestEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.PULL_REQUEST_EVENT;
	}

} //PullRequestEventImpl
