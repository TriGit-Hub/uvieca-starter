package com.sv.uvieca.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitud_model")
public class SolicitudModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clienteId", nullable = false)
	private ClienteModel cliente;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "electricistaId", nullable = false)
	private ElectricistaModel electricistaID;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "solicitudId", nullable = false)
	private InstalacionModel instalacionID;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}

	public ElectricistaModel getElectricistaID() {
		return electricistaID;
	}

	public void setElectricistaID(ElectricistaModel electricistaID) {
		this.electricistaID = electricistaID;
	}

	public InstalacionModel getInstalacionID() {
		return instalacionID;
	}

	public void setInstalacionID(InstalacionModel instalacionID) {
		this.instalacionID = instalacionID;
	}
	
	
}
