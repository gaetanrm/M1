package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AnimalInterface extends Remote {
	
	String getName() throws RemoteException;
	String getOwnerName() throws RemoteException;
	String getSpecies() throws RemoteException;
	String getBreed() throws RemoteException;
	
}
