package server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import client.Notifiable;
import client.Observer;
import server.classes.CabinetVeterinaire;
import server.classes.Species;

public class Server extends UnicastRemoteObject implements Observer{
	
	private static ArrayList<Notifiable> clientList;

	public Server() throws RemoteException {
		super();	
		Server.clientList = new ArrayList<>();
	}

	@Override
	public void addClient(Notifiable newClient) throws RemoteException {
		clientList.add(newClient);
		
	}
	
	public ArrayList<Notifiable> getClientList(){
		return clientList;
	}
	
	public void reportToAllClients(String msg) throws RemoteException {
		for(Notifiable cl : clientList) {
			cl.notify(msg);
		}
	}
	public void init (String[] args) {
		try {
			System.setProperty("java.rmi.server.codebase",  "file:/mnt/c/Users/gaeta/eclipse-workspace/Client/bin");
			
			/*if (System.getSecurityManager() == null){
				System.setSecurityManager(new SecurityManager());
				System.setProperty("java.security.Policy", "prop.policy");
			}*/
			CabinetVeterinaire chezDupont = new CabinetVeterinaire(this);
			Species renard = new Species("Renard", 8);
			chezDupont.create("Juju", "Dede", "Renard", "Roux");
			chezDupont.create("Lulu", "Patrick", "Chat", "Blanc");
			
			Registry registry = LocateRegistry.createRegistry(1099);
			if (registry == null) {
				System.err.println("RmiRegistry not found");
			}else {
				registry.rebind("Server", this);
				registry.rebind("ChezDupont", chezDupont);
				System.out.println("Server ready");
			}
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws RemoteException{
		Server newServer = new Server();
		newServer.init(args);
	}
}
