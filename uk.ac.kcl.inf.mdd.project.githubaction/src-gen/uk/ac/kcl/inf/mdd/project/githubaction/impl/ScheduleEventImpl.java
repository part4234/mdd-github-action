/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;
import uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.ScheduleEventImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.ScheduleEventImpl#getHour <em>Hour</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.ScheduleEventImpl#getDay <em>Day</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.ScheduleEventImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.ScheduleEventImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleEventImpl extends EventImpl implements ScheduleEvent {
	/**
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final String MINUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected String minute = MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHour() <em>Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHour()
	 * @generated
	 * @ordered
	 */
	protected String hour = HOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final String DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected String day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final String MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected String month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final String DAY_OF_WEEK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected String dayOfWeek = DAY_OF_WEEK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.SCHEDULE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinute(String newMinute) {
		String oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.SCHEDULE_EVENT__MINUTE, oldMinute,
					minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHour() {
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHour(String newHour) {
		String oldHour = hour;
		hour = newHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.SCHEDULE_EVENT__HOUR, oldHour,
					hour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDay(String newDay) {
		String oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.SCHEDULE_EVENT__DAY, oldDay,
					day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonth(String newMonth) {
		String oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.SCHEDULE_EVENT__MONTH, oldMonth,
					month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDayOfWeek(String newDayOfWeek) {
		String oldDayOfWeek = dayOfWeek;
		dayOfWeek = newDayOfWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubactionPackage.SCHEDULE_EVENT__DAY_OF_WEEK,
					oldDayOfWeek, dayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GithubactionPackage.SCHEDULE_EVENT__MINUTE:
			return getMinute();
		case GithubactionPackage.SCHEDULE_EVENT__HOUR:
			return getHour();
		case GithubactionPackage.SCHEDULE_EVENT__DAY:
			return getDay();
		case GithubactionPackage.SCHEDULE_EVENT__MONTH:
			return getMonth();
		case GithubactionPackage.SCHEDULE_EVENT__DAY_OF_WEEK:
			return getDayOfWeek();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GithubactionPackage.SCHEDULE_EVENT__MINUTE:
			setMinute((String) newValue);
			return;
		case GithubactionPackage.SCHEDULE_EVENT__HOUR:
			setHour((String) newValue);
			return;
		case GithubactionPackage.SCHEDULE_EVENT__DAY:
			setDay((String) newValue);
			return;
		case GithubactionPackage.SCHEDULE_EVENT__MONTH:
			setMonth((String) newValue);
			return;
		case GithubactionPackage.SCHEDULE_EVENT__DAY_OF_WEEK:
			setDayOfWeek((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GithubactionPackage.SCHEDULE_EVENT__MINUTE:
			setMinute(MINUTE_EDEFAULT);
			return;
		case GithubactionPackage.SCHEDULE_EVENT__HOUR:
			setHour(HOUR_EDEFAULT);
			return;
		case GithubactionPackage.SCHEDULE_EVENT__DAY:
			setDay(DAY_EDEFAULT);
			return;
		case GithubactionPackage.SCHEDULE_EVENT__MONTH:
			setMonth(MONTH_EDEFAULT);
			return;
		case GithubactionPackage.SCHEDULE_EVENT__DAY_OF_WEEK:
			setDayOfWeek(DAY_OF_WEEK_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GithubactionPackage.SCHEDULE_EVENT__MINUTE:
			return MINUTE_EDEFAULT == null ? minute != null : !MINUTE_EDEFAULT.equals(minute);
		case GithubactionPackage.SCHEDULE_EVENT__HOUR:
			return HOUR_EDEFAULT == null ? hour != null : !HOUR_EDEFAULT.equals(hour);
		case GithubactionPackage.SCHEDULE_EVENT__DAY:
			return DAY_EDEFAULT == null ? day != null : !DAY_EDEFAULT.equals(day);
		case GithubactionPackage.SCHEDULE_EVENT__MONTH:
			return MONTH_EDEFAULT == null ? month != null : !MONTH_EDEFAULT.equals(month);
		case GithubactionPackage.SCHEDULE_EVENT__DAY_OF_WEEK:
			return DAY_OF_WEEK_EDEFAULT == null ? dayOfWeek != null : !DAY_OF_WEEK_EDEFAULT.equals(dayOfWeek);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (minute: ");
		result.append(minute);
		result.append(", hour: ");
		result.append(hour);
		result.append(", day: ");
		result.append(day);
		result.append(", month: ");
		result.append(month);
		result.append(", dayOfWeek: ");
		result.append(dayOfWeek);
		result.append(')');
		return result.toString();
	}

} //ScheduleEventImpl
