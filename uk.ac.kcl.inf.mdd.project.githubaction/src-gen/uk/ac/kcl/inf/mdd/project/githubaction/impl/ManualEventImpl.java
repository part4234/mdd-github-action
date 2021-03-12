/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import org.eclipse.emf.ecore.EClass;

import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.ManualEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manual Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ManualEventImpl extends EventImpl implements ManualEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.MANUAL_EVENT;
	}

} //ManualEventImpl
