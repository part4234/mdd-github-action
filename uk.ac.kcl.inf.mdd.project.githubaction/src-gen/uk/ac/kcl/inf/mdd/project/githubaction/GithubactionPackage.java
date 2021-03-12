/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionFactory
 * @model kind="package"
 * @generated
 */
public interface GithubactionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "githubaction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/githubaction";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "githubaction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GithubactionPackage eINSTANCE = uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.EventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WebhookEventImpl <em>Webhook Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.WebhookEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getWebhookEvent()
	 * @generated
	 */
	int WEBHOOK_EVENT = 12;

	/**
	 * The number of structural features of the '<em>Webhook Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBHOOK_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Webhook Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBHOOK_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.BranchEventImpl <em>Branch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.BranchEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getBranchEvent()
	 * @generated
	 */
	int BRANCH_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__BRANCHES = WEBHOOK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__TAGS = WEBHOOK_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Branches Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__BRANCHES_IGNORE = WEBHOOK_EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tags Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__TAGS_IGNORE = WEBHOOK_EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__PATHS = WEBHOOK_EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Paths Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__PATHS_IGNORE = WEBHOOK_EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Branch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT_FEATURE_COUNT = WEBHOOK_EVENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Branch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT_OPERATION_COUNT = WEBHOOK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.PushEventImpl <em>Push Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.PushEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getPushEvent()
	 * @generated
	 */
	int PUSH_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_EVENT__BRANCHES = BRANCH_EVENT__BRANCHES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_EVENT__TAGS = BRANCH_EVENT__TAGS;

	/**
	 * The feature id for the '<em><b>Branches Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_EVENT__BRANCHES_IGNORE = BRANCH_EVENT__BRANCHES_IGNORE;

	/**
	 * The feature id for the '<em><b>Tags Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_EVENT__TAGS_IGNORE = BRANCH_EVENT__TAGS_IGNORE;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_EVENT__PATHS = BRANCH_EVENT__PATHS;

	/**
	 * The feature id for the '<em><b>Paths Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_EVENT__PATHS_IGNORE = BRANCH_EVENT__PATHS_IGNORE;

	/**
	 * The number of structural features of the '<em>Push Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_EVENT_FEATURE_COUNT = BRANCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Push Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_EVENT_OPERATION_COUNT = BRANCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.PullRequestEventImpl <em>Pull Request Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.PullRequestEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getPullRequestEvent()
	 * @generated
	 */
	int PULL_REQUEST_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_EVENT__BRANCHES = BRANCH_EVENT__BRANCHES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_EVENT__TAGS = BRANCH_EVENT__TAGS;

	/**
	 * The feature id for the '<em><b>Branches Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_EVENT__BRANCHES_IGNORE = BRANCH_EVENT__BRANCHES_IGNORE;

	/**
	 * The feature id for the '<em><b>Tags Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_EVENT__TAGS_IGNORE = BRANCH_EVENT__TAGS_IGNORE;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_EVENT__PATHS = BRANCH_EVENT__PATHS;

	/**
	 * The feature id for the '<em><b>Paths Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_EVENT__PATHS_IGNORE = BRANCH_EVENT__PATHS_IGNORE;

	/**
	 * The number of structural features of the '<em>Pull Request Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_EVENT_FEATURE_COUNT = BRANCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pull Request Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_EVENT_OPERATION_COUNT = BRANCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 4;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__JOBS = 0;

	/**
	 * The feature id for the '<em><b>On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 2;

	/**
	 * The feature id for the '<em><b>Env</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ENV = 3;

	/**
	 * The feature id for the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DEFAULTS = 4;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 5;

	/**
	 * The feature id for the '<em><b>Env</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENV = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__USES = 2;

	/**
	 * The feature id for the '<em><b>Run Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RUN_SETTING = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = 4;

	/**
	 * The feature id for the '<em><b>If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IF = 5;

	/**
	 * The feature id for the '<em><b>Run</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RUN = 6;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__WITH = 7;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENTRYPOINT = 8;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ARGS = 9;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STEPS = 1;

	/**
	 * The feature id for the '<em><b>Env</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENV = 2;

	/**
	 * The feature id for the '<em><b>Runs On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RUNS_ON = 3;

	/**
	 * The feature id for the '<em><b>Needs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NEEDS = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__OUTPUTS = 6;

	/**
	 * The feature id for the '<em><b>Defaults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DEFAULTS = 7;

	/**
	 * The feature id for the '<em><b>If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IF = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ID = 9;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.ScheduleEventImpl <em>Schedule Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.ScheduleEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getScheduleEvent()
	 * @generated
	 */
	int SCHEDULE_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__MINUTE = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__HOUR = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__DAY = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__MONTH = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT__DAY_OF_WEEK = EVENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Schedule Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Schedule Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.ManualEventImpl <em>Manual Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.ManualEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getManualEvent()
	 * @generated
	 */
	int MANUAL_EVENT = 8;

	/**
	 * The number of structural features of the '<em>Manual Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowDispatchEventImpl <em>Workflow Dispatch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowDispatchEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getWorkflowDispatchEvent()
	 * @generated
	 */
	int WORKFLOW_DISPATCH_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_EVENT__INPUTS = MANUAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Dispatch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_EVENT_FEATURE_COUNT = MANUAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Workflow Dispatch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_EVENT_OPERATION_COUNT = MANUAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.RepositoryDispatchEventImpl <em>Repository Dispatch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.RepositoryDispatchEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getRepositoryDispatchEvent()
	 * @generated
	 */
	int REPOSITORY_DISPATCH_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Event Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DISPATCH_EVENT__EVENT_TYPES = MANUAL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repository Dispatch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DISPATCH_EVENT_FEATURE_COUNT = MANUAL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repository Dispatch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_DISPATCH_EVENT_OPERATION_COUNT = MANUAL_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.InputImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__REQUIRED = 3;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.CreateEventImpl <em>Create Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.CreateEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getCreateEvent()
	 * @generated
	 */
	int CREATE_EVENT = 13;

	/**
	 * The number of structural features of the '<em>Create Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EVENT_FEATURE_COUNT = WEBHOOK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EVENT_OPERATION_COUNT = WEBHOOK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.DeleteEventImpl <em>Delete Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.DeleteEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getDeleteEvent()
	 * @generated
	 */
	int DELETE_EVENT = 14;

	/**
	 * The number of structural features of the '<em>Delete Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_EVENT_FEATURE_COUNT = WEBHOOK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_EVENT_OPERATION_COUNT = WEBHOOK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.DeploymentEventImpl <em>Deployment Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.DeploymentEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getDeploymentEvent()
	 * @generated
	 */
	int DEPLOYMENT_EVENT = 15;

	/**
	 * The number of structural features of the '<em>Deployment Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_EVENT_FEATURE_COUNT = WEBHOOK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deployment Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_EVENT_OPERATION_COUNT = WEBHOOK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.IssueEventImpl <em>Issue Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.IssueEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getIssueEvent()
	 * @generated
	 */
	int ISSUE_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_EVENT__ACTIVITY_TYPES = WEBHOOK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Issue Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_EVENT_FEATURE_COUNT = WEBHOOK_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Issue Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_EVENT_OPERATION_COUNT = WEBHOOK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.LabelEventImpl <em>Label Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.LabelEventImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getLabelEvent()
	 * @generated
	 */
	int LABEL_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Activity Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT__ACTIVITY_TYPES = WEBHOOK_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT_FEATURE_COUNT = WEBHOOK_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_EVENT_OPERATION_COUNT = WEBHOOK_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.EnvImpl <em>Env</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.EnvImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getEnv()
	 * @generated
	 */
	int ENV = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.RunSettingImpl <em>Run Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.RunSettingImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getRunSetting()
	 * @generated
	 */
	int RUN_SETTING = 19;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_SETTING__WORKING_DIRECTORY = 0;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_SETTING__SHELL = 1;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_SETTING__WITH = 2;

	/**
	 * The number of structural features of the '<em>Run Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_SETTING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Run Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.EnvironmentImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__URL = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.RunImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getRun()
	 * @generated
	 */
	int RUN = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__COMMANDS = 1;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.InputParameterImpl <em>Input Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.InputParameterImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getInputParameter()
	 * @generated
	 */
	int INPUT_PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Input Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.RepositoryImpl
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 23;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__WORKFLOWS = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType <em>Issue Activity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getIssueActivityType()
	 * @generated
	 */
	int ISSUE_ACTIVITY_TYPE = 24;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType <em>Label Activity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getLabelActivityType()
	 * @generated
	 */
	int LABEL_ACTIVITY_TYPE = 25;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent <em>Branch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent
	 * @generated
	 */
	EClass getBranchEvent();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Branches</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getBranches()
	 * @see #getBranchEvent()
	 * @generated
	 */
	EAttribute getBranchEvent_Branches();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getTags()
	 * @see #getBranchEvent()
	 * @generated
	 */
	EAttribute getBranchEvent_Tags();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getBranchesIgnore <em>Branches Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Branches Ignore</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getBranchesIgnore()
	 * @see #getBranchEvent()
	 * @generated
	 */
	EAttribute getBranchEvent_BranchesIgnore();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getTagsIgnore <em>Tags Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags Ignore</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getTagsIgnore()
	 * @see #getBranchEvent()
	 * @generated
	 */
	EAttribute getBranchEvent_TagsIgnore();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getPaths()
	 * @see #getBranchEvent()
	 * @generated
	 */
	EAttribute getBranchEvent_Paths();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getPathsIgnore <em>Paths Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paths Ignore</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getPathsIgnore()
	 * @see #getBranchEvent()
	 * @generated
	 */
	EAttribute getBranchEvent_PathsIgnore();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.PushEvent <em>Push Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.PushEvent
	 * @generated
	 */
	EClass getPushEvent();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.PullRequestEvent <em>Pull Request Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull Request Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.PullRequestEvent
	 * @generated
	 */
	EClass getPullRequestEvent();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getJobs()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Jobs();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getOn()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_On();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getEnv()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Env();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getDefaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaults</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getDefaults()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Defaults();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step#getEnv()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Env();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uses</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step#getUses()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Uses();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getRunSetting <em>Run Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run Setting</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step#getRunSetting()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_RunSetting();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step#getIf()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_If();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step#getRun()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Run();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>With</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step#getWith()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_With();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entrypoint</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step#getEntrypoint()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Entrypoint();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Step#getArgs()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Args();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job#getSteps()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Steps();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job#getEnv()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Env();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getRunsOn <em>Runs On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runs On</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job#getRunsOn()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_RunsOn();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Needs</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job#getNeeds()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Needs();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job#getEnvironment()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Environment();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Outputs</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job#getOutputs()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getDefaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defaults</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job#getDefaults()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Defaults();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job#getIf()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_If();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Job#getId()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Id();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent <em>Schedule Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent
	 * @generated
	 */
	EClass getScheduleEvent();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getMinute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minute</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getMinute()
	 * @see #getScheduleEvent()
	 * @generated
	 */
	EAttribute getScheduleEvent_Minute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getHour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hour</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getHour()
	 * @see #getScheduleEvent()
	 * @generated
	 */
	EAttribute getScheduleEvent_Hour();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getDay()
	 * @see #getScheduleEvent()
	 * @generated
	 */
	EAttribute getScheduleEvent_Day();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getMonth()
	 * @see #getScheduleEvent()
	 * @generated
	 */
	EAttribute getScheduleEvent_Month();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Week</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getDayOfWeek()
	 * @see #getScheduleEvent()
	 * @generated
	 */
	EAttribute getScheduleEvent_DayOfWeek();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.ManualEvent <em>Manual Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.ManualEvent
	 * @generated
	 */
	EClass getManualEvent();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent <em>Workflow Dispatch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Dispatch Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent
	 * @generated
	 */
	EClass getWorkflowDispatchEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent#getInputs()
	 * @see #getWorkflowDispatchEvent()
	 * @generated
	 */
	EReference getWorkflowDispatchEvent_Inputs();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent <em>Repository Dispatch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Dispatch Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent
	 * @generated
	 */
	EClass getRepositoryDispatchEvent();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent#getEventTypes <em>Event Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Types</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent#getEventTypes()
	 * @see #getRepositoryDispatchEvent()
	 * @generated
	 */
	EAttribute getRepositoryDispatchEvent_EventTypes();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Input#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Input#getDescription()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Description();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Input#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Input#getDefault()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Default();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Input#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Input#isRequired()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Required();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.WebhookEvent <em>Webhook Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webhook Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.WebhookEvent
	 * @generated
	 */
	EClass getWebhookEvent();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.CreateEvent <em>Create Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.CreateEvent
	 * @generated
	 */
	EClass getCreateEvent();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.DeleteEvent <em>Delete Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.DeleteEvent
	 * @generated
	 */
	EClass getDeleteEvent();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.DeploymentEvent <em>Deployment Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.DeploymentEvent
	 * @generated
	 */
	EClass getDeploymentEvent();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent <em>Issue Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent
	 * @generated
	 */
	EClass getIssueEvent();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent#getActivityTypes <em>Activity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Activity Types</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent#getActivityTypes()
	 * @see #getIssueEvent()
	 * @generated
	 */
	EAttribute getIssueEvent_ActivityTypes();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent <em>Label Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Event</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent
	 * @generated
	 */
	EClass getLabelEvent();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent#getActivityTypes <em>Activity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Activity Types</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent#getActivityTypes()
	 * @see #getLabelEvent()
	 * @generated
	 */
	EAttribute getLabelEvent_ActivityTypes();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.Env <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Env
	 * @generated
	 */
	EClass getEnv();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Env#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Env#getName()
	 * @see #getEnv()
	 * @generated
	 */
	EAttribute getEnv_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Env#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Env#getValue()
	 * @see #getEnv()
	 * @generated
	 */
	EAttribute getEnv_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting <em>Run Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Setting</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.RunSetting
	 * @generated
	 */
	EClass getRunSetting();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Directory</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getWorkingDirectory()
	 * @see #getRunSetting()
	 * @generated
	 */
	EAttribute getRunSetting_WorkingDirectory();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shell</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getShell()
	 * @see #getRunSetting()
	 * @generated
	 */
	EAttribute getRunSetting_Shell();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>With</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getWith()
	 * @see #getRunSetting()
	 * @generated
	 */
	EReference getRunSetting_With();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Environment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Environment#getName()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Environment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Environment#getUrl()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Url();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Run
	 * @generated
	 */
	EClass getRun();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Run#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Run#getName()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.Run#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commands</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Run#getCommands()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Commands();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.InputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameter</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.InputParameter
	 * @generated
	 */
	EClass getInputParameter();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.InputParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.InputParameter#getName()
	 * @see #getInputParameter()
	 * @generated
	 */
	EAttribute getInputParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.mdd.project.githubaction.InputParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.InputParameter#getValue()
	 * @see #getInputParameter()
	 * @generated
	 */
	EAttribute getInputParameter_Value();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.mdd.project.githubaction.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Repository#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflows</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Repository#getWorkflows()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Workflows();

	/**
	 * Returns the meta object for enum '{@link uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType <em>Issue Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Activity Type</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType
	 * @generated
	 */
	EEnum getIssueActivityType();

	/**
	 * Returns the meta object for enum '{@link uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType <em>Label Activity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Activity Type</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType
	 * @generated
	 */
	EEnum getLabelActivityType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GithubactionFactory getGithubactionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.BranchEventImpl <em>Branch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.BranchEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getBranchEvent()
		 * @generated
		 */
		EClass BRANCH_EVENT = eINSTANCE.getBranchEvent();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_EVENT__BRANCHES = eINSTANCE.getBranchEvent_Branches();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_EVENT__TAGS = eINSTANCE.getBranchEvent_Tags();

		/**
		 * The meta object literal for the '<em><b>Branches Ignore</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_EVENT__BRANCHES_IGNORE = eINSTANCE.getBranchEvent_BranchesIgnore();

		/**
		 * The meta object literal for the '<em><b>Tags Ignore</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_EVENT__TAGS_IGNORE = eINSTANCE.getBranchEvent_TagsIgnore();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_EVENT__PATHS = eINSTANCE.getBranchEvent_Paths();

		/**
		 * The meta object literal for the '<em><b>Paths Ignore</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_EVENT__PATHS_IGNORE = eINSTANCE.getBranchEvent_PathsIgnore();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.PushEventImpl <em>Push Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.PushEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getPushEvent()
		 * @generated
		 */
		EClass PUSH_EVENT = eINSTANCE.getPushEvent();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.PullRequestEventImpl <em>Pull Request Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.PullRequestEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getPullRequestEvent()
		 * @generated
		 */
		EClass PULL_REQUEST_EVENT = eINSTANCE.getPullRequestEvent();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.EventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__JOBS = eINSTANCE.getWorkflow_Jobs();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ON = eINSTANCE.getWorkflow_On();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ENV = eINSTANCE.getWorkflow_Env();

		/**
		 * The meta object literal for the '<em><b>Defaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__DEFAULTS = eINSTANCE.getWorkflow_Defaults();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.StepImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ENV = eINSTANCE.getStep_Env();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__USES = eINSTANCE.getStep_Uses();

		/**
		 * The meta object literal for the '<em><b>Run Setting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__RUN_SETTING = eINSTANCE.getStep_RunSetting();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ID = eINSTANCE.getStep_Id();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__IF = eINSTANCE.getStep_If();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__RUN = eINSTANCE.getStep_Run();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__WITH = eINSTANCE.getStep_With();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ENTRYPOINT = eINSTANCE.getStep_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ARGS = eINSTANCE.getStep_Args();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.JobImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STEPS = eINSTANCE.getJob_Steps();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENV = eINSTANCE.getJob_Env();

		/**
		 * The meta object literal for the '<em><b>Runs On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__RUNS_ON = eINSTANCE.getJob_RunsOn();

		/**
		 * The meta object literal for the '<em><b>Needs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__NEEDS = eINSTANCE.getJob_Needs();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENT = eINSTANCE.getJob_Environment();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__OUTPUTS = eINSTANCE.getJob_Outputs();

		/**
		 * The meta object literal for the '<em><b>Defaults</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__DEFAULTS = eINSTANCE.getJob_Defaults();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__IF = eINSTANCE.getJob_If();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ID = eINSTANCE.getJob_Id();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.ScheduleEventImpl <em>Schedule Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.ScheduleEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getScheduleEvent()
		 * @generated
		 */
		EClass SCHEDULE_EVENT = eINSTANCE.getScheduleEvent();

		/**
		 * The meta object literal for the '<em><b>Minute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_EVENT__MINUTE = eINSTANCE.getScheduleEvent_Minute();

		/**
		 * The meta object literal for the '<em><b>Hour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_EVENT__HOUR = eINSTANCE.getScheduleEvent_Hour();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_EVENT__DAY = eINSTANCE.getScheduleEvent_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_EVENT__MONTH = eINSTANCE.getScheduleEvent_Month();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_EVENT__DAY_OF_WEEK = eINSTANCE.getScheduleEvent_DayOfWeek();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.ManualEventImpl <em>Manual Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.ManualEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getManualEvent()
		 * @generated
		 */
		EClass MANUAL_EVENT = eINSTANCE.getManualEvent();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowDispatchEventImpl <em>Workflow Dispatch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.WorkflowDispatchEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getWorkflowDispatchEvent()
		 * @generated
		 */
		EClass WORKFLOW_DISPATCH_EVENT = eINSTANCE.getWorkflowDispatchEvent();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_DISPATCH_EVENT__INPUTS = eINSTANCE.getWorkflowDispatchEvent_Inputs();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.RepositoryDispatchEventImpl <em>Repository Dispatch Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.RepositoryDispatchEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getRepositoryDispatchEvent()
		 * @generated
		 */
		EClass REPOSITORY_DISPATCH_EVENT = eINSTANCE.getRepositoryDispatchEvent();

		/**
		 * The meta object literal for the '<em><b>Event Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_DISPATCH_EVENT__EVENT_TYPES = eINSTANCE.getRepositoryDispatchEvent_EventTypes();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.InputImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DESCRIPTION = eINSTANCE.getInput_Description();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DEFAULT = eINSTANCE.getInput_Default();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__REQUIRED = eINSTANCE.getInput_Required();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.WebhookEventImpl <em>Webhook Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.WebhookEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getWebhookEvent()
		 * @generated
		 */
		EClass WEBHOOK_EVENT = eINSTANCE.getWebhookEvent();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.CreateEventImpl <em>Create Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.CreateEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getCreateEvent()
		 * @generated
		 */
		EClass CREATE_EVENT = eINSTANCE.getCreateEvent();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.DeleteEventImpl <em>Delete Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.DeleteEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getDeleteEvent()
		 * @generated
		 */
		EClass DELETE_EVENT = eINSTANCE.getDeleteEvent();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.DeploymentEventImpl <em>Deployment Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.DeploymentEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getDeploymentEvent()
		 * @generated
		 */
		EClass DEPLOYMENT_EVENT = eINSTANCE.getDeploymentEvent();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.IssueEventImpl <em>Issue Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.IssueEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getIssueEvent()
		 * @generated
		 */
		EClass ISSUE_EVENT = eINSTANCE.getIssueEvent();

		/**
		 * The meta object literal for the '<em><b>Activity Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_EVENT__ACTIVITY_TYPES = eINSTANCE.getIssueEvent_ActivityTypes();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.LabelEventImpl <em>Label Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.LabelEventImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getLabelEvent()
		 * @generated
		 */
		EClass LABEL_EVENT = eINSTANCE.getLabelEvent();

		/**
		 * The meta object literal for the '<em><b>Activity Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_EVENT__ACTIVITY_TYPES = eINSTANCE.getLabelEvent_ActivityTypes();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.EnvImpl <em>Env</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.EnvImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getEnv()
		 * @generated
		 */
		EClass ENV = eINSTANCE.getEnv();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV__NAME = eINSTANCE.getEnv_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV__VALUE = eINSTANCE.getEnv_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.RunSettingImpl <em>Run Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.RunSettingImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getRunSetting()
		 * @generated
		 */
		EClass RUN_SETTING = eINSTANCE.getRunSetting();

		/**
		 * The meta object literal for the '<em><b>Working Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_SETTING__WORKING_DIRECTORY = eINSTANCE.getRunSetting_WorkingDirectory();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_SETTING__SHELL = eINSTANCE.getRunSetting_Shell();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_SETTING__WITH = eINSTANCE.getRunSetting_With();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.EnvironmentImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NAME = eINSTANCE.getEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__URL = eINSTANCE.getEnvironment_Url();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.RunImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getRun()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRun();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__NAME = eINSTANCE.getRun_Name();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__COMMANDS = eINSTANCE.getRun_Commands();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.InputParameterImpl <em>Input Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.InputParameterImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getInputParameter()
		 * @generated
		 */
		EClass INPUT_PARAMETER = eINSTANCE.getInputParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PARAMETER__NAME = eINSTANCE.getInputParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PARAMETER__VALUE = eINSTANCE.getInputParameter_Value();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.RepositoryImpl
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__WORKFLOWS = eINSTANCE.getRepository_Workflows();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType <em>Issue Activity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getIssueActivityType()
		 * @generated
		 */
		EEnum ISSUE_ACTIVITY_TYPE = eINSTANCE.getIssueActivityType();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType <em>Label Activity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType
		 * @see uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionPackageImpl#getLabelActivityType()
		 * @generated
		 */
		EEnum LABEL_ACTIVITY_TYPE = eINSTANCE.getLabelActivityType();

	}

} //GithubactionPackage
