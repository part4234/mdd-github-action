/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getEnv <em>Env</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getStepName <em>Step Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getUses <em>Uses</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getRunSetting <em>Run Setting</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getIf <em>If</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getWith <em>With</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getArgs <em>Args</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getRun <em>Run</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.project.githubaction.Env}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsenv
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Env</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_Env()
	 * @model containment="true"
	 * @generated
	 */
	EList<Env> getEnv();

	/**
	 * Returns the value of the '<em><b>Step Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsname
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step Name</em>' attribute.
	 * @see #setStepName(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_StepName()
	 * @model
	 * @generated
	 */
	String getStepName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getStepName <em>Step Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Name</em>' attribute.
	 * @see #getStepName()
	 * @generated
	 */
	void setStepName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsid
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsuses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses</em>' attribute.
	 * @see #setUses(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_Uses()
	 * @model
	 * @generated
	 */
	String getUses();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getUses <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' attribute.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(String value);

	/**
	 * Returns the value of the '<em><b>Run Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsrun
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Run Setting</em>' containment reference.
	 * @see #setRunSetting(RunSetting)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_RunSetting()
	 * @model containment="true"
	 * @generated
	 */
	RunSetting getRunSetting();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getRunSetting <em>Run Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Setting</em>' containment reference.
	 * @see #getRunSetting()
	 * @generated
	 */
	void setRunSetting(RunSetting value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsif
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If</em>' attribute.
	 * @see #setIf(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_If()
	 * @model
	 * @generated
	 */
	String getIf();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getIf <em>If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' attribute.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(String value);

	/**
	 * Returns the value of the '<em><b>With</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.project.githubaction.InputParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepswith
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>With</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_With()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputParameter> getWith();

	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepswithentrypoint
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entrypoint</em>' attribute.
	 * @see #setEntrypoint(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_Entrypoint()
	 * @model
	 * @generated
	 */
	String getEntrypoint();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getEntrypoint <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrypoint</em>' attribute.
	 * @see #getEntrypoint()
	 * @generated
	 */
	void setEntrypoint(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepswithargs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

	/**
	 * Returns the value of the '<em><b>Run</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_Run()
	 * @model
	 * @generated
	 */
	EList<String> getRun();

} // Step
