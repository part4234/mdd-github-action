/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Issue Activity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getIssueActivityType()
 * @model
 * @generated
 */
public enum IssueActivityType implements Enumerator {
	/**
	 * The '<em><b>Opened</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENED_VALUE
	 * @generated
	 * @ordered
	 */
	OPENED(0, "opened", "opened"),

	/**
	 * The '<em><b>Edited</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITED_VALUE
	 * @generated
	 * @ordered
	 */
	EDITED(1, "edited", "edited"),

	/**
	 * The '<em><b>Deleted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	DELETED(2, "deleted", "deleted"),

	/**
	 * The '<em><b>Transferred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERRED_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFERRED(3, "transferred", "transferred"),

	/**
	 * The '<em><b>Pinned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINNED_VALUE
	 * @generated
	 * @ordered
	 */
	PINNED(4, "pinned", "pinned"),

	/**
	 * The '<em><b>Unpinned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPINNED_VALUE
	 * @generated
	 * @ordered
	 */
	UNPINNED(5, "unpinned", "unpinned"),

	/**
	 * The '<em><b>Closed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(6, "closed", "closed"),

	/**
	 * The '<em><b>Reopened</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPENED_VALUE
	 * @generated
	 * @ordered
	 */
	REOPENED(7, "reopened", "reopened"),

	/**
	 * The '<em><b>Assigned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNED(8, "assigned", "assigned"),

	/**
	 * The '<em><b>Unassigned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNASSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	UNASSIGNED(9, "unassigned", "unassigned"),

	/**
	 * The '<em><b>Labeled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABELED_VALUE
	 * @generated
	 * @ordered
	 */
	LABELED(10, "labeled", "labeled"),

	/**
	 * The '<em><b>Unlabeled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLABELED_VALUE
	 * @generated
	 * @ordered
	 */
	UNLABELED(11, "unlabeled", "unlabeled"),

	/**
	 * The '<em><b>Locked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	LOCKED(12, "locked", "locked"),

	/**
	 * The '<em><b>Unlocked</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLOCKED_VALUE
	 * @generated
	 * @ordered
	 */
	UNLOCKED(13, "unlocked", "unlocked"),

	/**
	 * The '<em><b>Milestoned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILESTONED_VALUE
	 * @generated
	 * @ordered
	 */
	MILESTONED(14, "milestoned", "milestoned"),

	/**
	 * The '<em><b>Demilestoned</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMILESTONED_VALUE
	 * @generated
	 * @ordered
	 */
	DEMILESTONED(15, "demilestoned", "demilestoned");

	/**
	 * The '<em><b>Opened</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPENED
	 * @model name="opened"
	 * @generated
	 * @ordered
	 */
	public static final int OPENED_VALUE = 0;

	/**
	 * The '<em><b>Edited</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITED
	 * @model name="edited"
	 * @generated
	 * @ordered
	 */
	public static final int EDITED_VALUE = 1;

	/**
	 * The '<em><b>Deleted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETED
	 * @model name="deleted"
	 * @generated
	 * @ordered
	 */
	public static final int DELETED_VALUE = 2;

	/**
	 * The '<em><b>Transferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFERRED
	 * @model name="transferred"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFERRED_VALUE = 3;

	/**
	 * The '<em><b>Pinned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PINNED
	 * @model name="pinned"
	 * @generated
	 * @ordered
	 */
	public static final int PINNED_VALUE = 4;

	/**
	 * The '<em><b>Unpinned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNPINNED
	 * @model name="unpinned"
	 * @generated
	 * @ordered
	 */
	public static final int UNPINNED_VALUE = 5;

	/**
	 * The '<em><b>Closed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model name="closed"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 6;

	/**
	 * The '<em><b>Reopened</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPENED
	 * @model name="reopened"
	 * @generated
	 * @ordered
	 */
	public static final int REOPENED_VALUE = 7;

	/**
	 * The '<em><b>Assigned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED
	 * @model name="assigned"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNED_VALUE = 8;

	/**
	 * The '<em><b>Unassigned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNASSIGNED
	 * @model name="unassigned"
	 * @generated
	 * @ordered
	 */
	public static final int UNASSIGNED_VALUE = 9;

	/**
	 * The '<em><b>Labeled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABELED
	 * @model name="labeled"
	 * @generated
	 * @ordered
	 */
	public static final int LABELED_VALUE = 10;

	/**
	 * The '<em><b>Unlabeled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLABELED
	 * @model name="unlabeled"
	 * @generated
	 * @ordered
	 */
	public static final int UNLABELED_VALUE = 11;

	/**
	 * The '<em><b>Locked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCKED
	 * @model name="locked"
	 * @generated
	 * @ordered
	 */
	public static final int LOCKED_VALUE = 12;

	/**
	 * The '<em><b>Unlocked</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLOCKED
	 * @model name="unlocked"
	 * @generated
	 * @ordered
	 */
	public static final int UNLOCKED_VALUE = 13;

	/**
	 * The '<em><b>Milestoned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILESTONED
	 * @model name="milestoned"
	 * @generated
	 * @ordered
	 */
	public static final int MILESTONED_VALUE = 14;

	/**
	 * The '<em><b>Demilestoned</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEMILESTONED
	 * @model name="demilestoned"
	 * @generated
	 * @ordered
	 */
	public static final int DEMILESTONED_VALUE = 15;

	/**
	 * An array of all the '<em><b>Issue Activity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IssueActivityType[] VALUES_ARRAY = new IssueActivityType[] { OPENED, EDITED, DELETED,
			TRANSFERRED, PINNED, UNPINNED, CLOSED, REOPENED, ASSIGNED, UNASSIGNED, LABELED, UNLABELED, LOCKED, UNLOCKED,
			MILESTONED, DEMILESTONED, };

	/**
	 * A public read-only list of all the '<em><b>Issue Activity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IssueActivityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Issue Activity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueActivityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueActivityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Activity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueActivityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IssueActivityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Issue Activity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IssueActivityType get(int value) {
		switch (value) {
		case OPENED_VALUE:
			return OPENED;
		case EDITED_VALUE:
			return EDITED;
		case DELETED_VALUE:
			return DELETED;
		case TRANSFERRED_VALUE:
			return TRANSFERRED;
		case PINNED_VALUE:
			return PINNED;
		case UNPINNED_VALUE:
			return UNPINNED;
		case CLOSED_VALUE:
			return CLOSED;
		case REOPENED_VALUE:
			return REOPENED;
		case ASSIGNED_VALUE:
			return ASSIGNED;
		case UNASSIGNED_VALUE:
			return UNASSIGNED;
		case LABELED_VALUE:
			return LABELED;
		case UNLABELED_VALUE:
			return UNLABELED;
		case LOCKED_VALUE:
			return LOCKED;
		case UNLOCKED_VALUE:
			return UNLOCKED;
		case MILESTONED_VALUE:
			return MILESTONED;
		case DEMILESTONED_VALUE:
			return DEMILESTONED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IssueActivityType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //IssueActivityType
