/**
 */
package org.muml.uppaal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.uppaal.NTA;
import org.muml.uppaal.UppaalPackage;
import org.muml.uppaal.core.CommentableElement;
import org.muml.uppaal.core.CorePackage;
import org.muml.uppaal.core.impl.NamedElementImpl;
import org.muml.uppaal.declarations.GlobalDeclarations;
import org.muml.uppaal.declarations.SystemDeclarations;
import org.muml.uppaal.templates.Template;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NTA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.impl.NTAImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.muml.uppaal.impl.NTAImpl#getGlobalDeclarations <em>Global Declarations</em>}</li>
 *   <li>{@link org.muml.uppaal.impl.NTAImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.muml.uppaal.impl.NTAImpl#getSystemDeclarations <em>System Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NTAImpl extends NamedElementImpl implements NTA {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGlobalDeclarations() <em>Global Declarations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalDeclarations()
	 * @generated
	 * @ordered
	 */
	protected GlobalDeclarations globalDeclarations;

	/**
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<Template> template;

	/**
	 * The cached value of the '{@link #getSystemDeclarations() <em>System Declarations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemDeclarations()
	 * @generated
	 * @ordered
	 */
	protected SystemDeclarations systemDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NTAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UppaalPackage.Literals.NTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.NTA__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalDeclarations getGlobalDeclarations() {
		return globalDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalDeclarations(GlobalDeclarations newGlobalDeclarations, NotificationChain msgs) {
		GlobalDeclarations oldGlobalDeclarations = globalDeclarations;
		globalDeclarations = newGlobalDeclarations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalPackage.NTA__GLOBAL_DECLARATIONS, oldGlobalDeclarations, newGlobalDeclarations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalDeclarations(GlobalDeclarations newGlobalDeclarations) {
		if (newGlobalDeclarations != globalDeclarations) {
			NotificationChain msgs = null;
			if (globalDeclarations != null)
				msgs = ((InternalEObject)globalDeclarations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.NTA__GLOBAL_DECLARATIONS, null, msgs);
			if (newGlobalDeclarations != null)
				msgs = ((InternalEObject)newGlobalDeclarations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.NTA__GLOBAL_DECLARATIONS, null, msgs);
			msgs = basicSetGlobalDeclarations(newGlobalDeclarations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.NTA__GLOBAL_DECLARATIONS, newGlobalDeclarations, newGlobalDeclarations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Template> getTemplate() {
		if (template == null) {
			template = new EObjectContainmentEList<Template>(Template.class, this, UppaalPackage.NTA__TEMPLATE);
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDeclarations getSystemDeclarations() {
		return systemDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemDeclarations(SystemDeclarations newSystemDeclarations, NotificationChain msgs) {
		SystemDeclarations oldSystemDeclarations = systemDeclarations;
		systemDeclarations = newSystemDeclarations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalPackage.NTA__SYSTEM_DECLARATIONS, oldSystemDeclarations, newSystemDeclarations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemDeclarations(SystemDeclarations newSystemDeclarations) {
		if (newSystemDeclarations != systemDeclarations) {
			NotificationChain msgs = null;
			if (systemDeclarations != null)
				msgs = ((InternalEObject)systemDeclarations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.NTA__SYSTEM_DECLARATIONS, null, msgs);
			if (newSystemDeclarations != null)
				msgs = ((InternalEObject)newSystemDeclarations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.NTA__SYSTEM_DECLARATIONS, null, msgs);
			msgs = basicSetSystemDeclarations(newSystemDeclarations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.NTA__SYSTEM_DECLARATIONS, newSystemDeclarations, newSystemDeclarations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaalPackage.NTA__GLOBAL_DECLARATIONS:
				return basicSetGlobalDeclarations(null, msgs);
			case UppaalPackage.NTA__TEMPLATE:
				return ((InternalEList<?>)getTemplate()).basicRemove(otherEnd, msgs);
			case UppaalPackage.NTA__SYSTEM_DECLARATIONS:
				return basicSetSystemDeclarations(null, msgs);
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
			case UppaalPackage.NTA__COMMENT:
				return getComment();
			case UppaalPackage.NTA__GLOBAL_DECLARATIONS:
				return getGlobalDeclarations();
			case UppaalPackage.NTA__TEMPLATE:
				return getTemplate();
			case UppaalPackage.NTA__SYSTEM_DECLARATIONS:
				return getSystemDeclarations();
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
			case UppaalPackage.NTA__COMMENT:
				setComment((String)newValue);
				return;
			case UppaalPackage.NTA__GLOBAL_DECLARATIONS:
				setGlobalDeclarations((GlobalDeclarations)newValue);
				return;
			case UppaalPackage.NTA__TEMPLATE:
				getTemplate().clear();
				getTemplate().addAll((Collection<? extends Template>)newValue);
				return;
			case UppaalPackage.NTA__SYSTEM_DECLARATIONS:
				setSystemDeclarations((SystemDeclarations)newValue);
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
			case UppaalPackage.NTA__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case UppaalPackage.NTA__GLOBAL_DECLARATIONS:
				setGlobalDeclarations((GlobalDeclarations)null);
				return;
			case UppaalPackage.NTA__TEMPLATE:
				getTemplate().clear();
				return;
			case UppaalPackage.NTA__SYSTEM_DECLARATIONS:
				setSystemDeclarations((SystemDeclarations)null);
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
			case UppaalPackage.NTA__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case UppaalPackage.NTA__GLOBAL_DECLARATIONS:
				return globalDeclarations != null;
			case UppaalPackage.NTA__TEMPLATE:
				return template != null && !template.isEmpty();
			case UppaalPackage.NTA__SYSTEM_DECLARATIONS:
				return systemDeclarations != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (derivedFeatureID) {
				case UppaalPackage.NTA__COMMENT: return CorePackage.COMMENTABLE_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentableElement.class) {
			switch (baseFeatureID) {
				case CorePackage.COMMENTABLE_ELEMENT__COMMENT: return UppaalPackage.NTA__COMMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //NTAImpl
