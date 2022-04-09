package com.sv.uvieca.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sv.uvieca.repo.ElectricistaRepo;

@Entity
@Table(name = "copiasCarnet")
public class copiaCarnetmodel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	private String img;
	@OneToOne(mappedBy = "copiaCarnet")
	private ElectricistaModel electricista;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public ElectricistaModel getElectricista() {
		return electricista;
	}
	public void setElectricista(ElectricistaModel electricista) {
		this.electricista = electricista;
	}
	
	
}
