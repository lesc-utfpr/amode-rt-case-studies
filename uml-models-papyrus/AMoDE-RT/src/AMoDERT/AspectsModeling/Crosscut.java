/**
 */
package AMoDERT.AspectsModeling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Usage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crosscut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMoDERT.AspectsModeling.Crosscut#getBase_Association <em>Base Association</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.Crosscut#getBase_Usage <em>Base Usage</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.Crosscut#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getCrosscut()
 * @model
 * @generated
 */
public interface Crosscut extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Association</em>' reference.
	 * @see #setBase_Association(Association)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getCrosscut_Base_Association()
	 * @model ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.Crosscut#getBase_Association <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Association</em>' reference.
	 * @see #getBase_Association()
	 * @generated
	 */
	void setBase_Association(Association value);

	/**
	 * Returns the value of the '<em><b>Base Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Usage</em>' reference.
	 * @see #setBase_Usage(Usage)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getCrosscut_Base_Usage()
	 * @model ordered="false"
	 * @generated
	 */
	Usage getBase_Usage();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.Crosscut#getBase_Usage <em>Base Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Usage</em>' reference.
	 * @see #getBase_Usage()
	 * @generated
	 */
	void setBase_Usage(Usage value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute list.
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getCrosscut_Attributes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getAttributes();

} // Crosscut
