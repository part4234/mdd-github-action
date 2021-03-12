/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage
 * @generated
 */
public interface GithubactionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GithubactionFactory eINSTANCE = uk.ac.kcl.inf.mdd.project.githubaction.impl.GithubactionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Push Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Event</em>'.
	 * @generated
	 */
	PushEvent createPushEvent();

	/**
	 * Returns a new object of class '<em>Pull Request Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pull Request Event</em>'.
	 * @generated
	 */
	PullRequestEvent createPullRequestEvent();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job</em>'.
	 * @generated
	 */
	Job createJob();

	/**
	 * Returns a new object of class '<em>Schedule Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule Event</em>'.
	 * @generated
	 */
	ScheduleEvent createScheduleEvent();

	/**
	 * Returns a new object of class '<em>Workflow Dispatch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Dispatch Event</em>'.
	 * @generated
	 */
	WorkflowDispatchEvent createWorkflowDispatchEvent();

	/**
	 * Returns a new object of class '<em>Repository Dispatch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository Dispatch Event</em>'.
	 * @generated
	 */
	RepositoryDispatchEvent createRepositoryDispatchEvent();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Create Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Event</em>'.
	 * @generated
	 */
	CreateEvent createCreateEvent();

	/**
	 * Returns a new object of class '<em>Delete Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Event</em>'.
	 * @generated
	 */
	DeleteEvent createDeleteEvent();

	/**
	 * Returns a new object of class '<em>Deployment Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Event</em>'.
	 * @generated
	 */
	DeploymentEvent createDeploymentEvent();

	/**
	 * Returns a new object of class '<em>Issue Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Event</em>'.
	 * @generated
	 */
	IssueEvent createIssueEvent();

	/**
	 * Returns a new object of class '<em>Label Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Event</em>'.
	 * @generated
	 */
	LabelEvent createLabelEvent();

	/**
	 * Returns a new object of class '<em>Env</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Env</em>'.
	 * @generated
	 */
	Env createEnv();

	/**
	 * Returns a new object of class '<em>Run Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Setting</em>'.
	 * @generated
	 */
	RunSetting createRunSetting();

	/**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
	Environment createEnvironment();

	/**
	 * Returns a new object of class '<em>Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run</em>'.
	 * @generated
	 */
	Run createRun();

	/**
	 * Returns a new object of class '<em>Input Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Parameter</em>'.
	 * @generated
	 */
	InputParameter createInputParameter();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GithubactionPackage getGithubactionPackage();

} //GithubactionFactory
