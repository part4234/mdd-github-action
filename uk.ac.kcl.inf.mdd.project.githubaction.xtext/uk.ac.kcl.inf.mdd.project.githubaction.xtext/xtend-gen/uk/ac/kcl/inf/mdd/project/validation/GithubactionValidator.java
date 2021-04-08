package uk.ac.kcl.inf.mdd.project.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Env;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.InputParameter;
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
  public static final String DUPLICATE_NAMING = "uk.ac.kcl.inf.mdd.project.githubaction.DUPLICATE_NAMING";
  
  public static final String ATTRIBUTE_REQUIRED = "uk.ac.kcl.inf.mdd.project.githubaction.ATTRIBUTE_REQUIRED";
  
  public static final String CONFLICT_TRIGGER = "uk.ac.kcl.inf.mdd.project.githubaction.CONFLICT_TRIGGER";
  
  public static final String WRONG_CASE_USAGE = "uk.ac.kcl.inf.mdd.project.githubaction.WRONG_CASE_USAGE";
  
  public static final String NOT_WELL_FORMED = "uk.ac.kcl.inf.mdd.project.githubaction.NOT_WELL_FORMED";
  
  private final ArrayList<Object> cache = new ArrayList<Object>();
  
  /**
   * Check duplicate naming
   */
  @Check
  public void checkDuplicateNaming(final Repository repo) {
    EList<Workflow> _workflows = repo.getWorkflows();
    for (final Workflow wf : _workflows) {
      String _name = wf.getName();
      boolean _notEquals = (!Objects.equal(_name, ""));
      if (_notEquals) {
        boolean _contains = this.cache.contains(wf.getName());
        if (_contains) {
          this.error("Workflow names must be unique", wf, 
            GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.DUPLICATE_NAMING);
        }
        this.cache.add(wf.getName());
      }
    }
    this.cache.clear();
  }
  
  @Check
  public void checkDuplicateNaming(final Workflow wf) {
    EList<Job> _jobs = wf.getJobs();
    for (final Job job : _jobs) {
      String _name = job.getName();
      boolean _notEquals = (!Objects.equal(_name, ""));
      if (_notEquals) {
        boolean _contains = this.cache.contains(job.getName());
        if (_contains) {
          this.error("Job IDs must be unique", job, 
            GithubactionPackage.Literals.JOB__NAME, GithubactionValidator.DUPLICATE_NAMING);
        }
        this.cache.add(job.getName());
      }
    }
    this.cache.clear();
  }
  
  @Check
  public void checkDuplicateNaming(final Job job) {
    EList<Step> _steps = job.getSteps();
    for (final Step step : _steps) {
      String _name = step.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        boolean _contains = this.cache.contains(step.getName());
        if (_contains) {
          this.error("Step IDs must be unique", step, 
            GithubactionPackage.Literals.STEP__NAME, GithubactionValidator.DUPLICATE_NAMING);
        }
        this.cache.add(step.getName());
      }
    }
    this.cache.clear();
  }
  
  @Check
  public void checkDuplicateNaming(final Step step) {
    EList<InputParameter> _with = step.getWith();
    for (final InputParameter param : _with) {
      String _name = param.getName();
      boolean _notEquals = (!Objects.equal(_name, ""));
      if (_notEquals) {
        boolean _contains = this.cache.contains(param.getName());
        if (_contains) {
          this.error("Input parameter keys must be unique", param, 
            GithubactionPackage.Literals.INPUT_PARAMETER__NAME, GithubactionValidator.DUPLICATE_NAMING);
        }
        this.cache.add(param.getName());
      }
    }
    this.cache.clear();
  }
  
  @Check
  public void checkDuplicateNaming(final Env env) {
    this.checkEnvKey(env.eContainer());
  }
  
  protected void _checkEnvKey(final Workflow wf) {
    this.checkDuplicateEnvKey(wf.getEnv());
  }
  
  protected void _checkEnvKey(final Job job) {
    this.checkDuplicateEnvKey(job.getEnv());
  }
  
  protected void _checkEnvKey(final Step step) {
    this.checkDuplicateEnvKey(step.getEnv());
  }
  
  public void checkDuplicateEnvKey(final EList<Env> envs) {
    for (final Env env : envs) {
      String _name = env.getName();
      boolean _notEquals = (!Objects.equal(_name, ""));
      if (_notEquals) {
        boolean _contains = this.cache.contains(env.getName());
        if (_contains) {
          this.error("Env keys must be unique", env, 
            GithubactionPackage.Literals.ENV__NAME, GithubactionValidator.DUPLICATE_NAMING);
        }
        this.cache.add(env.getName());
      }
    }
    this.cache.clear();
  }
  
  /**
   * Check required attributes
   */
  @Check
  public void checkRequiredAttributes(final Workflow wf) {
    String _name = wf.getName();
    boolean _equals = Objects.equal(_name, "");
    if (_equals) {
      this.error("Workflow name cannot be empty", wf, 
        GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.ATTRIBUTE_REQUIRED);
    }
  }
  
  @Check
  public void checkRequiredAttributes(final Env env) {
    String _name = env.getName();
    boolean _equals = Objects.equal(_name, "");
    if (_equals) {
      this.error("Env name cannot be empty", env, 
        GithubactionPackage.Literals.ENV__NAME, GithubactionValidator.ATTRIBUTE_REQUIRED);
    }
    String _value = env.getValue();
    boolean _equals_1 = Objects.equal(_value, "");
    if (_equals_1) {
      this.error("Env value cannot be empty", env, 
        GithubactionPackage.Literals.ENV__VALUE, GithubactionValidator.ATTRIBUTE_REQUIRED);
    }
  }
  
  @Check
  public void checkRequiredAttributes(final InputParameter param) {
    String _name = param.getName();
    boolean _equals = Objects.equal(_name, "");
    if (_equals) {
      this.error("Input parameter value cannot be empty", param, 
        GithubactionPackage.Literals.INPUT_PARAMETER__NAME, GithubactionValidator.ATTRIBUTE_REQUIRED);
    }
    String _value = param.getValue();
    boolean _equals_1 = Objects.equal(_value, "");
    if (_equals_1) {
      this.error("Input parameter value cannot be empty", param, 
        GithubactionPackage.Literals.INPUT_PARAMETER__VALUE, GithubactionValidator.ATTRIBUTE_REQUIRED);
    }
  }
  
  /**
   * Check conflicting event triggers
   */
  @Check
  public void checkEventConflict(final BranchEvent event) {
    final boolean branchConflict = this.checkConflict(event.getBranches(), event.getBranchesIgnore());
    final boolean tagConflict = this.checkConflict(event.getTags(), event.getTagsIgnore());
    final boolean pathConflict = this.checkConflict(event.getPaths(), event.getPathsIgnore());
    if (((branchConflict || tagConflict) || pathConflict)) {
      this.error("Event trigger conflicted, workflow will never run", event, null, GithubactionValidator.CONFLICT_TRIGGER);
    }
  }
  
  public boolean checkConflict(final EList<?> list, final EList<?> ignoreList) {
    boolean _xblockexpression = false;
    {
      if (((list.size() > 0) && (ignoreList.size() > 0))) {
        final Function1<Object, Boolean> _function = (Object exp) -> {
          return Boolean.valueOf(ignoreList.contains(exp));
        };
        IterableExtensions.exists(list, _function);
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  /**
   * Check case sensitivity
   */
  @Check
  public void checkNameStartWithUpperCase(final Workflow wf) {
    if (((!Objects.equal(wf.getName(), "")) && (!Character.isUpperCase(wf.getName().charAt(0))))) {
      this.warning("Workflow name should start with an upper-case character", wf, 
        GithubactionPackage.Literals.WORKFLOW__NAME, GithubactionValidator.WRONG_CASE_USAGE);
    }
  }
  
  @Check
  public void checkNameIsUpperCase(final Env env) {
    String _name = env.getName();
    boolean _notEquals = (!Objects.equal(_name, ""));
    if (_notEquals) {
      final Function1<Character, Boolean> _function = (Character c) -> {
        return Boolean.valueOf((Character.isAlphabetic((c).charValue()) && (!Character.isUpperCase((c).charValue()))));
      };
      final boolean notUpperCase = IterableExtensions.<Character>exists(((Iterable<Character>)Conversions.doWrapArray(env.getName().toCharArray())), _function);
      if (notUpperCase) {
        this.warning("Env name should be upper-case", env, 
          GithubactionPackage.Literals.ENV__NAME, GithubactionValidator.WRONG_CASE_USAGE);
      }
    }
  }
  
  @Check
  public void checkIdStartWithLowerCase(final Job job) {
    if (((!Objects.equal(job.getName(), "")) && (!Character.isLowerCase(job.getName().charAt(0))))) {
      this.warning("Job id should start with an lower-case character", job, 
        GithubactionPackage.Literals.JOB__NAME, GithubactionValidator.WRONG_CASE_USAGE);
    }
  }
  
  @Check
  public void checkIdStartWithUpperCase(final Step step) {
    if (((!Objects.equal(step.getName(), "")) && (!Character.isLowerCase(step.getName().charAt(0))))) {
      this.warning("Step id should start with a lower-case character", step, 
        GithubactionPackage.Literals.STEP__NAME, GithubactionValidator.WRONG_CASE_USAGE);
    }
  }
  
  /**
   * Check well-formedness
   */
  @Check
  public void checkWellFormedness(final Repository repo) {
    int _size = repo.getWorkflows().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.warning("Repository should have at least one workflow", repo, 
        GithubactionPackage.Literals.REPOSITORY__WORKFLOWS, GithubactionValidator.NOT_WELL_FORMED);
    }
  }
  
  @Check
  public void checkWellFormedness(final Workflow wf) {
    int _size = wf.getOn().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.warning("Workflow should have at least one triggering event", wf, 
        GithubactionPackage.Literals.WORKFLOW__ON, GithubactionValidator.NOT_WELL_FORMED);
    }
    int _size_1 = wf.getJobs().size();
    boolean _equals_1 = (_size_1 == 0);
    if (_equals_1) {
      this.warning("Workflow should have at least one job", wf, 
        GithubactionPackage.Literals.WORKFLOW__JOBS, GithubactionValidator.NOT_WELL_FORMED);
    }
  }
  
  @Check
  public void checkWellFormedness(final Job job) {
    int _size = job.getSteps().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      this.warning("Job should have at least one step", job, 
        GithubactionPackage.Literals.JOB__STEPS, GithubactionValidator.NOT_WELL_FORMED);
    }
  }
  
  @Check
  public void checkWellFormedness(final BranchEvent event) {
    if (((((((event.getBranches().size() == 0) && (event.getBranchesIgnore().size() == 0)) && (event.getTags().size() == 0)) && (event.getTagsIgnore().size() == 0)) && (event.getPaths().size() == 0)) && (event.getPathsIgnore().size() == 0))) {
      this.warning("Event should have at least one triggering criteria", event, null, GithubactionValidator.NOT_WELL_FORMED);
    }
  }
  
  public void checkEnvKey(final EObject job) {
    if (job instanceof Job) {
      _checkEnvKey((Job)job);
      return;
    } else if (job instanceof Step) {
      _checkEnvKey((Step)job);
      return;
    } else if (job instanceof Workflow) {
      _checkEnvKey((Workflow)job);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(job).toString());
    }
  }
}
