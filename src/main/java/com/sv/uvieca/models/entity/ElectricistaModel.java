package com.sv.uvieca.models.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "electricistas")
public class ElectricistaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	private String nombre;
	private String nit;
	private String registro;
	private String email;
	private String telefono;

	private int dui;

	private int carnet;

	  @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "electricistaId")
	private Set<SolicitudModel> solicitudId;

	  @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "copia_Carnet")
	private copiaCarnetmodel copiaCarnet;
	  
	  @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "copia_Dui")
	private copiaDUImodel copiaDui;
	  
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

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getDui() {
		return dui;
	}

	public void setDui(int dui) {
		this.dui = dui;
	}

	public int getCarnet() {
		return carnet;
	}

	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}

	public Set<SolicitudModel> getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(Set<SolicitudModel> solicitudId) {
		this.solicitudId = solicitudId;
	}

	public copiaCarnetmodel getCopiaCarnet() {
		return copiaCarnet;
	}

	public void setCopiaCarnet(copiaCarnetmodel copiaCarnet) {
		this.copiaCarnet = copiaCarnet;
	}

	public copiaDUImodel getCopiaDui() {
		return copiaDui;
	}

	public void setCopiaDui(copiaDUImodel copiaDui) {
		this.copiaDui = copiaDui;
	}
	  
	  

}
