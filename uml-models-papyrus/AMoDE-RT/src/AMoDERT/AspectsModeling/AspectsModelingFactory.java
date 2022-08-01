/**
 */
package AMoDERT.AspectsModeling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AMoDERT.AspectsModeling.AspectsModelingPackage
 * @generated
 */
public interface AspectsModelingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AspectsModelingFactory eINSTANCE = AMoDERT.AspectsModeling.impl.AspectsModelingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect</em>'.
	 * @generated
	 */
	Aspect createAspect();

	/**
	 * Returns a new object of class '<em>Behavioral Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behavioral Adaptation</em>'.
	 * @generated
	 */
	BehavioralAdaptation createBehavioralAdaptation();

	/**
	 * Returns a new object of class '<em>Crosscut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crosscut</em>'.
	 * @generated
	 */
	Crosscut createCrosscut();

	/**
	 * Returns a new object of class '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution</em>'.
	 * @generated
	 */
	Execution createExecution();

	/**
	 * Returns a new object of class '<em>Join Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Point</em>'.
	 * @generated
	 */
	JoinPoint createJoinPoint();

	/**
	 * Returns a new object of class '<em>JPDD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JPDD</em>'.
	 * @generated
	 */
	JPDD createJPDD();

	/**
	 * Returns a new object of class '<em>Pointcut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pointcut</em>'.
	 * @generated
	 */
	Pointcut createPointcut();

	/**
	 * Returns a new object of class '<em>Structural Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structural Adaptation</em>'.
	 * @generated
	 */
	StructuralAdaptation createStructuralAdaptation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AspectsModelingPackage getAspectsModelingPackage();

} //AspectsModelingFactory
