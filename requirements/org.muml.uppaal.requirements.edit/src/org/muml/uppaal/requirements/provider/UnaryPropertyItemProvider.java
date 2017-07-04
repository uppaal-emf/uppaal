/**
 */
package org.muml.uppaal.requirements.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.uppaal.expressions.ExpressionsFactory;
import org.muml.uppaal.requirements.RequirementsFactory;
import org.muml.uppaal.requirements.RequirementsPackage;
import org.muml.uppaal.requirements.UnaryProperty;
import org.muml.uppaal.types.TypesFactory;

/**
 * This is the item provider adapter for a {@link org.muml.uppaal.requirements.UnaryProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryPropertyItemProvider
	extends PropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryPropertyItemProvider(AdapterFactory adapterFactory) {
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

			addQuantifierPropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Quantifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQuantifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryProperty_quantifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryProperty_quantifier_feature", "_UI_UnaryProperty_type"),
				 RequirementsPackage.Literals.UNARY_PROPERTY__QUANTIFIER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UnaryProperty_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UnaryProperty_operator_feature", "_UI_UnaryProperty_type"),
				 RequirementsPackage.Literals.UNARY_PROPERTY__OPERATOR,
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
			childrenFeatures.add(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION);
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
	 * This returns UnaryProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UnaryProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UnaryProperty)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_UnaryProperty_type") :
			getString("_UI_UnaryProperty_type") + " " + label;
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

		switch (notification.getFeatureID(UnaryProperty.class)) {
			case RequirementsPackage.UNARY_PROPERTY__QUANTIFIER:
			case RequirementsPackage.UNARY_PROPERTY__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RequirementsPackage.UNARY_PROPERTY__EXPRESSION:
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
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 RequirementsFactory.eINSTANCE.createDeadlockExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 TypesFactory.eINSTANCE.createScalarTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 TypesFactory.eINSTANCE.createStructTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 TypesFactory.eINSTANCE.createRangeTypeSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPreIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createPostIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createChannelPrefixExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RequirementsPackage.Literals.UNARY_PROPERTY__EXPRESSION,
				 ExpressionsFactory.eINSTANCE.createDataPrefixExpression()));
	}

}
