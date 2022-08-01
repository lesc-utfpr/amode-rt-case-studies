/**
 */
package AMoDERT.AspectsModeling.impl;

import AMoDERT.AspectsModeling.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AspectsModelingFactoryImpl extends EFactoryImpl implements AspectsModelingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AspectsModelingFactory init() {
		try {
			AspectsModelingFactory theAspectsModelingFactory = (AspectsModelingFactory)EPackage.Registry.INSTANCE.getEFactory(AspectsModelingPackage.eNS_URI);
			if (theAspectsModelingFactory != null) {
				return theAspectsModelingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AspectsModelingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectsModelingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AspectsModelingPackage.ASPECT: return createAspect();
			case AspectsModelingPackage.BEHAVIORAL_ADAPTATION: return createBehavioralAdaptation();
			case AspectsModelingPackage.CROSSCUT: return createCrosscut();
			case AspectsModelingPackage.EXECUTION: return createExecution();
			case AspectsModelingPackage.JOIN_POINT: return createJoinPoint();
			case AspectsModelingPackage.JPDD: return createJPDD();
			case AspectsModelingPackage.POINTCUT: return createPointcut();
			case AspectsModelingPackage.STRUCTURAL_ADAPTATION: return createStructuralAdaptation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aspect createAspect() {
		AspectImpl aspect = new AspectImpl();
		return aspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralAdaptation createBehavioralAdaptation() {
		BehavioralAdaptationImpl behavioralAdaptation = new BehavioralAdaptationImpl();
		return behavioralAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Crosscut createCrosscut() {
		CrosscutImpl crosscut = new CrosscutImpl();
		return crosscut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution createExecution() {
		ExecutionImpl execution = new ExecutionImpl();
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPoint createJoinPoint() {
		JoinPointImpl joinPoint = new JoinPointImpl();
		return joinPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPDD createJPDD() {
		JPDDImpl jpdd = new JPDDImpl();
		return jpdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pointcut createPointcut() {
		PointcutImpl pointcut = new PointcutImpl();
		return pointcut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralAdaptation createStructuralAdaptation() {
		StructuralAdaptationImpl structuralAdaptation = new StructuralAdaptationImpl();
		return structuralAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectsModelingPackage getAspectsModelingPackage() {
		return (AspectsModelingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AspectsModelingPackage getPackage() {
		return AspectsModelingPackage.eINSTANCE;
	}

} //AspectsModelingFactoryImpl
