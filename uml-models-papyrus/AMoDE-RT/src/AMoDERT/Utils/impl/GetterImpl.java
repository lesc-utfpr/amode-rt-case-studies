/**
 */
package AMoDERT.Utils.impl;

import AMoDERT.Utils.Getter;
import AMoDERT.Utils.UtilsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Getter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AMoDERT.Utils.impl.GetterImpl#getForAttribute <em>For Attribute</em>}</li>
 *   <li>{@link AMoDERT.Utils.impl.GetterImpl#getBase_Operation <em>Base Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetterImpl extends MinimalEObjectImpl.Container implements Getter {
	/**
	 * The cached value of the '{@link #getForAttribute() <em>For Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForAttribute()
	 * @generated
	 * @ordered
	 */
	protected Property forAttribute;

	/**
	 * The cached value of the '{@link #getBase_Operation() <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Operation()
	 * @generated
	 * @ordered
	 */
	protected Operation base_Operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilsPackage.Literals.GETTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getForAttribute() {
		if (forAttribute != null && forAttribute.eIsProxy()) {
			InternalEObject oldForAttribute = (InternalEObject)forAttribute;
			forAttribute = (Property)eResolveProxy(oldForAttribute);
			if (forAttribute != oldForAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UtilsPackage.GETTER__FOR_ATTRIBUTE, oldForAttribute, forAttribute));
			}
		}
		return forAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetForAttribute() {
		return forAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForAttribute(Property newForAttribute) {
		Property oldForAttribute = forAttribute;
		forAttribute = newForAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.GETTER__FOR_ATTRIBUTE, oldForAttribute, forAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getBase_Operation() {
		if (base_Operation != null && base_Operation.eIsProxy()) {
			InternalEObject oldBase_Operation = (InternalEObject)base_Operation;
			base_Operation = (Operation)eResolveProxy(oldBase_Operation);
			if (base_Operation != oldBase_Operation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UtilsPackage.GETTER__BASE_OPERATION, oldBase_Operation, base_Operation));
			}
		}
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetBase_Operation() {
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Operation(Operation newBase_Operation) {
		Operation oldBase_Operation = base_Operation;
		base_Operation = newBase_Operation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilsPackage.GETTER__BASE_OPERATION, oldBase_Operation, base_Operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UtilsPackage.GETTER__FOR_ATTRIBUTE:
				if (resolve) return getForAttribute();
				return basicGetForAttribute();
			case UtilsPackage.GETTER__BASE_OPERATION:
				if (resolve) return getBase_Operation();
				return basicGetBase_Operation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UtilsPackage.GETTER__FOR_ATTRIBUTE:
				setForAttribute((Property)newValue);
				return;
			case UtilsPackage.GETTER__BASE_OPERATION:
				setBase_Operation((Operation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UtilsPackage.GETTER__FOR_ATTRIBUTE:
				setForAttribute((Property)null);
				return;
			case UtilsPackage.GETTER__BASE_OPERATION:
				setBase_Operation((Operation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UtilsPackage.GETTER__FOR_ATTRIBUTE:
				return forAttribute != null;
			case UtilsPackage.GETTER__BASE_OPERATION:
				return base_Operation != null;
		}
		return super.eIsSet(featureID);
	}

} //GetterImpl
