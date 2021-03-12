/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#onschedule
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getMinute <em>Minute</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getHour <em>Hour</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getDay <em>Day</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getMonth <em>Month</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getDayOfWeek <em>Day Of Week</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getScheduleEvent()
 * @model
 * @generated
 */
public interface ScheduleEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Minute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute</em>' attribute.
	 * @see #setMinute(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getScheduleEvent_Minute()
	 * @model
	 * @generated
	 */
	String getMinute();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getMinute <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute</em>' attribute.
	 * @see #getMinute()
	 * @generated
	 */
	void setMinute(String value);

	/**
	 * Returns the value of the '<em><b>Hour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour</em>' attribute.
	 * @see #setHour(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getScheduleEvent_Hour()
	 * @model
	 * @generated
	 */
	String getHour();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getHour <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour</em>' attribute.
	 * @see #getHour()
	 * @generated
	 */
	void setHour(String value);

	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getScheduleEvent_Day()
	 * @model
	 * @generated
	 */
	String getDay();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(String value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getScheduleEvent_Month()
	 * @model
	 * @generated
	 */
	String getMonth();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(String value);

	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' attribute.
	 * @see #setDayOfWeek(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getScheduleEvent_DayOfWeek()
	 * @model
	 * @generated
	 */
	String getDayOfWeek();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent#getDayOfWeek <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Week</em>' attribute.
	 * @see #getDayOfWeek()
	 * @generated
	 */
	void setDayOfWeek(String value);

} // ScheduleEvent
