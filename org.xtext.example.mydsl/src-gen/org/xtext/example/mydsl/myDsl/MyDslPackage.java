/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Haskell</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__HASKELL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.HaskellImpl <em>Haskell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.HaskellImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHaskell()
   * @generated
   */
  int HASKELL = 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASKELL__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Haskell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HASKELL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Zip</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ZIP = 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OP = 1;

  /**
   * The feature id for the '<em><b>Tab</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TAB = 2;

  /**
   * The feature id for the '<em><b>N</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__N = 3;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ZIPImpl <em>ZIP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ZIPImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getZIP()
   * @generated
   */
  int ZIP = 3;

  /**
   * The feature id for the '<em><b>Op2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIP__OP2 = 0;

  /**
   * The feature id for the '<em><b>Op3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIP__OP3 = 1;

  /**
   * The number of structural features of the '<em>ZIP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OPImpl <em>OP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OPImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOP()
   * @generated
   */
  int OP = 4;

  /**
   * The feature id for the '<em><b>Inside</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP__INSIDE = 0;

  /**
   * The number of structural features of the '<em>OP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.INSIDEImpl <em>INSIDE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.INSIDEImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getINSIDE()
   * @generated
   */
  int INSIDE = 5;

  /**
   * The feature id for the '<em><b>Inside2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE__INSIDE2 = 0;

  /**
   * The number of structural features of the '<em>INSIDE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSIDE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TABImpl <em>TAB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TABImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTAB()
   * @generated
   */
  int TAB = 6;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__CONTENT = 0;

  /**
   * The feature id for the '<em><b>Add</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB__ADD = 1;

  /**
   * The number of structural features of the '<em>TAB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAB_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ADDImpl <em>ADD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ADDImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getADD()
   * @generated
   */
  int ADD = 7;

  /**
   * The feature id for the '<em><b>Add2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD__ADD2 = 0;

  /**
   * The number of structural features of the '<em>ADD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.NImpl <em>N</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.NImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getN()
   * @generated
   */
  int N = 8;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int N__INTEGER = 0;

  /**
   * The feature id for the '<em><b>Print</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int N__PRINT = 1;

  /**
   * The number of structural features of the '<em>N</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int N_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getHaskell <em>Haskell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Haskell</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getHaskell()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Haskell();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Haskell <em>Haskell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Haskell</em>'.
   * @see org.xtext.example.mydsl.myDsl.Haskell
   * @generated
   */
  EClass getHaskell();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Haskell#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Haskell#getExpression()
   * @see #getHaskell()
   * @generated
   */
  EReference getHaskell_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getZip <em>Zip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Zip</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getZip()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Zip();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getOp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getTab <em>Tab</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tab</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getTab()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Tab();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>N</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getN()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_N();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ZIP <em>ZIP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ZIP</em>'.
   * @see org.xtext.example.mydsl.myDsl.ZIP
   * @generated
   */
  EClass getZIP();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ZIP#getOp2 <em>Op2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op2</em>'.
   * @see org.xtext.example.mydsl.myDsl.ZIP#getOp2()
   * @see #getZIP()
   * @generated
   */
  EReference getZIP_Op2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.ZIP#getOp3 <em>Op3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op3</em>'.
   * @see org.xtext.example.mydsl.myDsl.ZIP#getOp3()
   * @see #getZIP()
   * @generated
   */
  EReference getZIP_Op3();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.OP <em>OP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OP</em>'.
   * @see org.xtext.example.mydsl.myDsl.OP
   * @generated
   */
  EClass getOP();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.OP#getInside <em>Inside</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inside</em>'.
   * @see org.xtext.example.mydsl.myDsl.OP#getInside()
   * @see #getOP()
   * @generated
   */
  EReference getOP_Inside();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.INSIDE <em>INSIDE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>INSIDE</em>'.
   * @see org.xtext.example.mydsl.myDsl.INSIDE
   * @generated
   */
  EClass getINSIDE();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.INSIDE#getInside2 <em>Inside2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inside2</em>'.
   * @see org.xtext.example.mydsl.myDsl.INSIDE#getInside2()
   * @see #getINSIDE()
   * @generated
   */
  EAttribute getINSIDE_Inside2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.TAB <em>TAB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TAB</em>'.
   * @see org.xtext.example.mydsl.myDsl.TAB
   * @generated
   */
  EClass getTAB();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.TAB#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see org.xtext.example.mydsl.myDsl.TAB#getContent()
   * @see #getTAB()
   * @generated
   */
  EAttribute getTAB_Content();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.TAB#getAdd <em>Add</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Add</em>'.
   * @see org.xtext.example.mydsl.myDsl.TAB#getAdd()
   * @see #getTAB()
   * @generated
   */
  EReference getTAB_Add();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ADD <em>ADD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ADD</em>'.
   * @see org.xtext.example.mydsl.myDsl.ADD
   * @generated
   */
  EClass getADD();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ADD#getAdd2 <em>Add2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Add2</em>'.
   * @see org.xtext.example.mydsl.myDsl.ADD#getAdd2()
   * @see #getADD()
   * @generated
   */
  EAttribute getADD_Add2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.N <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>N</em>'.
   * @see org.xtext.example.mydsl.myDsl.N
   * @generated
   */
  EClass getN();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.N#getInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer</em>'.
   * @see org.xtext.example.mydsl.myDsl.N#getInteger()
   * @see #getN()
   * @generated
   */
  EAttribute getN_Integer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.N#getPrint <em>Print</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Print</em>'.
   * @see org.xtext.example.mydsl.myDsl.N#getPrint()
   * @see #getN()
   * @generated
   */
  EAttribute getN_Print();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Haskell</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__HASKELL = eINSTANCE.getModel_Haskell();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.HaskellImpl <em>Haskell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.HaskellImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getHaskell()
     * @generated
     */
    EClass HASKELL = eINSTANCE.getHaskell();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HASKELL__EXPRESSION = eINSTANCE.getHaskell_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Zip</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__ZIP = eINSTANCE.getExpression_Zip();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__OP = eINSTANCE.getExpression_Op();

    /**
     * The meta object literal for the '<em><b>Tab</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__TAB = eINSTANCE.getExpression_Tab();

    /**
     * The meta object literal for the '<em><b>N</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__N = eINSTANCE.getExpression_N();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ZIPImpl <em>ZIP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ZIPImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getZIP()
     * @generated
     */
    EClass ZIP = eINSTANCE.getZIP();

    /**
     * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ZIP__OP2 = eINSTANCE.getZIP_Op2();

    /**
     * The meta object literal for the '<em><b>Op3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ZIP__OP3 = eINSTANCE.getZIP_Op3();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OPImpl <em>OP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OPImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOP()
     * @generated
     */
    EClass OP = eINSTANCE.getOP();

    /**
     * The meta object literal for the '<em><b>Inside</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OP__INSIDE = eINSTANCE.getOP_Inside();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.INSIDEImpl <em>INSIDE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.INSIDEImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getINSIDE()
     * @generated
     */
    EClass INSIDE = eINSTANCE.getINSIDE();

    /**
     * The meta object literal for the '<em><b>Inside2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSIDE__INSIDE2 = eINSTANCE.getINSIDE_Inside2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TABImpl <em>TAB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TABImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTAB()
     * @generated
     */
    EClass TAB = eINSTANCE.getTAB();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAB__CONTENT = eINSTANCE.getTAB_Content();

    /**
     * The meta object literal for the '<em><b>Add</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TAB__ADD = eINSTANCE.getTAB_Add();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ADDImpl <em>ADD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ADDImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getADD()
     * @generated
     */
    EClass ADD = eINSTANCE.getADD();

    /**
     * The meta object literal for the '<em><b>Add2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADD__ADD2 = eINSTANCE.getADD_Add2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.NImpl <em>N</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.NImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getN()
     * @generated
     */
    EClass N = eINSTANCE.getN();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute N__INTEGER = eINSTANCE.getN_Integer();

    /**
     * The meta object literal for the '<em><b>Print</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute N__PRINT = eINSTANCE.getN_Print();

  }

} //MyDslPackage
