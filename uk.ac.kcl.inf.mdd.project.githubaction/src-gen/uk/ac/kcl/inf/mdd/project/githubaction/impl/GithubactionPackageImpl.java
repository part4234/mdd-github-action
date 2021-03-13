/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.CreateEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.DeleteEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.DeploymentEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Env;
import uk.ac.kcl.inf.mdd.project.githubaction.Environment;
import uk.ac.kcl.inf.mdd.project.githubaction.Event;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionFactory;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.Input;
import uk.ac.kcl.inf.mdd.project.githubaction.InputParameter;
import uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType;
import uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Job;
import uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType;
import uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.ManualEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.PullRequestEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.PushEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Repository;
import uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.RunSetting;
import uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Step;
import uk.ac.kcl.inf.mdd.project.githubaction.WebhookEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Workflow;
import uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubactionPackageImpl extends EPackageImpl implements GithubactionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pullRequestEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowDispatchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryDispatchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webhookEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueActivityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelActivityTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GithubactionPackageImpl() {
		super(eNS_URI, GithubactionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GithubactionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GithubactionPackage init() {
		if (isInited)
			return (GithubactionPackage) EPackage.Registry.INSTANCE.getEPackage(GithubactionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGithubactionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GithubactionPackageImpl theGithubactionPackage = registeredGithubactionPackage instanceof GithubactionPackageImpl
				? (GithubactionPackageImpl) registeredGithubactionPackage
				: new GithubactionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGithubactionPackage.createPackageContents();

		// Initialize created meta-data
		theGithubactionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGithubactionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GithubactionPackage.eNS_URI, theGithubactionPackage);
		return theGithubactionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBranchEvent() {
		return branchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranchEvent_Branches() {
		return (EAttribute) branchEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranchEvent_Tags() {
		return (EAttribute) branchEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranchEvent_BranchesIgnore() {
		return (EAttribute) branchEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranchEvent_TagsIgnore() {
		return (EAttribute) branchEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranchEvent_Paths() {
		return (EAttribute) branchEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranchEvent_PathsIgnore() {
		return (EAttribute) branchEventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPushEvent() {
		return pushEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPullRequestEvent() {
		return pullRequestEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Jobs() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_On() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflow_Name() {
		return (EAttribute) workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Env() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Defaults() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_Env() {
		return (EReference) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_StepName() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Name() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Uses() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_RunSetting() {
		return (EReference) stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_If() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStep_With() {
		return (EReference) stepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Entrypoint() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Args() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStep_Run() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJob() {
		return jobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_JobName() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Name() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Steps() {
		return (EReference) jobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Env() {
		return (EReference) jobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_RunsOn() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Needs() {
		return (EReference) jobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Environment() {
		return (EReference) jobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_Outputs() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJob_Defaults() {
		return (EReference) jobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJob_If() {
		return (EAttribute) jobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScheduleEvent() {
		return scheduleEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduleEvent_Minute() {
		return (EAttribute) scheduleEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduleEvent_Hour() {
		return (EAttribute) scheduleEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduleEvent_Day() {
		return (EAttribute) scheduleEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduleEvent_Month() {
		return (EAttribute) scheduleEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduleEvent_DayOfWeek() {
		return (EAttribute) scheduleEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManualEvent() {
		return manualEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowDispatchEvent() {
		return workflowDispatchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowDispatchEvent_Inputs() {
		return (EReference) workflowDispatchEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepositoryDispatchEvent() {
		return repositoryDispatchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepositoryDispatchEvent_EventTypes() {
		return (EAttribute) repositoryDispatchEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Name() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Description() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Default() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Required() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebhookEvent() {
		return webhookEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreateEvent() {
		return createEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeleteEvent() {
		return deleteEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentEvent() {
		return deploymentEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssueEvent() {
		return issueEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueEvent_ActivityTypes() {
		return (EAttribute) issueEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelEvent() {
		return labelEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelEvent_ActivityTypes() {
		return (EAttribute) labelEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnv() {
		return envEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnv_Name() {
		return (EAttribute) envEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnv_Value() {
		return (EAttribute) envEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunSetting() {
		return runSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunSetting_WorkingDirectory() {
		return (EAttribute) runSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRunSetting_Shell() {
		return (EAttribute) runSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunSetting_With() {
		return (EReference) runSettingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Name() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Url() {
		return (EAttribute) environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputParameter() {
		return inputParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputParameter_Name() {
		return (EAttribute) inputParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputParameter_Value() {
		return (EAttribute) inputParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Workflows() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIssueActivityType() {
		return issueActivityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLabelActivityType() {
		return labelActivityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubactionFactory getGithubactionFactory() {
		return (GithubactionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		branchEventEClass = createEClass(BRANCH_EVENT);
		createEAttribute(branchEventEClass, BRANCH_EVENT__BRANCHES);
		createEAttribute(branchEventEClass, BRANCH_EVENT__TAGS);
		createEAttribute(branchEventEClass, BRANCH_EVENT__BRANCHES_IGNORE);
		createEAttribute(branchEventEClass, BRANCH_EVENT__TAGS_IGNORE);
		createEAttribute(branchEventEClass, BRANCH_EVENT__PATHS);
		createEAttribute(branchEventEClass, BRANCH_EVENT__PATHS_IGNORE);

		pushEventEClass = createEClass(PUSH_EVENT);

		pullRequestEventEClass = createEClass(PULL_REQUEST_EVENT);

		eventEClass = createEClass(EVENT);

		workflowEClass = createEClass(WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__JOBS);
		createEReference(workflowEClass, WORKFLOW__ON);
		createEAttribute(workflowEClass, WORKFLOW__NAME);
		createEReference(workflowEClass, WORKFLOW__ENV);
		createEReference(workflowEClass, WORKFLOW__DEFAULTS);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__ENV);
		createEAttribute(stepEClass, STEP__STEP_NAME);
		createEAttribute(stepEClass, STEP__USES);
		createEReference(stepEClass, STEP__RUN_SETTING);
		createEAttribute(stepEClass, STEP__NAME);
		createEAttribute(stepEClass, STEP__IF);
		createEReference(stepEClass, STEP__WITH);
		createEAttribute(stepEClass, STEP__ENTRYPOINT);
		createEAttribute(stepEClass, STEP__ARGS);
		createEAttribute(stepEClass, STEP__RUN);

		jobEClass = createEClass(JOB);
		createEAttribute(jobEClass, JOB__JOB_NAME);
		createEReference(jobEClass, JOB__STEPS);
		createEReference(jobEClass, JOB__ENV);
		createEAttribute(jobEClass, JOB__RUNS_ON);
		createEReference(jobEClass, JOB__NEEDS);
		createEReference(jobEClass, JOB__ENVIRONMENT);
		createEAttribute(jobEClass, JOB__OUTPUTS);
		createEReference(jobEClass, JOB__DEFAULTS);
		createEAttribute(jobEClass, JOB__IF);
		createEAttribute(jobEClass, JOB__NAME);

		scheduleEventEClass = createEClass(SCHEDULE_EVENT);
		createEAttribute(scheduleEventEClass, SCHEDULE_EVENT__MINUTE);
		createEAttribute(scheduleEventEClass, SCHEDULE_EVENT__HOUR);
		createEAttribute(scheduleEventEClass, SCHEDULE_EVENT__DAY);
		createEAttribute(scheduleEventEClass, SCHEDULE_EVENT__MONTH);
		createEAttribute(scheduleEventEClass, SCHEDULE_EVENT__DAY_OF_WEEK);

		manualEventEClass = createEClass(MANUAL_EVENT);

		workflowDispatchEventEClass = createEClass(WORKFLOW_DISPATCH_EVENT);
		createEReference(workflowDispatchEventEClass, WORKFLOW_DISPATCH_EVENT__INPUTS);

		repositoryDispatchEventEClass = createEClass(REPOSITORY_DISPATCH_EVENT);
		createEAttribute(repositoryDispatchEventEClass, REPOSITORY_DISPATCH_EVENT__EVENT_TYPES);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__NAME);
		createEAttribute(inputEClass, INPUT__DESCRIPTION);
		createEAttribute(inputEClass, INPUT__DEFAULT);
		createEAttribute(inputEClass, INPUT__REQUIRED);

		webhookEventEClass = createEClass(WEBHOOK_EVENT);

		createEventEClass = createEClass(CREATE_EVENT);

		deleteEventEClass = createEClass(DELETE_EVENT);

		deploymentEventEClass = createEClass(DEPLOYMENT_EVENT);

		issueEventEClass = createEClass(ISSUE_EVENT);
		createEAttribute(issueEventEClass, ISSUE_EVENT__ACTIVITY_TYPES);

		labelEventEClass = createEClass(LABEL_EVENT);
		createEAttribute(labelEventEClass, LABEL_EVENT__ACTIVITY_TYPES);

		envEClass = createEClass(ENV);
		createEAttribute(envEClass, ENV__NAME);
		createEAttribute(envEClass, ENV__VALUE);

		runSettingEClass = createEClass(RUN_SETTING);
		createEAttribute(runSettingEClass, RUN_SETTING__WORKING_DIRECTORY);
		createEAttribute(runSettingEClass, RUN_SETTING__SHELL);
		createEReference(runSettingEClass, RUN_SETTING__WITH);

		environmentEClass = createEClass(ENVIRONMENT);
		createEAttribute(environmentEClass, ENVIRONMENT__NAME);
		createEAttribute(environmentEClass, ENVIRONMENT__URL);

		inputParameterEClass = createEClass(INPUT_PARAMETER);
		createEAttribute(inputParameterEClass, INPUT_PARAMETER__NAME);
		createEAttribute(inputParameterEClass, INPUT_PARAMETER__VALUE);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__WORKFLOWS);

		// Create enums
		issueActivityTypeEEnum = createEEnum(ISSUE_ACTIVITY_TYPE);
		labelActivityTypeEEnum = createEEnum(LABEL_ACTIVITY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		branchEventEClass.getESuperTypes().add(this.getWebhookEvent());
		pushEventEClass.getESuperTypes().add(this.getBranchEvent());
		pullRequestEventEClass.getESuperTypes().add(this.getBranchEvent());
		scheduleEventEClass.getESuperTypes().add(this.getEvent());
		manualEventEClass.getESuperTypes().add(this.getEvent());
		workflowDispatchEventEClass.getESuperTypes().add(this.getManualEvent());
		repositoryDispatchEventEClass.getESuperTypes().add(this.getManualEvent());
		webhookEventEClass.getESuperTypes().add(this.getEvent());
		createEventEClass.getESuperTypes().add(this.getWebhookEvent());
		deleteEventEClass.getESuperTypes().add(this.getWebhookEvent());
		deploymentEventEClass.getESuperTypes().add(this.getWebhookEvent());
		issueEventEClass.getESuperTypes().add(this.getWebhookEvent());
		labelEventEClass.getESuperTypes().add(this.getWebhookEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(branchEventEClass, BranchEvent.class, "BranchEvent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranchEvent_Branches(), ecorePackage.getEString(), "branches", null, 0, -1, BranchEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchEvent_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, BranchEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchEvent_BranchesIgnore(), ecorePackage.getEString(), "branchesIgnore", null, 0, -1,
				BranchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchEvent_TagsIgnore(), ecorePackage.getEString(), "tagsIgnore", null, 0, -1,
				BranchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchEvent_Paths(), ecorePackage.getEString(), "paths", null, 0, -1, BranchEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranchEvent_PathsIgnore(), ecorePackage.getEString(), "pathsIgnore", null, 0, -1,
				BranchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pushEventEClass, PushEvent.class, "PushEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(pullRequestEventEClass, PullRequestEvent.class, "PullRequestEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflow_Jobs(), this.getJob(), null, "jobs", null, 0, -1, Workflow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getWorkflow_On(), this.getEvent(), null, "on", null, 0, -1, Workflow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getWorkflow_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workflow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Env(), this.getEnv(), null, "env", null, 0, -1, Workflow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getWorkflow_Defaults(), this.getRunSetting(), null, "defaults", null, 0, 1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Env(), this.getEnv(), null, "env", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_StepName(), ecorePackage.getEString(), "stepName", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Uses(), ecorePackage.getEString(), "uses", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_RunSetting(), this.getRunSetting(), null, "runSetting", null, 0, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Name(), theXMLTypePackage.getID(), "name", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_If(), ecorePackage.getEString(), "if", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_With(), this.getInputParameter(), null, "with", null, 0, -1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getStep_Entrypoint(), ecorePackage.getEString(), "entrypoint", null, 0, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Args(), ecorePackage.getEString(), "args", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Run(), ecorePackage.getEString(), "run", null, 0, -1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jobEClass, Job.class, "Job", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJob_JobName(), ecorePackage.getEString(), "jobName", null, 0, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Steps(), this.getStep(), null, "steps", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Env(), this.getEnv(), null, "env", null, 0, -1, Job.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_RunsOn(), ecorePackage.getEString(), "runsOn", null, 0, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Needs(), this.getJob(), null, "needs", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getJob_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, Job.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Outputs(), ecorePackage.getEString(), "outputs", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJob_Defaults(), this.getRunSetting(), null, "defaults", null, 0, -1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getJob_If(), ecorePackage.getEString(), "if", null, 0, 1, Job.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJob_Name(), theXMLTypePackage.getID(), "name", null, 1, 1, Job.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleEventEClass, ScheduleEvent.class, "ScheduleEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduleEvent_Minute(), ecorePackage.getEString(), "minute", null, 0, 1, ScheduleEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduleEvent_Hour(), ecorePackage.getEString(), "hour", null, 0, 1, ScheduleEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduleEvent_Day(), ecorePackage.getEString(), "day", null, 0, 1, ScheduleEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduleEvent_Month(), ecorePackage.getEString(), "month", null, 0, 1, ScheduleEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduleEvent_DayOfWeek(), ecorePackage.getEString(), "dayOfWeek", null, 0, 1,
				ScheduleEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(manualEventEClass, ManualEvent.class, "ManualEvent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowDispatchEventEClass, WorkflowDispatchEvent.class, "WorkflowDispatchEvent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflowDispatchEvent_Inputs(), this.getInput(), null, "inputs", null, 0, -1,
				WorkflowDispatchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryDispatchEventEClass, RepositoryDispatchEvent.class, "RepositoryDispatchEvent",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepositoryDispatchEvent_EventTypes(), ecorePackage.getEString(), "eventTypes", null, 0, -1,
				RepositoryDispatchEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Name(), ecorePackage.getEString(), "name", null, 1, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Description(), ecorePackage.getEString(), "description", null, 0, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Default(), ecorePackage.getEString(), "default", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1, Input.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webhookEventEClass, WebhookEvent.class, "WebhookEvent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(createEventEClass, CreateEvent.class, "CreateEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteEventEClass, DeleteEvent.class, "DeleteEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentEventEClass, DeploymentEvent.class, "DeploymentEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(issueEventEClass, IssueEvent.class, "IssueEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssueEvent_ActivityTypes(), this.getIssueActivityType(), "activityTypes", null, 0, -1,
				IssueEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(labelEventEClass, LabelEvent.class, "LabelEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelEvent_ActivityTypes(), this.getLabelActivityType(), "activityTypes", null, 0, -1,
				LabelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(envEClass, Env.class, "Env", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnv_Name(), ecorePackage.getEString(), "name", null, 1, 1, Env.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnv_Value(), ecorePackage.getEString(), "value", null, 1, 1, Env.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runSettingEClass, RunSetting.class, "RunSetting", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunSetting_WorkingDirectory(), ecorePackage.getEString(), "workingDirectory", null, 0, 1,
				RunSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunSetting_Shell(), ecorePackage.getEString(), "shell", null, 0, 1, RunSetting.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunSetting_With(), this.getEnv(), null, "with", null, 0, -1, RunSetting.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironment_Name(), ecorePackage.getEString(), "name", null, 1, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironment_Url(), ecorePackage.getEString(), "url", null, 0, 1, Environment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputParameterEClass, InputParameter.class, "InputParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, InputParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputParameter_Value(), ecorePackage.getEString(), "value", null, 1, 1, InputParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Workflows(), this.getWorkflow(), null, "workflows", null, 0, -1, Repository.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(issueActivityTypeEEnum, IssueActivityType.class, "IssueActivityType");
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.OPENED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.EDITED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.DELETED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.TRANSFERRED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.PINNED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.UNPINNED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.CLOSED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.REOPENED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.ASSIGNED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.UNASSIGNED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.LABELED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.UNLABELED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.LOCKED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.UNLOCKED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.MILESTONED);
		addEEnumLiteral(issueActivityTypeEEnum, IssueActivityType.DEMILESTONED);

		initEEnum(labelActivityTypeEEnum, LabelActivityType.class, "LabelActivityType");
		addEEnumLiteral(labelActivityTypeEEnum, LabelActivityType.CREATED);
		addEEnumLiteral(labelActivityTypeEEnum, LabelActivityType.EDITED);
		addEEnumLiteral(labelActivityTypeEEnum, LabelActivityType.DELETED);

		// Create resource
		createResource(eNS_URI);
	}

} //GithubactionPackageImpl
