/**
 */
package AMoDERT.AspectsModeling.impl;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import AMoDERT.AspectsModeling.JPDD;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.uml2.uml.Interaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JPDD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JPDDImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JPDDImpl#getBase_Interaction <em>Base Interaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JPDDImpl extends MinimalEObjectImpl.Container implements JPDD {
	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * The cached value of the '{@link #getBase_Interaction() <em>Base Interaction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Interaction()
	 * @generated
	 * @ordered
	 */
	protected Interaction base_Interaction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectsModelingPackage.Literals.JPDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectsModelingPackage.JPDD__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JPDD__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getBase_Interaction() {
		if (base_Interaction != null && base_Interaction.eIsProxy()) {
			InternalEObject oldBase_Interaction = (InternalEObject)base_Interaction;
			base_Interaction = (Interaction)eResolveProxy(oldBase_Interaction);
			if (base_Interaction != oldBase_Interaction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectsModelingPackage.JPDD__BASE_INTERACTION, oldBase_Interaction, base_Interaction));
			}
		}
		return base_Interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction basicGetBase_Interaction() {
		return base_Interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Interaction(Interaction newBase_Interaction) {
		Interaction oldBase_Interaction = base_Interaction;
		base_Interaction = newBase_Interaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JPDD__BASE_INTERACTION, oldBase_Interaction, base_Interaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectsModelingPackage.JPDD__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case AspectsModelingPackage.JPDD__BASE_INTERACTION:
				if (resolve) return getBase_Interaction();
				return basicGetBase_Interaction();
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
			case AspectsModelingPackage.JPDD__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case AspectsModelingPackage.JPDD__BASE_INTERACTION:
				setBase_Interaction((Interaction)newValue);
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
			case AspectsModelingPackage.JPDD__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case AspectsModelingPackage.JPDD__BASE_INTERACTION:
				setBase_Interaction((Interaction)null);
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
			case AspectsModelingPackage.JPDD__BASE_PACKAGE:
				return base_Package != null;
			case AspectsModelingPackage.JPDD__BASE_INTERACTION:
				return base_Interaction != null;
		}
		return super.eIsSet(featureID);
	}

} //JPDDImpl
