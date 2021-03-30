package uk.ac.kcl.inf.mdd.project.validation;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import uk.ac.kcl.inf.mdd.project.githubaction.Env;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.Job;
import uk.ac.kcl.inf.mdd.project.githubaction.Repository;
import uk.ac.kcl.inf.mdd.project.githubaction.Step;
import uk.ac.kcl.inf.mdd.project.githubaction.Workflow;
import uk.ac.kcl.inf.mdd.project.validation.AbstractGithubactionValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class GithubactionValidator extends AbstractGithubactionValidator {
  public ArrayList array = new ArrayList<Object>();
  
  public static final String INVALID_VARIABLE_NAME = "uk.ac.kcl.inf.mdd.project.githubaction.INVALID_VARIABLE_NAME";
  
  public static final String DUPLICATE_VARIABLE_NAME = "uk.ac.kcl.inf.mdd.project.githubaction.DUPLICATE_VARIABLE_NAME";
  
  public static final String CASE_VARIABLE_ISSUE = "uk.ac.kcl.inf.mdd.project.githubaction.WRONG_CASE_USAGE";
  
  public static final String VARIABLE_DEF_REQUIRED = "uk.ac.kcl.inf.mdd.project.githubaction.VARIABLE_DEF_REQUIRED";
  
  public static final String KEY_DEF_ERROR = "uk.ac.kcl.inf.mdd.project.githubaction.KEY_DEF_ERROR";
  
  /**
   * Duplicate name checks for workflows, jobs and steps
   */
  @Check
  public void checkDuplicateNaming(final Repository program) {
    EList<Workflow> _workflows = program.getWorkflows();
    for (final Workflow wfObj : _workflows) {
      {
        boolean _contains = this.array.contains(wfObj);
        if (_contains) {
          this.error("Name definiitons must be unique ", wfObj, 
            GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.KEY_DEF_ERROR);
        }
        this.array.add(wfObj);
      }
    }
    this.array.clear();
  }
  
  @Check
  public void checkDuplicateNaming(final Workflow wf) {
    EList<Job> _jobs = wf.getJobs();
    for (final Job jbObj : _jobs) {
      {
        boolean _contains = this.array.contains(jbObj);
        if (_contains) {
          this.error("Name definiitons must be unique ", jbObj, 
            GithubactionPackage.Literals.JOB__NAME, GithubactionValidator.KEY_DEF_ERROR);
        }
        this.array.add(jbObj);
      }
    }
    this.array.clear();
  }
  
  @Check
  public void checkDuplicateNaming(final Job jobs) {
    EList<Step> _steps = jobs.getSteps();
    for (final Step stepObj : _steps) {
      {
        boolean _contains = this.array.contains(stepObj);
        if (_contains) {
          this.error("Name definiitons must be unique", stepObj, 
            GithubactionPackage.Literals.STEP__NAME, GithubactionValidator.KEY_DEF_ERROR);
        }
        this.array.add(stepObj);
      }
    }
    this.array.clear();
  }
  
  /**
   * Required values checking
   */
  @Check
  public void checkRequiredVariablesNames(final Repository program) {
    int _size = program.getWorkflows().size();
    boolean _tripleEquals = (_size == 0);
    if (_tripleEquals) {
      this.warning("Workflow definitions required ", program, 
        GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.DUPLICATE_VARIABLE_NAME);
    }
  }
  
  @Check
  public void checkRequiredVariablesNames(final Workflow workF) {
    String _name = workF.getName();
    boolean _tripleEquals = (_name == "");
    if (_tripleEquals) {
      this.error("Workflow name is required", workF, 
        GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.VARIABLE_DEF_REQUIRED);
    }
    int _size = workF.getOn().size();
    boolean _tripleEquals_1 = (_size == 0);
    if (_tripleEquals_1) {
      this.warning("Event definition required", workF, 
        GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.VARIABLE_DEF_REQUIRED);
    }
    int _size_1 = workF.getJobs().size();
    boolean _tripleEquals_2 = (_size_1 == 0);
    if (_tripleEquals_2) {
      this.warning("Event definition required", workF, 
        GithubactionPackage.Literals.JOB__NAME, GithubactionValidator.DUPLICATE_VARIABLE_NAME);
    }
  }
  
  /**
   * Case sensitive/insensitive checks
   */
  @Check
  public void checkVariableNamesStartWithUpperCase(final Workflow decl) {
    boolean _isUpperCase = Character.isUpperCase(decl.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with an upper-case character", decl, 
        GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.CASE_VARIABLE_ISSUE);
    }
  }
  
  @Check
  public void checkVariableNamesStartWithUpperCase(final Job decl) {
    boolean _isUpperCase = Character.isUpperCase(decl.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with an upper-case character", decl, 
        GithubactionPackage.Literals.JOB__NAME, GithubactionValidator.CASE_VARIABLE_ISSUE);
    }
  }
  
  @Check
  public void checkVariableNamesStartWithUpperCase(final Step decl) {
    boolean _isUpperCase = Character.isUpperCase(decl.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with an upper-case character", decl, 
        GithubactionPackage.Literals.STEP__NAME, GithubactionValidator.CASE_VARIABLE_ISSUE);
    }
  }
  
  @Check
  public void checkVariableNamesStartWithUpperCase(final Env decl) {
    boolean _isLowerCase = Character.isLowerCase(decl.getName().charAt(0));
    boolean _not = (!_isLowerCase);
    if (_not) {
      this.warning("Name should start with a lower-case character", decl, 
        GithubactionPackage.Literals.ENV__NAME, GithubactionValidator.CASE_VARIABLE_ISSUE);
    }
  }
  
  /**
   * Unique key definitions
   */
  @Check
  public void checkForDuplicateKeyError(final Step innerSteps) {
    int _size = innerSteps.getWith().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      String _name = innerSteps.getWith().get(0).getName();
      String _name_1 = innerSteps.getWith().get(1).getName();
      boolean _tripleEquals = (_name == _name_1);
      if (_tripleEquals) {
        this.error("Duplicate keys definitions are not alloweed ", innerSteps, 
          GithubactionPackage.Literals.STEP__WITH, GithubactionValidator.KEY_DEF_ERROR);
      }
    }
  }
}
