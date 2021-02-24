/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import uk.ac.kcl.inf.mdd.project.githubaction.BranchEvent;
import uk.ac.kcl.inf.mdd.project.githubaction.GithubactionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.BranchEventImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.BranchEventImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.BranchEventImpl#getBranchesIgnore <em>Branches Ignore</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.BranchEventImpl#getTagsIgnore <em>Tags Ignore</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.BranchEventImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.project.githubaction.impl.BranchEventImpl#getPathsIgnore <em>Paths Ignore</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BranchEventImpl extends EventImpl implements BranchEvent {
	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<String> branches;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The cached value of the '{@link #getBranchesIgnore() <em>Branches Ignore</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchesIgnore()
	 * @generated
	 * @ordered
	 */
	protected EList<String> branchesIgnore;

	/**
	 * The cached value of the '{@link #getTagsIgnore() <em>Tags Ignore</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagsIgnore()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tagsIgnore;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paths;

	/**
	 * The cached value of the '{@link #getPathsIgnore() <em>Paths Ignore</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathsIgnore()
	 * @generated
	 * @ordered
	 */
	protected EList<String> pathsIgnore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubactionPackage.Literals.BRANCH_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBranches() {
		if (branches == null) {
			branches = new EDataTypeUniqueEList<String>(String.class, this, GithubactionPackage.BRANCH_EVENT__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, GithubactionPackage.BRANCH_EVENT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBranchesIgnore() {
		if (branchesIgnore == null) {
			branchesIgnore = new EDataTypeUniqueEList<String>(String.class, this,
					GithubactionPackage.BRANCH_EVENT__BRANCHES_IGNORE);
		}
		return branchesIgnore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTagsIgnore() {
		if (tagsIgnore == null) {
			tagsIgnore = new EDataTypeUniqueEList<String>(String.class, this,
					GithubactionPackage.BRANCH_EVENT__TAGS_IGNORE);
		}
		return tagsIgnore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPaths() {
		if (paths == null) {
			paths = new EDataTypeUniqueEList<String>(String.class, this, GithubactionPackage.BRANCH_EVENT__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPathsIgnore() {
		if (pathsIgnore == null) {
			pathsIgnore = new EDataTypeUniqueEList<String>(String.class, this,
					GithubactionPackage.BRANCH_EVENT__PATHS_IGNORE);
		}
		return pathsIgnore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GithubactionPackage.BRANCH_EVENT__BRANCHES:
			return getBranches();
		case GithubactionPackage.BRANCH_EVENT__TAGS:
			return getTags();
		case GithubactionPackage.BRANCH_EVENT__BRANCHES_IGNORE:
			return getBranchesIgnore();
		case GithubactionPackage.BRANCH_EVENT__TAGS_IGNORE:
			return getTagsIgnore();
		case GithubactionPackage.BRANCH_EVENT__PATHS:
			return getPaths();
		case GithubactionPackage.BRANCH_EVENT__PATHS_IGNORE:
			return getPathsIgnore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GithubactionPackage.BRANCH_EVENT__BRANCHES:
			getBranches().clear();
			getBranches().addAll((Collection<? extends String>) newValue);
			return;
		case GithubactionPackage.BRANCH_EVENT__TAGS:
			getTags().clear();
			getTags().addAll((Collection<? extends String>) newValue);
			return;
		case GithubactionPackage.BRANCH_EVENT__BRANCHES_IGNORE:
			getBranchesIgnore().clear();
			getBranchesIgnore().addAll((Collection<? extends String>) newValue);
			return;
		case GithubactionPackage.BRANCH_EVENT__TAGS_IGNORE:
			getTagsIgnore().clear();
			getTagsIgnore().addAll((Collection<? extends String>) newValue);
			return;
		case GithubactionPackage.BRANCH_EVENT__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends String>) newValue);
			return;
		case GithubactionPackage.BRANCH_EVENT__PATHS_IGNORE:
			getPathsIgnore().clear();
			getPathsIgnore().addAll((Collection<? extends String>) newValue);
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
		case GithubactionPackage.BRANCH_EVENT__BRANCHES:
			getBranches().clear();
			return;
		case GithubactionPackage.BRANCH_EVENT__TAGS:
			getTags().clear();
			return;
		case GithubactionPackage.BRANCH_EVENT__BRANCHES_IGNORE:
			getBranchesIgnore().clear();
			return;
		case GithubactionPackage.BRANCH_EVENT__TAGS_IGNORE:
			getTagsIgnore().clear();
			return;
		case GithubactionPackage.BRANCH_EVENT__PATHS:
			getPaths().clear();
			return;
		case GithubactionPackage.BRANCH_EVENT__PATHS_IGNORE:
			getPathsIgnore().clear();
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
		case GithubactionPackage.BRANCH_EVENT__BRANCHES:
			return branches != null && !branches.isEmpty();
		case GithubactionPackage.BRANCH_EVENT__TAGS:
			return tags != null && !tags.isEmpty();
		case GithubactionPackage.BRANCH_EVENT__BRANCHES_IGNORE:
			return branchesIgnore != null && !branchesIgnore.isEmpty();
		case GithubactionPackage.BRANCH_EVENT__TAGS_IGNORE:
			return tagsIgnore != null && !tagsIgnore.isEmpty();
		case GithubactionPackage.BRANCH_EVENT__PATHS:
			return paths != null && !paths.isEmpty();
		case GithubactionPackage.BRANCH_EVENT__PATHS_IGNORE:
			return pathsIgnore != null && !pathsIgnore.isEmpty();
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
		result.append(" (branches: ");
		result.append(branches);
		result.append(", tags: ");
		result.append(tags);
		result.append(", branchesIgnore: ");
		result.append(branchesIgnore);
		result.append(", tagsIgnore: ");
		result.append(tagsIgnore);
		result.append(", paths: ");
		result.append(paths);
		result.append(", pathsIgnore: ");
		result.append(pathsIgnore);
		result.append(')');
		return result.toString();
	}

} //BranchEventImpl
