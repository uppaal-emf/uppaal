/**
 */
package nl.utwente.ewi.fmt.uppaalSMC.impl;

import nl.utwente.ewi.fmt.uppaalSMC.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UppaalSMCFactoryImpl extends EFactoryImpl implements UppaalSMCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UppaalSMCFactory init() {
		try {
			UppaalSMCFactory theUppaalSMCFactory = (UppaalSMCFactory)EPackage.Registry.INSTANCE.getEFactory(UppaalSMCPackage.eNS_URI);
			if (theUppaalSMCFactory != null) {
				return theUppaalSMCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UppaalSMCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UppaalSMCFactoryImpl() {
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
			case UppaalSMCPackage.NSTA: return createNSTA();
			case UppaalSMCPackage.DOUBLE_TYPE: return createDoubleType();
			case UppaalSMCPackage.CHANCE_NODE: return createChanceNode();
			case UppaalSMCPackage.CHANCE_EDGE: return createChanceEdge();
			case UppaalSMCPackage.EXPONENTIAL_LOCATION: return createExponentialLocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSTA createNSTA() {
		NSTAImpl nsta = new NSTAImpl();
		return nsta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleType createDoubleType() {
		DoubleTypeImpl doubleType = new DoubleTypeImpl();
		return doubleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChanceNode createChanceNode() {
		ChanceNodeImpl chanceNode = new ChanceNodeImpl();
		return chanceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChanceEdge createChanceEdge() {
		ChanceEdgeImpl chanceEdge = new ChanceEdgeImpl();
		return chanceEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentialLocation createExponentialLocation() {
		ExponentialLocationImpl exponentialLocation = new ExponentialLocationImpl();
		return exponentialLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UppaalSMCPackage getUppaalSMCPackage() {
		return (UppaalSMCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UppaalSMCPackage getPackage() {
		return UppaalSMCPackage.eINSTANCE;
	}

} //UppaalSMCFactoryImpl
