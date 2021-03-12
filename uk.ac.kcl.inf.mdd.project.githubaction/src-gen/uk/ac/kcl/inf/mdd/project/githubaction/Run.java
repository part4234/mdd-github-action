/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Run#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Run#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getRun()
 * @model
 * @generated
 */
public interface Run extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getRun_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Run#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' attribute.
	 * @see #setCommands(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getRun_Commands()
	 * @model
	 * @generated
	 */
	String getCommands();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Run#getCommands <em>Commands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commands</em>' attribute.
	 * @see #getCommands()
	 * @generated
	 */
	void setCommands(String value);

} // Run
