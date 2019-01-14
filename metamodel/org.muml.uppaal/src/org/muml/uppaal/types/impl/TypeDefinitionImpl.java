/**
 */
package org.muml.uppaal.types.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
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
	 * The default value of the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final BuiltInType BASE_TYPE_EDEFAULT = BuiltInType.INT;
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
		// TODO: implement this method to return the 'Base Type' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpecification getTypeSpecification() {
		TypeSpecification typeSpecification = basicGetTypeSpecification();
		return typeSpecification != null && typeSpecification.eIsProxy() ? (TypeSpecification)eResolveProxy((InternalEObject)typeSpecification) : typeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * ER: Don't really know whether this implementation is correct.
	 * <!-- end-user-doc -->
	 */
	public TypeSpecification basicGetTypeSpecification() {
		return null;
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
				return getBaseType() != BASE_TYPE_EDEFAULT;
			case TypesPackage.TYPE_DEFINITION__TYPE_SPECIFICATION:
				return basicGetTypeSpecification() != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeDefinitionImpl
