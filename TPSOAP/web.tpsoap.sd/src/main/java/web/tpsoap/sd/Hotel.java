package web.tpsoap.sd;

import java.util.ArrayList;

public class Hotel {

	private ArrayList<Chambre> listChambre = new ArrayList<Chambre>();
	private String ville, name;
	private int nbStars;

	public Hotel(ArrayList<Chambre> listChambre, String ville, String name, int nbStars) {
		this.listChambre = listChambre;
		this.ville = ville;
		this.name = name;
		this.nbStars = nbStars;
	}

	public ArrayList<Chambre> getListChambre() {
		return listChambre;
	}

	public void setListChambre(ArrayList<Chambre> listChambre) {
		this.listChambre = listChambre;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getNbStars() {
		return nbStars;
	}

	public void setNbStars(int nbStars) {
		this.nbStars = nbStars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
