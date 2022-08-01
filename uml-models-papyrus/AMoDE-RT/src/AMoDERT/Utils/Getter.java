/**
 */
package AMoDERT.Utils;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Getter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMoDERT.Utils.Getter#getForAttribute <em>For Attribute</em>}</li>
 *   <li>{@link AMoDERT.Utils.Getter#getBase_Operation <em>Base Operation</em>}</li>
 * </ul>
 *
 * @see AMoDERT.Utils.UtilsPackage#getGetter()
 * @model
 * @generated
 */
public interface Getter extends EObject {
	/**
	 * Returns the value of the '<em><b>For Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Attribute</em>' reference.
	 * @see #setForAttribute(Property)
	 * @see AMoDERT.Utils.UtilsPackage#getGetter_ForAttribute()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getForAttribute();

	/**
	 * Sets the value of the '{@link AMoDERT.Utils.Getter#getForAttribute <em>For Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Attribute</em>' reference.
	 * @see #getForAttribute()
	 * @generated
	 */
	void setForAttribute(Property value);

	/**
	 * Returns the value of the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Operation</em>' reference.
	 * @see #setBase_Operation(Operation)
	 * @see AMoDERT.Utils.UtilsPackage#getGetter_Base_Operation()
	 * @model ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link AMoDERT.Utils.Getter#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

} // Getter
