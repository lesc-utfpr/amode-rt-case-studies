/**
 */
package AMoDERT.AspectsModeling.impl;

import AMoDERT.AspectsModeling.Aspect;
import AMoDERT.AspectsModeling.AspectsModelingFactory;
import AMoDERT.AspectsModeling.AspectsModelingPackage;
import AMoDERT.AspectsModeling.BehavioralAdaptation;
import AMoDERT.AspectsModeling.Crosscut;
import AMoDERT.AspectsModeling.Execution;
import AMoDERT.AspectsModeling.JoinPoint;
import AMoDERT.AspectsModeling.Pointcut;
import AMoDERT.AspectsModeling.StructuralAdaptation;

import AMoDERT.Utils.UtilsPackage;

import AMoDERT.Utils.impl.UtilsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AspectsModelingPackageImpl extends EPackageImpl implements AspectsModelingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crosscutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jpddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointcutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralAdaptationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see AMoDERT.AspectsModeling.AspectsModelingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AspectsModelingPackageImpl() {
		super(eNS_URI, AspectsModelingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AspectsModelingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AspectsModelingPackage init() {
		if (isInited) return (AspectsModelingPackage)EPackage.Registry.INSTANCE.getEPackage(AspectsModelingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAspectsModelingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AspectsModelingPackageImpl theAspectsModelingPackage = registeredAspectsModelingPackage instanceof AspectsModelingPackageImpl ? (AspectsModelingPackageImpl)registeredAspectsModelingPackage : new AspectsModelingPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UtilsPackage.eNS_URI);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl)(registeredPackage instanceof UtilsPackageImpl ? registeredPackage : UtilsPackage.eINSTANCE);

		// Create package meta-data objects
		theAspectsModelingPackage.createPackageContents();
		theUtilsPackage.createPackageContents();

		// Initialize created meta-data
		theAspectsModelingPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAspectsModelingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AspectsModelingPackage.eNS_URI, theAspectsModelingPackage);
		return theAspectsModelingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspect() {
		return aspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Base_Class() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralAdaptation() {
		return behavioralAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralAdaptation_Base_Operation() {
		return (EReference)behavioralAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrosscut() {
		return crosscutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrosscut_Base_Association() {
		return (EReference)crosscutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCrosscut_Base_Usage() {
		return (EReference)crosscutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrosscut_Attributes() {
		return (EAttribute)crosscutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecution() {
		return executionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Base_Message() {
		return (EReference)executionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinPoint() {
		return joinPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinPoint_Base_Class() {
		return (EReference)joinPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinPoint_Base_Message() {
		return (EReference)joinPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinPoint_Base_Artifact() {
		return (EReference)joinPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinPoint_Base_Operation() {
		return (EReference)joinPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinPoint_Base_Property() {
		return (EReference)joinPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinPoint_Base_Lifeline() {
		return (EReference)joinPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinPoint_Name() {
		return (EAttribute)joinPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinPoint_Behavior() {
		return (EAttribute)joinPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinPoint_Node() {
		return (EAttribute)joinPointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinPoint_Object() {
		return (EAttribute)joinPointEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinPoint_Class() {
		return (EAttribute)joinPointEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinPoint_MessageDefinition() {
		return (EAttribute)joinPointEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJPDD() {
		return jpddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPDD_Base_Package() {
		return (EReference)jpddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPDD_Base_Interaction() {
		return (EReference)jpddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointcut() {
		return pointcutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointcut_Base_Operation() {
		return (EReference)pointcutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointcut_Base_Property() {
		return (EReference)pointcutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralAdaptation() {
		return structuralAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralAdaptation_Base_Operation() {
		return (EReference)structuralAdaptationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectsModelingFactory getAspectsModelingFactory() {
		return (AspectsModelingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aspectEClass = createEClass(ASPECT);
		createEReference(aspectEClass, ASPECT__BASE_CLASS);

		behavioralAdaptationEClass = createEClass(BEHAVIORAL_ADAPTATION);
		createEReference(behavioralAdaptationEClass, BEHAVIORAL_ADAPTATION__BASE_OPERATION);

		crosscutEClass = createEClass(CROSSCUT);
		createEReference(crosscutEClass, CROSSCUT__BASE_ASSOCIATION);
		createEReference(crosscutEClass, CROSSCUT__BASE_USAGE);
		createEAttribute(crosscutEClass, CROSSCUT__ATTRIBUTES);

		executionEClass = createEClass(EXECUTION);
		createEReference(executionEClass, EXECUTION__BASE_MESSAGE);

		joinPointEClass = createEClass(JOIN_POINT);
		createEReference(joinPointEClass, JOIN_POINT__BASE_CLASS);
		createEReference(joinPointEClass, JOIN_POINT__BASE_MESSAGE);
		createEReference(joinPointEClass, JOIN_POINT__BASE_ARTIFACT);
		createEReference(joinPointEClass, JOIN_POINT__BASE_OPERATION);
		createEReference(joinPointEClass, JOIN_POINT__BASE_PROPERTY);
		createEReference(joinPointEClass, JOIN_POINT__BASE_LIFELINE);
		createEAttribute(joinPointEClass, JOIN_POINT__NAME);
		createEAttribute(joinPointEClass, JOIN_POINT__BEHAVIOR);
		createEAttribute(joinPointEClass, JOIN_POINT__NODE);
		createEAttribute(joinPointEClass, JOIN_POINT__OBJECT);
		createEAttribute(joinPointEClass, JOIN_POINT__CLASS);
		createEAttribute(joinPointEClass, JOIN_POINT__MESSAGE_DEFINITION);

		jpddEClass = createEClass(JPDD);
		createEReference(jpddEClass, JPDD__BASE_PACKAGE);
		createEReference(jpddEClass, JPDD__BASE_INTERACTION);

		pointcutEClass = createEClass(POINTCUT);
		createEReference(pointcutEClass, POINTCUT__BASE_OPERATION);
		createEReference(pointcutEClass, POINTCUT__BASE_PROPERTY);

		structuralAdaptationEClass = createEClass(STRUCTURAL_ADAPTATION);
		createEReference(structuralAdaptationEClass, STRUCTURAL_ADAPTATION__BASE_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAspect_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behavioralAdaptationEClass, BehavioralAdaptation.class, "BehavioralAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioralAdaptation_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, BehavioralAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(crosscutEClass, Crosscut.class, "Crosscut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCrosscut_Base_Association(), theUMLPackage.getAssociation(), null, "base_Association", null, 0, 1, Crosscut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCrosscut_Base_Usage(), theUMLPackage.getUsage(), null, "base_Usage", null, 0, 1, Crosscut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCrosscut_Attributes(), ecorePackage.getEString(), "Attributes", null, 0, -1, Crosscut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(executionEClass, Execution.class, "Execution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecution_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(joinPointEClass, JoinPoint.class, "JoinPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoinPoint_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getJoinPoint_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 0, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getJoinPoint_Base_Artifact(), theUMLPackage.getArtifact(), null, "base_Artifact", null, 0, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getJoinPoint_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getJoinPoint_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getJoinPoint_Base_Lifeline(), theUMLPackage.getLifeline(), null, "base_Lifeline", null, 0, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJoinPoint_Name(), ecorePackage.getEString(), "Name", null, 0, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJoinPoint_Behavior(), theTypesPackage.getBoolean(), "Behavior", "false", 1, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJoinPoint_Node(), theTypesPackage.getBoolean(), "Node", "false", 1, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJoinPoint_Object(), theTypesPackage.getBoolean(), "Object", "false", 1, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJoinPoint_Class(), theTypesPackage.getBoolean(), "Class", "false", 1, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getJoinPoint_MessageDefinition(), theTypesPackage.getBoolean(), "MessageDefinition", "false", 1, 1, JoinPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(jpddEClass, AMoDERT.AspectsModeling.JPDD.class, "JPDD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJPDD_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, AMoDERT.AspectsModeling.JPDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getJPDD_Base_Interaction(), theUMLPackage.getInteraction(), null, "base_Interaction", null, 0, 1, AMoDERT.AspectsModeling.JPDD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pointcutEClass, Pointcut.class, "Pointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointcut_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPointcut_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 0, 1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(structuralAdaptationEClass, StructuralAdaptation.class, "StructuralAdaptation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralAdaptation_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 0, 1, StructuralAdaptation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AspectsModelingPackageImpl
