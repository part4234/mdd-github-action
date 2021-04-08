package uk.ac.kcl.inf.mdd.project.validation

import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.validation.Check
import uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent
import uk.ac.kcl.inf.mdd.project.githubaction.Env
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage
import uk.ac.kcl.inf.mdd.project.githubaction.InputParameter
import uk.ac.kcl.inf.mdd.project.githubaction.Job
import uk.ac.kcl.inf.mdd.project.githubaction.Repository
import uk.ac.kcl.inf.mdd.project.githubaction.Step
import uk.ac.kcl.inf.mdd.project.githubaction.Workflow

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GithubactionValidator extends AbstractGithubactionValidator { 

	public static val DUPLICATE_NAMING = 'uk.ac.kcl.inf.mdd.project.githubaction.DUPLICATE_NAMING'
	public static val ATTRIBUTE_REQUIRED = 'uk.ac.kcl.inf.mdd.project.githubaction.ATTRIBUTE_REQUIRED'
	public static val CONFLICT_TRIGGER = 'uk.ac.kcl.inf.mdd.project.githubaction.CONFLICT_TRIGGER'
	public static val WRONG_CASE_USAGE = 'uk.ac.kcl.inf.mdd.project.githubaction.WRONG_CASE_USAGE'
	public static val NOT_WELL_FORMED = 'uk.ac.kcl.inf.mdd.project.githubaction.NOT_WELL_FORMED'
	
	val cache = new ArrayList;

	/*
	 * Check duplicate naming
	 */

	@Check
	def checkDuplicateNaming(Repository repo) {
		for (Workflow wf: repo.workflows) {
			if (wf.name != '') {
				if (cache.contains(wf.name)) {
					error('Workflow names must be unique', wf,
						GithubactionPackage.Literals.WORKFLOW__NAME, DUPLICATE_NAMING)
				}
				cache.add(wf.name)
			}			
		}
		cache.clear
	}
	
	@Check
	def checkDuplicateNaming(Workflow wf) {
		for (Job job: wf.jobs) {
			if (job.name != '') {
				if (cache.contains(job.name)) {
				error('Job IDs must be unique', job,
					GithubactionPackage.Literals.JOB__NAME, DUPLICATE_NAMING)
				}	
				cache.add(job.name)
			}			
		}
		cache.clear
	}		

	@Check
	def checkDuplicateNaming(Job job) {
		for (Step step: job.steps) {
			if (step.name !== null) {
				if (cache.contains(step.name)){
					error('Step IDs must be unique', step,
						GithubactionPackage.Literals.STEP__NAME, DUPLICATE_NAMING)
				}	
				cache.add(step.name)				
			}
		}
		cache.clear
	}
	
	@Check
	def checkDuplicateNaming(Step step) {
		for (InputParameter param : step.with) {
			if (param.name != '') {
				if (cache.contains(param.name)) {
					error('Input parameter keys must be unique', param,
						GithubactionPackage.Literals.INPUT_PARAMETER__NAME, DUPLICATE_NAMING)
				}
				cache.add(param.name)				
			}
		}
		cache.clear
	}
	
	@Check
	def checkDuplicateNaming(Env env) {
		env.eContainer.checkEnvKey
	}
	
	def dispatch checkEnvKey(Workflow wf) {
		checkDuplicateEnvKey(wf.env)
	}
	
	def dispatch checkEnvKey(Job job) {
		checkDuplicateEnvKey(job.env)
	}
	
	def dispatch checkEnvKey(Step step) {
		checkDuplicateEnvKey(step.env) 
	}
	
	def checkDuplicateEnvKey(EList<Env> envs) {
		for (Env env : envs){
			if (env.name != '') {
				if (cache.contains(env.name)) {
					error('Env keys must be unique', env,
						GithubactionPackage.Literals.ENV__NAME, DUPLICATE_NAMING)
				}
				cache.add(env.name)				
			}
		}
		cache.clear
	}
	

	/*
	 * Check required attributes
	 */	

	@Check
	def checkRequiredAttributes(Workflow wf) {
		if (wf.name == '') {
			error('Workflow name cannot be empty', wf,
				GithubactionPackage.Literals.WORKFLOW__NAME, ATTRIBUTE_REQUIRED)
		}			
	}
	
	@Check
	def checkRequiredAttributes(Env env) {
		if (env.name == '') {
			error('Env name cannot be empty', env,
				GithubactionPackage.Literals.ENV__NAME, ATTRIBUTE_REQUIRED)
		}
		if (env.value == '') {
			error('Env value cannot be empty', env,
				GithubactionPackage.Literals.ENV__VALUE, ATTRIBUTE_REQUIRED)
		}
	}
	
	@Check
	def checkRequiredAttributes(InputParameter param) {
		if (param.name == '') {
			error('Input parameter value cannot be empty', param,
				GithubactionPackage.Literals.INPUT_PARAMETER__NAME, ATTRIBUTE_REQUIRED)
		}
		if (param.value == '') {
			error('Input parameter value cannot be empty', param,
				GithubactionPackage.Literals.INPUT_PARAMETER__VALUE, ATTRIBUTE_REQUIRED)
		}
	}
	
	/*
	 * Check conflicting event triggers
	 */
	
	@Check
	def checkEventConflict(BranchEvent event) {
		val branchConflict = checkConflict(event.branches, event.branchesIgnore)
		val tagConflict = checkConflict(event.tags, event.tagsIgnore)
		val pathConflict = checkConflict(event.paths, event.pathsIgnore)

		if (branchConflict || tagConflict || pathConflict) {
			error('Event trigger conflicted, workflow will never run', event, null, CONFLICT_TRIGGER)
		}
	}
	
	def checkConflict(EList<?> list, EList<?> ignoreList) {
		if (list.size > 0 && ignoreList.size > 0) {
			return list.exists[exp | ignoreList.contains(exp)]
		}
		return false
	}
	
	/*
	 * Check case sensitivity
	 */
	
	@Check
	def checkNameStartWithUpperCase(Workflow wf) {
		if (wf.name != '' && !Character.isUpperCase(wf.name.charAt(0))) {
			warning('Workflow name should start with an upper-case character', wf,
				GithubactionPackage.Literals.WORKFLOW__NAME, uk.ac.kcl.inf.mdd.project.validation.GithubactionValidator.WRONG_CASE_USAGE)
		}
	}
	
	@Check
	def checkNameIsUpperCase(Env env) {
		if (env.name != '') {
			val notUpperCase = env.name.toCharArray.exists[c | Character.isAlphabetic(c) && !Character.isUpperCase(c)]
			if (notUpperCase) {
				warning('Env name should be upper-case', env,
					GithubactionPackage.Literals.ENV__NAME, uk.ac.kcl.inf.mdd.project.validation.GithubactionValidator.WRONG_CASE_USAGE)				
			}
		}
	}
	
	@Check
	def checkIdStartWithLowerCase(Job job) {
		if (job.name != '' && !Character.isLowerCase(job.name.charAt(0))) {
			warning('Job id should start with an lower-case character', job,
				GithubactionPackage.Literals.JOB__NAME, uk.ac.kcl.inf.mdd.project.validation.GithubactionValidator.WRONG_CASE_USAGE)
		}
	}
	
	@Check
	def checkIdStartWithUpperCase(Step step) {
		if (step.name != '' && !Character.isLowerCase(step.name.charAt(0))) {
			warning('Step id should start with a lower-case character', step,
				GithubactionPackage.Literals.STEP__NAME, uk.ac.kcl.inf.mdd.project.validation.GithubactionValidator.WRONG_CASE_USAGE)
		}
	}
	
	/*
	 * Check well-formedness
	 */
	
	@Check
	def checkWellFormedness(Repository repo) {
		if (repo.workflows.size == 0) {
			warning('Repository should have at least one workflow', repo,
				GithubactionPackage.Literals.REPOSITORY__WORKFLOWS, NOT_WELL_FORMED)
		}
	}
	
	@Check
	def checkWellFormedness(Workflow wf) {
		if (wf.on.size == 0) {
			warning('Workflow should have at least one triggering event', wf,
				GithubactionPackage.Literals.WORKFLOW__ON, NOT_WELL_FORMED)
		}
		if (wf.jobs.size == 0) {
			warning('Workflow should have at least one job', wf,
				GithubactionPackage.Literals.WORKFLOW__JOBS, NOT_WELL_FORMED)
		}				
	}
	
	@Check
	def checkWellFormedness(Job job) {
		if (job.steps.size == 0) {
			warning('Job should have at least one step', job,
				GithubactionPackage.Literals.JOB__STEPS, NOT_WELL_FORMED)
		}
	}
	 
	@Check
	def checkWellFormedness(BranchEvent event) {
		if (event.branches.size == 0 && event.branchesIgnore.size == 0
			&& event.tags.size == 0 && event.tagsIgnore.size == 0
			&& event.paths.size == 0 && event.pathsIgnore.size == 0
		) {
			warning('Event should have at least one triggering criteria', event, null, NOT_WELL_FORMED)
		}
	}

}