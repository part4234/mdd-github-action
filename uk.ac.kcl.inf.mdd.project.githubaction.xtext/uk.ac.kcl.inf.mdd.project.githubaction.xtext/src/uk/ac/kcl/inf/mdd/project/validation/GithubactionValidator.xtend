package uk.ac.kcl.inf.mdd.project.validation

import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.validation.Check

import uk.ac.kcl.inf.mdd.project.githubaction.Repository;
import uk.ac.kcl.inf.mdd.project.githubaction.Workflow;
import uk.ac.kcl.inf.mdd.project.githubaction.Event;
import uk.ac.kcl.inf.mdd.project.githubaction.Job;
import uk.ac.kcl.inf.mdd.project.githubaction.Step;

import uk.ac.kcl.inf.mdd.project.githubaction.*; 
/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GithubactionValidator extends AbstractGithubactionValidator  {
	
	//This checks for mis-spellings and case-sensitiveness
	public static val INVALID_VARIABLE_NAME = 'uk.ac.kcl.inf.mdd.project.githubaction.INVALID_VARIABLE_NAME'
	public static val DUPLICATE_VARIABLE_NAME = 'uk.ac.kcl.inf.mdd.project.githubaction.DUPLICATE_VARIABLE_NAME'	
	public static val CASE_VARIABLE_ISSUE = 'uk.ac.kcl.inf.mdd.project.githubaction.WRONG_CASE_USAGE'	
	public static val VARIABLE_DEF_REQUIRED = 'uk.ac.kcl.inf.mdd.project.githubaction.VARIABLE_DEF_REQUIRED'		
	public static val KEY_DEF_ERROR = 'uk.ac.kcl.inf.mdd.project.githubaction.KEY_DEF_ERROR'		

	/*
	 * Required values checking
	 */
		@Check
	def checkRequiredVariablesNames(Repository program) {
		if (program.workflows.size === 0) {
			warning('Workflow definitions required ', program,
				GithubactionPackage.Literals.WORKFLOW__NAME, DUPLICATE_VARIABLE_NAME)
		}
	}		

	@Check
	def checkRequiredVariablesNames(Workflow workF) {
		if (workF.name === ""){
			error('Workflow name is required', workF,
				GithubactionPackage.Literals.PUSH_EVENT__BRANCHES, VARIABLE_DEF_REQUIRED)
		}		
		if (workF.on.size === 0){
			warning('Event definition required', workF,
				GithubactionPackage.Literals.PUSH_EVENT__BRANCHES, VARIABLE_DEF_REQUIRED)
		}
		if (workF.jobs.size === 0){
			warning('Event definition required', workF,
				GithubactionPackage.Literals.PUSH_EVENT__BRANCHES, DUPLICATE_VARIABLE_NAME)
		}				
	}		
	
	/*
	 * Case sensitive/insensitive checks below
	 */
	
	@Check
	def checkVariableNamesStartWithUpperCase(Workflow decl) {
		if (!Character.isUpperCase(decl.name.charAt(0))) {
			warning('Name should start with an upper-case character', decl,
				GithubactionPackage.Literals.WORKFLOW__NAME, CASE_VARIABLE_ISSUE)
		}
	}
	
	@Check
	def checkVariableNamesStartWithUpperCase(Job decl) {
		if (!Character.isUpperCase(decl.name.charAt(0))) {
			warning('Name should start with an upper-case character', decl,
				GithubactionPackage.Literals.WORKFLOW__NAME, CASE_VARIABLE_ISSUE)
		}
	}
	
	@Check
	def checkVariableNamesStartWithUpperCase(Step decl) {
		if (!Character.isUpperCase(decl.name.charAt(0))) {
			warning('Name should start with an upper-case character', decl,
				GithubactionPackage.Literals.WORKFLOW__NAME, CASE_VARIABLE_ISSUE)
		}
	}	
	
	@Check
	def checkVariableNamesStartWithUpperCase(Env decl) {
		if (!Character.isLowerCase(decl.name.charAt(0))) {
			warning('Name should start with a lower-case character', decl,
				GithubactionPackage.Literals.WORKFLOW__NAME, CASE_VARIABLE_ISSUE)
		}
	}	

	/*
	 * Unique checks for definitions
	 */
	 
	 //checks duplicate key definitions
	@Check
	def checkRequiredVariablesNames(Step innerSteps) {
		if (innerSteps.with.get(0).name === innerSteps.with.get(1).name) {
			error('Duplicate keys definitions are not alloweed ', innerSteps,
				GithubactionPackage.Literals.STEP__WITH, KEY_DEF_ERROR)
		}
	}
	
	
			
	
}