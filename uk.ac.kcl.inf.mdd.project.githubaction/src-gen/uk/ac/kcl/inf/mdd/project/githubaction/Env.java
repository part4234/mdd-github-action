/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Env#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Env#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getEnv()
 * @model
 * @generated
 */
public interface Env extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getEnv_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Env#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getEnv_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Env#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Env
