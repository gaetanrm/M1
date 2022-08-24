package web.tpsoap.wd;

public class Reservation {

	private String name, surname, login, password;
	private Long dateArrivee, dateDepart;
	private Chambre ch;
	private int price;
	private Long idAgence, carteCredit; //Add getter and setter + constructor ....
	private Client cl;
	
	public Reservation(String login, String password, String name, String surname, Long carteCredit, Long dateArrivee, Long dateDepart, Chambre ch, int price) {
		cl = new Client(login, password, name, surname, carteCredit);
		this.dateArrivee = dateArrivee;
		this.dateDepart = dateDepart;
		this.ch = ch;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}

	public Long getCarteCredit() {
		return carteCredit;
	}

	public void setCarteCredit(Long carteCredit) {
		this.carteCredit = carteCredit;
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
