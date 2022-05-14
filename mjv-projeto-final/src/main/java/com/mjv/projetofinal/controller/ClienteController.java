package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mjv.projetofinal.model.Cliente;
import com.mjv.projetofinal.repository.ClienteRepository;

public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	@PostMapping
	public void gravar(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente); 
		
	}
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}
	
}
