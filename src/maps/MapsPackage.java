/**
 */
package maps;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see maps.MapsFactory
 * @model kind="package"
 * @generated
 */
public interface MapsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "maps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "maps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "maps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MapsPackage eINSTANCE = maps.impl.MapsPackageImpl.init();

	/**
	 * The meta object id for the '{@link maps.impl.mapImpl <em>map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maps.impl.mapImpl
	 * @see maps.impl.MapsPackageImpl#getmap()
	 * @generated
	 */
	int MAP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Space</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__SPACE = 1;

	/**
	 * The feature id for the '<em><b>Road</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ROAD = 2;

	/**
	 * The number of structural features of the '<em>map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maps.impl.roadImpl <em>road</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maps.impl.roadImpl
	 * @see maps.impl.MapsPackageImpl#getroad()
	 * @generated
	 */
	int ROAD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__BORDER = 2;

	/**
	 * The feature id for the '<em><b>Meet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD__MEET = 3;

	/**
	 * The number of structural features of the '<em>road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>road</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maps.impl.pedestrianImpl <em>pedestrian</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maps.impl.pedestrianImpl
	 * @see maps.impl.MapsPackageImpl#getpedestrian()
	 * @generated
	 */
	int PEDESTRIAN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__NAME = ROAD__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__LENGTH = ROAD__LENGTH;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__BORDER = ROAD__BORDER;

	/**
	 * The feature id for the '<em><b>Meet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN__MEET = ROAD__MEET;

	/**
	 * The number of structural features of the '<em>pedestrian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_FEATURE_COUNT = ROAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>pedestrian</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PEDESTRIAN_OPERATION_COUNT = ROAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maps.impl.streetImpl <em>street</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maps.impl.streetImpl
	 * @see maps.impl.MapsPackageImpl#getstreet()
	 * @generated
	 */
	int STREET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__NAME = ROAD__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__LENGTH = ROAD__LENGTH;

	/**
	 * The feature id for the '<em><b>Border</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__BORDER = ROAD__BORDER;

	/**
	 * The feature id for the '<em><b>Meet</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET__MEET = ROAD__MEET;

	/**
	 * The number of structural features of the '<em>street</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_FEATURE_COUNT = ROAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>street</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREET_OPERATION_COUNT = ROAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maps.impl.publicSpaceImpl <em>public Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maps.impl.publicSpaceImpl
	 * @see maps.impl.MapsPackageImpl#getpublicSpace()
	 * @generated
	 */
	int PUBLIC_SPACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bordered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE__BORDERED_BY = 1;

	/**
	 * The number of structural features of the '<em>public Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>public Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link maps.impl.gardenImpl <em>garden</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maps.impl.gardenImpl
	 * @see maps.impl.MapsPackageImpl#getgarden()
	 * @generated
	 */
	int GARDEN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN__NAME = PUBLIC_SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Bordered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN__BORDERED_BY = PUBLIC_SPACE__BORDERED_BY;

	/**
	 * The number of structural features of the '<em>garden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN_FEATURE_COUNT = PUBLIC_SPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>garden</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARDEN_OPERATION_COUNT = PUBLIC_SPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link maps.impl.squareImpl <em>square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see maps.impl.squareImpl
	 * @see maps.impl.MapsPackageImpl#getsquare()
	 * @generated
	 */
	int SQUARE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NAME = PUBLIC_SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Bordered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__BORDERED_BY = PUBLIC_SPACE__BORDERED_BY;

	/**
	 * The number of structural features of the '<em>square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = PUBLIC_SPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_OPERATION_COUNT = PUBLIC_SPACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link maps.map <em>map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>map</em>'.
	 * @see maps.map
	 * @generated
	 */
	EClass getmap();

	/**
	 * Returns the meta object for the attribute '{@link maps.map#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maps.map#getName()
	 * @see #getmap()
	 * @generated
	 */
	EAttribute getmap_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link maps.map#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Space</em>'.
	 * @see maps.map#getSpace()
	 * @see #getmap()
	 * @generated
	 */
	EReference getmap_Space();

	/**
	 * Returns the meta object for the containment reference list '{@link maps.map#getRoad <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Road</em>'.
	 * @see maps.map#getRoad()
	 * @see #getmap()
	 * @generated
	 */
	EReference getmap_Road();

	/**
	 * Returns the meta object for class '{@link maps.pedestrian <em>pedestrian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>pedestrian</em>'.
	 * @see maps.pedestrian
	 * @generated
	 */
	EClass getpedestrian();

	/**
	 * Returns the meta object for class '{@link maps.street <em>street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>street</em>'.
	 * @see maps.street
	 * @generated
	 */
	EClass getstreet();

	/**
	 * Returns the meta object for class '{@link maps.garden <em>garden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>garden</em>'.
	 * @see maps.garden
	 * @generated
	 */
	EClass getgarden();

	/**
	 * Returns the meta object for class '{@link maps.square <em>square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>square</em>'.
	 * @see maps.square
	 * @generated
	 */
	EClass getsquare();

	/**
	 * Returns the meta object for class '{@link maps.publicSpace <em>public Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>public Space</em>'.
	 * @see maps.publicSpace
	 * @generated
	 */
	EClass getpublicSpace();

	/**
	 * Returns the meta object for the attribute '{@link maps.publicSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maps.publicSpace#getName()
	 * @see #getpublicSpace()
	 * @generated
	 */
	EAttribute getpublicSpace_Name();

	/**
	 * Returns the meta object for the reference list '{@link maps.publicSpace#getBorderedBy <em>Bordered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bordered By</em>'.
	 * @see maps.publicSpace#getBorderedBy()
	 * @see #getpublicSpace()
	 * @generated
	 */
	EReference getpublicSpace_BorderedBy();

	/**
	 * Returns the meta object for class '{@link maps.road <em>road</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>road</em>'.
	 * @see maps.road
	 * @generated
	 */
	EClass getroad();

	/**
	 * Returns the meta object for the attribute '{@link maps.road#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see maps.road#getName()
	 * @see #getroad()
	 * @generated
	 */
	EAttribute getroad_Name();

	/**
	 * Returns the meta object for the attribute '{@link maps.road#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see maps.road#getLength()
	 * @see #getroad()
	 * @generated
	 */
	EAttribute getroad_Length();

	/**
	 * Returns the meta object for the reference list '{@link maps.road#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Border</em>'.
	 * @see maps.road#getBorder()
	 * @see #getroad()
	 * @generated
	 */
	EReference getroad_Border();

	/**
	 * Returns the meta object for the reference list '{@link maps.road#getMeet <em>Meet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meet</em>'.
	 * @see maps.road#getMeet()
	 * @see #getroad()
	 * @generated
	 */
	EReference getroad_Meet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MapsFactory getMapsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link maps.impl.mapImpl <em>map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maps.impl.mapImpl
		 * @see maps.impl.MapsPackageImpl#getmap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getmap();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__NAME = eINSTANCE.getmap_Name();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__SPACE = eINSTANCE.getmap_Space();

		/**
		 * The meta object literal for the '<em><b>Road</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__ROAD = eINSTANCE.getmap_Road();

		/**
		 * The meta object literal for the '{@link maps.impl.pedestrianImpl <em>pedestrian</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maps.impl.pedestrianImpl
		 * @see maps.impl.MapsPackageImpl#getpedestrian()
		 * @generated
		 */
		EClass PEDESTRIAN = eINSTANCE.getpedestrian();

		/**
		 * The meta object literal for the '{@link maps.impl.streetImpl <em>street</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maps.impl.streetImpl
		 * @see maps.impl.MapsPackageImpl#getstreet()
		 * @generated
		 */
		EClass STREET = eINSTANCE.getstreet();

		/**
		 * The meta object literal for the '{@link maps.impl.gardenImpl <em>garden</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maps.impl.gardenImpl
		 * @see maps.impl.MapsPackageImpl#getgarden()
		 * @generated
		 */
		EClass GARDEN = eINSTANCE.getgarden();

		/**
		 * The meta object literal for the '{@link maps.impl.squareImpl <em>square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maps.impl.squareImpl
		 * @see maps.impl.MapsPackageImpl#getsquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getsquare();

		/**
		 * The meta object literal for the '{@link maps.impl.publicSpaceImpl <em>public Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maps.impl.publicSpaceImpl
		 * @see maps.impl.MapsPackageImpl#getpublicSpace()
		 * @generated
		 */
		EClass PUBLIC_SPACE = eINSTANCE.getpublicSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_SPACE__NAME = eINSTANCE.getpublicSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Bordered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_SPACE__BORDERED_BY = eINSTANCE.getpublicSpace_BorderedBy();

		/**
		 * The meta object literal for the '{@link maps.impl.roadImpl <em>road</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see maps.impl.roadImpl
		 * @see maps.impl.MapsPackageImpl#getroad()
		 * @generated
		 */
		EClass ROAD = eINSTANCE.getroad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__NAME = eINSTANCE.getroad_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROAD__LENGTH = eINSTANCE.getroad_Length();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__BORDER = eINSTANCE.getroad_Border();

		/**
		 * The meta object literal for the '<em><b>Meet</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROAD__MEET = eINSTANCE.getroad_Meet();

	}

} //MapsPackage
