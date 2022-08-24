package web.tpsoap.wd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.jws.WebService;

@WebService(endpointInterface="web.tpsoap.wd.HotelWebService")
public class HotelWebServiceImpl implements HotelWebService{
	
	static ArrayList<Agence> listAgence = new ArrayList<Agence>();
	static List<String> listName = new ArrayList<String>();
	static List<String> listVille = new ArrayList<String>();
	static {
		listVille.add("Montpellier");
		listVille.add("Paris");
		listVille.add("Toulouse");
		listVille.add("Lyon");
		listVille.add("Bordeaux");
		listName.add("Jurassic Park");
		listName.add("Central Park");
		listName.add("L'éléphant");
		listName.add("Le Navire");
		listName.add("La Souris");
		Agence agence1 = new Agence(0001, "mdp1", 10);
		Agence agence2 = new Agence(0002, "mdp2", 20);
		Agence agence3 = new Agence(0003, "mdp3", 5);
		Agence agence4 = new Agence(0004, "mdp4", 35);
		listAgence.add(agence1);
		listAgence.add(agence2);
		listAgence.add(agence3);
		listAgence.add(agence4);
		
	};
	
	String ville = listVille.get((int)(Math.random() * 5));
	String name = listName.get((int)(Math.random() * 5));
	int nbStars = (int)(Math.random() * 6);
	
	Hotel hotel = new Hotel(createListChambre(), ville, name, nbStars);
	
	public ArrayList<Chambre> createListChambre(){
		
		ArrayList<Chambre> listChambre = new ArrayList<Chambre>();
		
		for (int i = 0; i < 1 + ((int)(Math.random() * 20)); i++){
			listChambre.add(new Chambre((1 + ((int)(Math.random() * 10))), (1 + ((int)(Math.random() * 200)))));
		}
		return listChambre;
	}

	public void makeReservation(String login, String password, String name, String surname, Long carteCredit, Long dateArrivee, 
			Long dateDepart, int idChambre, int price) {
		
		Scanner scan = new Scanner(System.in);
		
		while(dateArrivee > dateDepart) {
			System.out.println("Veuillez rentrez une date d'arrivee et une date de départ valides : ");
			dateArrivee = scan.nextLong();
			dateDepart = scan.nextLong();
		}
		
		System.out.println("Reservation prise en compte");
		System.out.println("Référence de la réservation : ");
		
		Random rand = new Random();
		String refResa = "abcdef123456";
		int longueur = refResa.length();
		for(int i = 0; i < 30; i++) {
		  int k = rand.nextInt(longueur);
		  System.out.print(refResa.charAt(k)+"");
		}
		
		Reservation newRes = new Reservation(login, password, name, surname, carteCredit, dateArrivee, dateDepart, getChambre(idChambre), price);
		getChambre(idChambre).getListResa().add(newRes);
		System.out.println("\nRéservation réussie !");
		System.out.println("Voici la liste des réservations pour cette chambre : ");
		for (int i = 0; i < getChambre(idChambre).getListResa().size(); i++) {
			System.out.println("Réservation au nom de : "+ getChambre(idChambre).getListResa().get(i).getCl().getName());
		}
	}

	public ArrayList<Chambre> searchChambre(Long dateArrivee, Long dateDepart, int nbPersonnes) {
		
		ArrayList<Chambre> list = new ArrayList<Chambre>();
		
			for (int j = 0; j < hotel.getListChambre().size(); j++) {
				ArrayList<Reservation> listRes = hotel.getListChambre().get(j).getListResa();

				if (listRes.isEmpty()) {
					if ((nbPersonnes <= hotel.getListChambre().get(j).getNbPersonnes())){
							list.add(hotel.getListChambre().get(j));
					}
				}
				else {
					for(Reservation r : listRes) {
						if ((r.getDateArrivee() > dateDepart || r.getDateDepart() < dateArrivee) && 
								(nbPersonnes <= hotel.getListChambre().get(j).getNbPersonnes())) {
								
								list.add(hotel.getListChambre().get(j));
						}
					}
				}
			}
			return list;
	}
	
	public boolean isPartenaire(int identifiant, String mdp) {
		for (Agence ag : listAgence) {
			if ((ag.getId() == identifiant) && (ag.getPassword().equals(mdp))){
				return true;
			}
		}return false;
	}

	public Agence getAgence(int identifiant, String mdp) {
		int i = 0;
		
		while((identifiant != listAgence.get(i).getId()) && (mdp != listAgence.get(i).getPassword())) {
			i++;
		}
		Agence ag = listAgence.get(i);
		return ag;
	}
	
	public Chambre getChambre(int id) {
		int i = 0;
		
		while(id !=hotel.getListChambre().get(i).getId()) {
			i++;
		}
		Chambre ch = hotel.getListChambre().get(i);
		return ch;
	}
	
	

}
