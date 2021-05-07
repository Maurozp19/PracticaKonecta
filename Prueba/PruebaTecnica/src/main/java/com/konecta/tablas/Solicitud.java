package com.konecta.tablas;

import java.util.Date;

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

@Entity
public class Solicitud {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name ="Codigo", length = 50)
	@NotNull
	private String codigo;
	
	@Column(name ="Descripcion", length = 50)
	@NotNull
	private String desc;
	
	@Column(name ="Resumen", length = 50)
	@NotNull
	private String res;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="Id_empleado")
	private Empleado empleado;
	
	public int getIdSolicitud() {
		return Id;
	}
	
	public void setIdSolicitud(int Id) {
		this.Id = Id;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getResumen() {
		return res;
	}
	
	public void setResumen(String res) {
		this.res = res;
	}
	
}
