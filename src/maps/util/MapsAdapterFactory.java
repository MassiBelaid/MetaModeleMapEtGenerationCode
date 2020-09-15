/**
 */
package maps.util;

import maps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see maps.MapsPackage
 * @generated
 */
public class MapsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MapsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MapsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapsSwitch<Adapter> modelSwitch =
		new MapsSwitch<Adapter>() {
			@Override
			public Adapter casemap(map object) {
				return createmapAdapter();
			}
			@Override
			public Adapter casepedestrian(pedestrian object) {
				return createpedestrianAdapter();
			}
			@Override
			public Adapter casestreet(street object) {
				return createstreetAdapter();
			}
			@Override
			public Adapter casegarden(garden object) {
				return creategardenAdapter();
			}
			@Override
			public Adapter casesquare(square object) {
				return createsquareAdapter();
			}
			@Override
			public Adapter casepublicSpace(publicSpace object) {
				return createpublicSpaceAdapter();
			}
			@Override
			public Adapter caseroad(road object) {
				return createroadAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link maps.map <em>map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maps.map
	 * @generated
	 */
	public Adapter createmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maps.pedestrian <em>pedestrian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maps.pedestrian
	 * @generated
	 */
	public Adapter createpedestrianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maps.street <em>street</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maps.street
	 * @generated
	 */
	public Adapter createstreetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maps.garden <em>garden</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maps.garden
	 * @generated
	 */
	public Adapter creategardenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maps.square <em>square</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maps.square
	 * @generated
	 */
	public Adapter createsquareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maps.publicSpace <em>public Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maps.publicSpace
	 * @generated
	 */
	public Adapter createpublicSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link maps.road <em>road</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see maps.road
	 * @generated
	 */
	public Adapter createroadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MapsAdapterFactory
