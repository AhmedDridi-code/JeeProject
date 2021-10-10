package com.gestionEmp.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ch.qos.logback.core.net.server.Client;

@Entity
public class Conge {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConge;
	
	@Column(name="dateDebut")
	private Date dateDebut;
	
	@Column(name="dateFin")
	private Date dateFin;
	
	@Column(name="periode")
	private Date periode;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="employe_id")
	private Employe employeConge;
	
	public Conge(Date dateDebut, Date dateFin, Date periode, String description) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.periode = periode;
		this.description = description;
	}
	
	public Long getIdConge() {
		return idConge;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Date getPeriode() {
		return periode;
	}
	public void setPeriode(Date periode) {
		this.periode = periode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
