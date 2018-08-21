/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Expression#getZip <em>Zip</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Expression#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Expression#getTab <em>Tab</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Expression#getN <em>N</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Zip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zip</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zip</em>' containment reference.
   * @see #setZip(ZIP)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression_Zip()
   * @model containment="true"
   * @generated
   */
  ZIP getZip();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Expression#getZip <em>Zip</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zip</em>' containment reference.
   * @see #getZip()
   * @generated
   */
  void setZip(ZIP value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' containment reference.
   * @see #setOp(OP)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression_Op()
   * @model containment="true"
   * @generated
   */
  OP getOp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Expression#getOp <em>Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' containment reference.
   * @see #getOp()
   * @generated
   */
  void setOp(OP value);

  /**
   * Returns the value of the '<em><b>Tab</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tab</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tab</em>' containment reference.
   * @see #setTab(TAB)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression_Tab()
   * @model containment="true"
   * @generated
   */
  TAB getTab();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Expression#getTab <em>Tab</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tab</em>' containment reference.
   * @see #getTab()
   * @generated
   */
  void setTab(TAB value);

  /**
   * Returns the value of the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' containment reference.
   * @see #setN(N)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getExpression_N()
   * @model containment="true"
   * @generated
   */
  N getN();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Expression#getN <em>N</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' containment reference.
   * @see #getN()
   * @generated
   */
  void setN(N value);

} // Expression