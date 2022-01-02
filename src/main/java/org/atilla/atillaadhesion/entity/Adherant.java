package org.atilla.atillaadhesion.entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adherant")
public class Adherant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="dateDeNaissance") //date_de_naissance
	private LocalDate dateDeNaissance;
	
	@Column(name="promo")
	private String promo;
	
	@Column(name="campus")
	private String campus;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mailingListe") //mailing_liste	
	private Boolean mailingListe;
	
	@Column(name="cotisant")
	private Boolean cotisant;
	
	//Constructeurs
	
	public Adherant() {
		//obligatoire pour que hibernate fonctionne
	}

	public Adherant(String nom, String prenom, String genre, LocalDate dateDeNaissance, String promo, String campus,
			String email, Boolean mailingListe, Boolean cotisant) {
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.dateDeNaissance = dateDeNaissance;
		this.promo = promo;
		this.campus = campus;
		this.email = email;
		this.mailingListe = mailingListe;
		this.cotisant = cotisant;
	}
	
	//Getters et Setters
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
		this.promo = promo;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getMailingListe() {
		return mailingListe;
	}

	public void setMailingListe(Boolean mailingListe) {
		this.mailingListe = mailingListe;
	}

	public Boolean getCotisant() {
		return cotisant;
	}

	public void setCotisant(Boolean cotisant) {
		this.cotisant = cotisant;
	}

	//toString for debugging
	@Override
	public String toString() {
		return "Adherant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", genre=" + genre + ", dateDeNaissance="
				+ dateDeNaissance + ", promo=" + promo + ", campus=" + campus + ", email=" + email + ", mailingListe="
				+ mailingListe + ", cotisant=" + cotisant + "]";
	}
	

	
	

	
	
	

}
