package web.tpsoap.wd;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HotelWebService {

	@WebMethod
	void makeReservation(String login, String password, String name, String surname, Long carteCredit, Long dateArrivee, Long dateDepart, int idChambre, int price);
	
	@WebMethod
	ArrayList<Chambre> searchChambre(Long dateArrivee, Long dateDepart, int nbPersonnes);
	
	@WebMethod
	boolean isPartenaire(int identifiant, String mdp);
	
	@WebMethod
	Agence getAgence(int identifiant, String mdp);
	
}
