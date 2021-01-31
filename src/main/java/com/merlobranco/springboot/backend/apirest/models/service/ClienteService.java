package com.merlobranco.springboot.backend.apirest.models.service;

import java.util.List;

import com.merlobranco.springboot.backend.apirest.models.entity.Cliente;

public interface ClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);

}
