package com.gestionEmp.entities;

import javax.persistence.Entity;

@Entity
public class Responsable extends Employe{

	public Responsable(String login, String nom, String prenom, String numTel, String email, int congeRestant) {
		super(login, nom, prenom, numTel, email, email, congeRestant);
		
	}
	
}
