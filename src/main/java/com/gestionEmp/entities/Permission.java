package com.gestionEmp.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Permission {

	private Long idPerm;
	private String raison;
	private Date heureDeb;
	private Date heureFin;
	private boolean etat;
	
	@ManyToOne
	@JoinColumn(name="employe_id")
	private Employe employePerm;
	
	public Permission(String raison, Date heureDeb, Date heureFin, boolean etat) {
		this.raison = raison;
		this.heureDeb = heureDeb;
		this.heureFin = heureFin;
		this.etat = etat;
	}

	public Long getIdPerm() {
		return idPerm;
	}

	public String getRaison() {
		return raison;
	}

	public void setRaison(String raison) {
		this.raison = raison;
	}

	public Date getHeureDeb() {
		return heureDeb;
	}

	public void setHeureDeb(Date heureDeb) {
		this.heureDeb = heureDeb;
	}

	public Date getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	
	
}
