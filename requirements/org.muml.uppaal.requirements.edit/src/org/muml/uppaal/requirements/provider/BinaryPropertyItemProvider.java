/**
 */
package org.muml.uppaal.requirements.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.uppaal.expressions.ExpressionsFactory;
import org.muml.uppaal.requirements.BinaryProperty;
import org.muml.uppaal.requirements.RequirementsFactory;
import org.muml.uppaal.requirements.RequirementsPackage;
import org.muml.uppaal.types.TypesFactory;

/**
 * This is the item provider adapter for a {@link org.muml.uppaal.requirements.BinaryProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryPropertyItemProvider
	extends PropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryPropertyItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION);
			childrenFeatures.add(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BinaryProperty)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_BinaryProperty_type") :
			getString("_UI_BinaryProperty_type") + " " + label;
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

		switch (notification.getFeatureID(BinaryProperty.class)) {
			case RequirementsPackage.BINARY_PROPERTY__LEFT_EXPRESSION:
			case RequirementsPackage.BINARY_PROPERTY__RIGHT_EXPRESSION:
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
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 RequirementsFactory.eINSTANCE.createDeadlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 TypesFactory.eINSTANCE.createScalarTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 TypesFactory.eINSTANCE.createStructTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 TypesFactory.eINSTANCE.createRangeTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPreIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPostIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createChannelPrefixExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createDataPrefixExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 RequirementsFactory.eINSTANCE.createDeadlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 TypesFactory.eINSTANCE.createScalarTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 TypesFactory.eINSTANCE.createStructTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 TypesFactory.eINSTANCE.createRangeTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPreIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPostIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createChannelPrefixExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createDataPrefixExpression()));
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
			childFeature == RequirementsPackage.Literals.BINARY_PROPERTY__LEFT_EXPRESSION ||
			childFeature == RequirementsPackage.Literals.BINARY_PROPERTY__RIGHT_EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
