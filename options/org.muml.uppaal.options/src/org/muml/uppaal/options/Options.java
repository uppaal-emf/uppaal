/**
 */
package org.muml.uppaal.options;

import org.muml.core.ExtendableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.uppaal.options.Options#getConnectorOutBufferSize <em>Connector Out Buffer Size</em>}</li>
 *   <li>{@link org.muml.uppaal.options.Options#getHashTableSize <em>Hash Table Size</em>}</li>
 *   <li>{@link org.muml.uppaal.options.Options#getStateSpaceReduction <em>State Space Reduction</em>}</li>
 *   <li>{@link org.muml.uppaal.options.Options#getTraceOptions <em>Trace Options</em>}</li>
 * </ul>
 *
 * @see org.muml.uppaal.options.OptionsPackage#getOptions()
 * @model
 * @generated
 */
public interface Options extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Connector Out Buffer Size</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the size of the outgoing connector buffers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Out Buffer Size</em>' attribute.
	 * @see #setConnectorOutBufferSize(int)
	 * @see org.muml.uppaal.options.OptionsPackage#getOptions_ConnectorOutBufferSize()
	 * @model default="5"
	 * @generated
	 */
	int getConnectorOutBufferSize();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.options.Options#getConnectorOutBufferSize <em>Connector Out Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Out Buffer Size</em>' attribute.
	 * @see #getConnectorOutBufferSize()
	 * @generated
	 */
	void setConnectorOutBufferSize(int value);

	/**
	 * Returns the value of the '<em><b>Hash Table Size</b></em>' attribute.
	 * The default value is <code>"27"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the hash table size for bit state hashing will be 2^hashTableSize
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hash Table Size</em>' attribute.
	 * @see #setHashTableSize(int)
	 * @see org.muml.uppaal.options.OptionsPackage#getOptions_HashTableSize()
	 * @model default="27" required="true"
	 * @generated
	 */
	int getHashTableSize();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.options.Options#getHashTableSize <em>Hash Table Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hash Table Size</em>' attribute.
	 * @see #getHashTableSize()
	 * @generated
	 */
	void setHashTableSize(int value);

	/**
	 * Returns the value of the '<em><b>State Space Reduction</b></em>' attribute.
	 * The default value is <code>"conservative"</code>.
	 * The literals are from the enumeration {@link org.muml.uppaal.options.StateSpaceReduction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * options for the state space consumption
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Space Reduction</em>' attribute.
	 * @see org.muml.uppaal.options.StateSpaceReduction
	 * @see #setStateSpaceReduction(StateSpaceReduction)
	 * @see org.muml.uppaal.options.OptionsPackage#getOptions_StateSpaceReduction()
	 * @model default="conservative"
	 * @generated
	 */
	StateSpaceReduction getStateSpaceReduction();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.options.Options#getStateSpaceReduction <em>State Space Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Space Reduction</em>' attribute.
	 * @see org.muml.uppaal.options.StateSpaceReduction
	 * @see #getStateSpaceReduction()
	 * @generated
	 */
	void setStateSpaceReduction(StateSpaceReduction value);

	/**
	 * Returns the value of the '<em><b>Trace Options</b></em>' attribute.
	 * The default value is <code>"some"</code>.
	 * The literals are from the enumeration {@link org.muml.uppaal.options.TraceOptions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * options for the generated traces
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Options</em>' attribute.
	 * @see org.muml.uppaal.options.TraceOptions
	 * @see #setTraceOptions(TraceOptions)
	 * @see org.muml.uppaal.options.OptionsPackage#getOptions_TraceOptions()
	 * @model default="some"
	 * @generated
	 */
	TraceOptions getTraceOptions();

	/**
	 * Sets the value of the '{@link org.muml.uppaal.options.Options#getTraceOptions <em>Trace Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Options</em>' attribute.
	 * @see org.muml.uppaal.options.TraceOptions
	 * @see #getTraceOptions()
	 * @generated
	 */
	void setTraceOptions(TraceOptions value);

} // Options
