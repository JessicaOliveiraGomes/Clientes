package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ContatoDTO;
import com.example.demo.entities.Contato;
import com.example.demo.services.ContatoService;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/contato")
@AllArgsConstructor
public class ContatoController {

	private final ContatoService contatoService;
	
	@ApiOperation(value = "Retorna uma lista de Clientes")
	@GetMapping
	public ResponseEntity<List<ContatoDTO>> buscarContato() {
		return ResponseEntity.ok(contatoService.getContato());
	}
	
	@ApiOperation(value = "Salva um novo cadastro de cliente")
	@PostMapping
	public ResponseEntity<ContatoDTO> saveContato(@RequestBody Contato contato) {
		return ResponseEntity.ok(contatoService.saveContato(contato));
	}
	
	@ApiOperation(value = "Atualiza a lista de Clientes")
	@PutMapping
	public ResponseEntity<ContatoDTO> updateContato(@RequestBody Contato contato) {
		return ResponseEntity.ok(contatoService.updateContato(contato));
	}
	
	@ApiOperation(value = "Deleta cliente por id")
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		contatoService.deleteContato(id);
		return ResponseEntity.noContent().build();
		
	}
	
}
