/**
 */
package org.muml.uppaal.types.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.uppaal.expressions.ExpressionsFactory;
import org.muml.uppaal.provider.UppaalEditPlugin;
import org.muml.uppaal.types.IntegerBounds;
import org.muml.uppaal.types.TypesPackage;

/**
 * This is the item provider adapter for a {@link org.muml.uppaal.types.IntegerBounds} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerBoundsItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerBoundsItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND);
			childrenFeatures.add(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND);
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
	 * This returns IntegerBounds.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IntegerBounds"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_IntegerBounds_type");
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

		switch (notification.getFeatureID(IntegerBounds.class)) {
			case TypesPackage.INTEGER_BOUNDS__LOWER_BOUND:
			case TypesPackage.INTEGER_BOUNDS__UPPER_BOUND:
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
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));
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
			childFeature == TypesPackage.Literals.INTEGER_BOUNDS__LOWER_BOUND ||
			childFeature == TypesPackage.Literals.INTEGER_BOUNDS__UPPER_BOUND;

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
