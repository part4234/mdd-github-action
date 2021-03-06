/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mdd.project.githubaction.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import uk.ac.kcl.inf.mdd.project.githubaction.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage
 * @generated
 */
public class GithubactionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GithubactionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GithubactionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GithubactionPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GithubactionPackage.REPOSITORY:
      {
        Repository repository = (Repository)theEObject;
        T result = caseRepository(repository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.WORKFLOW:
      {
        Workflow workflow = (Workflow)theEObject;
        T result = caseWorkflow(workflow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.JOB:
      {
        Job job = (Job)theEObject;
        T result = caseJob(job);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.STEP:
      {
        Step step = (Step)theEObject;
        T result = caseStep(step);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.ENV:
      {
        Env env = (Env)theEObject;
        T result = caseEnv(env);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.INPUT_PARAMETER:
      {
        InputParameter inputParameter = (InputParameter)theEObject;
        T result = caseInputParameter(inputParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.ENVIRONMENT:
      {
        Environment environment = (Environment)theEObject;
        T result = caseEnvironment(environment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.RUN_SETTING:
      {
        RunSetting runSetting = (RunSetting)theEObject;
        T result = caseRunSetting(runSetting);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.PUSH_EVENT:
      {
        PushEvent pushEvent = (PushEvent)theEObject;
        T result = casePushEvent(pushEvent);
        if (result == null) result = caseEvent(pushEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.PULL_REQUEST_EVENT:
      {
        PullRequestEvent pullRequestEvent = (PullRequestEvent)theEObject;
        T result = casePullRequestEvent(pullRequestEvent);
        if (result == null) result = caseEvent(pullRequestEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.SCHEDULE_EVENT:
      {
        ScheduleEvent scheduleEvent = (ScheduleEvent)theEObject;
        T result = caseScheduleEvent(scheduleEvent);
        if (result == null) result = caseEvent(scheduleEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.WORKFLOW_DISPATCH_EVENT:
      {
        WorkflowDispatchEvent workflowDispatchEvent = (WorkflowDispatchEvent)theEObject;
        T result = caseWorkflowDispatchEvent(workflowDispatchEvent);
        if (result == null) result = caseEvent(workflowDispatchEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.REPOSITORY_DISPATCH_EVENT:
      {
        RepositoryDispatchEvent repositoryDispatchEvent = (RepositoryDispatchEvent)theEObject;
        T result = caseRepositoryDispatchEvent(repositoryDispatchEvent);
        if (result == null) result = caseEvent(repositoryDispatchEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.CREATE_EVENT:
      {
        CreateEvent createEvent = (CreateEvent)theEObject;
        T result = caseCreateEvent(createEvent);
        if (result == null) result = caseEvent(createEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.DELETE_EVENT:
      {
        DeleteEvent deleteEvent = (DeleteEvent)theEObject;
        T result = caseDeleteEvent(deleteEvent);
        if (result == null) result = caseEvent(deleteEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.DEPLOYMENT_EVENT:
      {
        DeploymentEvent deploymentEvent = (DeploymentEvent)theEObject;
        T result = caseDeploymentEvent(deploymentEvent);
        if (result == null) result = caseEvent(deploymentEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.ISSUE_EVENT:
      {
        IssueEvent issueEvent = (IssueEvent)theEObject;
        T result = caseIssueEvent(issueEvent);
        if (result == null) result = caseEvent(issueEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.LABEL_EVENT:
      {
        LabelEvent labelEvent = (LabelEvent)theEObject;
        T result = caseLabelEvent(labelEvent);
        if (result == null) result = caseEvent(labelEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GithubactionPackage.INPUT:
      {
        Input input = (Input)theEObject;
        T result = caseInput(input);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepository(Repository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflow(Workflow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Job</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Job</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJob(Job object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Step</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStep(Step object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Env</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Env</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnv(Env object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputParameter(InputParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironment(Environment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Run Setting</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Run Setting</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunSetting(RunSetting object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Push Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Push Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePushEvent(PushEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pull Request Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pull Request Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePullRequestEvent(PullRequestEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Schedule Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Schedule Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScheduleEvent(ScheduleEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workflow Dispatch Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workflow Dispatch Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkflowDispatchEvent(WorkflowDispatchEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Repository Dispatch Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Repository Dispatch Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRepositoryDispatchEvent(RepositoryDispatchEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateEvent(CreateEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteEvent(DeleteEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deployment Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deployment Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeploymentEvent(DeploymentEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Issue Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Issue Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIssueEvent(IssueEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelEvent(LabelEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GithubactionSwitch
