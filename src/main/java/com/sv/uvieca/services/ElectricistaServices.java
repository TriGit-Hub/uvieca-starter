package com.sv.uvieca.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.uvieca.models.entity.ClienteModel;
import com.sv.uvieca.models.entity.ElectricistaModel;
import com.sv.uvieca.repo.ClienteRepo;
import com.sv.uvieca.repo.ElectricistaRepo;

@Service
public class ElectricistaServices {

	@Autowired
	ElectricistaRepo electricistarepo;
	
	public ArrayList<ElectricistaModel> obtenerClientes (){
		return(ArrayList<ElectricistaModel>) electricistarepo.findAll();
	}
	
	public void guardarClientes (ElectricistaModel electricista) {
		electricistarepo.save(electricista);
	}
}
