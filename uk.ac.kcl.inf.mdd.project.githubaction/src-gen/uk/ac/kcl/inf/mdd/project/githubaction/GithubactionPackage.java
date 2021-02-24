/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	int BRANCH_EVENT__BRANCHES = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__TAGS = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Branches Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__BRANCHES_IGNORE = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tags Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__TAGS_IGNORE = EVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__PATHS = EVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Paths Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT__PATHS_IGNORE = EVENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Branch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Branch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__EVENTS = 1;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 2;

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
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 0;

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
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.Workflow#getEvents()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Events();

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
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__EVENTS = eINSTANCE.getWorkflow_Events();

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

	}

} //GithubactionPackage
