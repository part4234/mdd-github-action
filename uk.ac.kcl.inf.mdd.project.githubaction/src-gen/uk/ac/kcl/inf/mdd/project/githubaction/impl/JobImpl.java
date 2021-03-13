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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mdd.project.githubaction.Env;
import uk.ac.kcl.inf.mdd.project.githubaction.Environment;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.Job;
import uk.ac.kcl.inf.mdd.project.githubaction.RunSetting;
import uk.ac.kcl.inf.mdd.project.githubaction.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl#getJobName <em>Job Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl#getRunsOn <em>Runs On</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl#getNeeds <em>Needs</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl#getIf <em>If</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
	/**
	 * The default value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobName() <em>Job Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobName()
	 * @generated
	 * @ordered
	 */
	protected String jobName = JOB_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

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
	 * The default value of the '{@link #getRunsOn() <em>Runs On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsOn()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunsOn() <em>Runs On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsOn()
	 * @generated
	 * @ordered
	 */
	protected String runsOn = RUNS_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNeeds() <em>Needs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeeds()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> needs;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outputs;

	/**
	 * The cached value of the '{@link #getDefaults() <em>Defaults</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaults()
	 * @generated
	 * @ordered
	 */
	protected EList<RunSetting> defaults;

	/**
	 * The default value of the '{@link #getIf() <em>If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected String if_ = IF_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobName() {
		return jobName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobName(String newJobName) {
		String oldJobName = jobName;
		jobName = newJobName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.JOB__JOB_NAME, oldJobName,
					jobName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, GithubactionPackage.JOB__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Env> getEnv() {
		if (env == null) {
			env = new EObjectContainmentEList<Env>(Env.class, this, GithubactionPackage.JOB__ENV);
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunsOn() {
		return runsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunsOn(String newRunsOn) {
		String oldRunsOn = runsOn;
		runsOn = newRunsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.JOB__RUNS_ON, oldRunsOn, runsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getNeeds() {
		if (needs == null) {
			needs = new EObjectResolvingEList<Job>(Job.class, this, GithubactionPackage.JOB__NEEDS);
		}
		return needs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject) environment;
			environment = (Environment) eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GithubactionPackage.JOB__ENVIRONMENT,
							oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment basicGetEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnvironment(Environment newEnvironment) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.JOB__ENVIRONMENT, oldEnvironment,
					environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOutputs() {
		if (outputs == null) {
			outputs = new EDataTypeUniqueEList<String>(String.class, this, GithubactionPackage.JOB__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RunSetting> getDefaults() {
		if (defaults == null) {
			defaults = new EObjectContainmentEList<RunSetting>(RunSetting.class, this,
					GithubactionPackage.JOB__DEFAULTS);
		}
		return defaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIf(String newIf) {
		String oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.JOB__IF, oldIf, if_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GithubactionPackage.JOB__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case GithubactionPackage.JOB__ENV:
			return ((InternalEList<?>) getEnv()).basicRemove(otherEnd, msgs);
		case GithubactionPackage.JOB__DEFAULTS:
			return ((InternalEList<?>) getDefaults()).basicRemove(otherEnd, msgs);
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
		case GithubactionPackage.JOB__JOB_NAME:
			return getJobName();
		case GithubactionPackage.JOB__STEPS:
			return getSteps();
		case GithubactionPackage.JOB__ENV:
			return getEnv();
		case GithubactionPackage.JOB__RUNS_ON:
			return getRunsOn();
		case GithubactionPackage.JOB__NEEDS:
			return getNeeds();
		case GithubactionPackage.JOB__ENVIRONMENT:
			if (resolve)
				return getEnvironment();
			return basicGetEnvironment();
		case GithubactionPackage.JOB__OUTPUTS:
			return getOutputs();
		case GithubactionPackage.JOB__DEFAULTS:
			return getDefaults();
		case GithubactionPackage.JOB__IF:
			return getIf();
		case GithubactionPackage.JOB__NAME:
			return getName();
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
		case GithubactionPackage.JOB__JOB_NAME:
			setJobName((String) newValue);
			return;
		case GithubactionPackage.JOB__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case GithubactionPackage.JOB__ENV:
			getEnv().clear();
			getEnv().addAll((Collection<? extends Env>) newValue);
			return;
		case GithubactionPackage.JOB__RUNS_ON:
			setRunsOn((String) newValue);
			return;
		case GithubactionPackage.JOB__NEEDS:
			getNeeds().clear();
			getNeeds().addAll((Collection<? extends Job>) newValue);
			return;
		case GithubactionPackage.JOB__ENVIRONMENT:
			setEnvironment((Environment) newValue);
			return;
		case GithubactionPackage.JOB__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends String>) newValue);
			return;
		case GithubactionPackage.JOB__DEFAULTS:
			getDefaults().clear();
			getDefaults().addAll((Collection<? extends RunSetting>) newValue);
			return;
		case GithubactionPackage.JOB__IF:
			setIf((String) newValue);
			return;
		case GithubactionPackage.JOB__NAME:
			setName((String) newValue);
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
		case GithubactionPackage.JOB__JOB_NAME:
			setJobName(JOB_NAME_EDEFAULT);
			return;
		case GithubactionPackage.JOB__STEPS:
			getSteps().clear();
			return;
		case GithubactionPackage.JOB__ENV:
			getEnv().clear();
			return;
		case GithubactionPackage.JOB__RUNS_ON:
			setRunsOn(RUNS_ON_EDEFAULT);
			return;
		case GithubactionPackage.JOB__NEEDS:
			getNeeds().clear();
			return;
		case GithubactionPackage.JOB__ENVIRONMENT:
			setEnvironment((Environment) null);
			return;
		case GithubactionPackage.JOB__OUTPUTS:
			getOutputs().clear();
			return;
		case GithubactionPackage.JOB__DEFAULTS:
			getDefaults().clear();
			return;
		case GithubactionPackage.JOB__IF:
			setIf(IF_EDEFAULT);
			return;
		case GithubactionPackage.JOB__NAME:
			setName(NAME_EDEFAULT);
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
		case GithubactionPackage.JOB__JOB_NAME:
			return JOB_NAME_EDEFAULT == null ? jobName != null : !JOB_NAME_EDEFAULT.equals(jobName);
		case GithubactionPackage.JOB__STEPS:
			return steps != null && !steps.isEmpty();
		case GithubactionPackage.JOB__ENV:
			return env != null && !env.isEmpty();
		case GithubactionPackage.JOB__RUNS_ON:
			return RUNS_ON_EDEFAULT == null ? runsOn != null : !RUNS_ON_EDEFAULT.equals(runsOn);
		case GithubactionPackage.JOB__NEEDS:
			return needs != null && !needs.isEmpty();
		case GithubactionPackage.JOB__ENVIRONMENT:
			return environment != null;
		case GithubactionPackage.JOB__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case GithubactionPackage.JOB__DEFAULTS:
			return defaults != null && !defaults.isEmpty();
		case GithubactionPackage.JOB__IF:
			return IF_EDEFAULT == null ? if_ != null : !IF_EDEFAULT.equals(if_);
		case GithubactionPackage.JOB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (jobName: ");
		result.append(jobName);
		result.append(", runsOn: ");
		result.append(runsOn);
		result.append(", outputs: ");
		result.append(outputs);
		result.append(", if: ");
		result.append(if_);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //JobImpl
