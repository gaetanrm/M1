package web.tpsoap.sd;

public class Client {

	private String name;
	private String surname;
	private Long carteCredit;
	
	public Client(String name, String surname, Long carteCredit) {
		this.name = name;
		this.surname = surname;
		this.carteCredit = carteCredit;
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

	public Long getCarteCredit() {
		return carteCredit;
	}

	public void setCarteCredit(Long carteCredit) {
		this.carteCredit = carteCredit;
	}
	
}
