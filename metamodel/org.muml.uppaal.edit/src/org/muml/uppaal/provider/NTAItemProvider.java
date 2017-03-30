/**
 */
package org.muml.uppaal.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.uppaal.NTA;
import org.muml.uppaal.UppaalPackage;
import org.muml.uppaal.core.CorePackage;
import org.muml.uppaal.core.provider.NamedElementItemProvider;
import org.muml.uppaal.declarations.DeclarationsFactory;
import org.muml.uppaal.templates.TemplatesFactory;
import org.muml.uppaal.types.TypesFactory;

/**
 * This is the item provider adapter for a {@link org.muml.uppaal.NTA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NTAItemProvider
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NTAItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommentableElement_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommentableElement_comment_feature", "_UI_CommentableElement_type"),
				 CorePackage.Literals.COMMENTABLE_ELEMENT__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UppaalPackage.Literals.NTA__GLOBAL_DECLARATIONS);
			childrenFeatures.add(UppaalPackage.Literals.NTA__TEMPLATE);
			childrenFeatures.add(UppaalPackage.Literals.NTA__SYSTEM_DECLARATIONS);
			childrenFeatures.add(UppaalPackage.Literals.NTA__INT);
			childrenFeatures.add(UppaalPackage.Literals.NTA__BOOL);
			childrenFeatures.add(UppaalPackage.Literals.NTA__CLOCK);
			childrenFeatures.add(UppaalPackage.Literals.NTA__CHAN);
			childrenFeatures.add(UppaalPackage.Literals.NTA__VOID);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns NTA.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NTA"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NTA)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NTA_type") :
			getString("_UI_NTA_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NTA.class)) {
			case UppaalPackage.NTA__COMMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UppaalPackage.NTA__GLOBAL_DECLARATIONS:
			case UppaalPackage.NTA__TEMPLATE:
			case UppaalPackage.NTA__SYSTEM_DECLARATIONS:
			case UppaalPackage.NTA__INT:
			case UppaalPackage.NTA__BOOL:
			case UppaalPackage.NTA__CLOCK:
			case UppaalPackage.NTA__CHAN:
			case UppaalPackage.NTA__VOID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.NTA__GLOBAL_DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createGlobalDeclarations()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.NTA__TEMPLATE,
				 TemplatesFactory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.NTA__SYSTEM_DECLARATIONS,
				 DeclarationsFactory.eINSTANCE.createSystemDeclarations()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.NTA__INT,
				 TypesFactory.eINSTANCE.createPredefinedType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.NTA__BOOL,
				 TypesFactory.eINSTANCE.createPredefinedType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.NTA__CLOCK,
				 TypesFactory.eINSTANCE.createPredefinedType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.NTA__CHAN,
				 TypesFactory.eINSTANCE.createPredefinedType()));

		newChildDescriptors.add
			(createChildParameter
				(UppaalPackage.Literals.NTA__VOID,
				 TypesFactory.eINSTANCE.createPredefinedType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == UppaalPackage.Literals.NTA__INT ||
			childFeature == UppaalPackage.Literals.NTA__BOOL ||
			childFeature == UppaalPackage.Literals.NTA__CLOCK ||
			childFeature == UppaalPackage.Literals.NTA__CHAN ||
			childFeature == UppaalPackage.Literals.NTA__VOID;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UppaalEditPlugin.INSTANCE;
	}

}
