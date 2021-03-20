/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mdd.project.generator;

import com.google.common.collect.Iterators;
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
import uk.ac.kcl.inf.mdd.project.githubaction.Event;
import uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.Job;
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
      _builder.append("i");
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
    fsa.generateFile(this.deriveStatsTargetFileNameFor(resource), this.doGenerateClass(model));
  }
  
  public String deriveStatsTargetFileNameFor(final Resource resource) {
    return resource.getURI().appendFileExtension("yaml").lastSegment();
  }
  
  public String doGenerateStats(final Repository program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Program contains:");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- ");
    int _size = IteratorExtensions.size(Iterators.<Repository>filter(program.eAllContents(), Repository.class));
    _builder.append(_size);
    _builder.append(" Repositories");
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
    _builder.append("# This is the generated .yaml file for the input repository.");
    _builder.newLine();
    _builder.append("# Files are individually generated Individually for each workflow and differ by main/feature");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    final Function1<Workflow, String> _function = (Workflow it) -> {
      GithubactionGenerator.Environment _environment = new GithubactionGenerator.Environment();
      return this.generateWorkFlowStmt(it, _environment);
    };
    String _join = IterableExtensions.join(ListExtensions.<Workflow, String>map(program.getWorkflows(), _function), "\n");
    _builder.append(_join, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generateWorkFlowStmt(final Workflow stmt, final GithubactionGenerator.Environment env) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field statements is undefined for the type Workflow"
      + "\nThe method generateJavaStatement(Environment) is undefined"
      + "\nThe method or field generateEventStmt is undefined for the type EList<Event>"
      + "\nThe method or field generateEventStmt2 is undefined for the type Env"
      + "\nThe method or field generateEventStmt3 is undefined for the type RunSetting"
      + "\nThe method or field generateEventStmt4 is undefined for the type Job"
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  /**
   * add more methods to handle the rest calls
   * dispatch def String generateEventStmt(Event stmt) '''
   * 
   * �if (PushEvent != null ){'''    push:'''}��generatePullRequestEventt�
   * �if (PullRequestEvent != null){'''    push:'''}��generatePullRequestEventt�
   * �if (ScheduleEvent != null){'''    push:'''}��generateScheduleEvent�
   * �if (WorkflowDispatchEvent != null){'''    push:'''}��generateWorkflowDispatchEvent�
   * �if (RepositoryDispatchEvent != null){'''    push:'''}��generateRepositoryDispatchEvent�
   * �if (CreateEvent != null){'''    push:'''}��generateCreateEvent�
   * �if (DeleteEvent != null){'''    push:'''}��generateDeleteEvent�
   * �if (DeploymentEvent != null){'''    push:'''}��generateDeploymentEvent�
   * �if (IssueEvent != null){'''    push:'''}��generateIssueEvent�
   * �if (LabelEvent != null){'''    push:'''}��generateLabelEvent�
   * '''
   */
  protected String _generatePushEvent(final PushEvent stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    CharSequence _xifexpression = null;
    boolean _isEmpty = stmt.getBranchesIgnore().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("    ");
      _builder_1.append("branches: [master]");
      _xifexpression = _builder_1;
    }
    _builder.append(_xifexpression);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generatePullEvent(final PullRequestEvent stmt) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateScheduleEvent(final ScheduleEvent stmt) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateWorkflowEvent(final WorkflowDispatchEvent stmt) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateDispatchEvent(final RepositoryDispatchEvent stmt) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateCreateEvent(final CreateEvent stmt) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateDeleteEvent(final DeleteEvent stmt) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateDeploymentEvent(final DeploymentEvent stmt) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateIssueEvent(final IssueEvent stmt) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateLabelEvent(final LabelEvent stmt) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public String generateWorkFlowStmt(final Workflow stmt, final GithubactionGenerator.Environment env) {
    return _generateWorkFlowStmt(stmt, env);
  }
  
  public String generatePushEvent(final PushEvent stmt) {
    return _generatePushEvent(stmt);
  }
  
  public String generatePullEvent(final PullRequestEvent stmt) {
    return _generatePullEvent(stmt);
  }
  
  public String generateScheduleEvent(final ScheduleEvent stmt) {
    return _generateScheduleEvent(stmt);
  }
  
  public String generateWorkflowEvent(final WorkflowDispatchEvent stmt) {
    return _generateWorkflowEvent(stmt);
  }
  
  public String generateDispatchEvent(final RepositoryDispatchEvent stmt) {
    return _generateDispatchEvent(stmt);
  }
  
  public String generateCreateEvent(final CreateEvent stmt) {
    return _generateCreateEvent(stmt);
  }
  
  public String generateDeleteEvent(final DeleteEvent stmt) {
    return _generateDeleteEvent(stmt);
  }
  
  public String generateDeploymentEvent(final DeploymentEvent stmt) {
    return _generateDeploymentEvent(stmt);
  }
  
  public String generateIssueEvent(final IssueEvent stmt) {
    return _generateIssueEvent(stmt);
  }
  
  public String generateLabelEvent(final LabelEvent stmt) {
    return _generateLabelEvent(stmt);
  }
}
