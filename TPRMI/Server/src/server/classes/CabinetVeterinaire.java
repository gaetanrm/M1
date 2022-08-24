package server.classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.ListIterator;

import server.Server;
import common.CabinetVetInterface;
import common.AnimalInterface;


public class CabinetVeterinaire extends UnicastRemoteObject implements CabinetVetInterface{

	private ArrayList<String> collecName;
	private ArrayList<AnimalInterface> collection;
	private ArrayList<String> collecSpeciesName;
	private ArrayList<Species> collecSpecies;
	private Server server;

	
	public CabinetVeterinaire(Server server) throws RemoteException {
		super();
		collecName = new ArrayList<String>();
		collection = new ArrayList<AnimalInterface>();
		collecSpeciesName = new ArrayList<String>();
		collecSpecies = new ArrayList<Species>();
		this.server = server;
		
	}
	
	public ArrayList<AnimalInterface> getCollection() throws RemoteException{
		return collection;
	}

	public void search(String name) throws RemoteException{
			if (collecName.contains(name)) {
				System.out.println("Voici l'animal que vous cherchez : \n" + collection.get(collecName.indexOf(name)));
			}else {
				System.out.println("Animal non trouvé");
			}
	}
	
	public void create(String name, String ownerName, String species, String breed) throws RemoteException{
		Animal newPatient = new Animal(name, ownerName, species, breed, null);
		collection.add(newPatient);
		collecName.add(name);
		server.reportToAllClients("Ajouté");
	}
	
	public void printCollec() throws RemoteException{
		ListIterator<AnimalInterface> li = collection.listIterator();
		System.out.println("Liste de tous les animaux du cabinet : ");
	    while (li.hasNext())
	        System.out.println(li.next());
	}
	
	public String createSpecies(String speciesName, int lifeSpan) throws RemoteException{
		if (collecSpeciesName.contains(speciesName))
			return speciesName;
		else {
			Species newSpecies = new Species(speciesName, lifeSpan);
			collecSpeciesName.add(speciesName);
			collecSpecies.add(newSpecies);
			return speciesName;
		}
	}

	
}
