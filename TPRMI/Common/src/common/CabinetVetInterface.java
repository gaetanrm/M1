package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


public interface CabinetVetInterface extends Remote{
	void search(String name) throws RemoteException;
	ArrayList<AnimalInterface> getCollection() throws RemoteException;
	void create(String name, String ownerName, String species, String breed) throws RemoteException;
	void printCollec() throws RemoteException;
	public String createSpecies(String speciesName, int lifeSpan) throws RemoteException;
}
