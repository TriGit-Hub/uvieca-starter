package com.sv.uvieca.models.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	private String nombre;
	private String razonSocial;
	private String nit;
	private String nrc;
	
	private String actEconomica;
	private String email;
	private String telefono;
	
	  
	  @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	    @JoinColumn(name = "nitID",referencedColumnName = "id")
	private copiaNITmodel nitID;
	
	  @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	    @JoinColumn(name = "nrcID",referencedColumnName = "id")
	private copiaNCRmodel nrcID;

	  @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	    @JoinColumn(name = "consEmpresa",referencedColumnName = "id")
	private ConstitucionEmpresamodel consEmpresa;
	 
	  

	  @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "clienteId")
	private Set<SolicitudModel> solicitudId;
	
	
	private int idInstalacion;
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
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	public String getActEconomica() {
		return actEconomica;
	}
	public void setActEconomica(String actEconomica) {
		this.actEconomica = actEconomica;
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

	
	public int getIdInstalacion() {
		return idInstalacion;
	}
	public void setIdInstalacion(int idInstalacion) {
		this.idInstalacion = idInstalacion;
	}
	public copiaNITmodel getNitID() {
		return nitID;
	}
	public void setNitID(copiaNITmodel nitID) {
		this.nitID = nitID;
	}
	public copiaNCRmodel getNrcID() {
		return nrcID;
	}
	public void setNrcID(copiaNCRmodel nrcID) {
		this.nrcID = nrcID;
	}
	public ConstitucionEmpresamodel getConsEmpresa() {
		return consEmpresa;
	}
	public void setConsEmpresa(ConstitucionEmpresamodel consEmpresa) {
		this.consEmpresa = consEmpresa;
	}
	public Set<SolicitudModel> getSolicitudId() {
		return solicitudId;
	}
	public void setSolicitudId(Set<SolicitudModel> solicitudId) {
		this.solicitudId = solicitudId;
	}

	
	
}
