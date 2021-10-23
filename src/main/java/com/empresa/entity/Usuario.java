package com.empresa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id	
	private String id_usuario;
	private String dni_usuario;
	private String nombres_usuario;
	private String apellidos_usuario;
	private int es_activo;
	private String contrasenia_usuario;
	private int id_rol;
	
	//Get y Set
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getDni_usuario() {
		return dni_usuario;
	}
	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}
	public String getNombres_usuario() {
		return nombres_usuario;
	}
	public void setNombres_usuario(String nombres_usuario) {
		this.nombres_usuario = nombres_usuario;
	}
	public String getApellidos_usuario() {
		return apellidos_usuario;
	}
	public void setApellidos_usuario(String apellidos_usuario) {
		this.apellidos_usuario = apellidos_usuario;
	}
	public int getEs_activo() {
		return es_activo;
	}
	public void setEs_activo(int es_activo) {
		this.es_activo = es_activo;
	}
	public String getContrasenia_usuario() {
		return contrasenia_usuario;
	}
	public void setContrasenia_usuario(String contrasenia_usuario) {
		this.contrasenia_usuario = contrasenia_usuario;
	}
	public int getId_rol() {
		return id_rol;
	}
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", dni_usuario=" + dni_usuario + ", nombres_usuario="
				+ nombres_usuario + ", apellidos_usuario=" + apellidos_usuario + ", es_activo=" + es_activo
				+ ", contrasenia_usuario=" + contrasenia_usuario + ", id_rol=" + id_rol + "]";
	}
	
	
	
}
