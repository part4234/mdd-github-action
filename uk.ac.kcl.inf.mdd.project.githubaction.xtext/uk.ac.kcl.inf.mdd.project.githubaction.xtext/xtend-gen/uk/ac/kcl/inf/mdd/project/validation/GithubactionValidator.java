package uk.ac.kcl.inf.mdd.project.validation;

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
  public static final String INVALID_VARIABLE_NAME = "uk.ac.kcl.inf.mdd.project.githubaction.INVALID_VARIABLE_NAME";
  
  public static final String DUPLICATE_VARIABLE_NAME = "uk.ac.kcl.inf.mdd.project.githubaction.DUPLICATE_VARIABLE_NAME";
  
  public static final String CASE_VARIABLE_ISSUE = "uk.ac.kcl.inf.mdd.project.githubaction.WRONG_CASE_USAGE";
  
  public static final String VARIABLE_DEF_REQUIRED = "uk.ac.kcl.inf.mdd.project.githubaction.VARIABLE_DEF_REQUIRED";
  
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
        GithubactionPackage.Literals.PUSH_EVENT__BRANCHES, GithubactionValidator.VARIABLE_DEF_REQUIRED);
    }
    int _size = workF.getOn().size();
    boolean _tripleEquals_1 = (_size == 0);
    if (_tripleEquals_1) {
      this.warning("Event definition required", workF, 
        GithubactionPackage.Literals.PUSH_EVENT__BRANCHES, GithubactionValidator.VARIABLE_DEF_REQUIRED);
    }
    int _size_1 = workF.getJobs().size();
    boolean _tripleEquals_2 = (_size_1 == 0);
    if (_tripleEquals_2) {
      this.warning("Event definition required", workF, 
        GithubactionPackage.Literals.PUSH_EVENT__BRANCHES, GithubactionValidator.DUPLICATE_VARIABLE_NAME);
    }
  }
  
  /**
   * Case sensitive/insensitive checks below
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
        GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.CASE_VARIABLE_ISSUE);
    }
  }
  
  @Check
  public void checkVariableNamesStartWithUpperCase(final Step decl) {
    boolean _isUpperCase = Character.isUpperCase(decl.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should start with an upper-case character", decl, 
        GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.CASE_VARIABLE_ISSUE);
    }
  }
  
  @Check
  public void checkVariableNamesStartWithUpperCase(final Env decl) {
    boolean _isLowerCase = Character.isLowerCase(decl.getName().charAt(0));
    boolean _not = (!_isLowerCase);
    if (_not) {
      this.warning("Name should start with a lower-case character", decl, 
        GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.CASE_VARIABLE_ISSUE);
    }
  }
}
