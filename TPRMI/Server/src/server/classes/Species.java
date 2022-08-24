package server.classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.SpeciesInterface;

public class Species extends UnicastRemoteObject implements SpeciesInterface {

	private String speciesName;
	private int lifeSpan;
	
	public Species(String speciesName, int lifeSpan) throws RemoteException{
		this.speciesName = speciesName;
		this.lifeSpan = lifeSpan;
	}

	public String getSpeciesName() throws RemoteException{
		return speciesName;
	}

	public int getLifeSpan() throws RemoteException{
		return lifeSpan;
	}
	
	
}
