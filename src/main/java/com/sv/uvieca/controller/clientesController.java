package com.sv.uvieca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.uvieca.models.entity.ClienteModel;
import com.sv.uvieca.services.ClienteServices;



@RestController
@RequestMapping("/clientes")
public class clientesController {
	
	@Autowired
	ClienteServices clienteServices;
	
	@GetMapping
	public List<ClienteModel> obtenerClientes(){
		return clienteServices.obtenerClientes();
	}
	
	@PostMapping
	public void guardarCliente(@RequestBody ClienteModel cliente) {
		 clienteServices.guardarClientes(cliente);
	}

}