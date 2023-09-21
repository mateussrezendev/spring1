package com.br.mateus.prjMateus.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ncliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ncliente")
	private String ncliente;
	
	@Column(name = "telefone")
	private double telefone;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getncliente() {
		return ncliente;
	}
	public void setncliente(String ncliente) {
		this.ncliente = ncliente;
	}
	public double gettelefone() {
		return telefone;
	}
	public void settelefone(double telefone) {
		this.telefone = telefone; 
	}
}
