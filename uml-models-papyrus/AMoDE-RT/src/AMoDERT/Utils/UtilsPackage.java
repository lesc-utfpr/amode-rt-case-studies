/**
 */
package AMoDERT.Utils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see AMoDERT.Utils.UtilsFactory
 * @model kind="package"
 * @generated
 */
public interface UtilsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Utils";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///AMoDERT/Utils.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AMoDERT.Utils";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilsPackage eINSTANCE = AMoDERT.Utils.impl.UtilsPackageImpl.init();

	/**
	 * The meta object id for the '{@link AMoDERT.Utils.impl.GetterImpl <em>Getter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMoDERT.Utils.impl.GetterImpl
	 * @see AMoDERT.Utils.impl.UtilsPackageImpl#getGetter()
	 * @generated
	 */
	int GETTER = 0;

	/**
	 * The feature id for the '<em><b>For Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER__FOR_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER__BASE_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Getter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Getter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GETTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMoDERT.Utils.impl.SetterImpl <em>Setter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMoDERT.Utils.impl.SetterImpl
	 * @see AMoDERT.Utils.impl.UtilsPackageImpl#getSetter()
	 * @generated
	 */
	int SETTER = 1;

	/**
	 * The feature id for the '<em><b>For Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__FOR_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER__BASE_OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Setter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link AMoDERT.Utils.Getter <em>Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Getter</em>'.
	 * @see AMoDERT.Utils.Getter
	 * @generated
	 */
	EClass getGetter();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.Utils.Getter#getForAttribute <em>For Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Attribute</em>'.
	 * @see AMoDERT.Utils.Getter#getForAttribute()
	 * @see #getGetter()
	 * @generated
	 */
	EReference getGetter_ForAttribute();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.Utils.Getter#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see AMoDERT.Utils.Getter#getBase_Operation()
	 * @see #getGetter()
	 * @generated
	 */
	EReference getGetter_Base_Operation();

	/**
	 * Returns the meta object for class '{@link AMoDERT.Utils.Setter <em>Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setter</em>'.
	 * @see AMoDERT.Utils.Setter
	 * @generated
	 */
	EClass getSetter();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.Utils.Setter#getForAttribute <em>For Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For Attribute</em>'.
	 * @see AMoDERT.Utils.Setter#getForAttribute()
	 * @see #getSetter()
	 * @generated
	 */
	EReference getSetter_ForAttribute();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.Utils.Setter#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see AMoDERT.Utils.Setter#getBase_Operation()
	 * @see #getSetter()
	 * @generated
	 */
	EReference getSetter_Base_Operation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilsFactory getUtilsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link AMoDERT.Utils.impl.GetterImpl <em>Getter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMoDERT.Utils.impl.GetterImpl
		 * @see AMoDERT.Utils.impl.UtilsPackageImpl#getGetter()
		 * @generated
		 */
		EClass GETTER = eINSTANCE.getGetter();

		/**
		 * The meta object literal for the '<em><b>For Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GETTER__FOR_ATTRIBUTE = eINSTANCE.getGetter_ForAttribute();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GETTER__BASE_OPERATION = eINSTANCE.getGetter_Base_Operation();

		/**
		 * The meta object literal for the '{@link AMoDERT.Utils.impl.SetterImpl <em>Setter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMoDERT.Utils.impl.SetterImpl
		 * @see AMoDERT.Utils.impl.UtilsPackageImpl#getSetter()
		 * @generated
		 */
		EClass SETTER = eINSTANCE.getSetter();

		/**
		 * The meta object literal for the '<em><b>For Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTER__FOR_ATTRIBUTE = eINSTANCE.getSetter_ForAttribute();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTER__BASE_OPERATION = eINSTANCE.getSetter_Base_Operation();

	}

} //UtilsPackage
