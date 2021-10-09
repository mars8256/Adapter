package edu.uspg.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alumno {

	int id;
	String nombres;
	String apellidos;
	String correo;
	
	
	public Alumno() {
		super();
	}


	public Alumno(int id, String nombres, String apellidos, String correo) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
	}


	public int getId() {
		return id;
	}

	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}


	public String getNombres() {
		return nombres;
	}

	@XmlElement
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}

	@XmlElement
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCorreo() {
		return correo;
	}

	@XmlElement
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	
	
}
