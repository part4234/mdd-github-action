/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mdd.project.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.mdd.project.githubaction.CreateEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.DeleteEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.DeploymentEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Env;
import uk.ac.kcl.inf.mdd.project.githubaction.Environment;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.Input;
import uk.ac.kcl.inf.mdd.project.githubaction.InputParameter;
import uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Job;
import uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.PullRequestEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.PushEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Repository;
import uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.RunSetting;
import uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Step;
import uk.ac.kcl.inf.mdd.project.githubaction.Workflow;
import uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent;
import uk.ac.kcl.inf.mdd.project.services.GithubactionGrammarAccess;

@SuppressWarnings("all")
public class GithubactionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GithubactionGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == GithubactionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case GithubactionPackage.CREATE_EVENT:
				sequence_CreateEvent(context, (CreateEvent) semanticObject); 
				return; 
			case GithubactionPackage.DELETE_EVENT:
				sequence_DeleteEvent(context, (DeleteEvent) semanticObject); 
				return; 
			case GithubactionPackage.DEPLOYMENT_EVENT:
				sequence_DeploymentEvent(context, (DeploymentEvent) semanticObject); 
				return; 
			case GithubactionPackage.ENV:
				sequence_Env(context, (Env) semanticObject); 
				return; 
			case GithubactionPackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case GithubactionPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case GithubactionPackage.INPUT_PARAMETER:
				sequence_InputParameter(context, (InputParameter) semanticObject); 
				return; 
			case GithubactionPackage.ISSUE_EVENT:
				sequence_IssueEvent(context, (IssueEvent) semanticObject); 
				return; 
			case GithubactionPackage.JOB:
				sequence_Job(context, (Job) semanticObject); 
				return; 
			case GithubactionPackage.LABEL_EVENT:
				sequence_LabelEvent(context, (LabelEvent) semanticObject); 
				return; 
			case GithubactionPackage.PULL_REQUEST_EVENT:
				sequence_PullRequestEvent(context, (PullRequestEvent) semanticObject); 
				return; 
			case GithubactionPackage.PUSH_EVENT:
				sequence_PushEvent(context, (PushEvent) semanticObject); 
				return; 
			case GithubactionPackage.REPOSITORY:
				sequence_Repository(context, (Repository) semanticObject); 
				return; 
			case GithubactionPackage.REPOSITORY_DISPATCH_EVENT:
				sequence_RepositoryDispatchEvent(context, (RepositoryDispatchEvent) semanticObject); 
				return; 
			case GithubactionPackage.RUN_SETTING:
				sequence_RunSetting(context, (RunSetting) semanticObject); 
				return; 
			case GithubactionPackage.SCHEDULE_EVENT:
				sequence_ScheduleEvent(context, (ScheduleEvent) semanticObject); 
				return; 
			case GithubactionPackage.STEP:
				sequence_Step(context, (Step) semanticObject); 
				return; 
			case GithubactionPackage.WORKFLOW:
				sequence_Workflow(context, (Workflow) semanticObject); 
				return; 
			case GithubactionPackage.WORKFLOW_DISPATCH_EVENT:
				sequence_WorkflowDispatchEvent(context, (WorkflowDispatchEvent) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Event returns CreateEvent
	 *     CreateEvent returns CreateEvent
	 *
	 * Constraint:
	 *     {CreateEvent}
	 */
	protected void sequence_CreateEvent(ISerializationContext context, CreateEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns DeleteEvent
	 *     DeleteEvent returns DeleteEvent
	 *
	 * Constraint:
	 *     {DeleteEvent}
	 */
	protected void sequence_DeleteEvent(ISerializationContext context, DeleteEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns DeploymentEvent
	 *     DeploymentEvent returns DeploymentEvent
	 *
	 * Constraint:
	 *     {DeploymentEvent}
	 */
	protected void sequence_DeploymentEvent(ISerializationContext context, DeploymentEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Env returns Env
	 *
	 * Constraint:
	 *     (name=EString value=EString)
	 */
	protected void sequence_Env(ISerializationContext context, Env semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubactionPackage.Literals.ENV__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubactionPackage.Literals.ENV__NAME));
			if (transientValues.isValueTransient(semanticObject, GithubactionPackage.Literals.ENV__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubactionPackage.Literals.ENV__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnvAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getEnvAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (name=EString url=EString?)
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InputParameter returns InputParameter
	 *
	 * Constraint:
	 *     (name=EString value=EString)
	 */
	protected void sequence_InputParameter(ISerializationContext context, InputParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, GithubactionPackage.Literals.INPUT_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubactionPackage.Literals.INPUT_PARAMETER__NAME));
			if (transientValues.isValueTransient(semanticObject, GithubactionPackage.Literals.INPUT_PARAMETER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GithubactionPackage.Literals.INPUT_PARAMETER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInputParameterAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInputParameterAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (required?='required'? name=EString description=EString? default=EString?)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns IssueEvent
	 *     IssueEvent returns IssueEvent
	 *
	 * Constraint:
	 *     (activityTypes+=IssueActivityType activityTypes+=IssueActivityType*)?
	 */
	protected void sequence_IssueEvent(ISerializationContext context, IssueEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Job returns Job
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         jobName=EString? 
	 *         (needs+=[Job|EString] needs+=[Job|EString]*)? 
	 *         runsOn=EString? 
	 *         environment=[Environment|EString]? 
	 *         (outputs+=EString outputs+=EString*)? 
	 *         (env+=Env env+=Env*)? 
	 *         (defaults+=RunSetting defaults+=RunSetting*)? 
	 *         if=EString? 
	 *         (steps+=Step steps+=Step*)?
	 *     )
	 */
	protected void sequence_Job(ISerializationContext context, Job semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns LabelEvent
	 *     LabelEvent returns LabelEvent
	 *
	 * Constraint:
	 *     (activityTypes+=LabelActivityType activityTypes+=LabelActivityType*)?
	 */
	protected void sequence_LabelEvent(ISerializationContext context, LabelEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns PullRequestEvent
	 *     PullRequestEvent returns PullRequestEvent
	 *
	 * Constraint:
	 *     (
	 *         (branches+=EString branches+=EString*)? 
	 *         (tags+=EString tags+=EString*)? 
	 *         (branchesIgnore+=EString branchesIgnore+=EString*)? 
	 *         (tagsIgnore+=EString tagsIgnore+=EString*)? 
	 *         (paths+=EString paths+=EString*)? 
	 *         (pathsIgnore+=EString pathsIgnore+=EString*)?
	 *     )
	 */
	protected void sequence_PullRequestEvent(ISerializationContext context, PullRequestEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns PushEvent
	 *     PushEvent returns PushEvent
	 *
	 * Constraint:
	 *     (
	 *         (branches+=EString branches+=EString*)? 
	 *         (tags+=EString tags+=EString*)? 
	 *         (branchesIgnore+=EString branchesIgnore+=EString*)? 
	 *         (tagsIgnore+=EString tagsIgnore+=EString*)? 
	 *         (paths+=EString paths+=EString*)? 
	 *         (pathsIgnore+=EString pathsIgnore+=EString*)?
	 *     )
	 */
	protected void sequence_PushEvent(ISerializationContext context, PushEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns RepositoryDispatchEvent
	 *     RepositoryDispatchEvent returns RepositoryDispatchEvent
	 *
	 * Constraint:
	 *     (eventTypes+=EString eventTypes+=EString*)?
	 */
	protected void sequence_RepositoryDispatchEvent(ISerializationContext context, RepositoryDispatchEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Repository returns Repository
	 *
	 * Constraint:
	 *     (workflows+=Workflow workflows+=Workflow*)?
	 */
	protected void sequence_Repository(ISerializationContext context, Repository semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RunSetting returns RunSetting
	 *
	 * Constraint:
	 *     (workingDirectory=EString? shell=EString? (with+=Env with+=Env*)?)
	 */
	protected void sequence_RunSetting(ISerializationContext context, RunSetting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns ScheduleEvent
	 *     ScheduleEvent returns ScheduleEvent
	 *
	 * Constraint:
	 *     (minute=EString? hour=EString? day=EString? month=EString? dayOfWeek=EString?)
	 */
	protected void sequence_ScheduleEvent(ISerializationContext context, ScheduleEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Step returns Step
	 *
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         stepName=EString? 
	 *         if=EString? 
	 *         uses=EString? 
	 *         (run+=EString run+=EString*)? 
	 *         runSetting=RunSetting? 
	 *         (with+=InputParameter with+=InputParameter*)? 
	 *         entrypoint=EString? 
	 *         args=EString? 
	 *         (env+=Env env+=Env*)?
	 *     )
	 */
	protected void sequence_Step(ISerializationContext context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns WorkflowDispatchEvent
	 *     WorkflowDispatchEvent returns WorkflowDispatchEvent
	 *
	 * Constraint:
	 *     (inputs+=Input inputs+=Input*)?
	 */
	protected void sequence_WorkflowDispatchEvent(ISerializationContext context, WorkflowDispatchEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Workflow returns Workflow
	 *
	 * Constraint:
	 *     (name=EString? (on+=Event on+=Event*)? (env+=Env env+=Env*)? defaults=RunSetting? (jobs+=Job jobs+=Job*)?)
	 */
	protected void sequence_Workflow(ISerializationContext context, Workflow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
