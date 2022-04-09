package com.sv.uvieca.repo;


import org.springframework.data.repository.CrudRepository;

import com.sv.uvieca.models.entity.ClienteModel;

public interface ClienteRepo extends CrudRepository<ClienteModel, Long>{

}
