/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getSteps <em>Steps</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getEnv <em>Env</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getRunsOn <em>Runs On</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getNeeds <em>Needs</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getIf <em>If</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idname
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.project.githubaction.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idsteps
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.project.githubaction.Env}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idenv
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Env</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob_Env()
	 * @model containment="true"
	 * @generated
	 */
	EList<Env> getEnv();

	/**
	 * Returns the value of the '<em><b>Runs On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idruns-on
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runs On</em>' attribute.
	 * @see #setRunsOn(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob_RunsOn()
	 * @model
	 * @generated
	 */
	String getRunsOn();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getRunsOn <em>Runs On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs On</em>' attribute.
	 * @see #getRunsOn()
	 * @generated
	 */
	void setRunsOn(String value);

	/**
	 * Returns the value of the '<em><b>Needs</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.project.githubaction.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idneeds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Needs</em>' reference list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob_Needs()
	 * @model
	 * @generated
	 */
	EList<Job> getNeeds();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idenvironment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob_Environment()
	 * @model
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idoutputs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outputs</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob_Outputs()
	 * @model
	 * @generated
	 */
	EList<String> getOutputs();

	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_iddefaultsrun
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defaults</em>' containment reference list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob_Defaults()
	 * @model containment="true"
	 * @generated
	 */
	EList<RunSetting> getDefaults();

	/**
	 * Returns the value of the '<em><b>If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idif
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>If</em>' attribute.
	 * @see #setIf(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob_If()
	 * @model
	 * @generated
	 */
	String getIf();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getIf <em>If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' attribute.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_id
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getJob_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.mdd.project.githubaction.Job#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Job
