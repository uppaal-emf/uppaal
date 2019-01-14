/**
 */
package org.muml.uppaal.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.uppaal.declarations.DeclarationsPackage;
import org.muml.uppaal.declarations.TypeDeclaration;
import org.muml.uppaal.types.DeclaredType;
import org.muml.uppaal.types.TypeDefinition;
import org.muml.uppaal.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declared Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.types.impl.DeclaredTypeImpl#getTypeDeclaration <em>Type Declaration</em>}</li>
 *   <li>{@link org.muml.uppaal.types.impl.DeclaredTypeImpl#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclaredTypeImpl extends TypeImpl implements DeclaredType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclaredTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.DECLARED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration getTypeDeclaration() {
		if (eContainerFeatureID() != TypesPackage.DECLARED_TYPE__TYPE_DECLARATION) return null;
		return (TypeDeclaration)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeDeclaration(TypeDeclaration newTypeDeclaration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTypeDeclaration, TypesPackage.DECLARED_TYPE__TYPE_DECLARATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDeclaration(TypeDeclaration newTypeDeclaration) {
		if (newTypeDeclaration != eInternalContainer() || (eContainerFeatureID() != TypesPackage.DECLARED_TYPE__TYPE_DECLARATION && newTypeDeclaration != null)) {
			if (EcoreUtil.isAncestor(this, newTypeDeclaration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTypeDeclaration != null)
				msgs = ((InternalEObject)newTypeDeclaration).eInverseAdd(this, DeclarationsPackage.TYPE_DECLARATION__TYPE, TypeDeclaration.class, msgs);
			msgs = basicSetTypeDeclaration(newTypeDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.DECLARED_TYPE__TYPE_DECLARATION, newTypeDeclaration, newTypeDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition getTypeDefinition() {
		TypeDefinition typeDefinition = basicGetTypeDefinition();
		return typeDefinition != null && typeDefinition.eIsProxy() ? (TypeDefinition)eResolveProxy((InternalEObject)typeDefinition) : typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition basicGetTypeDefinition() {
		// TODO: implement this method to return the 'Type Definition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DECLARED_TYPE__TYPE_DECLARATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTypeDeclaration((TypeDeclaration)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DECLARED_TYPE__TYPE_DECLARATION:
				return basicSetTypeDeclaration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TypesPackage.DECLARED_TYPE__TYPE_DECLARATION:
				return eInternalContainer().eInverseRemove(this, DeclarationsPackage.TYPE_DECLARATION__TYPE, TypeDeclaration.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.DECLARED_TYPE__TYPE_DECLARATION:
				return getTypeDeclaration();
			case TypesPackage.DECLARED_TYPE__TYPE_DEFINITION:
				if (resolve) return getTypeDefinition();
				return basicGetTypeDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.DECLARED_TYPE__TYPE_DECLARATION:
				setTypeDeclaration((TypeDeclaration)newValue);
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
			case TypesPackage.DECLARED_TYPE__TYPE_DECLARATION:
				setTypeDeclaration((TypeDeclaration)null);
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
			case TypesPackage.DECLARED_TYPE__TYPE_DECLARATION:
				return getTypeDeclaration() != null;
			case TypesPackage.DECLARED_TYPE__TYPE_DEFINITION:
				return basicGetTypeDefinition() != null;
		}
		return super.eIsSet(featureID);
	}

} //DeclaredTypeImpl
