package com.tablero.hockey.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tablerohockey")
public class tablero implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idPartido;
	
	private String local;
	private String visitante;
	private int puntoslocal;
	private int puntosvisitante;
	private int faltaslocal;
	private int faltasvisitante;
	
	public Long getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getVisitante() {
		return visitante;
	}
	public void setVisitante(String visitante) {
		this.visitante = visitante;
	}
	public int getPuntoslocal() {
		return puntoslocal;
	}
	public void setPuntoslocal(int puntoslocal) {
		this.puntoslocal = puntoslocal;
	}
	public int getPuntosvisitante() {
		return puntosvisitante;
	}
	public void setPuntosvisitante(int puntosvisitante) {
		this.puntosvisitante = puntosvisitante;
	}
	public int getFaltaslocal() {
		return faltaslocal;
	}
	public void setFaltaslocal(int faltaslocal) {
		this.faltaslocal = faltaslocal;
	}
	public int getFaltasvisitante() {
		return faltasvisitante;
	}
	public void setFaltasvisitante(int faltasvisitante) {
		this.faltasvisitante = faltasvisitante;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
	