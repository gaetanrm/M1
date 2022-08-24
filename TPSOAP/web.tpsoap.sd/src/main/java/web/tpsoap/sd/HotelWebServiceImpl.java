package web.tpsoap.sd;

import java.util.ArrayList;
import java.util.Scanner;

import javax.jws.WebService;

public class HotelWebServiceImpl implements HotelWebService{
	
	private static ArrayList<Chambre> listChambre1 = new ArrayList<Chambre>();
	private static Hotel hotel1 = new Hotel(listChambre1, "Montpellier", "Le Sarrasin", 3);
	static {
		listChambre1.add(new Chambre(hotel1, 5, 90));
		listChambre1.add(new Chambre(hotel1, 3, 42));
			
	}
	
	private static ArrayList<Chambre> listChambre2 = new ArrayList<Chambre>();
	private static Hotel hotel2 = new Hotel(listChambre2, "Paris", "L'horloge", 3);
	static {
		listChambre2.add(new Chambre(hotel2, 5, 110));
		listChambre2.add(new Chambre(hotel2, 3, 75));
	}
	
	private static ArrayList<Chambre> listChambre3 = new ArrayList<Chambre>();
	private static Hotel hotel3 = new Hotel(listChambre3, "Toulouse", "L'éléphant", 3);
	static {
		listChambre3.add(new Chambre(hotel3, 5, 100));
		listChambre3.add(new Chambre(hotel3, 3, 58));
	}
	
	private static ArrayList<Hotel> listHotel = new ArrayList<Hotel>()  {{
		add(hotel1);
		add(hotel2);
		add(hotel3);
	}};
	

	public void makeReservation(Client cl, Long dateArrivee, Long dateDepart, Hotel h, Chambre ch, int price) {
		
		Scanner scan = new Scanner(System.in);
		
		while(dateArrivee > dateDepart) {
			System.out.println("Veuillez rentrez une date d'arrivee et une date de départ valides : ");
			dateArrivee = scan.nextLong();
			dateDepart = scan.nextLong();
		}
		
		
		System.out.println("Reservation prise en compte");
		Reservation newRes = new Reservation(cl, dateArrivee, dateDepart, h, ch, price);
		ch.getListResa().add(newRes);
		System.out.println("Réservation réussie !");
		System.out.println("Voici la liste des réservations pour cette chambre : ");
		for (int i = 0; i < ch.getListResa().size(); i++) {
			System.out.println("Résa au nom de : "+ ch.getListResa().get(i).getCl().getName());
		}
	}

	public ArrayList<Pair<Hotel, Chambre>> searchHotel(String ville, Long dateArrivee, Long dateDepart, int prixMin, int prixMax,
			int nbStars, int nbPersonnes) {
		
		ArrayList<Pair<Hotel, Chambre>> list = new ArrayList<Pair<Hotel, Chambre>>();
		
		for(int i = 0; i < listHotel.size(); i++){
			ArrayList<Chambre> listCh = listHotel.get(i).getListChambre();
			
			for (int j = 0; j < listCh.size(); j++) {
				ArrayList<Reservation> listRes = listCh.get(j).getListResa();

				if (listRes.isEmpty()) {
					if ((listCh.get(j).getH().getVille().equals(ville)) && (nbPersonnes <= listCh.get(j).getNbPersonnes())){
						if ((nbStars == listCh.get(j).getH().getNbStars()) && (listCh.get(j).getPrice() >= prixMin) && 
								(listCh.get(j).getPrice() <= prixMax)) {
					
							Pair<Hotel, Chambre> newChDispo = new Pair<Hotel, Chambre>(listCh.get(j).getH(), listCh.get(j));
							Hotel testHotel = newChDispo.getLeft();
							list.add(newChDispo);
						}
					}
				}
				else {
					for(Reservation r : listRes) {
						if ((r.getDateArrivee() > dateDepart || r.getDateDepart() < dateArrivee) && (listCh.get(j).getH().getVille().equals(ville))) {
							if ((nbPersonnes <= listCh.get(j).getNbPersonnes()) && (nbStars == listCh.get(j).getH().getNbStars())  && 
									(listCh.get(j).getPrice() >= prixMin) && (listCh.get(j).getPrice() <= prixMax)) {
								
								Pair<Hotel, Chambre> newChDispo = new Pair<Hotel, Chambre>(listCh.get(j).getH(), listCh.get(j));
								list.add(newChDispo);
							}
						}
					}
				}
			}
		}
		return list;
	}

}
