/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#onpushpull_requestbranchestags
 * https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions#onpushpull_requestpaths
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getBranches <em>Branches</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getTags <em>Tags</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getBranchesIgnore <em>Branches Ignore</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getTagsIgnore <em>Tags Ignore</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getPaths <em>Paths</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent#getPathsIgnore <em>Paths Ignore</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getBranchEvent()
 * @model abstract="true"
 * @generated
 */
public interface BranchEvent extends WebhookEvent {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getBranchEvent_Branches()
	 * @model
	 * @generated
	 */
	EList<String> getBranches();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getBranchEvent_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Branches Ignore</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches Ignore</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getBranchEvent_BranchesIgnore()
	 * @model
	 * @generated
	 */
	EList<String> getBranchesIgnore();

	/**
	 * Returns the value of the '<em><b>Tags Ignore</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags Ignore</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getBranchEvent_TagsIgnore()
	 * @model
	 * @generated
	 */
	EList<String> getTagsIgnore();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getBranchEvent_Paths()
	 * @model
	 * @generated
	 */
	EList<String> getPaths();

	/**
	 * Returns the value of the '<em><b>Paths Ignore</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths Ignore</em>' attribute list.
	 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getBranchEvent_PathsIgnore()
	 * @model
	 * @generated
	 */
	EList<String> getPathsIgnore();

} // BranchEvent
