package com.empresa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "AGENTE")
public class Agente {

	@Id
	private String id_usuario;
	private int id_categoria;
	
	//get y set
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	
	
	@Override
	public String toString() {
		return "Agente [id_usuario=" + id_usuario + ", id_categoria=" + id_categoria + "]";
	}
	
	
	
	
}
