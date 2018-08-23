/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Numbers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numbers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NumbersImpl#getOne <em>One</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NumbersImpl#getNumb <em>Numb</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NumbersImpl#getTwo <em>Two</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumbersImpl extends MinimalEObjectImpl.Container implements Numbers
{
  /**
   * The default value of the '{@link #getOne() <em>One</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOne()
   * @generated
   * @ordered
   */
  protected static final int ONE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOne() <em>One</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOne()
   * @generated
   * @ordered
   */
  protected int one = ONE_EDEFAULT;

  /**
   * The cached value of the '{@link #getNumb() <em>Numb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumb()
   * @generated
   * @ordered
   */
  protected Numbers numb;

  /**
   * The default value of the '{@link #getTwo() <em>Two</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwo()
   * @generated
   * @ordered
   */
  protected static final int TWO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTwo() <em>Two</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTwo()
   * @generated
   * @ordered
   */
  protected int two = TWO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumbersImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.NUMBERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getOne()
  {
    return one;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOne(int newOne)
  {
    int oldOne = one;
    one = newOne;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NUMBERS__ONE, oldOne, one));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Numbers getNumb()
  {
    return numb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumb(Numbers newNumb, NotificationChain msgs)
  {
    Numbers oldNumb = numb;
    numb = newNumb;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.NUMBERS__NUMB, oldNumb, newNumb);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumb(Numbers newNumb)
  {
    if (newNumb != numb)
    {
      NotificationChain msgs = null;
      if (numb != null)
        msgs = ((InternalEObject)numb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NUMBERS__NUMB, null, msgs);
      if (newNumb != null)
        msgs = ((InternalEObject)newNumb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.NUMBERS__NUMB, null, msgs);
      msgs = basicSetNumb(newNumb, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NUMBERS__NUMB, newNumb, newNumb));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTwo()
  {
    return two;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTwo(int newTwo)
  {
    int oldTwo = two;
    two = newTwo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.NUMBERS__TWO, oldTwo, two));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.NUMBERS__NUMB:
        return basicSetNumb(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.NUMBERS__ONE:
        return getOne();
      case MyDslPackage.NUMBERS__NUMB:
        return getNumb();
      case MyDslPackage.NUMBERS__TWO:
        return getTwo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.NUMBERS__ONE:
        setOne((Integer)newValue);
        return;
      case MyDslPackage.NUMBERS__NUMB:
        setNumb((Numbers)newValue);
        return;
      case MyDslPackage.NUMBERS__TWO:
        setTwo((Integer)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.NUMBERS__ONE:
        setOne(ONE_EDEFAULT);
        return;
      case MyDslPackage.NUMBERS__NUMB:
        setNumb((Numbers)null);
        return;
      case MyDslPackage.NUMBERS__TWO:
        setTwo(TWO_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.NUMBERS__ONE:
        return one != ONE_EDEFAULT;
      case MyDslPackage.NUMBERS__NUMB:
        return numb != null;
      case MyDslPackage.NUMBERS__TWO:
        return two != TWO_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (one: ");
    result.append(one);
    result.append(", two: ");
    result.append(two);
    result.append(')');
    return result.toString();
  }

} //NumbersImpl
