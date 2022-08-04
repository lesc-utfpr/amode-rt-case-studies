/**
 */
package AMoDERT.AspectsModeling;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see AMoDERT.AspectsModeling.AspectsModelingFactory
 * @model kind="package"
 * @generated
 */
public interface AspectsModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AspectsModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///AMoDERT/AspectsModeling.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AMoDERT.AspectsModeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AspectsModelingPackage eINSTANCE = AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link AMoDERT.AspectsModeling.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMoDERT.AspectsModeling.impl.AspectImpl
	 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMoDERT.AspectsModeling.impl.BehavioralAdaptationImpl <em>Behavioral Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMoDERT.AspectsModeling.impl.BehavioralAdaptationImpl
	 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getBehavioralAdaptation()
	 * @generated
	 */
	int BEHAVIORAL_ADAPTATION = 1;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ADAPTATION__BASE_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Behavioral Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ADAPTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Behavioral Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIORAL_ADAPTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMoDERT.AspectsModeling.impl.CrosscutImpl <em>Crosscut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMoDERT.AspectsModeling.impl.CrosscutImpl
	 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getCrosscut()
	 * @generated
	 */
	int CROSSCUT = 2;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUT__BASE_ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Base Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUT__BASE_USAGE = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUT__PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUT__DEADLINE = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUT__PRIORITY = 4;

	/**
	 * The feature id for the '<em><b>WCET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUT__WCET = 5;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUT__TIME_STAMP = 6;

	/**
	 * The number of structural features of the '<em>Crosscut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Crosscut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSCUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMoDERT.AspectsModeling.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMoDERT.AspectsModeling.impl.ExecutionImpl
	 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 3;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMoDERT.AspectsModeling.impl.JoinPointImpl <em>Join Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMoDERT.AspectsModeling.impl.JoinPointImpl
	 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getJoinPoint()
	 * @generated
	 */
	int JOIN_POINT = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__BASE_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Base Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__BASE_ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__BASE_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__BASE_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__BASE_LIFELINE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__NAME = 6;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__BEHAVIOR = 7;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__NODE = 8;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__OBJECT = 9;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__CLASS = 10;

	/**
	 * The feature id for the '<em><b>Message Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT__MESSAGE_DEFINITION = 11;

	/**
	 * The number of structural features of the '<em>Join Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Join Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMoDERT.AspectsModeling.impl.JPDDImpl <em>JPDD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMoDERT.AspectsModeling.impl.JPDDImpl
	 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getJPDD()
	 * @generated
	 */
	int JPDD = 5;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPDD__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Base Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPDD__BASE_INTERACTION = 1;

	/**
	 * The number of structural features of the '<em>JPDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPDD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>JPDD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPDD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMoDERT.AspectsModeling.impl.PointcutImpl <em>Pointcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMoDERT.AspectsModeling.impl.PointcutImpl
	 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getPointcut()
	 * @generated
	 */
	int POINTCUT = 6;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__BASE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT__BASE_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pointcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINTCUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMoDERT.AspectsModeling.impl.StructuralAdaptationImpl <em>Structural Adaptation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMoDERT.AspectsModeling.impl.StructuralAdaptationImpl
	 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getStructuralAdaptation()
	 * @generated
	 */
	int STRUCTURAL_ADAPTATION = 7;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTATION__BASE_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Structural Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Structural Adaptation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_ADAPTATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link AMoDERT.AspectsModeling.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see AMoDERT.AspectsModeling.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.Aspect#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see AMoDERT.AspectsModeling.Aspect#getBase_Class()
	 * @see #getAspect()
	 * @generated
	 */
	EReference getAspect_Base_Class();

	/**
	 * Returns the meta object for class '{@link AMoDERT.AspectsModeling.BehavioralAdaptation <em>Behavioral Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavioral Adaptation</em>'.
	 * @see AMoDERT.AspectsModeling.BehavioralAdaptation
	 * @generated
	 */
	EClass getBehavioralAdaptation();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.BehavioralAdaptation#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see AMoDERT.AspectsModeling.BehavioralAdaptation#getBase_Operation()
	 * @see #getBehavioralAdaptation()
	 * @generated
	 */
	EReference getBehavioralAdaptation_Base_Operation();

	/**
	 * Returns the meta object for class '{@link AMoDERT.AspectsModeling.Crosscut <em>Crosscut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crosscut</em>'.
	 * @see AMoDERT.AspectsModeling.Crosscut
	 * @generated
	 */
	EClass getCrosscut();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.Crosscut#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see AMoDERT.AspectsModeling.Crosscut#getBase_Association()
	 * @see #getCrosscut()
	 * @generated
	 */
	EReference getCrosscut_Base_Association();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.Crosscut#getBase_Usage <em>Base Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Usage</em>'.
	 * @see AMoDERT.AspectsModeling.Crosscut#getBase_Usage()
	 * @see #getCrosscut()
	 * @generated
	 */
	EReference getCrosscut_Base_Usage();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.Crosscut#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see AMoDERT.AspectsModeling.Crosscut#getPeriod()
	 * @see #getCrosscut()
	 * @generated
	 */
	EAttribute getCrosscut_Period();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.Crosscut#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see AMoDERT.AspectsModeling.Crosscut#getDeadline()
	 * @see #getCrosscut()
	 * @generated
	 */
	EAttribute getCrosscut_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.Crosscut#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see AMoDERT.AspectsModeling.Crosscut#getPriority()
	 * @see #getCrosscut()
	 * @generated
	 */
	EAttribute getCrosscut_Priority();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.Crosscut#getWCET <em>WCET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WCET</em>'.
	 * @see AMoDERT.AspectsModeling.Crosscut#getWCET()
	 * @see #getCrosscut()
	 * @generated
	 */
	EAttribute getCrosscut_WCET();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.Crosscut#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see AMoDERT.AspectsModeling.Crosscut#getTimeStamp()
	 * @see #getCrosscut()
	 * @generated
	 */
	EAttribute getCrosscut_TimeStamp();

	/**
	 * Returns the meta object for class '{@link AMoDERT.AspectsModeling.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see AMoDERT.AspectsModeling.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.Execution#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see AMoDERT.AspectsModeling.Execution#getBase_Message()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Base_Message();

	/**
	 * Returns the meta object for class '{@link AMoDERT.AspectsModeling.JoinPoint <em>Join Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Point</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint
	 * @generated
	 */
	EClass getJoinPoint();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#getBase_Class()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EReference getJoinPoint_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#getBase_Message()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EReference getJoinPoint_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Artifact <em>Base Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Artifact</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#getBase_Artifact()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EReference getJoinPoint_Base_Artifact();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#getBase_Operation()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EReference getJoinPoint_Base_Operation();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#getBase_Property()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EReference getJoinPoint_Base_Property();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.JoinPoint#getBase_Lifeline <em>Base Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Lifeline</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#getBase_Lifeline()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EReference getJoinPoint_Base_Lifeline();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.JoinPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#getName()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EAttribute getJoinPoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.JoinPoint#isBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#isBehavior()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EAttribute getJoinPoint_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.JoinPoint#isNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#isNode()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EAttribute getJoinPoint_Node();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.JoinPoint#isObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#isObject()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EAttribute getJoinPoint_Object();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.JoinPoint#isClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#isClass()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EAttribute getJoinPoint_Class();

	/**
	 * Returns the meta object for the attribute '{@link AMoDERT.AspectsModeling.JoinPoint#isMessageDefinition <em>Message Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Definition</em>'.
	 * @see AMoDERT.AspectsModeling.JoinPoint#isMessageDefinition()
	 * @see #getJoinPoint()
	 * @generated
	 */
	EAttribute getJoinPoint_MessageDefinition();

	/**
	 * Returns the meta object for class '{@link AMoDERT.AspectsModeling.JPDD <em>JPDD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPDD</em>'.
	 * @see AMoDERT.AspectsModeling.JPDD
	 * @generated
	 */
	EClass getJPDD();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.JPDD#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see AMoDERT.AspectsModeling.JPDD#getBase_Package()
	 * @see #getJPDD()
	 * @generated
	 */
	EReference getJPDD_Base_Package();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.JPDD#getBase_Interaction <em>Base Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interaction</em>'.
	 * @see AMoDERT.AspectsModeling.JPDD#getBase_Interaction()
	 * @see #getJPDD()
	 * @generated
	 */
	EReference getJPDD_Base_Interaction();

	/**
	 * Returns the meta object for class '{@link AMoDERT.AspectsModeling.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pointcut</em>'.
	 * @see AMoDERT.AspectsModeling.Pointcut
	 * @generated
	 */
	EClass getPointcut();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.Pointcut#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see AMoDERT.AspectsModeling.Pointcut#getBase_Operation()
	 * @see #getPointcut()
	 * @generated
	 */
	EReference getPointcut_Base_Operation();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.Pointcut#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see AMoDERT.AspectsModeling.Pointcut#getBase_Property()
	 * @see #getPointcut()
	 * @generated
	 */
	EReference getPointcut_Base_Property();

	/**
	 * Returns the meta object for class '{@link AMoDERT.AspectsModeling.StructuralAdaptation <em>Structural Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Adaptation</em>'.
	 * @see AMoDERT.AspectsModeling.StructuralAdaptation
	 * @generated
	 */
	EClass getStructuralAdaptation();

	/**
	 * Returns the meta object for the reference '{@link AMoDERT.AspectsModeling.StructuralAdaptation#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see AMoDERT.AspectsModeling.StructuralAdaptation#getBase_Operation()
	 * @see #getStructuralAdaptation()
	 * @generated
	 */
	EReference getStructuralAdaptation_Base_Operation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AspectsModelingFactory getAspectsModelingFactory();

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
		 * The meta object literal for the '{@link AMoDERT.AspectsModeling.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMoDERT.AspectsModeling.impl.AspectImpl
		 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASPECT__BASE_CLASS = eINSTANCE.getAspect_Base_Class();

		/**
		 * The meta object literal for the '{@link AMoDERT.AspectsModeling.impl.BehavioralAdaptationImpl <em>Behavioral Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMoDERT.AspectsModeling.impl.BehavioralAdaptationImpl
		 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getBehavioralAdaptation()
		 * @generated
		 */
		EClass BEHAVIORAL_ADAPTATION = eINSTANCE.getBehavioralAdaptation();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIORAL_ADAPTATION__BASE_OPERATION = eINSTANCE.getBehavioralAdaptation_Base_Operation();

		/**
		 * The meta object literal for the '{@link AMoDERT.AspectsModeling.impl.CrosscutImpl <em>Crosscut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMoDERT.AspectsModeling.impl.CrosscutImpl
		 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getCrosscut()
		 * @generated
		 */
		EClass CROSSCUT = eINSTANCE.getCrosscut();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSCUT__BASE_ASSOCIATION = eINSTANCE.getCrosscut_Base_Association();

		/**
		 * The meta object literal for the '<em><b>Base Usage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSCUT__BASE_USAGE = eINSTANCE.getCrosscut_Base_Usage();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSCUT__PERIOD = eINSTANCE.getCrosscut_Period();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSCUT__DEADLINE = eINSTANCE.getCrosscut_Deadline();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSCUT__PRIORITY = eINSTANCE.getCrosscut_Priority();

		/**
		 * The meta object literal for the '<em><b>WCET</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSCUT__WCET = eINSTANCE.getCrosscut_WCET();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSCUT__TIME_STAMP = eINSTANCE.getCrosscut_TimeStamp();

		/**
		 * The meta object literal for the '{@link AMoDERT.AspectsModeling.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMoDERT.AspectsModeling.impl.ExecutionImpl
		 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__BASE_MESSAGE = eINSTANCE.getExecution_Base_Message();

		/**
		 * The meta object literal for the '{@link AMoDERT.AspectsModeling.impl.JoinPointImpl <em>Join Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMoDERT.AspectsModeling.impl.JoinPointImpl
		 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getJoinPoint()
		 * @generated
		 */
		EClass JOIN_POINT = eINSTANCE.getJoinPoint();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_POINT__BASE_CLASS = eINSTANCE.getJoinPoint_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_POINT__BASE_MESSAGE = eINSTANCE.getJoinPoint_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Base Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_POINT__BASE_ARTIFACT = eINSTANCE.getJoinPoint_Base_Artifact();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_POINT__BASE_OPERATION = eINSTANCE.getJoinPoint_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_POINT__BASE_PROPERTY = eINSTANCE.getJoinPoint_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Base Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_POINT__BASE_LIFELINE = eINSTANCE.getJoinPoint_Base_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_POINT__NAME = eINSTANCE.getJoinPoint_Name();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_POINT__BEHAVIOR = eINSTANCE.getJoinPoint_Behavior();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_POINT__NODE = eINSTANCE.getJoinPoint_Node();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_POINT__OBJECT = eINSTANCE.getJoinPoint_Object();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_POINT__CLASS = eINSTANCE.getJoinPoint_Class();

		/**
		 * The meta object literal for the '<em><b>Message Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_POINT__MESSAGE_DEFINITION = eINSTANCE.getJoinPoint_MessageDefinition();

		/**
		 * The meta object literal for the '{@link AMoDERT.AspectsModeling.impl.JPDDImpl <em>JPDD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMoDERT.AspectsModeling.impl.JPDDImpl
		 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getJPDD()
		 * @generated
		 */
		EClass JPDD = eINSTANCE.getJPDD();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPDD__BASE_PACKAGE = eINSTANCE.getJPDD_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Base Interaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPDD__BASE_INTERACTION = eINSTANCE.getJPDD_Base_Interaction();

		/**
		 * The meta object literal for the '{@link AMoDERT.AspectsModeling.impl.PointcutImpl <em>Pointcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMoDERT.AspectsModeling.impl.PointcutImpl
		 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getPointcut()
		 * @generated
		 */
		EClass POINTCUT = eINSTANCE.getPointcut();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT__BASE_OPERATION = eINSTANCE.getPointcut_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINTCUT__BASE_PROPERTY = eINSTANCE.getPointcut_Base_Property();

		/**
		 * The meta object literal for the '{@link AMoDERT.AspectsModeling.impl.StructuralAdaptationImpl <em>Structural Adaptation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMoDERT.AspectsModeling.impl.StructuralAdaptationImpl
		 * @see AMoDERT.AspectsModeling.impl.AspectsModelingPackageImpl#getStructuralAdaptation()
		 * @generated
		 */
		EClass STRUCTURAL_ADAPTATION = eINSTANCE.getStructuralAdaptation();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_ADAPTATION__BASE_OPERATION = eINSTANCE.getStructuralAdaptation_Base_Operation();

	}

} //AspectsModelingPackage
