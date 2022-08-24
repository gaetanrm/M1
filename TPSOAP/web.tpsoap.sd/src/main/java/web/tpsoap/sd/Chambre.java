package web.tpsoap.sd;

import java.util.ArrayList;

public class Chambre {

	private Hotel h;
	private ArrayList<Reservation> listResa;
	private int nbPersonnes;
	private int price;
	
	public Chambre(Hotel h, int nbPersonnes, int price) {
		this.h = h;
		this.nbPersonnes = nbPersonnes;
		this.price = price;
		listResa = new ArrayList<Reservation>();
	}

	public Hotel getH() {
		return h;
	}

	public void setH(Hotel h) {
		this.h = h;
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
