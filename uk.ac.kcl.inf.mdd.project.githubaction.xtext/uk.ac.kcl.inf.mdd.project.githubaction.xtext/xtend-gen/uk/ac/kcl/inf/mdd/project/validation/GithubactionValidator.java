package uk.ac.kcl.inf.mdd.project.validation;

import org.eclipse.xtext.validation.Check;
import uk.ac.kcl.inf.mdd.project.githubaction.Env;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.Job;
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
