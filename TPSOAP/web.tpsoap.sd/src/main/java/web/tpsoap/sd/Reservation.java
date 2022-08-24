package web.tpsoap.sd;

public class Reservation {

	private Client cl;
	private Long dateArrivee, dateDepart;
	private Hotel h;
	private Chambre ch;
	private int price;
	
	public Reservation(Client cl, Long dateArrivee, Long dateDepart, Hotel h, Chambre ch, int price) {
		this.cl = cl;
		this.dateArrivee = dateArrivee;
		this.dateDepart = dateDepart;
		this.h = h;
		this.ch = ch;
		this.price = price;
	}

	public Client getCl() {
		return cl;
	}

	public void setCl(Client cl) {
		this.cl = cl;
	}

	public Long getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Long dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Long getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Long dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Hotel getH() {
		return h;
	}

	public void setH(Hotel h) {
		this.h = h;
	}

	public Chambre getCh() {
		return ch;
	}

	public void setCh(Chambre ch) {
		this.ch = ch;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
