/**
 */
package AMoDERT.AspectsModeling;

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
 *   <li>{@link AMoDERT.AspectsModeling.Crosscut#getPeriod <em>Period</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.Crosscut#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.Crosscut#getPriority <em>Priority</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.Crosscut#getWCET <em>WCET</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.Crosscut#getTimeStamp <em>Time Stamp</em>}</li>
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
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(String)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getCrosscut_Period()
	 * @model ordered="false"
	 * @generated
	 */
	String getPeriod();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.Crosscut#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(String)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getCrosscut_Deadline()
	 * @model ordered="false"
	 * @generated
	 */
	String getDeadline();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.Crosscut#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getCrosscut_Priority()
	 * @model ordered="false"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.Crosscut#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>WCET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WCET</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WCET</em>' attribute.
	 * @see #setWCET(String)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getCrosscut_WCET()
	 * @model ordered="false"
	 * @generated
	 */
	String getWCET();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.Crosscut#getWCET <em>WCET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WCET</em>' attribute.
	 * @see #getWCET()
	 * @generated
	 */
	void setWCET(String value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(String)
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#getCrosscut_TimeStamp()
	 * @model ordered="false"
	 * @generated
	 */
	String getTimeStamp();

	/**
	 * Sets the value of the '{@link AMoDERT.AspectsModeling.Crosscut#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(String value);

} // Crosscut
