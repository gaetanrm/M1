package server.classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import common.AnimalInterface;


public class Animal extends UnicastRemoteObject implements AnimalInterface {
	
	/* ATTRIBUTS */
	private String name;
	private String ownerName;
	private String species;
	private String breed;
	private FileRecord record;
	
	
	/* CONSTRUCTOR */
	
	public Animal(String name, String ownerName, String species, String breed, FileRecord record) throws RemoteException {
		this.name = name;
		this.ownerName = ownerName;
		this.species = species;
		this.breed = breed;
		this.record = record;
	}

	
	/*METHODS */

	public String getName() {
		return name;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getSpecies() {
		return species;
	}

	public String getBreed() {
		return breed;
	}
	
	public void setName(String newName) {
		name = newName;
	}

	public void setOwnerName(String newOwnerName) {
		ownerName = newOwnerName;
	}

	public void setSpecies(String newSpecies) {
		species = newSpecies;
	}

	public void setBreed(String newBreed) {
		breed = newBreed;
	}
	
	public FileRecord getRecord() {
		return record;
	}

	public void setRecord(FileRecord record) {
		this.record = record;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", ownerName=" + ownerName + ", espece=" + species + ", race=" + breed
				+ "]";
	}
	
}
