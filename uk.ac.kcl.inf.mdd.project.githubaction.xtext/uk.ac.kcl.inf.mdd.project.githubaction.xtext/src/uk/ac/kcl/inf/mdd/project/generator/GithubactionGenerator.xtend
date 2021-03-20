/*
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mdd.project.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import uk.ac.kcl.inf.mdd.project.githubaction.Repository;
import uk.ac.kcl.inf.mdd.project.githubaction.Workflow;
import uk.ac.kcl.inf.mdd.project.githubaction.Event;
import uk.ac.kcl.inf.mdd.project.githubaction.Job;
import uk.ac.kcl.inf.mdd.project.githubaction.Step;

import uk.ac.kcl.inf.mdd.project.githubaction.*; import org.eclipse.emf.common.util.EList

//says deprecated but works :o

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GithubactionGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val model = resource.contents.head as Repository
		//fsa.generateFile(resource.deriveStatsTargetFileNameFor, model.doGenerateStats ) -- To be added later for file generation
		
		//val className = resource.deriveClassNameFor
		fsa.generateFile( 'test.txt', model.doGenerateClass())
		
		//split file using the link shown
		
		}
	
	
	def deriveStatsTargetFileNameFor(Resource resource) {
		resource.URI.appendFileExtension('yaml').lastSegment
	}
	

	def String doGenerateStats(Repository program) '''
		Program contains:
		
		- �program.eAllContents.filter(Repository).size� Repositories
		- �program.eAllContents.filter(Workflow).size� Workflows
		- �program.eAllContents.filter(Event).size� Events
		- �program.eAllContents.filter(Job).size� Jobs
		- �program.eAllContents.filter(Step).size� Steps

	'''
	
	def deriveClassNameFor(Resource resource) {
		val origName = resource.URI.lastSegment
		
		origName.substring(0, origName.indexOf('.')).toFirstUpper + 'Turtle'
	}
	
	/*
	 * Below are parseable dispatch mathos for all grammar types
	 */
	def String doGenerateClass(Repository program) '''
		�program.workflows.map[generateWorkflow(new Environment)].join('\n')�
	'''

	private static class Environment {
		var int counter = 0
		def getFreshVarName() '''i_�counter++�'''
		def exit() { counter-- }
	}
	
	def String generateWorkflow(Workflow workflow, Environment env) '''
		name: �workflow.name.toString.join('\n')�
		�IF !workflow.on.empty�
			on:
			�FOR event : workflow.on�
				�event�
				�event.generateEvent().join('\n')�
			�ENDFOR�
		�ENDIF�
		�IF !workflow.jobs.empty�
			jobs:
			�FOR job : workflow.jobs�
				�generateJob(job).join('\n')�
			�ENDFOR�
		�ENDIF�
	'''
    
   // assuming the attributes are in EList we simply check the 1st index as null or not
   /*
    * 		�if (!event.tags.empty && event.tags.get(1) !== null){'''stmt.branches.get(1)'''}�
		�if (!event.branchesIgnore.empty && event.branchesIgnore.get(1) !== null){'''branches:'''+ event.branches.get(1)}�
		�if (!event.tagsIgnore.empty && event.tagsIgnore.get(1) !== null){'''stmt.branches.get(1)'''}�
		�if (!event.paths.empty && event.paths.get(1) !== null){'''branches:'''+ event.branches.get(1)}�
		�if (!event.pathsIgnore.empty && event.pathsIgnore.get(1) !== null){'''stmt.branches.get(1)'''}�
    */
	dispatch def String generateEvent(PushEvent event) '''
			push:
		�if (!event.branches.empty && event.branches.get(1) !== null){'''	branches: �event.branches.get(1)�'''}� 
				
	'''
	
	dispatch def String generateEvent(PullRequestEvent stmt) '''
		�if (stmt.branches.get(1) !== null){'''branches:'''+ stmt.branches.get(1)}�
		�if (stmt.tags.get(1) !== null){'''stmt.branches.get(1)'''}�
		�if (stmt.branchesIgnore.get(1) !== null){'''branches:'''+ stmt.branches.get(1)}�
		�if (stmt.tagsIgnore.get(1) !== null){'''stmt.branches.get(1)'''}�
		�if (stmt.paths.get(1) !== null){'''branches:'''+ stmt.branches.get(1)}�
		�if (stmt.pathsIgnore.get(1) !== null){'''stmt.branches.get(1)'''}�			
	'''
	
	dispatch def String generateEvent(ScheduleEvent stmt) ''''''	
	dispatch def String generateEvent(WorkflowDispatchEvent stmt) ''''''
	dispatch def String generateEvent(RepositoryDispatchEvent stmt) ''''''	
	dispatch def String generateEvent(CreateEvent stmt) ''''''
	dispatch def String generateEvent(DeleteEvent stmt) ''''''
	dispatch def String generateEvent(DeploymentEvent stmt) ''''''	
	dispatch def String generateEvent(IssueEvent stmt) ''''''	
	dispatch def String generateEvent(LabelEvent stmt) ''''''	
	

	def String generateJob(Job job) '''
			test:
			name: �job.name.toString�
			runsOn: �job.name.toString�
			name: �job.runsOn.toString�
		�IF !job.steps.empty�
			steps:
			�FOR step : job.steps�
				�generateStepsType(step).join('\n')�
			�ENDFOR�	
		�ENDIF�						
	'''	

	def String generateStepsType(Step step) '''
		�IF step.name !== null�		- name: �step.name��ENDIF�
		�IF step.name === null && step.uses !== null�		- uses: �ELSEIF step.uses !== null� 	 uses: �step.uses.toString��ENDIF�
		
		�IF !step.with.empty�with: �step.name�
			�FOR input : step.with��input.name�:�input.value��ENDFOR�
		�ENDIF�
		�IF !step.run.empty�run: 
			�FOR line : step.run��line��ENDFOR�
		�ENDIF�
		�IF !step.env.empty�env: �step.name�
			�FOR input : step.env��input.name�:�input.value��ENDFOR�
		�ENDIF�
	'''	
}
