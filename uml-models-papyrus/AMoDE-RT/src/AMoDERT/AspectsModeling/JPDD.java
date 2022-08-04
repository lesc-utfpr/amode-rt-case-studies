/**
 */
package AMoDERT.AspectsModeling;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Interaction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMoDERT.AspectsModeling.JPDD#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JPDD#getBase_Interaction <em>Base Interaction</em>}</li>
 * </ul>
 *
 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJPDD()
 * @model
 * @generated
 */
public interface JPDD extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJPDD_Base_Package()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JPDD#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Base Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Interaction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Interaction</em>' reference.
	 * @see #setBase_Interaction(Interaction)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJPDD_Base_Interaction()
	 * @model ordered="false"
	 * @generated
	 */
	Interaction getBase_Interaction();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JPDD#getBase_Interaction <em>Base Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Interaction</em>' reference.
	 * @see #getBase_Interaction()
	 * @generated
	 */
	void setBase_Interaction(Interaction value);

} // JPDD
