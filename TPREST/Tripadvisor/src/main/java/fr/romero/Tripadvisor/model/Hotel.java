package fr.romero.Tripadvisor.model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "name")
	private String name;
	@Column(name= "stars")
	private int stars;
	@Column(name= "description")
	private String description;
	
	
	//Faire un nombre de chambres aléatoires(pas fini) Min + (int)(Math.random() * ((Max - Min) + 1))
	//private ArrayList<Chambre> listChambre = new ArrayList<Chambre>();

	public Hotel() {}
	
	public Hotel(Long id, String name, int stars, String description) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.stars = stars;
		//this.listChambre = new ArrayList<Chambre>();
	}

	/*public Hotel(Long id, String name, int stars, String description, ArrayList<Chambre> listChambre) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.stars = stars;
		this.listChambre = listChambre;
	}*/
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*public ArrayList<Chambre> getListChambre() {
		return listChambre;
	}

	public void setListChambre(ArrayList<Chambre> listChambre) {
		this.listChambre = listChambre;
	}*/
	
	
	
	
}
