/**
 */
package maps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>public Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link maps.publicSpace#getName <em>Name</em>}</li>
 *   <li>{@link maps.publicSpace#getBorderedBy <em>Bordered By</em>}</li>
 * </ul>
 *
 * @see maps.MapsPackage#getpublicSpace()
 * @model abstract="true"
 * @generated
 */
public interface publicSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see maps.MapsPackage#getpublicSpace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link maps.publicSpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bordered By</b></em>' reference list.
	 * The list contents are of type {@link maps.road}.
	 * It is bidirectional and its opposite is '{@link maps.road#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bordered By</em>' reference list.
	 * @see maps.MapsPackage#getpublicSpace_BorderedBy()
	 * @see maps.road#getBorder
	 * @model opposite="border" required="true"
	 * @generated
	 */
	EList<road> getBorderedBy();

} // publicSpace
