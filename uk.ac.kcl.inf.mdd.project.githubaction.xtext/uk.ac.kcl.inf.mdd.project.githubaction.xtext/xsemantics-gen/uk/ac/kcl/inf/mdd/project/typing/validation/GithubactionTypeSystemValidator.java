package uk.ac.kcl.inf.mdd.project.typing.validation;

import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import uk.ac.kcl.inf.mdd.project.typing.GithubactionTypeSystem;
import uk.ac.kcl.inf.mdd.project.validation.AbstractGithubactionValidator;

@SuppressWarnings("all")
public class GithubactionTypeSystemValidator extends AbstractGithubactionValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected GithubactionTypeSystem xsemanticsSystem;
  
  protected GithubactionTypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
}
