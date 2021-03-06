/**
 */
package uk.ac.kcl.inf.mdd.project.githubaction.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import uk.ac.kcl.inf.mdd.project.githubaction.util.GithubactionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubactionItemProviderAdapterFactory extends GithubactionAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubactionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.PushEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushEventItemProvider pushEventItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.PushEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPushEventAdapter() {
		if (pushEventItemProvider == null) {
			pushEventItemProvider = new PushEventItemProvider(this);
		}

		return pushEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.PullRequestEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PullRequestEventItemProvider pullRequestEventItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.PullRequestEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPullRequestEventAdapter() {
		if (pullRequestEventItemProvider == null) {
			pullRequestEventItemProvider = new PullRequestEventItemProvider(this);
		}

		return pullRequestEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.Workflow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowItemProvider workflowItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.Workflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowAdapter() {
		if (workflowItemProvider == null) {
			workflowItemProvider = new WorkflowItemProvider(this);
		}

		return workflowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.Step} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepItemProvider stepItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStepAdapter() {
		if (stepItemProvider == null) {
			stepItemProvider = new StepItemProvider(this);
		}

		return stepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.Job} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobItemProvider jobItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJobAdapter() {
		if (jobItemProvider == null) {
			jobItemProvider = new JobItemProvider(this);
		}

		return jobItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleEventItemProvider scheduleEventItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.ScheduleEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScheduleEventAdapter() {
		if (scheduleEventItemProvider == null) {
			scheduleEventItemProvider = new ScheduleEventItemProvider(this);
		}

		return scheduleEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowDispatchEventItemProvider workflowDispatchEventItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.WorkflowDispatchEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowDispatchEventAdapter() {
		if (workflowDispatchEventItemProvider == null) {
			workflowDispatchEventItemProvider = new WorkflowDispatchEventItemProvider(this);
		}

		return workflowDispatchEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryDispatchEventItemProvider repositoryDispatchEventItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.RepositoryDispatchEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryDispatchEventAdapter() {
		if (repositoryDispatchEventItemProvider == null) {
			repositoryDispatchEventItemProvider = new RepositoryDispatchEventItemProvider(this);
		}

		return repositoryDispatchEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.Input} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputItemProvider inputItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputAdapter() {
		if (inputItemProvider == null) {
			inputItemProvider = new InputItemProvider(this);
		}

		return inputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.CreateEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateEventItemProvider createEventItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.CreateEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateEventAdapter() {
		if (createEventItemProvider == null) {
			createEventItemProvider = new CreateEventItemProvider(this);
		}

		return createEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.DeleteEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteEventItemProvider deleteEventItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.DeleteEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeleteEventAdapter() {
		if (deleteEventItemProvider == null) {
			deleteEventItemProvider = new DeleteEventItemProvider(this);
		}

		return deleteEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.DeploymentEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentEventItemProvider deploymentEventItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.DeploymentEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeploymentEventAdapter() {
		if (deploymentEventItemProvider == null) {
			deploymentEventItemProvider = new DeploymentEventItemProvider(this);
		}

		return deploymentEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueEventItemProvider issueEventItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.IssueEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIssueEventAdapter() {
		if (issueEventItemProvider == null) {
			issueEventItemProvider = new IssueEventItemProvider(this);
		}

		return issueEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelEventItemProvider labelEventItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.LabelEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLabelEventAdapter() {
		if (labelEventItemProvider == null) {
			labelEventItemProvider = new LabelEventItemProvider(this);
		}

		return labelEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.Env} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvItemProvider envItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.Env}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvAdapter() {
		if (envItemProvider == null) {
			envItemProvider = new EnvItemProvider(this);
		}

		return envItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunSettingItemProvider runSettingItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.RunSetting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRunSettingAdapter() {
		if (runSettingItemProvider == null) {
			runSettingItemProvider = new RunSettingItemProvider(this);
		}

		return runSettingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.Environment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentItemProvider environmentItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvironmentAdapter() {
		if (environmentItemProvider == null) {
			environmentItemProvider = new EnvironmentItemProvider(this);
		}

		return environmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.InputParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputParameterItemProvider inputParameterItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.InputParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputParameterAdapter() {
		if (inputParameterItemProvider == null) {
			inputParameterItemProvider = new InputParameterItemProvider(this);
		}

		return inputParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uk.ac.kcl.inf.mdd.project.githubaction.Repository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryItemProvider repositoryItemProvider;

	/**
	 * This creates an adapter for a {@link uk.ac.kcl.inf.mdd.project.githubaction.Repository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepositoryAdapter() {
		if (repositoryItemProvider == null) {
			repositoryItemProvider = new RepositoryItemProvider(this);
		}

		return repositoryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (pushEventItemProvider != null)
			pushEventItemProvider.dispose();
		if (pullRequestEventItemProvider != null)
			pullRequestEventItemProvider.dispose();
		if (workflowItemProvider != null)
			workflowItemProvider.dispose();
		if (stepItemProvider != null)
			stepItemProvider.dispose();
		if (jobItemProvider != null)
			jobItemProvider.dispose();
		if (scheduleEventItemProvider != null)
			scheduleEventItemProvider.dispose();
		if (workflowDispatchEventItemProvider != null)
			workflowDispatchEventItemProvider.dispose();
		if (repositoryDispatchEventItemProvider != null)
			repositoryDispatchEventItemProvider.dispose();
		if (inputItemProvider != null)
			inputItemProvider.dispose();
		if (createEventItemProvider != null)
			createEventItemProvider.dispose();
		if (deleteEventItemProvider != null)
			deleteEventItemProvider.dispose();
		if (deploymentEventItemProvider != null)
			deploymentEventItemProvider.dispose();
		if (issueEventItemProvider != null)
			issueEventItemProvider.dispose();
		if (labelEventItemProvider != null)
			labelEventItemProvider.dispose();
		if (envItemProvider != null)
			envItemProvider.dispose();
		if (runSettingItemProvider != null)
			runSettingItemProvider.dispose();
		if (environmentItemProvider != null)
			environmentItemProvider.dispose();
		if (inputParameterItemProvider != null)
			inputParameterItemProvider.dispose();
		if (repositoryItemProvider != null)
			repositoryItemProvider.dispose();
	}

}
