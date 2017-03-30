/**
 */
package org.muml.uppaal.declarations.global;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.muml.uppaal.declarations.DeclarationsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Contains special classes that are relevant for the global declarations.
 * <!-- end-model-doc -->
 * @see org.muml.uppaal.declarations.global.GlobalFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface GlobalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "global";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.muml.org/uppaal/declarations/global";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "global";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlobalPackage eINSTANCE = org.muml.uppaal.declarations.global.impl.GlobalPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.global.impl.ChannelPriorityDeclarationImpl <em>Channel Priority Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.global.impl.ChannelPriorityDeclarationImpl
	 * @see org.muml.uppaal.declarations.global.impl.GlobalPackageImpl#getChannelPriorityDeclaration()
	 * @generated
	 */
	int CHANNEL_PRIORITY_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRIORITY_DECLARATION__GROUPS = DeclarationsPackage.DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Channel Priority Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRIORITY_DECLARATION_FEATURE_COUNT = DeclarationsPackage.DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.global.impl.ChannelPriorityGroupImpl <em>Channel Priority Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.global.impl.ChannelPriorityGroupImpl
	 * @see org.muml.uppaal.declarations.global.impl.GlobalPackageImpl#getChannelPriorityGroup()
	 * @generated
	 */
	int CHANNEL_PRIORITY_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRIORITY_GROUP__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Channel Priority Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRIORITY_GROUP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.global.impl.PriorityItemImpl <em>Priority Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.global.impl.PriorityItemImpl
	 * @see org.muml.uppaal.declarations.global.impl.GlobalPackageImpl#getPriorityItem()
	 * @generated
	 */
	int PRIORITY_ITEM = 2;

	/**
	 * The number of structural features of the '<em>Priority Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_ITEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.global.impl.ChannelItemImpl <em>Channel Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.global.impl.ChannelItemImpl
	 * @see org.muml.uppaal.declarations.global.impl.GlobalPackageImpl#getChannelItem()
	 * @generated
	 */
	int CHANNEL_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Channel Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_ITEM__CHANNEL_EXPRESSION = PRIORITY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Channel Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_ITEM_FEATURE_COUNT = PRIORITY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.muml.uppaal.declarations.global.impl.DefaultItemImpl <em>Default Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.muml.uppaal.declarations.global.impl.DefaultItemImpl
	 * @see org.muml.uppaal.declarations.global.impl.GlobalPackageImpl#getDefaultItem()
	 * @generated
	 */
	int DEFAULT_ITEM = 4;

	/**
	 * The number of structural features of the '<em>Default Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ITEM_FEATURE_COUNT = PRIORITY_ITEM_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.global.ChannelPriorityDeclaration <em>Channel Priority Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Priority Declaration</em>'.
	 * @see org.muml.uppaal.declarations.global.ChannelPriorityDeclaration
	 * @generated
	 */
	EClass getChannelPriorityDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.declarations.global.ChannelPriorityDeclaration#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.muml.uppaal.declarations.global.ChannelPriorityDeclaration#getGroups()
	 * @see #getChannelPriorityDeclaration()
	 * @generated
	 */
	EReference getChannelPriorityDeclaration_Groups();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.global.ChannelPriorityGroup <em>Channel Priority Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Priority Group</em>'.
	 * @see org.muml.uppaal.declarations.global.ChannelPriorityGroup
	 * @generated
	 */
	EClass getChannelPriorityGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.muml.uppaal.declarations.global.ChannelPriorityGroup#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.muml.uppaal.declarations.global.ChannelPriorityGroup#getItems()
	 * @see #getChannelPriorityGroup()
	 * @generated
	 */
	EReference getChannelPriorityGroup_Items();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.global.PriorityItem <em>Priority Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Item</em>'.
	 * @see org.muml.uppaal.declarations.global.PriorityItem
	 * @generated
	 */
	EClass getPriorityItem();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.global.ChannelItem <em>Channel Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Item</em>'.
	 * @see org.muml.uppaal.declarations.global.ChannelItem
	 * @generated
	 */
	EClass getChannelItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.muml.uppaal.declarations.global.ChannelItem#getChannelExpression <em>Channel Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel Expression</em>'.
	 * @see org.muml.uppaal.declarations.global.ChannelItem#getChannelExpression()
	 * @see #getChannelItem()
	 * @generated
	 */
	EReference getChannelItem_ChannelExpression();

	/**
	 * Returns the meta object for class '{@link org.muml.uppaal.declarations.global.DefaultItem <em>Default Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Item</em>'.
	 * @see org.muml.uppaal.declarations.global.DefaultItem
	 * @generated
	 */
	EClass getDefaultItem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GlobalFactory getGlobalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.global.impl.ChannelPriorityDeclarationImpl <em>Channel Priority Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.global.impl.ChannelPriorityDeclarationImpl
		 * @see org.muml.uppaal.declarations.global.impl.GlobalPackageImpl#getChannelPriorityDeclaration()
		 * @generated
		 */
		EClass CHANNEL_PRIORITY_DECLARATION = eINSTANCE.getChannelPriorityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_PRIORITY_DECLARATION__GROUPS = eINSTANCE.getChannelPriorityDeclaration_Groups();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.global.impl.ChannelPriorityGroupImpl <em>Channel Priority Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.global.impl.ChannelPriorityGroupImpl
		 * @see org.muml.uppaal.declarations.global.impl.GlobalPackageImpl#getChannelPriorityGroup()
		 * @generated
		 */
		EClass CHANNEL_PRIORITY_GROUP = eINSTANCE.getChannelPriorityGroup();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_PRIORITY_GROUP__ITEMS = eINSTANCE.getChannelPriorityGroup_Items();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.global.impl.PriorityItemImpl <em>Priority Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.global.impl.PriorityItemImpl
		 * @see org.muml.uppaal.declarations.global.impl.GlobalPackageImpl#getPriorityItem()
		 * @generated
		 */
		EClass PRIORITY_ITEM = eINSTANCE.getPriorityItem();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.global.impl.ChannelItemImpl <em>Channel Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.global.impl.ChannelItemImpl
		 * @see org.muml.uppaal.declarations.global.impl.GlobalPackageImpl#getChannelItem()
		 * @generated
		 */
		EClass CHANNEL_ITEM = eINSTANCE.getChannelItem();

		/**
		 * The meta object literal for the '<em><b>Channel Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_ITEM__CHANNEL_EXPRESSION = eINSTANCE.getChannelItem_ChannelExpression();

		/**
		 * The meta object literal for the '{@link org.muml.uppaal.declarations.global.impl.DefaultItemImpl <em>Default Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.muml.uppaal.declarations.global.impl.DefaultItemImpl
		 * @see org.muml.uppaal.declarations.global.impl.GlobalPackageImpl#getDefaultItem()
		 * @generated
		 */
		EClass DEFAULT_ITEM = eINSTANCE.getDefaultItem();

	}

} //GlobalPackage
