package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SpeciesInterface extends Remote {

	public String getSpeciesName() throws RemoteException;
	public int getLifeSpan() throws RemoteException;

}
