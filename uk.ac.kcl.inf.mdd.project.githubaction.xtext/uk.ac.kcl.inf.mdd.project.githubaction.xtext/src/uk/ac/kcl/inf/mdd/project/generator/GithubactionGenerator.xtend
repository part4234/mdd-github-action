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

import uk.ac.kcl.inf.mdd.project.githubaction.*; //says deprecated but works :o

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GithubactionGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val model = resource.contents.head as Repository
		fsa.generateFile(resource.deriveStatsTargetFileNameFor, model.doGenerateStats )
		
		//The base call, this doesnt differ on the 2 file requirement in the same repo
		fsa.generateFile(resource.deriveStatsTargetFileNameFor, model.doGenerateClass)
		
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
		# This is the generated .yaml file for the input repository.
		# Files are individually generated Individually for each workflow and differ by main/feature
		
		�program.workflows.map[generateWorkFlowStmt()].join('\n')�
		
	
	''' 
	// �� Ignore the name and just append to it. Get it from the top attribute values.
	// Files need to be split here for master and featre- TBD
	dispatch def String generateWorkFlowStmt(Workflow stmt) '''
		name: �stmt.name�
	
		�if (stmt.on !== ""){'''on:'''}��stmt.on.get(0).generateEventStmt�
		
		�if (stmt.env !== ""){'''env:'''}��stmt.on.get(0).generateEventStmt�
		
		�if (stmt.defaults !== ""){'''defaults:'''}��stmt.on.get(0).generateEventStmt�
		
		�if (stmt.jobs !== ""){'''jobs:'''}��stmt.on.get(0).generateEventStmt�
		
		'''


	//add more methods to handle the rest calls
	dispatch def String generateEventStmt(Event stmt) '''
		
		�if (stmt === PushEvent){'''    push:'''}��generatePushEventStmt(PushEvent)�
	
	'''	
	
	
	dispatch def String generatePushEventStmt(PushEvent stmt) ''''''
	
	
	
	
	
	
	dispatch def String generateActiontStmt(Job stmt) '''
	on:
		(�if (stmt.jobName === '' ) {'''-'''}�);
	'''
	

	
	
	dispatch def String generateActiontStmt(RunSetting stmt) ''''''
		
	dispatch def String generateActiontsStmt(Job stmt) ''''''
	
	dispatch def String generateActiontStmt(Step stmt) ''''''
	
	// check for value comparisons here - may need to hardcode it
	dispatch def String generateActiontStmt(IssueEvent stmt) '''
	
	�if (stmt.activityTypes === 'opened') {'''name:'''}���);
	
	
	
	
	
	
	
	'''
	
	dispatch def String generateActiontStmt(Name stmt) '''
	
	
	'''
	/* 
	dispatch def String generateActiontStmt(Workflow stmt) ''''''
	
	dispatch def String generateActiontStmt(Workflow stmt) ''''''
	
	dispatch def String generateActiontStmt(Workflow stmt) ''''''
	
	dispatch def String generateActiontStmt(Workflow stmt) ''''''
	*/
	
		
}
