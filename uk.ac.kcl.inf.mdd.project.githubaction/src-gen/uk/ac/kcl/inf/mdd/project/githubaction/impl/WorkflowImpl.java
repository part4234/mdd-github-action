/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mdd.project.githubaction.Env;
import uk.ac.kcl.inf.mdd.project.githubaction.Event;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.Job;
import uk.ac.kcl.inf.mdd.project.githubaction.RunSetting;
import uk.ac.kcl.inf.mdd.project.githubaction.Workflow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowImpl#getOn <em>On</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowImpl#getDefaults <em>Defaults</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements Workflow {
	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> jobs;

	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> on;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected EList<Env> env;

	/**
	 * The cached value of the '{@link #getDefaults() <em>Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaults()
	 * @generated
	 * @ordered
	 */
	protected RunSetting defaults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<Job>(Job.class, this, GithubactionPackage.WORKFLOW__JOBS);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getOn() {
		if (on == null) {
			on = new EObjectContainmentEList<Event>(Event.class, this, GithubactionPackage.WORKFLOW__ON);
		}
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.WORKFLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Env> getEnv() {
		if (env == null) {
			env = new EObjectContainmentEList<Env>(Env.class, this, GithubactionPackage.WORKFLOW__ENV);
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunSetting getDefaults() {
		return defaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaults(RunSetting newDefaults, NotificationChain msgs) {
		RunSetting oldDefaults = defaults;
		defaults = newDefaults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GithubactionPackage.WORKFLOW__DEFAULTS, oldDefaults, newDefaults);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaults(RunSetting newDefaults) {
		if (newDefaults != defaults) {
			NotificationChain msgs = null;
			if (defaults != null)
				msgs = ((InternalEObject) defaults).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GithubactionPackage.WORKFLOW__DEFAULTS, null, msgs);
			if (newDefaults != null)
				msgs = ((InternalEObject) newDefaults).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GithubactionPackage.WORKFLOW__DEFAULTS, null, msgs);
			msgs = basicSetDefaults(newDefaults, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.WORKFLOW__DEFAULTS, newDefaults,
					newDefaults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GithubactionPackage.WORKFLOW__JOBS:
			return ((InternalEList<?>) getJobs()).basicRemove(otherEnd, msgs);
		case GithubactionPackage.WORKFLOW__ON:
			return ((InternalEList<?>) getOn()).basicRemove(otherEnd, msgs);
		case GithubactionPackage.WORKFLOW__ENV:
			return ((InternalEList<?>) getEnv()).basicRemove(otherEnd, msgs);
		case GithubactionPackage.WORKFLOW__DEFAULTS:
			return basicSetDefaults(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GithubactionPackage.WORKFLOW__JOBS:
			return getJobs();
		case GithubactionPackage.WORKFLOW__ON:
			return getOn();
		case GithubactionPackage.WORKFLOW__NAME:
			return getName();
		case GithubactionPackage.WORKFLOW__ENV:
			return getEnv();
		case GithubactionPackage.WORKFLOW__DEFAULTS:
			return getDefaults();
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
		case GithubactionPackage.WORKFLOW__JOBS:
			getJobs().clear();
			getJobs().addAll((Collection<? extends Job>) newValue);
			return;
		case GithubactionPackage.WORKFLOW__ON:
			getOn().clear();
			getOn().addAll((Collection<? extends Event>) newValue);
			return;
		case GithubactionPackage.WORKFLOW__NAME:
			setName((String) newValue);
			return;
		case GithubactionPackage.WORKFLOW__ENV:
			getEnv().clear();
			getEnv().addAll((Collection<? extends Env>) newValue);
			return;
		case GithubactionPackage.WORKFLOW__DEFAULTS:
			setDefaults((RunSetting) newValue);
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
		case GithubactionPackage.WORKFLOW__JOBS:
			getJobs().clear();
			return;
		case GithubactionPackage.WORKFLOW__ON:
			getOn().clear();
			return;
		case GithubactionPackage.WORKFLOW__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GithubactionPackage.WORKFLOW__ENV:
			getEnv().clear();
			return;
		case GithubactionPackage.WORKFLOW__DEFAULTS:
			setDefaults((RunSetting) null);
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
		case GithubactionPackage.WORKFLOW__JOBS:
			return jobs != null && !jobs.isEmpty();
		case GithubactionPackage.WORKFLOW__ON:
			return on != null && !on.isEmpty();
		case GithubactionPackage.WORKFLOW__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GithubactionPackage.WORKFLOW__ENV:
			return env != null && !env.isEmpty();
		case GithubactionPackage.WORKFLOW__DEFAULTS:
			return defaults != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
