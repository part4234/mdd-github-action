/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mdd.project.generator;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.mdd.project.githubaction.CreateEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.DeleteEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.DeploymentEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Env;
import uk.ac.kcl.inf.mdd.project.githubaction.Event;
import uk.ac.kcl.inf.mdd.project.githubaction.Input;
import uk.ac.kcl.inf.mdd.project.githubaction.InputParameter;
import uk.ac.kcl.inf.mdd.project.githubaction.IssueActivityType;
import uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Job;
import uk.ac.kcl.inf.mdd.project.githubaction.LabelActivityType;
import uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.PullRequestEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.PushEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Repository;
import uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Step;
import uk.ac.kcl.inf.mdd.project.githubaction.Workflow;
import uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class GithubactionGenerator extends AbstractGenerator {
  private static class Environment {
    private int counter = 0;
    
    public CharSequence getFreshVarName() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i_");
      int _plusPlus = this.counter++;
      _builder.append(_plusPlus);
      return _builder;
    }
    
    public int exit() {
      return this.counter--;
    }
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Repository model = ((Repository) _head);
    fsa.generateFile(this.deriveStatsTargetFileNameFor(resource), this.doGenerateStats(model));
    fsa.generateFile("githubaction2.yaml", this.doGenerateClass(model));
  }
  
  public String deriveStatsTargetFileNameFor(final Resource resource) {
    return resource.getURI().appendFileExtension("txt").lastSegment();
  }
  
  public String doGenerateStats(final Repository program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Program contains:");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- ");
    int _size = IteratorExtensions.size(Iterators.<Repository>filter(program.eAllContents(), Repository.class));
    _builder.append(_size);
    _builder.append(" Repositoriese");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_1 = IteratorExtensions.size(Iterators.<Workflow>filter(program.eAllContents(), Workflow.class));
    _builder.append(_size_1);
    _builder.append(" Workflows");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_2 = IteratorExtensions.size(Iterators.<Event>filter(program.eAllContents(), Event.class));
    _builder.append(_size_2);
    _builder.append(" Events");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_3 = IteratorExtensions.size(Iterators.<Job>filter(program.eAllContents(), Job.class));
    _builder.append(_size_3);
    _builder.append(" Jobs");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_4 = IteratorExtensions.size(Iterators.<Step>filter(program.eAllContents(), Step.class));
    _builder.append(_size_4);
    _builder.append(" Steps");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  public String deriveClassNameFor(final Resource resource) {
    String _xblockexpression = null;
    {
      final String origName = resource.getURI().lastSegment();
      String _firstUpper = StringExtensions.toFirstUpper(origName.substring(0, origName.indexOf(".")));
      _xblockexpression = (_firstUpper + "Turtle");
    }
    return _xblockexpression;
  }
  
  /**
   * Below are parseable dispatch mathos for all grammar types
   */
  public String doGenerateClass(final Repository program) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<Workflow, String> _function = (Workflow it) -> {
      GithubactionGenerator.Environment _environment = new GithubactionGenerator.Environment();
      return this.generateWorkflow(it, _environment);
    };
    String _join = IterableExtensions.join(ListExtensions.<Workflow, String>map(program.getWorkflows(), _function), "\n");
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateWorkflow(final Workflow workflow, final GithubactionGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("name: ");
    String _string = workflow.getName().toString();
    _builder.append(_string);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _isEmpty = workflow.getOn().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("on:");
        _builder.newLine();
        {
          EList<Event> _on = workflow.getOn();
          for(final Event event : _on) {
            _builder.newLine();
            String _generateEvent = this.generateEvent(event);
            _builder.append(_generateEvent);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _isEmpty_1 = workflow.getJobs().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("jobs:");
        _builder.newLine();
        {
          EList<Job> _jobs = workflow.getJobs();
          for(final Job job : _jobs) {
            String _generateJob = this.generateJob(job);
            _builder.append(_generateJob);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _generateEvent(final PushEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("push:");
    _builder.newLine();
    CharSequence _xifexpression = null;
    if (((!event.getBranches().isEmpty()) && (event.getBranches().get(0) != null))) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\t");
      _builder_1.append("branches: [");
      String _get = event.getBranches().get(0);
      _builder_1.append(_get, "\t");
      _builder_1.append("]");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_1 = null;
    if (((!event.getTags().isEmpty()) && (event.getTags().get(1) != null))) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" \t");
      _builder_2.append("tags: ");
      String _get_1 = event.getTags().get(0);
      _builder_2.append(_get_1, " \t");
      _xifexpression_1 = _builder_2;
    }
    _builder.append(_xifexpression_1);
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_2 = null;
    if (((!event.getBranchesIgnore().isEmpty()) && (event.getBranchesIgnore().get(1) != null))) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(" \t");
      _builder_3.append("branchesIgnore: ");
      String _get_2 = event.getBranchesIgnore().get(0);
      _builder_3.append(_get_2, " \t");
      _xifexpression_2 = _builder_3;
    }
    _builder.append(_xifexpression_2);
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_3 = null;
    if (((!event.getTagsIgnore().isEmpty()) && (event.getTagsIgnore().get(1) != null))) {
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append(" \t");
      _builder_4.append("tagsIgnore: ");
      String _get_3 = event.getTagsIgnore().get(0);
      _builder_4.append(_get_3, " \t");
      _xifexpression_3 = _builder_4;
    }
    _builder.append(_xifexpression_3);
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_4 = null;
    if (((!event.getPaths().isEmpty()) && (event.getPaths().get(1) != null))) {
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append(" \t");
      _builder_5.append("paths: ");
      String _get_4 = event.getPaths().get(0);
      _builder_5.append(_get_4, " \t");
      _xifexpression_4 = _builder_5;
    }
    _builder.append(_xifexpression_4);
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_5 = null;
    if (((!event.getPathsIgnore().isEmpty()) && (event.getPathsIgnore().get(1) != null))) {
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append(" \t");
      _builder_6.append("pathsIgnore: ");
      String _get_5 = event.getPathsIgnore().get(0);
      _builder_6.append(_get_5, " \t");
      _xifexpression_5 = _builder_6;
    }
    _builder.append(_xifexpression_5);
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateEvent(final PullRequestEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("pull:");
    _builder.newLine();
    CharSequence _xifexpression = null;
    if (((!event.getBranches().isEmpty()) && (event.getBranches().get(0) != null))) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\t");
      _builder_1.append("branches: [");
      String _get = event.getBranches().get(0);
      _builder_1.append(_get, "\t");
      _builder_1.append("]");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_1 = null;
    if (((!event.getTags().isEmpty()) && (event.getTags().get(1) != null))) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" \t");
      _builder_2.append("tags: ");
      String _get_1 = event.getTags().get(0);
      _builder_2.append(_get_1, " \t");
      _xifexpression_1 = _builder_2;
    }
    _builder.append(_xifexpression_1);
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_2 = null;
    if (((!event.getBranchesIgnore().isEmpty()) && (event.getBranchesIgnore().get(1) != null))) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append(" \t");
      _builder_3.append("branchesIgnore: ");
      String _get_2 = event.getBranchesIgnore().get(0);
      _builder_3.append(_get_2, " \t");
      _xifexpression_2 = _builder_3;
    }
    _builder.append(_xifexpression_2);
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_3 = null;
    if (((!event.getTagsIgnore().isEmpty()) && (event.getTagsIgnore().get(1) != null))) {
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.append(" \t");
      _builder_4.append("tagsIgnore: ");
      String _get_3 = event.getTagsIgnore().get(0);
      _builder_4.append(_get_3, " \t");
      _xifexpression_3 = _builder_4;
    }
    _builder.append(_xifexpression_3);
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_4 = null;
    if (((!event.getPaths().isEmpty()) && (event.getPaths().get(1) != null))) {
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.append(" \t");
      _builder_5.append("paths: ");
      String _get_4 = event.getPaths().get(0);
      _builder_5.append(_get_4, " \t");
      _xifexpression_4 = _builder_5;
    }
    _builder.append(_xifexpression_4);
    _builder.newLineIfNotEmpty();
    CharSequence _xifexpression_5 = null;
    if (((!event.getPathsIgnore().isEmpty()) && (event.getPathsIgnore().get(1) != null))) {
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.append(" \t");
      _builder_6.append("pathsIgnore: ");
      String _get_5 = event.getPathsIgnore().get(0);
      _builder_6.append(_get_5, " \t");
      _xifexpression_5 = _builder_6;
    }
    _builder.append(_xifexpression_5);
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateEvent(final ScheduleEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("schedule:\t");
    _builder.newLine();
    CharSequence _xifexpression = null;
    String _hour = event.getHour();
    boolean _tripleNotEquals = (_hour != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\t ");
      _builder_1.append("-cron: ");
      String _minute = event.getMinute();
      _builder_1.append(_minute, "\t ");
      _builder_1.append(" ");
      String _hour_1 = event.getHour();
      _builder_1.append(_hour_1, "\t ");
      _builder_1.append(" ");
      String _day = event.getDay();
      _builder_1.append(_day, "\t ");
      _builder_1.append(" ");
      String _month = event.getMonth();
      _builder_1.append(_month, "\t ");
      _builder_1.append(" ");
      String _dayOfWeek = event.getDayOfWeek();
      _builder_1.append(_dayOfWeek, "\t ");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generateEvent(final WorkflowDispatchEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("workflow_dispatch:");
    _builder.newLine();
    CharSequence _xifexpression = null;
    Input _get = event.getInputs().get(0);
    boolean _tripleNotEquals = (_get != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\t ");
      _builder_1.append("inputs: ");
      Input _get_1 = event.getInputs().get(0);
      _builder_1.append(_get_1, "\t ");
      _builder_1.append(" ");
      Input _get_2 = event.getInputs().get(1);
      _builder_1.append(_get_2, "\t ");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression);
    _builder.append(" \t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generateEvent(final RepositoryDispatchEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("repository_dispatch:");
    _builder.newLine();
    CharSequence _xifexpression = null;
    String _get = event.getEventTypes().get(0);
    boolean _tripleNotEquals = (_get != null);
    if (_tripleNotEquals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\t ");
      _builder_1.append("types: [");
      String _get_1 = event.getEventTypes().get(0);
      _builder_1.append(_get_1, "\t ");
      _builder_1.append(",");
      String _get_2 = event.getEventTypes().get(1);
      _builder_1.append(_get_2, "\t ");
      _builder_1.append("]");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression);
    _builder.append(" \t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _generateEvent(final CreateEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateEvent(final DeleteEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateEvent(final DeploymentEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateEvent(final IssueEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = event.getActivityTypes().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<IssueActivityType> _activityTypes = event.getActivityTypes();
          for(final IssueActivityType type : _activityTypes) {
            _builder.append("types: [");
            String _IssueActivityType = this.IssueActivityType(type);
            _builder.append(_IssueActivityType);
            _builder.append("]");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _generateEvent(final LabelEvent event) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isEmpty = event.getActivityTypes().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        {
          EList<LabelActivityType> _activityTypes = event.getActivityTypes();
          for(final LabelActivityType type : _activityTypes) {
            _builder.append("types: [");
            String _labelActivityType = this.labelActivityType(type);
            _builder.append(_labelActivityType);
            _builder.append("]");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String _IssueActivityType(final IssueActivityType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((type == IssueActivityType.OPENED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.OPENED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == IssueActivityType.CLOSED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.CLOSED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == IssueActivityType.DELETED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.DELETED);
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == IssueActivityType.EDITED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.EDITED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == IssueActivityType.DELETED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.DELETED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == IssueActivityType.TRANSFERRED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.TRANSFERRED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == IssueActivityType.ASSIGNED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.ASSIGNED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == IssueActivityType.UNASSIGNED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.UNASSIGNED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == IssueActivityType.LOCKED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.LOCKED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == IssueActivityType.UNLOCKED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.UNLOCKED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == IssueActivityType.REOPENED)) {
        _builder.append(" ");
        _builder.append(IssueActivityType.REOPENED);
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _labelActivityType(final LabelActivityType type) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((type == LabelActivityType.CREATED)) {
        _builder.append(" ");
        _builder.append(LabelActivityType.CREATED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == LabelActivityType.EDITED)) {
        _builder.append(" ");
        _builder.append(LabelActivityType.EDITED);
        _builder.append(", ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((type == LabelActivityType.DELETED)) {
        _builder.append(" ");
        _builder.append(LabelActivityType.DELETED);
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateJob(final Job job) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("test:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("name: ");
    String _string = job.getJobName().toString();
    _builder.append(_string, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("runsOn: ");
    String _string_1 = job.getRunsOn().toString();
    _builder.append(_string_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _isEmpty = job.getSteps().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t");
        _builder.append("steps:");
        _builder.newLine();
        {
          EList<Step> _steps = job.getSteps();
          for(final Step step : _steps) {
            String _generateStepsType = this.generateStepsType(step);
            _builder.append(_generateStepsType);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String generateStepsType(final Step step) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _stepName = step.getStepName();
      boolean _tripleNotEquals = (_stepName != null);
      if (_tripleNotEquals) {
        _builder.append("\t\t- name: ");
        String _stepName_1 = step.getStepName();
        _builder.append(_stepName_1);
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if (((step.getStepName() == null) && (step.getUses() != null))) {
        _builder.append("\t\t- uses: ");
        String _string = step.getUses().toString();
        _builder.append(_string);
      } else {
        String _uses = step.getUses();
        boolean _tripleNotEquals_1 = (_uses != null);
        if (_tripleNotEquals_1) {
          _builder.append(" \t \t\tuses: ");
          String _string_1 = step.getUses().toString();
          _builder.append(_string_1);
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      boolean _isEmpty = step.getWith().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\t\twith: ");
        String _name = step.getName();
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<InputParameter> _with = step.getWith();
          for(final InputParameter input : _with) {
            String _name_1 = input.getName();
            _builder.append(_name_1, "\t");
            _builder.append(":");
            String _value = input.getValue();
            _builder.append(_value, "\t");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEmpty_1 = step.getRun().isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\trun: ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<String> _run = step.getRun();
          for(final String line : _run) {
            _builder.append(line, "\t");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _isEmpty_2 = step.getEnv().isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\tenv: ");
        String _name_2 = step.getName();
        _builder.append(_name_2);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          EList<Env> _env = step.getEnv();
          for(final Env input_1 : _env) {
            String _name_3 = input_1.getName();
            _builder.append(_name_3, "\t");
            _builder.append(":");
            String _value_1 = input_1.getValue();
            _builder.append(_value_1, "\t");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generateEvent(final Event event) {
    if (event instanceof CreateEvent) {
      return _generateEvent((CreateEvent)event);
    } else if (event instanceof DeleteEvent) {
      return _generateEvent((DeleteEvent)event);
    } else if (event instanceof DeploymentEvent) {
      return _generateEvent((DeploymentEvent)event);
    } else if (event instanceof IssueEvent) {
      return _generateEvent((IssueEvent)event);
    } else if (event instanceof LabelEvent) {
      return _generateEvent((LabelEvent)event);
    } else if (event instanceof PullRequestEvent) {
      return _generateEvent((PullRequestEvent)event);
    } else if (event instanceof PushEvent) {
      return _generateEvent((PushEvent)event);
    } else if (event instanceof RepositoryDispatchEvent) {
      return _generateEvent((RepositoryDispatchEvent)event);
    } else if (event instanceof ScheduleEvent) {
      return _generateEvent((ScheduleEvent)event);
    } else if (event instanceof WorkflowDispatchEvent) {
      return _generateEvent((WorkflowDispatchEvent)event);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(event).toString());
    }
  }
  
  public String IssueActivityType(final IssueActivityType type) {
    return _IssueActivityType(type);
  }
  
  public String labelActivityType(final LabelActivityType type) {
    return _labelActivityType(type);
  }
}
