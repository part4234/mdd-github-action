/**
 *
 * $Id$
 */
package uk.ac.kcl.inf.mdd.project.githubaction.validation;

/**
 * A sample validator interface for {@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ScheduleEventValidator {
	boolean validate();

	boolean validateMinute(String value);

	boolean validateHour(String value);

	boolean validateDay(String value);

	boolean validateMonth(String value);

	boolean validateDayOfWeek(String value);
}
