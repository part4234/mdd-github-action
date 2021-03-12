/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getShell <em>Shell</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getWith <em>With</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getRunSetting()
 * @model
 * @generated
 */
public interface RunSetting extends EObject {
	/**
	 * Returns the value of the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory</em>' attribute.
	 * @see #setWorkingDirectory(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getRunSetting_WorkingDirectory()
	 * @model
	 * @generated
	 */
	String getWorkingDirectory();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getWorkingDirectory <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory</em>' attribute.
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	void setWorkingDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see #setShell(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getRunSetting_Shell()
	 * @model
	 * @generated
	 */
	String getShell();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(String value);

	/**
	 * Returns the value of the '<em><b>With</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.project.githubaction.Env}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getRunSetting_With()
	 * @model containment="true"
	 * @generated
	 */
	EList<Env> getWith();

} // RunSetting
