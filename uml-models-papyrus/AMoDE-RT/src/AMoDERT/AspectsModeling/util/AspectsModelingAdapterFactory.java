/**
 */
package AMoDERT.AspectsModeling.util;

import AMoDERT.AspectsModeling.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AMoDERT.AspectsModeling.AspectsModelingPackage
 * @generated
 */
public class AspectsModelingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AspectsModelingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectsModelingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AspectsModelingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectsModelingSwitch<Adapter> modelSwitch =
		new AspectsModelingSwitch<Adapter>() {
			@Override
			public Adapter caseAspect(Aspect object) {
				return createAspectAdapter();
			}
			@Override
			public Adapter caseBehavioralAdaptation(BehavioralAdaptation object) {
				return createBehavioralAdaptationAdapter();
			}
			@Override
			public Adapter caseCrosscut(Crosscut object) {
				return createCrosscutAdapter();
			}
			@Override
			public Adapter caseExecution(Execution object) {
				return createExecutionAdapter();
			}
			@Override
			public Adapter caseJoinPoint(JoinPoint object) {
				return createJoinPointAdapter();
			}
			@Override
			public Adapter caseJPDD(JPDD object) {
				return createJPDDAdapter();
			}
			@Override
			public Adapter casePointcut(Pointcut object) {
				return createPointcutAdapter();
			}
			@Override
			public Adapter caseStructuralAdaptation(StructuralAdaptation object) {
				return createStructuralAdaptationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link AMoDERT.AspectsModeling.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMoDERT.AspectsModeling.Aspect
	 * @generated
	 */
	public Adapter createAspectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMoDERT.AspectsModeling.BehavioralAdaptation <em>Behavioral Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMoDERT.AspectsModeling.BehavioralAdaptation
	 * @generated
	 */
	public Adapter createBehavioralAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMoDERT.AspectsModeling.Crosscut <em>Crosscut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMoDERT.AspectsModeling.Crosscut
	 * @generated
	 */
	public Adapter createCrosscutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMoDERT.AspectsModeling.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMoDERT.AspectsModeling.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMoDERT.AspectsModeling.JoinPoint <em>Join Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMoDERT.AspectsModeling.JoinPoint
	 * @generated
	 */
	public Adapter createJoinPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMoDERT.AspectsModeling.JPDD <em>JPDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMoDERT.AspectsModeling.JPDD
	 * @generated
	 */
	public Adapter createJPDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMoDERT.AspectsModeling.Pointcut <em>Pointcut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMoDERT.AspectsModeling.Pointcut
	 * @generated
	 */
	public Adapter createPointcutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMoDERT.AspectsModeling.StructuralAdaptation <em>Structural Adaptation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMoDERT.AspectsModeling.StructuralAdaptation
	 * @generated
	 */
	public Adapter createStructuralAdaptationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AspectsModelingAdapterFactory
