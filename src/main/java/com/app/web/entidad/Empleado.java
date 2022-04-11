package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre",nullable = false,length =50)
	private String nombre;
	
	@Column(name="email",nullable = false,length =50,unique=true)
	private String email;
	
	@Column(name="estatus",nullable = false,length =50)
	private String estatus;
	
	@Column(name="area",nullable = false,length =50)
	private String area;

	public Empleado() {
		super();
	}

	public Empleado(Long id, String nombre, String email, String estatus, String area) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.estatus = estatus;
		this.area = area;
	}
	
	public Empleado( String nombre, String email, String estatus, String area) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.estatus = estatus;
		this.area = area;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "empleado [id=" + id + ", nombre=" + nombre + ", email=" + email + ", estatus=" + estatus + ", area="
				+ area + "]";
	}
	
	
}
