/**
 */
package maps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see maps.MapsPackage
 * @generated
 */
public interface MapsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MapsFactory eINSTANCE = maps.impl.MapsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>map</em>'.
	 * @generated
	 */
	map createmap();

	/**
	 * Returns a new object of class '<em>pedestrian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>pedestrian</em>'.
	 * @generated
	 */
	pedestrian createpedestrian();

	/**
	 * Returns a new object of class '<em>street</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>street</em>'.
	 * @generated
	 */
	street createstreet();

	/**
	 * Returns a new object of class '<em>garden</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>garden</em>'.
	 * @generated
	 */
	garden creategarden();

	/**
	 * Returns a new object of class '<em>square</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>square</em>'.
	 * @generated
	 */
	square createsquare();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MapsPackage getMapsPackage();

} //MapsFactory
