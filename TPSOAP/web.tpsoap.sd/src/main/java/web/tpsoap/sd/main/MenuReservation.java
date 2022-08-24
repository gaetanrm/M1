package web.tpsoap.sd.main;

import java.util.ArrayList;
import java.util.Scanner;

import web.tpsoap.sd.Chambre;
import web.tpsoap.sd.Client;
import web.tpsoap.sd.Hotel;
import web.tpsoap.sd.HotelWebServiceImpl;
import web.tpsoap.sd.Pair;

public class MenuReservation {

	public void reservation() {
		
		Scanner scan =  new Scanner(System.in);
		String name, surname, ville;
		Long carteCredit, dateArrivee, dateDepart;
		int prixMin, prixMax, nbStars, nbPersonnes, choice;
		
		System.out.println("Veuillez rentrer les informations suivantes concernant votre recherche d'hotels : \n");
		System.out.println("Ville de séjour : ");
		ville = scan.nextLine();
		
		System.out.println("Date d'arrivée : ");
		dateArrivee = scan.nextLong();
		
		System.out.println("Date de départ : ");
		dateDepart = scan.nextLong();
		
		System.out.println("Prix minimum : ");
		prixMin = scan.nextInt();
		
		System.out.println("Prix maximum : ");
		prixMax = scan.nextInt();
		
		System.out.println("Nombre d'étoiles : ");
		nbStars = scan.nextInt();
		
		System.out.println("Nombre de personnes : ");
		nbPersonnes = scan.nextInt();
		
		HotelWebServiceImpl hotelWebService = new HotelWebServiceImpl();
		ArrayList<Pair<Hotel, Chambre>> listReturnHotel = hotelWebService.searchHotel(ville, dateArrivee, dateDepart, prixMin, prixMax, nbStars, nbPersonnes);
		int x = 1;
		
		for (Pair<Hotel, Chambre> hotel : listReturnHotel) {
			System.out.println("Recherche numéro : " + x + "\nNom de l'hôtel : " + hotel.getLeft().getName() + "\nVille : " + hotel.getLeft().getVille() + " \nPrix : " 
					+ hotel.getRight().getPrice() + " \nNombre d'étoiles : " + hotel.getLeft().getNbStars() + " \nNombre de lits : " 
					+ hotel.getRight().getNbPersonnes());
			x++;
		}
		
		System.out.println("Quelle Chambre voulez vous réserver ? ");
		while(((choice = scan.nextInt()-1) >= listReturnHotel.size()) || ((choice < 0))) {
			System.err.println("Erreur ! Veuillez entrer un numéro correct !");
		};
		
		Pair<Hotel, Chambre> userChoice = new Pair<Hotel, Chambre>(listReturnHotel.get(choice).getLeft(), listReturnHotel.get(choice).getRight());
		
		System.out.println("Veuillez rentrer les informations suivantes : ");
		System.out.println("Nom : ");
		do {
			name = scan.nextLine();
		}while(name.equals(""));
		
		System.out.println("Prénom : ");
		surname = scan.nextLine();
		
		System.out.println("Carte de Crédit");
		carteCredit = scan.nextLong();
		
		Client cl = new Client(name, surname, carteCredit);
		hotelWebService.makeReservation(cl, dateArrivee, dateDepart, userChoice.getLeft(), userChoice.getRight(), userChoice.getRight().getPrice());
	}
}
