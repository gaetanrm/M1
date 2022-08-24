package fr.romero.Tripadvisor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chambre {

	@Id
	private Long id;
	
	@Column(name="numero")
	private String numero;
	@Column(name="lits")
	private int lits;
	@Column(name="lits Disponibles")
	private int litsDispo;
	@Column(name="prix")
	private int prix;
	
	public Chambre(Long id, String numero, int lits, int litsDispo, int prix) {
		this.id = id;
		this.numero = numero;
		this.lits = lits;
		this.litsDispo = litsDispo;
		this.prix = prix;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getLits() {
		return lits;
	}

	public void setLits(int lits) {
		this.lits = lits;
	}

	public int getLitsDispo() {
		return litsDispo;
	}

	public void setLitsDispo(int litsDispo) {
		this.litsDispo = litsDispo;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
	
	
}
