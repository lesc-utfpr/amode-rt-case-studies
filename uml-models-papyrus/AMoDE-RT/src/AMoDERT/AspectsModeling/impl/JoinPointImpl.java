/**
 */
package AMoDERT.AspectsModeling.impl;

import AMoDERT.AspectsModeling.AspectsModelingPackage;
import AMoDERT.AspectsModeling.JoinPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#getBase_Artifact <em>Base Artifact</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#isBehavior <em>Behavior</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#isNode <em>Node</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#isObject <em>Object</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#isClass <em>Class</em>}</li>
 *   <li>{@link AMoDERT.AspectsModeling.impl.JoinPointImpl#isMessageDefinition <em>Message Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinPointImpl extends MinimalEObjectImpl.Container implements JoinPoint {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getBase_Message() <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Message()
	 * @generated
	 * @ordered
	 */
	protected Message base_Message;

	/**
	 * The cached value of the '{@link #getBase_Artifact() <em>Base Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Artifact()
	 * @generated
	 * @ordered
	 */
	protected Artifact base_Artifact;

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
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The cached value of the '{@link #getBase_Lifeline() <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Lifeline()
	 * @generated
	 * @ordered
	 */
	protected Lifeline base_Lifeline;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEHAVIOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBehavior()
	 * @generated
	 * @ordered
	 */
	protected boolean behavior = BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNode() <em>Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNode()
	 * @generated
	 * @ordered
	 */
	protected boolean node = NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObject()
	 * @generated
	 * @ordered
	 */
	protected boolean object = OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isClass() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClass() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClass()
	 * @generated
	 * @ordered
	 */
	protected boolean class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #isMessageDefinition() <em>Message Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESSAGE_DEFINITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMessageDefinition() <em>Message Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessageDefinition()
	 * @generated
	 * @ordered
	 */
	protected boolean messageDefinition = MESSAGE_DEFINITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AspectsModelingPackage.Literals.JOIN_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectsModelingPackage.JOIN_POINT__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getBase_Message() {
		if (base_Message != null && base_Message.eIsProxy()) {
			InternalEObject oldBase_Message = (InternalEObject)base_Message;
			base_Message = (Message)eResolveProxy(oldBase_Message);
			if (base_Message != oldBase_Message) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectsModelingPackage.JOIN_POINT__BASE_MESSAGE, oldBase_Message, base_Message));
			}
		}
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetBase_Message() {
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Message(Message newBase_Message) {
		Message oldBase_Message = base_Message;
		base_Message = newBase_Message;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact getBase_Artifact() {
		if (base_Artifact != null && base_Artifact.eIsProxy()) {
			InternalEObject oldBase_Artifact = (InternalEObject)base_Artifact;
			base_Artifact = (Artifact)eResolveProxy(oldBase_Artifact);
			if (base_Artifact != oldBase_Artifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectsModelingPackage.JOIN_POINT__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
			}
		}
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact basicGetBase_Artifact() {
		return base_Artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Artifact(Artifact newBase_Artifact) {
		Artifact oldBase_Artifact = base_Artifact;
		base_Artifact = newBase_Artifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__BASE_ARTIFACT, oldBase_Artifact, base_Artifact));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectsModelingPackage.JOIN_POINT__BASE_OPERATION, oldBase_Operation, base_Operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__BASE_OPERATION, oldBase_Operation, base_Operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectsModelingPackage.JOIN_POINT__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getBase_Lifeline() {
		if (base_Lifeline != null && base_Lifeline.eIsProxy()) {
			InternalEObject oldBase_Lifeline = (InternalEObject)base_Lifeline;
			base_Lifeline = (Lifeline)eResolveProxy(oldBase_Lifeline);
			if (base_Lifeline != oldBase_Lifeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AspectsModelingPackage.JOIN_POINT__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
			}
		}
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetBase_Lifeline() {
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Lifeline(Lifeline newBase_Lifeline) {
		Lifeline oldBase_Lifeline = base_Lifeline;
		base_Lifeline = newBase_Lifeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(boolean newBehavior) {
		boolean oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(boolean newNode) {
		boolean oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(boolean newObject) {
		boolean oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass_(boolean newClass) {
		boolean oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMessageDefinition() {
		return messageDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDefinition(boolean newMessageDefinition) {
		boolean oldMessageDefinition = messageDefinition;
		messageDefinition = newMessageDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AspectsModelingPackage.JOIN_POINT__MESSAGE_DEFINITION, oldMessageDefinition, messageDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AspectsModelingPackage.JOIN_POINT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case AspectsModelingPackage.JOIN_POINT__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case AspectsModelingPackage.JOIN_POINT__BASE_ARTIFACT:
				if (resolve) return getBase_Artifact();
				return basicGetBase_Artifact();
			case AspectsModelingPackage.JOIN_POINT__BASE_OPERATION:
				if (resolve) return getBase_Operation();
				return basicGetBase_Operation();
			case AspectsModelingPackage.JOIN_POINT__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case AspectsModelingPackage.JOIN_POINT__BASE_LIFELINE:
				if (resolve) return getBase_Lifeline();
				return basicGetBase_Lifeline();
			case AspectsModelingPackage.JOIN_POINT__NAME:
				return getName();
			case AspectsModelingPackage.JOIN_POINT__BEHAVIOR:
				return isBehavior();
			case AspectsModelingPackage.JOIN_POINT__NODE:
				return isNode();
			case AspectsModelingPackage.JOIN_POINT__OBJECT:
				return isObject();
			case AspectsModelingPackage.JOIN_POINT__CLASS:
				return isClass();
			case AspectsModelingPackage.JOIN_POINT__MESSAGE_DEFINITION:
				return isMessageDefinition();
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
			case AspectsModelingPackage.JOIN_POINT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__BASE_ARTIFACT:
				setBase_Artifact((Artifact)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__BASE_OPERATION:
				setBase_Operation((Operation)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__NAME:
				setName((String)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__BEHAVIOR:
				setBehavior((Boolean)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__NODE:
				setNode((Boolean)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__OBJECT:
				setObject((Boolean)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__CLASS:
				setClass_((Boolean)newValue);
				return;
			case AspectsModelingPackage.JOIN_POINT__MESSAGE_DEFINITION:
				setMessageDefinition((Boolean)newValue);
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
			case AspectsModelingPackage.JOIN_POINT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case AspectsModelingPackage.JOIN_POINT__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case AspectsModelingPackage.JOIN_POINT__BASE_ARTIFACT:
				setBase_Artifact((Artifact)null);
				return;
			case AspectsModelingPackage.JOIN_POINT__BASE_OPERATION:
				setBase_Operation((Operation)null);
				return;
			case AspectsModelingPackage.JOIN_POINT__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case AspectsModelingPackage.JOIN_POINT__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)null);
				return;
			case AspectsModelingPackage.JOIN_POINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AspectsModelingPackage.JOIN_POINT__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
				return;
			case AspectsModelingPackage.JOIN_POINT__NODE:
				setNode(NODE_EDEFAULT);
				return;
			case AspectsModelingPackage.JOIN_POINT__OBJECT:
				setObject(OBJECT_EDEFAULT);
				return;
			case AspectsModelingPackage.JOIN_POINT__CLASS:
				setClass_(CLASS_EDEFAULT);
				return;
			case AspectsModelingPackage.JOIN_POINT__MESSAGE_DEFINITION:
				setMessageDefinition(MESSAGE_DEFINITION_EDEFAULT);
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
			case AspectsModelingPackage.JOIN_POINT__BASE_CLASS:
				return base_Class != null;
			case AspectsModelingPackage.JOIN_POINT__BASE_MESSAGE:
				return base_Message != null;
			case AspectsModelingPackage.JOIN_POINT__BASE_ARTIFACT:
				return base_Artifact != null;
			case AspectsModelingPackage.JOIN_POINT__BASE_OPERATION:
				return base_Operation != null;
			case AspectsModelingPackage.JOIN_POINT__BASE_PROPERTY:
				return base_Property != null;
			case AspectsModelingPackage.JOIN_POINT__BASE_LIFELINE:
				return base_Lifeline != null;
			case AspectsModelingPackage.JOIN_POINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AspectsModelingPackage.JOIN_POINT__BEHAVIOR:
				return behavior != BEHAVIOR_EDEFAULT;
			case AspectsModelingPackage.JOIN_POINT__NODE:
				return node != NODE_EDEFAULT;
			case AspectsModelingPackage.JOIN_POINT__OBJECT:
				return object != OBJECT_EDEFAULT;
			case AspectsModelingPackage.JOIN_POINT__CLASS:
				return class_ != CLASS_EDEFAULT;
			case AspectsModelingPackage.JOIN_POINT__MESSAGE_DEFINITION:
				return messageDefinition != MESSAGE_DEFINITION_EDEFAULT;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Behavior: ");
		result.append(behavior);
		result.append(", Node: ");
		result.append(node);
		result.append(", Object: ");
		result.append(object);
		result.append(", Class: ");
		result.append(class_);
		result.append(", MessageDefinition: ");
		result.append(messageDefinition);
		result.append(')');
		return result.toString();
	}

} //JoinPointImpl
