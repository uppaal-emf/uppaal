/**
 */
package org.muml.uppaal.parsable.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.parsable.IdentifiableLocation;
import org.muml.uppaal.parsable.ParsableFactory;
import org.muml.uppaal.parsable.ParsablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParsableFactoryImpl extends EFactoryImpl implements ParsableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParsableFactory init() {
		try {
			ParsableFactory theParsableFactory = (ParsableFactory)EPackage.Registry.INSTANCE.getEFactory(ParsablePackage.eNS_URI);
			if (theParsableFactory != null) {
				return theParsableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParsableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsableFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ParsablePackage.IDENTIFIABLE_LOCATION: return createIdentifiableLocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableLocation createIdentifiableLocation() {
		IdentifiableLocationImpl identifiableLocation = new IdentifiableLocationImpl();
		return identifiableLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsablePackage getParsablePackage() {
		return (ParsablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParsablePackage getPackage() {
		return ParsablePackage.eINSTANCE;
	}

} //ParsableFactoryImpl
