package com.lipari.app.products.entities;

import jakarta.persistence.*;

@Entity
@Table(name="t_product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long id;

	@Column(name = "code", columnDefinition = "int")
	private int codice;

	@Column(name = "description", columnDefinition = "varchar(255)")
	private String descrizione;

	@Column(name = "cost", columnDefinition = "double(10, 2)")
	private double costo;

	@Column(name = "stock", columnDefinition = "int")
	private int magazzino;

	public Product(){}

	public Product(int codice, String descrizione, double costo, int magazzino) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.costo = costo;
		this.magazzino = magazzino;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", codice=" + codice + ", descrizione=" + descrizione + ", costo=" + costo
				+ ", magazzino=" + magazzino + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getMagazzino() {
		return magazzino;
	}

	public void setMagazzino(int magazzino) {
		this.magazzino = magazzino;
	}

}
