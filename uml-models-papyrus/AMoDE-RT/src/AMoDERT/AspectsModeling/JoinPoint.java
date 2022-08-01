/**
 */
package AMoDERT.AspectsModeling;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Artifact <em>Base Artifact</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#getName <em>Name</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#isBehavior <em>Behavior</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#isNode <em>Node</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#isObject <em>Object</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#isClass <em>Class</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.JoinPoint#isMessageDefinition <em>Message Definition</em>}</li>
 * </ul>
 *
 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint()
 * @model
 * @generated
 */
public interface JoinPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Message</em>' reference.
	 * @see #setBase_Message(Message)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Base_Message()
	 * @model ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Message <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Message</em>' reference.
	 * @see #getBase_Message()
	 * @generated
	 */
	void setBase_Message(Message value);

	/**
	 * Returns the value of the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Artifact</em>' reference.
	 * @see #setBase_Artifact(Artifact)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Base_Artifact()
	 * @model ordered="false"
	 * @generated
	 */
	Artifact getBase_Artifact();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Artifact <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Artifact</em>' reference.
	 * @see #getBase_Artifact()
	 * @generated
	 */
	void setBase_Artifact(Artifact value);

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
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Base_Operation()
	 * @model ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Lifeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Lifeline</em>' reference.
	 * @see #setBase_Lifeline(Lifeline)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Base_Lifeline()
	 * @model ordered="false"
	 * @generated
	 */
	Lifeline getBase_Lifeline();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Lifeline <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Lifeline</em>' reference.
	 * @see #getBase_Lifeline()
	 * @generated
	 */
	void setBase_Lifeline(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see #setBehavior(boolean)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Behavior()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBehavior();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#isBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see #isBehavior()
	 * @generated
	 */
	void setBehavior(boolean value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' attribute.
	 * @see #setNode(boolean)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Node()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNode();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#isNode <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' attribute.
	 * @see #isNode()
	 * @generated
	 */
	void setNode(boolean value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(boolean)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Object()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isObject();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#isObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #isObject()
	 * @generated
	 */
	void setObject(boolean value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass_(boolean)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_Class()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isClass();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#isClass <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #isClass()
	 * @generated
	 */
	void setClass_(boolean value);

	/**
	 * Returns the value of the '<em><b>Message Definition</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Definition</em>' attribute.
	 * @see #setMessageDefinition(boolean)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getJoinPoint_MessageDefinition()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isMessageDefinition();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.JoinPoint#isMessageDefinition <em>Message Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Definition</em>' attribute.
	 * @see #isMessageDefinition()
	 * @generated
	 */
	void setMessageDefinition(boolean value);

} // JoinPoint
