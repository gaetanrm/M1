package client;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import common.CabinetVetInterface;

public class Client extends UnicastRemoteObject implements Notifiable {

	private Client() throws RemoteException{
		super();
	}
	
	public void init (String[] args) {
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			Observer obs = (Observer) registry.lookup("Server");
			obs.addClient(this);
			CabinetVetInterface stub = (CabinetVetInterface) registry.lookup("ChezDupont");
			stub.create("Garfield", "John", stub.createSpecies("Cat", 12), "Roux");
			stub.create("Milou", "Tintin", stub.createSpecies("Chien", 14), "Fox Terrier");
			stub.printCollec();
			stub.search("Garfield");
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}

	@Override
	public void notify(String mssg) throws RemoteException {
		System.out.println("Le Serveur nous dit : " + mssg);
		
	}
	
	public static void main(String[] args) throws RemoteException {
		Client newClient = new Client();
		newClient.init(args);
	}
}
