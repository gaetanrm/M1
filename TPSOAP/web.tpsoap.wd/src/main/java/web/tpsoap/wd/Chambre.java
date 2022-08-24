package web.tpsoap.wd;

import java.util.ArrayList;

public class Chambre {

	private int id; 
	private ArrayList<Reservation> listResa;
	private int nbPersonnes;
	private int price;
	
	public Chambre(int nbPersonnes, int price) {
		this.id = (int)(Math.random() * 151);
		this.nbPersonnes = nbPersonnes;
		this.price = price;
		listResa = new ArrayList<Reservation>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Reservation> getListResa() {
		return listResa;
	}

	public void setListResa(ArrayList<Reservation> listResa) {
		this.listResa = listResa;
	}

	public int getNbPersonnes() {
		return nbPersonnes;
	}

	public void setNbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
