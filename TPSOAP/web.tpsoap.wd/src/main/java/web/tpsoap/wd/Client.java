package web.tpsoap.wd;

public class Client {

	private String login, password;
	private String name, surname;
	private Long carteCredit;
	
	public Client(String login, String password, String name, String surname, Long carteCredit) {
		this.login = login;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.carteCredit = carteCredit;
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
