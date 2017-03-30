/**
 */
package org.muml.uppaal.declarations.global.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.muml.uppaal.declarations.global.ChannelItem;
import org.muml.uppaal.declarations.global.ChannelPriorityDeclaration;
import org.muml.uppaal.declarations.global.ChannelPriorityGroup;
import org.muml.uppaal.declarations.global.DefaultItem;
import org.muml.uppaal.declarations.global.GlobalFactory;
import org.muml.uppaal.declarations.global.GlobalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalFactoryImpl extends EFactoryImpl implements GlobalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GlobalFactory init() {
		try {
			GlobalFactory theGlobalFactory = (GlobalFactory)EPackage.Registry.INSTANCE.getEFactory(GlobalPackage.eNS_URI);
			if (theGlobalFactory != null) {
				return theGlobalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GlobalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalFactoryImpl() {
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
			case GlobalPackage.CHANNEL_PRIORITY_DECLARATION: return createChannelPriorityDeclaration();
			case GlobalPackage.CHANNEL_PRIORITY_GROUP: return createChannelPriorityGroup();
			case GlobalPackage.CHANNEL_ITEM: return createChannelItem();
			case GlobalPackage.DEFAULT_ITEM: return createDefaultItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelPriorityDeclaration createChannelPriorityDeclaration() {
		ChannelPriorityDeclarationImpl channelPriorityDeclaration = new ChannelPriorityDeclarationImpl();
		return channelPriorityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelPriorityGroup createChannelPriorityGroup() {
		ChannelPriorityGroupImpl channelPriorityGroup = new ChannelPriorityGroupImpl();
		return channelPriorityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelItem createChannelItem() {
		ChannelItemImpl channelItem = new ChannelItemImpl();
		return channelItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultItem createDefaultItem() {
		DefaultItemImpl defaultItem = new DefaultItemImpl();
		return defaultItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalPackage getGlobalPackage() {
		return (GlobalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GlobalPackage getPackage() {
		return GlobalPackage.eINSTANCE;
	}

} //GlobalFactoryImpl
