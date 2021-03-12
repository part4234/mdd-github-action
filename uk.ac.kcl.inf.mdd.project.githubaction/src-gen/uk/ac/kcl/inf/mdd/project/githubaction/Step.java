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
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getUses <em>Uses</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getRunSetting <em>Run Setting</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getId <em>Id</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getIf <em>If</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getRun <em>Run</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getWith <em>With</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getArgs <em>Args</em>}</li>
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsname
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_Name()
	 * @model
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
	 * Returns the value of the '<em><b>Uses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsuses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uses</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_Uses()
	 * @model
	 * @generated
	 */
	EList<String> getUses();

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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsid
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * Returns the value of the '<em><b>Run</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsrun
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Run</em>' containment reference.
	 * @see #setRun(Run)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getStep_Run()
	 * @model containment="true"
	 * @generated
	 */
	Run getRun();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Step#getRun <em>Run</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run</em>' containment reference.
	 * @see #getRun()
	 * @generated
	 */
	void setRun(Run value);

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

} // Step
