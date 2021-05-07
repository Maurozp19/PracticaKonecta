package com.konecta.tablas;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

import java.util.Date;

@Entity 
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name ="Fecha_Ingreso")
	@NotNull
	private Date fecha;
	
	@Column(name ="Nombre", length = 50)
	@NotNull
	private String nombre;
	
	@Column(name ="Salario")
	@NotNull
	private int salario;
	
	@OneToOne(mappedBy = "empleado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Solicitud solicitud;
	
	public int getIdEmpleado() {
		return Id;
	}
	
	public void setIdEmpleado(int Id) {
		this.Id = Id;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
}
