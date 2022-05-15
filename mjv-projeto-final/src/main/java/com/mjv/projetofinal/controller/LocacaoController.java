package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.locacao.Locacao;
import com.mjv.projetofinal.repository.LocacaoRepository;

@RestController
@RequestMapping("/locacoes") 

public class LocacaoController {

	@Autowired						
	private LocacaoRepository locacaoRepository;
	
	@PostMapping 					 
	public void gravar(@RequestBody Locacao locacao) { 
		locacaoRepository.save(locacao); 
		
	}
	
	@GetMapping								
	public List<Locacao> listar(){
		return locacaoRepository.findAll(); 
	}
	
}
