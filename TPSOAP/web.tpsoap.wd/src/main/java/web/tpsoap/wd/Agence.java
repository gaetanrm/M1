package web.tpsoap.wd;

public class Agence {

	private int id, reduction;
	private String password;
	
	public Agence(int id, String password, int reduction) {
		this.id = id;
		this.password = password;
		this.reduction = reduction;
	}
	
	public Agence(int id, String password) {
		this.id = id;
		this.password = password;
		this.reduction = 0; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getReduction() {
		return reduction;
	}

	public void setReduction(int reduction) {
		this.reduction = reduction;
	}
}
