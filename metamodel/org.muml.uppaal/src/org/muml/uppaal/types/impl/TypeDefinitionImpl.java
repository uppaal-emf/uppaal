/**
 */
package org.muml.uppaal.types.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.uppaal.types.BuiltInType;
import org.muml.uppaal.types.TypeDefinition;
import org.muml.uppaal.types.TypeSpecification;
import org.muml.uppaal.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.types.impl.TypeDefinitionImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.muml.uppaal.types.impl.TypeDefinitionImpl#getTypeSpecification <em>Type Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeDefinitionImpl extends EObjectImpl implements TypeDefinition {
	/**
	 * The cached setting delegate for the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BASE_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TypesPackage.Literals.TYPE_DEFINITION__BASE_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTypeSpecification() <em>Type Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSpecification()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TYPE_SPECIFICATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TypesPackage.Literals.TYPE_DEFINITION__TYPE_SPECIFICATION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInType getBaseType() {
		return (BuiltInType)BASE_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpecification getTypeSpecification() {
		return (TypeSpecification)TYPE_SPECIFICATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpecification basicGetTypeSpecification() {
		return (TypeSpecification)TYPE_SPECIFICATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.TYPE_DEFINITION__BASE_TYPE:
				return getBaseType();
			case TypesPackage.TYPE_DEFINITION__TYPE_SPECIFICATION:
				if (resolve) return getTypeSpecification();
				return basicGetTypeSpecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.TYPE_DEFINITION__BASE_TYPE:
				return BASE_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TypesPackage.TYPE_DEFINITION__TYPE_SPECIFICATION:
				return TYPE_SPECIFICATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //TypeDefinitionImpl
