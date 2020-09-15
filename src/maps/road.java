/**
 */
package maps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>road</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maps.road#getName <em>Name</em>}</li>
 *   <li>{@link maps.road#getLength <em>Length</em>}</li>
 *   <li>{@link maps.road#getBorder <em>Border</em>}</li>
 *   <li>{@link maps.road#getMeet <em>Meet</em>}</li>
 * </ul>
 *
 * @see maps.MapsPackage#getroad()
 * @model abstract="true"
 * @generated
 */
public interface road extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maps.MapsPackage#getroad_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maps.road#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see maps.MapsPackage#getroad_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link maps.road#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' reference list.
	 * The list contents are of type {@link maps.publicSpace}.
	 * It is bidirectional and its opposite is '{@link maps.publicSpace#getBorderedBy <em>Bordered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' reference list.
	 * @see maps.MapsPackage#getroad_Border()
	 * @see maps.publicSpace#getBorderedBy
	 * @model opposite="borderedBy"
	 * @generated
	 */
	EList<publicSpace> getBorder();

	/**
	 * Returns the value of the '<em><b>Meet</b></em>' reference list.
	 * The list contents are of type {@link maps.road}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meet</em>' reference list.
	 * @see maps.MapsPackage#getroad_Meet()
	 * @model
	 * @generated
	 */
	EList<road> getMeet();

} // road
