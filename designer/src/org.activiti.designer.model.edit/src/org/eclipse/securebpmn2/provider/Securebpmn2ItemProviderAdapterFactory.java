/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.securebpmn2.provider;

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

import org.eclipse.securebpmn2.util.Securebpmn2AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Securebpmn2ItemProviderAdapterFactory extends
		Securebpmn2AdapterFactory implements ComposeableAdapterFactory,
		IChangeNotifier, IDisposable {
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
	public Securebpmn2ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.SecurityFlowNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityFlowNodeItemProvider securityFlowNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.SecurityFlowNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityFlowNodeAdapter() {
		if (securityFlowNodeItemProvider == null) {
			securityFlowNodeItemProvider = new SecurityFlowNodeItemProvider(
					this);
		}

		return securityFlowNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.SecurityFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityFlowItemProvider securityFlowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.SecurityFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityFlowAdapter() {
		if (securityFlowItemProvider == null) {
			securityFlowItemProvider = new SecurityFlowItemProvider(this);
		}

		return securityFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.Role} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleItemProvider roleItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleAdapter() {
		if (roleItemProvider == null) {
			roleItemProvider = new RoleItemProvider(this);
		}

		return roleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.User} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserItemProvider userItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUserAdapter() {
		if (userItemProvider == null) {
			userItemProvider = new UserItemProvider(this);
		}

		return userItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.Group} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupItemProvider groupItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGroupAdapter() {
		if (groupItemProvider == null) {
			groupItemProvider = new GroupItemProvider(this);
		}

		return groupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.ActivityAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityActionItemProvider activityActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.ActivityAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityActionAdapter() {
		if (activityActionItemProvider == null) {
			activityActionItemProvider = new ActivityActionItemProvider(this);
		}

		return activityActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.AtomicActivityAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicActivityActionItemProvider atomicActivityActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.AtomicActivityAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicActivityActionAdapter() {
		if (atomicActivityActionItemProvider == null) {
			atomicActivityActionItemProvider = new AtomicActivityActionItemProvider(
					this);
		}

		return atomicActivityActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.CompositeActivityAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeActivityActionItemProvider compositeActivityActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.CompositeActivityAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeActivityActionAdapter() {
		if (compositeActivityActionItemProvider == null) {
			compositeActivityActionItemProvider = new CompositeActivityActionItemProvider(
					this);
		}

		return compositeActivityActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.Permission} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionItemProvider permissionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPermissionAdapter() {
		if (permissionItemProvider == null) {
			permissionItemProvider = new PermissionItemProvider(this);
		}

		return permissionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.NeedToKnow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeedToKnowItemProvider needToKnowItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.NeedToKnow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNeedToKnowAdapter() {
		if (needToKnowItemProvider == null) {
			needToKnowItemProvider = new NeedToKnowItemProvider(this);
		}

		return needToKnowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.SeparationOfDuty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeparationOfDutyItemProvider separationOfDutyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.SeparationOfDuty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeparationOfDutyAdapter() {
		if (separationOfDutyItemProvider == null) {
			separationOfDutyItemProvider = new SeparationOfDutyItemProvider(
					this);
		}

		return separationOfDutyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.BindingOfDuty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingOfDutyItemProvider bindingOfDutyItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.BindingOfDuty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindingOfDutyAdapter() {
		if (bindingOfDutyItemProvider == null) {
			bindingOfDutyItemProvider = new BindingOfDutyItemProvider(this);
		}

		return bindingOfDutyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.AuthorizationConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationConstraintItemProvider authorizationConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.AuthorizationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAuthorizationConstraintAdapter() {
		if (authorizationConstraintItemProvider == null) {
			authorizationConstraintItemProvider = new AuthorizationConstraintItemProvider(
					this);
		}

		return authorizationConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.ActivityAuthorizationConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityAuthorizationConstraintItemProvider activityAuthorizationConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.ActivityAuthorizationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAuthorizationConstraintAdapter() {
		if (activityAuthorizationConstraintItemProvider == null) {
			activityAuthorizationConstraintItemProvider = new ActivityAuthorizationConstraintItemProvider(
					this);
		}

		return activityAuthorizationConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.ProcessAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessActionItemProvider processActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.ProcessAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessActionAdapter() {
		if (processActionItemProvider == null) {
			processActionItemProvider = new ProcessActionItemProvider(this);
		}

		return processActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.AtomicProcessAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicProcessActionItemProvider atomicProcessActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.AtomicProcessAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicProcessActionAdapter() {
		if (atomicProcessActionItemProvider == null) {
			atomicProcessActionItemProvider = new AtomicProcessActionItemProvider(
					this);
		}

		return atomicProcessActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.CompositeProcessAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeProcessActionItemProvider compositeProcessActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.CompositeProcessAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeProcessActionAdapter() {
		if (compositeProcessActionItemProvider == null) {
			compositeProcessActionItemProvider = new CompositeProcessActionItemProvider(
					this);
		}

		return compositeProcessActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.ItemAwareElementAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemAwareElementActionItemProvider itemAwareElementActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.ItemAwareElementAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemAwareElementActionAdapter() {
		if (itemAwareElementActionItemProvider == null) {
			itemAwareElementActionItemProvider = new ItemAwareElementActionItemProvider(
					this);
		}

		return itemAwareElementActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.AtomicItemAwareElementAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicItemAwareElementActionItemProvider atomicItemAwareElementActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.AtomicItemAwareElementAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtomicItemAwareElementActionAdapter() {
		if (atomicItemAwareElementActionItemProvider == null) {
			atomicItemAwareElementActionItemProvider = new AtomicItemAwareElementActionItemProvider(
					this);
		}

		return atomicItemAwareElementActionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.securebpmn2.CompositeItemAwareElementAction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeItemAwareElementActionItemProvider compositeItemAwareElementActionItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.securebpmn2.CompositeItemAwareElementAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeItemAwareElementActionAdapter() {
		if (compositeItemAwareElementActionItemProvider == null) {
			compositeItemAwareElementActionItemProvider = new CompositeItemAwareElementActionItemProvider(
					this);
		}

		return compositeItemAwareElementActionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
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
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
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
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void dispose() {
		if (securityFlowNodeItemProvider != null)
			securityFlowNodeItemProvider.dispose();
		if (securityFlowItemProvider != null)
			securityFlowItemProvider.dispose();
		if (roleItemProvider != null)
			roleItemProvider.dispose();
		if (userItemProvider != null)
			userItemProvider.dispose();
		if (groupItemProvider != null)
			groupItemProvider.dispose();
		if (activityActionItemProvider != null)
			activityActionItemProvider.dispose();
		if (atomicActivityActionItemProvider != null)
			atomicActivityActionItemProvider.dispose();
		if (compositeActivityActionItemProvider != null)
			compositeActivityActionItemProvider.dispose();
		if (permissionItemProvider != null)
			permissionItemProvider.dispose();
		if (needToKnowItemProvider != null)
			needToKnowItemProvider.dispose();
		if (separationOfDutyItemProvider != null)
			separationOfDutyItemProvider.dispose();
		if (bindingOfDutyItemProvider != null)
			bindingOfDutyItemProvider.dispose();
		if (authorizationConstraintItemProvider != null)
			authorizationConstraintItemProvider.dispose();
		if (activityAuthorizationConstraintItemProvider != null)
			activityAuthorizationConstraintItemProvider.dispose();
		if (processActionItemProvider != null)
			processActionItemProvider.dispose();
		if (atomicProcessActionItemProvider != null)
			atomicProcessActionItemProvider.dispose();
		if (compositeProcessActionItemProvider != null)
			compositeProcessActionItemProvider.dispose();
		if (itemAwareElementActionItemProvider != null)
			itemAwareElementActionItemProvider.dispose();
		if (atomicItemAwareElementActionItemProvider != null)
			atomicItemAwareElementActionItemProvider.dispose();
		if (compositeItemAwareElementActionItemProvider != null)
			compositeItemAwareElementActionItemProvider.dispose();
	}

}