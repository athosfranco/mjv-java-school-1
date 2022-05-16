package com.mjv.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjv.projetofinal.model.locacao.LocacaoItem;
import com.mjv.projetofinal.repository.LocacaoItemRepository;

@RestController
	@RequestMapping("/locacao_item")
	public class LocacaoItemController {

		@Autowired
		LocacaoItemRepository locacaoItemRepository;

		@PostMapping
		public void gravar(@RequestBody LocacaoItem locacaoItem) {
			locacaoItemRepository.save(locacaoItem);
		}

		@GetMapping
		public List<LocacaoItem> listar() {
			return locacaoItemRepository.findAll();
		}

		@DeleteMapping("{id}")
		public void deletar(@PathVariable Integer id, @RequestBody LocacaoItem locacaoItem) {
			locacaoItemRepository.delete(locacaoItem);
		}
	}
	
