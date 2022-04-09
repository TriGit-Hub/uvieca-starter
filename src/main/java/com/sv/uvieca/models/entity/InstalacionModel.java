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
@Table(name = "instalaciones")
public class InstalacionModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	private String nombre_pro;
	private String direccion;
	private int tension_del_suministro;
	private int carga_a_solicitar;
	private int nro_tablero;
	private int nro_de_hojas;
	private String clasificacion_de_la_instalacion;
	private String tipo_de_servicio;
	private int nro_de_trasformadores;
	private int nro_de_niveles;
	private int nro_de_servicio_a_instalar;
	private int capacidad_de_la_subestacion;
	private int capacidad_del_generador;
	private String conexion_de_la_subestacion;
	
	private int departamentoid;
	
	private int municipioid;

	  @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "solicitudId")
	private Set<SolicitudModel> solicitudId;

	  @OneToMany(cascade = CascadeType.ALL)
	    @JoinColumn(name = "inspeccionid")
	private Set<Inspeccion> inspeccionid;
	  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_pro() {
		return nombre_pro;
	}

	public void setNombre_pro(String nombre_pro) {
		this.nombre_pro = nombre_pro;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTension_del_suministro() {
		return tension_del_suministro;
	}

	public void setTension_del_suministro(int tension_del_suministro) {
		this.tension_del_suministro = tension_del_suministro;
	}

	public int getCarga_a_solicitar() {
		return carga_a_solicitar;
	}

	public void setCarga_a_solicitar(int carga_a_solicitar) {
		this.carga_a_solicitar = carga_a_solicitar;
	}

	public int getNro_tablero() {
		return nro_tablero;
	}

	public void setNro_tablero(int nro_tablero) {
		this.nro_tablero = nro_tablero;
	}

	public int getNro_de_hojas() {
		return nro_de_hojas;
	}

	public void setNro_de_hojas(int nro_de_hojas) {
		this.nro_de_hojas = nro_de_hojas;
	}

	public String getClasificacion_de_la_instalacion() {
		return clasificacion_de_la_instalacion;
	}

	public void setClasificacion_de_la_instalacion(String clasificacion_de_la_instalacion) {
		this.clasificacion_de_la_instalacion = clasificacion_de_la_instalacion;
	}

	public String getTipo_de_servicio() {
		return tipo_de_servicio;
	}

	public void setTipo_de_servicio(String tipo_de_servicio) {
		this.tipo_de_servicio = tipo_de_servicio;
	}

	public int getNro_de_trasformadores() {
		return nro_de_trasformadores;
	}

	public void setNro_de_trasformadores(int nro_de_trasformadores) {
		this.nro_de_trasformadores = nro_de_trasformadores;
	}

	public int getNro_de_niveles() {
		return nro_de_niveles;
	}

	public void setNro_de_niveles(int nro_de_niveles) {
		this.nro_de_niveles = nro_de_niveles;
	}

	public int getNro_de_servicio_a_instalar() {
		return nro_de_servicio_a_instalar;
	}

	public void setNro_de_servicio_a_instalar(int nro_de_servicio_a_instalar) {
		this.nro_de_servicio_a_instalar = nro_de_servicio_a_instalar;
	}

	public int getCapacidad_de_la_subestacion() {
		return capacidad_de_la_subestacion;
	}

	public void setCapacidad_de_la_subestacion(int capacidad_de_la_subestacion) {
		this.capacidad_de_la_subestacion = capacidad_de_la_subestacion;
	}

	public int getCapacidad_del_generador() {
		return capacidad_del_generador;
	}

	public void setCapacidad_del_generador(int capacidad_del_generador) {
		this.capacidad_del_generador = capacidad_del_generador;
	}

	public String getConexion_de_la_subestacion() {
		return conexion_de_la_subestacion;
	}

	public void setConexion_de_la_subestacion(String conexion_de_la_subestacion) {
		this.conexion_de_la_subestacion = conexion_de_la_subestacion;
	}

	public int getDepartamentoid() {
		return departamentoid;
	}

	public void setDepartamentoid(int departamentoid) {
		this.departamentoid = departamentoid;
	}

	public int getMunicipioid() {
		return municipioid;
	}

	public void setMunicipioid(int municipioid) {
		this.municipioid = municipioid;
	}

	public Set<SolicitudModel> getSolicitudId() {
		return solicitudId;
	}

	public void setSolicitudId(Set<SolicitudModel> solicitudId) {
		this.solicitudId = solicitudId;
	}
	  
	  
	
}
