/**
 */
package org.muml.uppaal.statements.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.muml.uppaal.expressions.ExpressionsFactory;
import org.muml.uppaal.statements.ForLoop;
import org.muml.uppaal.statements.StatementsFactory;
import org.muml.uppaal.statements.StatementsPackage;

/**
 * This is the item provider adapter for a {@link org.muml.uppaal.statements.ForLoop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ForLoopItemProvider
	extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoopItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION);
			childrenFeatures.add(StatementsPackage.Literals.FOR_LOOP__CONDITION);
			childrenFeatures.add(StatementsPackage.Literals.FOR_LOOP__ITERATION);
			childrenFeatures.add(StatementsPackage.Literals.FOR_LOOP__STATEMENT);
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
	 * This returns ForLoop.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ForLoop"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ForLoop_type");
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

		switch (notification.getFeatureID(ForLoop.class)) {
			case StatementsPackage.FOR_LOOP__INITIALIZATION:
			case StatementsPackage.FOR_LOOP__CONDITION:
			case StatementsPackage.FOR_LOOP__ITERATION:
			case StatementsPackage.FOR_LOOP__STATEMENT:
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
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__INITIALIZATION,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__CONDITION,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createNegationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createPlusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createMinusExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createLogicalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createConditionExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createScopedIdentifierExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createQuantificationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createIncrementDecrementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createBitShiftExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createMinMaxExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__ITERATION,
				 ExpressionsFactory.eINSTANCE.createBitwiseExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__STATEMENT,
				 StatementsFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__STATEMENT,
				 StatementsFactory.eINSTANCE.createEmptyStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__STATEMENT,
				 StatementsFactory.eINSTANCE.createForLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__STATEMENT,
				 StatementsFactory.eINSTANCE.createIteration()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__STATEMENT,
				 StatementsFactory.eINSTANCE.createWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__STATEMENT,
				 StatementsFactory.eINSTANCE.createDoWhileLoop()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__STATEMENT,
				 StatementsFactory.eINSTANCE.createIfStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__STATEMENT,
				 StatementsFactory.eINSTANCE.createReturnStatement()));

		newChildDescriptors.add
			(createChildParameter
				(StatementsPackage.Literals.FOR_LOOP__STATEMENT,
				 StatementsFactory.eINSTANCE.createExpressionStatement()));
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
			childFeature == StatementsPackage.Literals.FOR_LOOP__INITIALIZATION ||
			childFeature == StatementsPackage.Literals.FOR_LOOP__CONDITION ||
			childFeature == StatementsPackage.Literals.FOR_LOOP__ITERATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
