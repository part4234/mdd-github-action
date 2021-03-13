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
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mdd.project.githubaction.Env;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.InputParameter;
import uk.ac.kcl.inf.mdd.project.githubaction.RunSetting;
import uk.ac.kcl.inf.mdd.project.githubaction.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl#getStepName <em>Step Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl#getRunSetting <em>Run Setting</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl#getIf <em>If</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl#getWith <em>With</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl#getRun <em>Run</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
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
	 * The default value of the '{@link #getStepName() <em>Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepName()
	 * @generated
	 * @ordered
	 */
	protected static final String STEP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStepName() <em>Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepName()
	 * @generated
	 * @ordered
	 */
	protected String stepName = STEP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUses() <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected static final String USES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected String uses = USES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRunSetting() <em>Run Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunSetting()
	 * @generated
	 * @ordered
	 */
	protected RunSetting runSetting;

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
	 * The cached value of the '{@link #getWith() <em>With</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith()
	 * @generated
	 * @ordered
	 */
	protected EList<InputParameter> with;

	/**
	 * The default value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRYPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected String entrypoint = ENTRYPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected String args = ARGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRun() <em>Run</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun()
	 * @generated
	 * @ordered
	 */
	protected EList<String> run;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Env> getEnv() {
		if (env == null) {
			env = new EObjectContainmentEList<Env>(Env.class, this, GithubactionPackage.STEP__ENV);
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStepName() {
		return stepName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepName(String newStepName) {
		String oldStepName = stepName;
		stepName = newStepName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.STEP__STEP_NAME, oldStepName,
					stepName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUses(String newUses) {
		String oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.STEP__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunSetting getRunSetting() {
		return runSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunSetting(RunSetting newRunSetting, NotificationChain msgs) {
		RunSetting oldRunSetting = runSetting;
		runSetting = newRunSetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GithubactionPackage.STEP__RUN_SETTING, oldRunSetting, newRunSetting);
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
	public void setRunSetting(RunSetting newRunSetting) {
		if (newRunSetting != runSetting) {
			NotificationChain msgs = null;
			if (runSetting != null)
				msgs = ((InternalEObject) runSetting).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GithubactionPackage.STEP__RUN_SETTING, null, msgs);
			if (newRunSetting != null)
				msgs = ((InternalEObject) newRunSetting).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GithubactionPackage.STEP__RUN_SETTING, null, msgs);
			msgs = basicSetRunSetting(newRunSetting, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.STEP__RUN_SETTING, newRunSetting,
					newRunSetting));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.STEP__IF, oldIf, if_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputParameter> getWith() {
		if (with == null) {
			with = new EObjectContainmentEList<InputParameter>(InputParameter.class, this,
					GithubactionPackage.STEP__WITH);
		}
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntrypoint() {
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntrypoint(String newEntrypoint) {
		String oldEntrypoint = entrypoint;
		entrypoint = newEntrypoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.STEP__ENTRYPOINT, oldEntrypoint,
					entrypoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgs(String newArgs) {
		String oldArgs = args;
		args = newArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.STEP__ARGS, oldArgs, args));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRun() {
		if (run == null) {
			run = new EDataTypeUniqueEList<String>(String.class, this, GithubactionPackage.STEP__RUN);
		}
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GithubactionPackage.STEP__ENV:
			return ((InternalEList<?>) getEnv()).basicRemove(otherEnd, msgs);
		case GithubactionPackage.STEP__RUN_SETTING:
			return basicSetRunSetting(null, msgs);
		case GithubactionPackage.STEP__WITH:
			return ((InternalEList<?>) getWith()).basicRemove(otherEnd, msgs);
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
		case GithubactionPackage.STEP__ENV:
			return getEnv();
		case GithubactionPackage.STEP__STEP_NAME:
			return getStepName();
		case GithubactionPackage.STEP__USES:
			return getUses();
		case GithubactionPackage.STEP__RUN_SETTING:
			return getRunSetting();
		case GithubactionPackage.STEP__NAME:
			return getName();
		case GithubactionPackage.STEP__IF:
			return getIf();
		case GithubactionPackage.STEP__WITH:
			return getWith();
		case GithubactionPackage.STEP__ENTRYPOINT:
			return getEntrypoint();
		case GithubactionPackage.STEP__ARGS:
			return getArgs();
		case GithubactionPackage.STEP__RUN:
			return getRun();
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
		case GithubactionPackage.STEP__ENV:
			getEnv().clear();
			getEnv().addAll((Collection<? extends Env>) newValue);
			return;
		case GithubactionPackage.STEP__STEP_NAME:
			setStepName((String) newValue);
			return;
		case GithubactionPackage.STEP__USES:
			setUses((String) newValue);
			return;
		case GithubactionPackage.STEP__RUN_SETTING:
			setRunSetting((RunSetting) newValue);
			return;
		case GithubactionPackage.STEP__NAME:
			setName((String) newValue);
			return;
		case GithubactionPackage.STEP__IF:
			setIf((String) newValue);
			return;
		case GithubactionPackage.STEP__WITH:
			getWith().clear();
			getWith().addAll((Collection<? extends InputParameter>) newValue);
			return;
		case GithubactionPackage.STEP__ENTRYPOINT:
			setEntrypoint((String) newValue);
			return;
		case GithubactionPackage.STEP__ARGS:
			setArgs((String) newValue);
			return;
		case GithubactionPackage.STEP__RUN:
			getRun().clear();
			getRun().addAll((Collection<? extends String>) newValue);
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
		case GithubactionPackage.STEP__ENV:
			getEnv().clear();
			return;
		case GithubactionPackage.STEP__STEP_NAME:
			setStepName(STEP_NAME_EDEFAULT);
			return;
		case GithubactionPackage.STEP__USES:
			setUses(USES_EDEFAULT);
			return;
		case GithubactionPackage.STEP__RUN_SETTING:
			setRunSetting((RunSetting) null);
			return;
		case GithubactionPackage.STEP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GithubactionPackage.STEP__IF:
			setIf(IF_EDEFAULT);
			return;
		case GithubactionPackage.STEP__WITH:
			getWith().clear();
			return;
		case GithubactionPackage.STEP__ENTRYPOINT:
			setEntrypoint(ENTRYPOINT_EDEFAULT);
			return;
		case GithubactionPackage.STEP__ARGS:
			setArgs(ARGS_EDEFAULT);
			return;
		case GithubactionPackage.STEP__RUN:
			getRun().clear();
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
		case GithubactionPackage.STEP__ENV:
			return env != null && !env.isEmpty();
		case GithubactionPackage.STEP__STEP_NAME:
			return STEP_NAME_EDEFAULT == null ? stepName != null : !STEP_NAME_EDEFAULT.equals(stepName);
		case GithubactionPackage.STEP__USES:
			return USES_EDEFAULT == null ? uses != null : !USES_EDEFAULT.equals(uses);
		case GithubactionPackage.STEP__RUN_SETTING:
			return runSetting != null;
		case GithubactionPackage.STEP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GithubactionPackage.STEP__IF:
			return IF_EDEFAULT == null ? if_ != null : !IF_EDEFAULT.equals(if_);
		case GithubactionPackage.STEP__WITH:
			return with != null && !with.isEmpty();
		case GithubactionPackage.STEP__ENTRYPOINT:
			return ENTRYPOINT_EDEFAULT == null ? entrypoint != null : !ENTRYPOINT_EDEFAULT.equals(entrypoint);
		case GithubactionPackage.STEP__ARGS:
			return ARGS_EDEFAULT == null ? args != null : !ARGS_EDEFAULT.equals(args);
		case GithubactionPackage.STEP__RUN:
			return run != null && !run.isEmpty();
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
		result.append(" (stepName: ");
		result.append(stepName);
		result.append(", uses: ");
		result.append(uses);
		result.append(", name: ");
		result.append(name);
		result.append(", if: ");
		result.append(if_);
		result.append(", entrypoint: ");
		result.append(entrypoint);
		result.append(", args: ");
		result.append(args);
		result.append(", run: ");
		result.append(run);
		result.append(')');
		return result.toString();
	}

} //StepImpl
