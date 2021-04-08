/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.mdd.project.githubaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.PushEvent#getBranches <em>Branches</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.PushEvent#getTags <em>Tags</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.PushEvent#getBranchesIgnore <em>Branches Ignore</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.PushEvent#getTagsIgnore <em>Tags Ignore</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.PushEvent#getPaths <em>Paths</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.PushEvent#getPathsIgnore <em>Paths Ignore</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getPushEvent()
 * @model
 * @generated
 */
public interface PushEvent extends Event
{
  /**
   * Returns the value of the '<em><b>Branches</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branches</em>' attribute list.
   * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getPushEvent_Branches()
   * @model unique="false"
   * @generated
   */
  EList<String> getBranches();

  /**
   * Returns the value of the '<em><b>Tags</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' attribute list.
   * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getPushEvent_Tags()
   * @model unique="false"
   * @generated
   */
  EList<String> getTags();

  /**
   * Returns the value of the '<em><b>Branches Ignore</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branches Ignore</em>' attribute list.
   * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getPushEvent_BranchesIgnore()
   * @model unique="false"
   * @generated
   */
  EList<String> getBranchesIgnore();

  /**
   * Returns the value of the '<em><b>Tags Ignore</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags Ignore</em>' attribute list.
   * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getPushEvent_TagsIgnore()
   * @model unique="false"
   * @generated
   */
  EList<String> getTagsIgnore();

  /**
   * Returns the value of the '<em><b>Paths</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paths</em>' attribute list.
   * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getPushEvent_Paths()
   * @model unique="false"
   * @generated
   */
  EList<String> getPaths();

  /**
   * Returns the value of the '<em><b>Paths Ignore</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paths Ignore</em>' attribute list.
   * @see uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage#getPushEvent_PathsIgnore()
   * @model unique="false"
   * @generated
   */
  EList<String> getPathsIgnore();

} // PushEvent
