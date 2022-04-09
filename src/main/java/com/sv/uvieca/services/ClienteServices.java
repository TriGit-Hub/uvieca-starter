package com.sv.uvieca.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.uvieca.models.entity.ClienteModel;
import com.sv.uvieca.repo.ClienteRepo;

@Service
public class ClienteServices {

	@Autowired
	ClienteRepo clienterepo;
	
	public List<ClienteModel> obtenerClientes (){
		return(List<ClienteModel>) clienterepo.findAll();
	}
	
	public void guardarClientes (ClienteModel cliente) {
		clienterepo.save(cliente);
	}
}
