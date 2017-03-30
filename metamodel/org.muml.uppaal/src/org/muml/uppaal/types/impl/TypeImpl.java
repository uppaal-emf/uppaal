/**
 */
package org.muml.uppaal.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.uppaal.core.impl.NamedElementImpl;
import org.muml.uppaal.declarations.Index;
import org.muml.uppaal.types.BuiltInType;
import org.muml.uppaal.types.Type;
import org.muml.uppaal.types.TypeSpecification;
import org.muml.uppaal.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.types.impl.TypeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.muml.uppaal.types.impl.TypeImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.muml.uppaal.types.impl.TypeImpl#getTypeSpecification <em>Type Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TypeImpl extends NamedElementImpl implements Type {
	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> index;

	/**
	 * The cached setting delegate for the '{@link #getBaseType() <em>Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BASE_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TypesPackage.Literals.TYPE__BASE_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTypeSpecification() <em>Type Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeSpecification()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TYPE_SPECIFICATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)TypesPackage.Literals.TYPE__TYPE_SPECIFICATION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getIndex() {
		if (index == null) {
			index = new EObjectContainmentEList<Index>(Index.class, this, TypesPackage.TYPE__INDEX);
		}
		return index;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.TYPE__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.TYPE__INDEX:
				return getIndex();
			case TypesPackage.TYPE__BASE_TYPE:
				return getBaseType();
			case TypesPackage.TYPE__TYPE_SPECIFICATION:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.TYPE__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Index>)newValue);
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
			case TypesPackage.TYPE__INDEX:
				getIndex().clear();
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
			case TypesPackage.TYPE__INDEX:
				return index != null && !index.isEmpty();
			case TypesPackage.TYPE__BASE_TYPE:
				return BASE_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case TypesPackage.TYPE__TYPE_SPECIFICATION:
				return TYPE_SPECIFICATION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //TypeImpl
