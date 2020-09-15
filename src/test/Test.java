package test;


import maps.MapsPackage;
import maps.map;
import maps.pedestrian;
import maps.publicSpace;
import maps.road;
import maps.street;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.emf.ecore.xml.namespace.SpaceType;


public class Test {

	public static void main(String[] args) {
		//Je charge l'instance map.xmi du méta-modèle maps.ecore
				Resource resource = chargerModele("model/mapInstance.xmi", MapsPackage.eINSTANCE);
				if (resource == null) System.err.println(" Erreur de chargement du modèle");
				
				
				//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "map"
				map maMap = (map) resource.getContents().get(0);
				
				
				
				
				
				//toute les street de la map
				System.out.println("Toute les street de la map : "+maMap.getName()); 
				for(road pspace : maMap.getRoad()) {
					if (pspace instanceof street) {
						System.out.println("\t"+pspace.getName());
					}
				}
				
				//Toutes les rues pi ́etonnes (Pedetrian) dont la longueur d ́epasse 1000m.
				System.out.println("Toute les pedestriant dépassant les 1000m"); 
				for(road pdt : maMap.getRoad()) {
					if (pdt instanceof pedestrian) {
						if(pdt.getLength()>1000) {
							System.out.println("\t"+pdt.getName());							
						}

					}
				}
				
				
				//tous les noms des road adjacentes d'un street
				Scanner sc = new Scanner(System.in);  
				System.out.println("Donnez un nom de route : \t");
				String nameStreet = sc.nextLine();
				
				for(road pdt : maMap.getRoad()) {
					
						if(pdt.getName().equals(nameStreet)) {
							List<road> listRoad = new ArrayList<road>();
							listRoad = pdt.getMeet();
								
							
							System.out.println("Toutes les route adjacentes à "+nameStreet+" : ");
							for(road r : listRoad) {
								System.out.println("\t"+r.getName());
								
							}
						}
				}
				
				
				//Les route bordant un square
				System.out.println("Donnez un nom d'une place : \t");
				String nameSquare = sc.nextLine();
				
				for(publicSpace pSpace : maMap.getSpace()) {
					
						if(pSpace.getName().equals(nameSquare)) {
							List<road> listRoad = new ArrayList<road>();
							listRoad = pSpace.getBorderedBy();
							
								
							
							System.out.println("Toutes les route adjacentes à "+nameSquare+" : ");
							for(road r : listRoad) {
								System.out.println("\t"+r.getName());
							}
						}
				}

	}
	
	
	
	
	public static Resource chargerModele(String uri, EPackage pack) {
		   Resource resource = null;
		   try {
			   
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      XMLResource.XMLMap xmlMap = new XMLMapImpl();
		      xmlMap.setNoNamespacePackage(pack);
		      java.util.Map options = new java.util.HashMap();
		      options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		      resource.load(options);
		   }
		   catch(Exception e) {
		      System.err.println("ERREUR chargement du modèle : "+e);
		      e.printStackTrace();
		   }
		   return resource;
		}

}
