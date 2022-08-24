package web.tpsoap.wd.client.main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import web.tpsoap.wd.client.Chambre;
import web.tpsoap.wd.client.HotelWebService;
import web.tpsoap.wd.client.HotelWebServiceImplService;

public class MenuReservation {

	public void reservation() {
		
		int choice;
		
		try {
			URL url = new URL("http://localhost:8080/hotelwebservice?wsdl");
			HotelWebServiceImplService serviceImpl = new HotelWebServiceImplService(url);
			HotelWebService proxy = serviceImpl.getHotelWebServiceImplPort();
			
			Scanner scan =  new Scanner(System.in);
			Long dateArrivee, dateDepart;
			int nbPersonnes;
			
			System.out.println("Veuillez rentrer les informations suivantes concernant votre recherche d'hotels : \n");
			
			Pair<Integer, String> idAgence = loginAgence();
			
			while(!(proxy.isPartenaire(idAgence.getLeft(), idAgence.getRight()))) {
				idAgence = loginAgence();
			}
			
			System.out.println("Date d'arrivée : ");
			dateArrivee = scan.nextLong();
			
			System.out.println("Date de départ : ");
			dateDepart = scan.nextLong();
			
			System.out.println("Nombre de personnes : ");
			nbPersonnes = scan.nextInt();
			
			ArrayList<Chambre> listReturnChambre = (ArrayList<Chambre>) proxy.searchChambre(dateArrivee, dateDepart, nbPersonnes);
			if(listReturnChambre.isEmpty()) {
				System.out.println("Pas de chambres disponibles");
				System.exit(1);
			}
			int x = 1;
			
			for (Chambre chambre : listReturnChambre) {
				System.out.println("Recherche numéro : " + x + "\nID : " + chambre.getId() + " \nPrix : " 
						+ (chambre.getPrice()-((chambre.getPrice() * proxy.getAgence(idAgence.getLeft(), idAgence.getRight()).getReduction())/100)) + " \nNombre de lits : " + chambre.getNbPersonnes());
				x++;
			}
			
			System.out.println("Voulez vous réserver une chambre ? \n1 -> Oui\n2 -> Non");
			int clientOrNot = scan.nextInt();
			if (clientOrNot == 1) {
				System.out.println("Id de l'agence partenaire : " + idAgence.getLeft());
				System.out.println("Quelle Chambre voulez vous réserver ? ");
				while(((choice = scan.nextInt()-1) >= listReturnChambre.size()) || ((choice < 0))) {
					System.err.println("Erreur ! Veuillez entrer un numéro correct !");
				};
				
				Chambre userChoice = listReturnChambre.get(choice);
				
				System.out.println("Veuillez rentrer les informations suivantes : ");
				System.out.println("Login :");
				scan.nextLine();
				String login = scan.nextLine();
				
				System.out.println("Password :");
				String password = scan.nextLine();
				
				System.out.println("Nom : ");
				String name = scan.nextLine();
				
				System.out.println("Prénom : ");
				String surname = scan.nextLine();
				
				System.out.println("Carte de Crédit");
				Long carteCredit = scan.nextLong();
				proxy.makeReservation(login, password, name, surname, carteCredit, dateArrivee, dateDepart, userChoice.getId(), userChoice.getPrice());
			}
			else
				System.out.println("Bye !");
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public Pair<Integer, String> loginAgence() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Identifiant de l'Agence : ");
		int identifiant = scan.nextInt();
		
		System.out.println("Mot de Passe : ");
		scan.nextLine();
		String mdp = scan.nextLine();
		
		return new Pair<Integer, String>(identifiant, mdp);
	}
}
