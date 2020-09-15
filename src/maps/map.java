/**
 */
package maps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maps.map#getName <em>Name</em>}</li>
 *   <li>{@link maps.map#getSpace <em>Space</em>}</li>
 *   <li>{@link maps.map#getRoad <em>Road</em>}</li>
 * </ul>
 *
 * @see maps.MapsPackage#getmap()
 * @model
 * @generated
 */
public interface map extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maps.MapsPackage#getmap_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maps.map#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' containment reference list.
	 * The list contents are of type {@link maps.publicSpace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' containment reference list.
	 * @see maps.MapsPackage#getmap_Space()
	 * @model containment="true"
	 * @generated
	 */
	EList<publicSpace> getSpace();

	/**
	 * Returns the value of the '<em><b>Road</b></em>' containment reference list.
	 * The list contents are of type {@link maps.road}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road</em>' containment reference list.
	 * @see maps.MapsPackage#getmap_Road()
	 * @model containment="true"
	 * @generated
	 */
	EList<road> getRoad();

} // map
