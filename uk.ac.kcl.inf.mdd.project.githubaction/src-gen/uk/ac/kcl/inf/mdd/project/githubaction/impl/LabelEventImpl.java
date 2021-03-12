/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType;
import uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.LabelEventImpl#getActivityTypes <em>Activity Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelEventImpl extends WebhookEventImpl implements LabelEvent {
	/**
	 * The cached value of the '{@link #getActivityTypes() <em>Activity Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<LabelActivityType> activityTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.LABEL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LabelActivityType> getActivityTypes() {
		if (activityTypes == null) {
			activityTypes = new EDataTypeUniqueEList<LabelActivityType>(LabelActivityType.class, this,
					GithubactionPackage.LABEL_EVENT__ACTIVITY_TYPES);
		}
		return activityTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GithubactionPackage.LABEL_EVENT__ACTIVITY_TYPES:
			return getActivityTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GithubactionPackage.LABEL_EVENT__ACTIVITY_TYPES:
			getActivityTypes().clear();
			getActivityTypes().addAll((Collection<? extends LabelActivityType>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GithubactionPackage.LABEL_EVENT__ACTIVITY_TYPES:
			getActivityTypes().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GithubactionPackage.LABEL_EVENT__ACTIVITY_TYPES:
			return activityTypes != null && !activityTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (activityTypes: ");
		result.append(activityTypes);
		result.append(')');
		return result.toString();
	}

} //LabelEventImpl
