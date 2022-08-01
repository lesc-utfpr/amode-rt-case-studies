/**
 */
package AMoDERT.AspectsModeling.impl;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import AMoDERT.AspectsModeling.Crosscut;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crosscut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AMoDERT.AspectsModeling.impl.CrosscutImpl#getBase_Association <em>Base Association</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.CrosscutImpl#getBase_Usage <em>Base Usage</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.CrosscutImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.CrosscutImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.CrosscutImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.CrosscutImpl#getWCET <em>WCET</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.CrosscutImpl#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrosscutImpl extends MinimalEObjectImpl.Container implements Crosscut {
	/**
	 * The cached value of the '{@link #getBase_Association() <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Association()
	 * @generated
	 * @ordered
	 */
	protected Association base_Association;

	/**
	 * The cached value of the '{@link #getBase_Usage() <em>Base Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Usage()
	 * @generated
	 * @ordered
	 */
	protected Usage base_Usage;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected String period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final String DEADLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected String deadline = DEADLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWCET() <em>WCET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWCET()
	 * @generated
	 * @ordered
	 */
	protected static final String WCET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWCET() <em>WCET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWCET()
	 * @generated
	 * @ordered
	 */
	protected String wcet = WCET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrosscutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectsModelingPackage.Literals.CROSSCUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getBase_Association() {
		if (base_Association != null && base_Association.eIsProxy()) {
			InternalEObject oldBase_Association = (InternalEObject)base_Association;
			base_Association = (Association)eResolveProxy(oldBase_Association);
			if (base_Association != oldBase_Association) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectsModelingPackage.CROSSCUT__BASE_ASSOCIATION, oldBase_Association, base_Association));
			}
		}
		return base_Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetBase_Association() {
		return base_Association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Association(Association newBase_Association) {
		Association oldBase_Association = base_Association;
		base_Association = newBase_Association;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.CROSSCUT__BASE_ASSOCIATION, oldBase_Association, base_Association));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage getBase_Usage() {
		if (base_Usage != null && base_Usage.eIsProxy()) {
			InternalEObject oldBase_Usage = (InternalEObject)base_Usage;
			base_Usage = (Usage)eResolveProxy(oldBase_Usage);
			if (base_Usage != oldBase_Usage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectsModelingPackage.CROSSCUT__BASE_USAGE, oldBase_Usage, base_Usage));
			}
		}
		return base_Usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage basicGetBase_Usage() {
		return base_Usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Usage(Usage newBase_Usage) {
		Usage oldBase_Usage = base_Usage;
		base_Usage = newBase_Usage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.CROSSCUT__BASE_USAGE, oldBase_Usage, base_Usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(String newPeriod) {
		String oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.CROSSCUT__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(String newDeadline) {
		String oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.CROSSCUT__DEADLINE, oldDeadline, deadline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.CROSSCUT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWCET() {
		return wcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWCET(String newWCET) {
		String oldWCET = wcet;
		wcet = newWCET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.CROSSCUT__WCET, oldWCET, wcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(String newTimeStamp) {
		String oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.CROSSCUT__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectsModelingPackage.CROSSCUT__BASE_ASSOCIATION:
				if (resolve) return getBase_Association();
				return basicGetBase_Association();
			case AspectsModelingPackage.CROSSCUT__BASE_USAGE:
				if (resolve) return getBase_Usage();
				return basicGetBase_Usage();
			case AspectsModelingPackage.CROSSCUT__PERIOD:
				return getPeriod();
			case AspectsModelingPackage.CROSSCUT__DEADLINE:
				return getDeadline();
			case AspectsModelingPackage.CROSSCUT__PRIORITY:
				return getPriority();
			case AspectsModelingPackage.CROSSCUT__WCET:
				return getWCET();
			case AspectsModelingPackage.CROSSCUT__TIME_STAMP:
				return getTimeStamp();
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
			case AspectsModelingPackage.CROSSCUT__BASE_ASSOCIATION:
				setBase_Association((Association)newValue);
				return;
			case AspectsModelingPackage.CROSSCUT__BASE_USAGE:
				setBase_Usage((Usage)newValue);
				return;
			case AspectsModelingPackage.CROSSCUT__PERIOD:
				setPeriod((String)newValue);
				return;
			case AspectsModelingPackage.CROSSCUT__DEADLINE:
				setDeadline((String)newValue);
				return;
			case AspectsModelingPackage.CROSSCUT__PRIORITY:
				setPriority((String)newValue);
				return;
			case AspectsModelingPackage.CROSSCUT__WCET:
				setWCET((String)newValue);
				return;
			case AspectsModelingPackage.CROSSCUT__TIME_STAMP:
				setTimeStamp((String)newValue);
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
			case AspectsModelingPackage.CROSSCUT__BASE_ASSOCIATION:
				setBase_Association((Association)null);
				return;
			case AspectsModelingPackage.CROSSCUT__BASE_USAGE:
				setBase_Usage((Usage)null);
				return;
			case AspectsModelingPackage.CROSSCUT__PERIOD:
				setPeriod(PERIOD_EDEFAULT);
				return;
			case AspectsModelingPackage.CROSSCUT__DEADLINE:
				setDeadline(DEADLINE_EDEFAULT);
				return;
			case AspectsModelingPackage.CROSSCUT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case AspectsModelingPackage.CROSSCUT__WCET:
				setWCET(WCET_EDEFAULT);
				return;
			case AspectsModelingPackage.CROSSCUT__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
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
			case AspectsModelingPackage.CROSSCUT__BASE_ASSOCIATION:
				return base_Association != null;
			case AspectsModelingPackage.CROSSCUT__BASE_USAGE:
				return base_Usage != null;
			case AspectsModelingPackage.CROSSCUT__PERIOD:
				return PERIOD_EDEFAULT == null ? period != null : !PERIOD_EDEFAULT.equals(period);
			case AspectsModelingPackage.CROSSCUT__DEADLINE:
				return DEADLINE_EDEFAULT == null ? deadline != null : !DEADLINE_EDEFAULT.equals(deadline);
			case AspectsModelingPackage.CROSSCUT__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case AspectsModelingPackage.CROSSCUT__WCET:
				return WCET_EDEFAULT == null ? wcet != null : !WCET_EDEFAULT.equals(wcet);
			case AspectsModelingPackage.CROSSCUT__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Period: ");
		result.append(period);
		result.append(", Deadline: ");
		result.append(deadline);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", WCET: ");
		result.append(wcet);
		result.append(", TimeStamp: ");
		result.append(timeStamp);
		result.append(')');
		return result.toString();
	}

} //CrosscutImpl
