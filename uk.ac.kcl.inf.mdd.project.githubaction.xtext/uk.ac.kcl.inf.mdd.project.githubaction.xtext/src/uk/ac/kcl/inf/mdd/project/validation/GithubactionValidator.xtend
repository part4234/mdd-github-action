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

	
	
	
}