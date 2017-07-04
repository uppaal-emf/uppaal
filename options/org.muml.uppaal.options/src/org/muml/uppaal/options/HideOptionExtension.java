/**
 */
package org.muml.uppaal.options;

import org.muml.core.Extension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hide Option Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An options extension used to specify for what options an editor should be shown in the verification wizard.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.options.HideOptionExtension#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.options.OptionsPackage#getHideOptionExtension()
 * @model
 * @generated
 */
public interface HideOptionExtension extends Extension {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * indicates which option should be hidden
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Option</em>' attribute.
	 * @see #setOption(String)
	 * @see org.muml.uppaal.options.OptionsPackage#getHideOptionExtension_Option()
	 * @model default=""
	 * @generated
	 */
	String getOption();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.options.HideOptionExtension#getOption <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' attribute.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(String value);

} // HideOptionExtension
