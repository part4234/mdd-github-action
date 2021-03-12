/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.mdd.project.githubaction.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubactionFactoryImpl extends EFactoryImpl implements GithubactionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GithubactionFactory init() {
		try {
			GithubactionFactory theGithubactionFactory = (GithubactionFactory) EPackage.Registry.INSTANCE
					.getEFactory(GithubactionPackage.eNS_URI);
			if (theGithubactionFactory != null) {
				return theGithubactionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GithubactionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubactionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GithubactionPackage.PUSH_EVENT:
			return createPushEvent();
		case GithubactionPackage.PULL_REQUEST_EVENT:
			return createPullRequestEvent();
		case GithubactionPackage.WORKFLOW:
			return createWorkflow();
		case GithubactionPackage.STEP:
			return createStep();
		case GithubactionPackage.JOB:
			return createJob();
		case GithubactionPackage.SCHEDULE_EVENT:
			return createScheduleEvent();
		case GithubactionPackage.WORKFLOW_DISPATCH_EVENT:
			return createWorkflowDispatchEvent();
		case GithubactionPackage.REPOSITORY_DISPATCH_EVENT:
			return createRepositoryDispatchEvent();
		case GithubactionPackage.INPUT:
			return createInput();
		case GithubactionPackage.CREATE_EVENT:
			return createCreateEvent();
		case GithubactionPackage.DELETE_EVENT:
			return createDeleteEvent();
		case GithubactionPackage.DEPLOYMENT_EVENT:
			return createDeploymentEvent();
		case GithubactionPackage.ISSUE_EVENT:
			return createIssueEvent();
		case GithubactionPackage.LABEL_EVENT:
			return createLabelEvent();
		case GithubactionPackage.ENV:
			return createEnv();
		case GithubactionPackage.RUN_SETTING:
			return createRunSetting();
		case GithubactionPackage.ENVIRONMENT:
			return createEnvironment();
		case GithubactionPackage.RUN:
			return createRun();
		case GithubactionPackage.INPUT_PARAMETER:
			return createInputParameter();
		case GithubactionPackage.REPOSITORY:
			return createRepository();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GithubactionPackage.ISSUE_ACTIVITY_TYPE:
			return createIssueActivityTypeFromString(eDataType, initialValue);
		case GithubactionPackage.LABEL_ACTIVITY_TYPE:
			return createLabelActivityTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GithubactionPackage.ISSUE_ACTIVITY_TYPE:
			return convertIssueActivityTypeToString(eDataType, instanceValue);
		case GithubactionPackage.LABEL_ACTIVITY_TYPE:
			return convertLabelActivityTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PushEvent createPushEvent() {
		PushEventImpl pushEvent = new PushEventImpl();
		return pushEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PullRequestEvent createPullRequestEvent() {
		PullRequestEventImpl pullRequestEvent = new PullRequestEventImpl();
		return pullRequestEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job createJob() {
		JobImpl job = new JobImpl();
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduleEvent createScheduleEvent() {
		ScheduleEventImpl scheduleEvent = new ScheduleEventImpl();
		return scheduleEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowDispatchEvent createWorkflowDispatchEvent() {
		WorkflowDispatchEventImpl workflowDispatchEvent = new WorkflowDispatchEventImpl();
		return workflowDispatchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryDispatchEvent createRepositoryDispatchEvent() {
		RepositoryDispatchEventImpl repositoryDispatchEvent = new RepositoryDispatchEventImpl();
		return repositoryDispatchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreateEvent createCreateEvent() {
		CreateEventImpl createEvent = new CreateEventImpl();
		return createEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeleteEvent createDeleteEvent() {
		DeleteEventImpl deleteEvent = new DeleteEventImpl();
		return deleteEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentEvent createDeploymentEvent() {
		DeploymentEventImpl deploymentEvent = new DeploymentEventImpl();
		return deploymentEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueEvent createIssueEvent() {
		IssueEventImpl issueEvent = new IssueEventImpl();
		return issueEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelEvent createLabelEvent() {
		LabelEventImpl labelEvent = new LabelEventImpl();
		return labelEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Env createEnv() {
		EnvImpl env = new EnvImpl();
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunSetting createRunSetting() {
		RunSettingImpl runSetting = new RunSettingImpl();
		return runSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Run createRun() {
		RunImpl run = new RunImpl();
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputParameter createInputParameter() {
		InputParameterImpl inputParameter = new InputParameterImpl();
		return inputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueActivityType createIssueActivityTypeFromString(EDataType eDataType, String initialValue) {
		IssueActivityType result = IssueActivityType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueActivityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelActivityType createLabelActivityTypeFromString(EDataType eDataType, String initialValue) {
		LabelActivityType result = LabelActivityType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelActivityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubactionPackage getGithubactionPackage() {
		return (GithubactionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GithubactionPackage getPackage() {
		return GithubactionPackage.eINSTANCE;
	}

} //GithubactionFactoryImpl
