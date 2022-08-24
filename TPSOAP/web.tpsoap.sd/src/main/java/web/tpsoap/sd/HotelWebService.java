package web.tpsoap.sd;

import java.util.ArrayList;

public interface HotelWebService {

	void makeReservation(Client cl, Long dateArrivee, Long dateDepart, Hotel h, Chambre ch, int price);
	
	ArrayList<Pair<Hotel, Chambre>> searchHotel(String ville, Long dateArrivee, Long dateDepart, int prixMin, int prixMax, int nbStars, int nbPersonnes);
	
}
