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

import com.example.demo.dto.EnderecoDTO;
import com.example.demo.entities.Endereco;
import com.example.demo.services.EnderecoService;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/endereco")
@AllArgsConstructor
public class EnderecoController {
	
	private final EnderecoService enderecoService;
	
	@ApiOperation(value = "Retorna uma lista de Clientes")
	@GetMapping
	public ResponseEntity<List<EnderecoDTO>> buscarEndereco() {
		//TODO UTILIZAR REPONSE ENTITY
		return ResponseEntity.ok(enderecoService.getEndereco());
	}
	
	@ApiOperation(value = "Salva um novo cadastro de cliente")
	@PostMapping
	public ResponseEntity<EnderecoDTO> saveEndereco(@RequestBody Endereco endereco) {
		//TODO UTILIZAR REPONSE ENTITY
		return ResponseEntity.ok(enderecoService.saveEndereco(endereco));
	}
	
	@ApiOperation(value = "Atualiza a lista de Clientes")
	@PutMapping
	public ResponseEntity<EnderecoDTO> updateEndereco(@RequestBody Endereco endereco) {
		//TODO UTILIZAR REPONSE ENTITY
		return ResponseEntity.ok(enderecoService.updateEndereco(endereco));
	}
	
	@ApiOperation(value = "Deleta cliente por id")
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		//TODO UTILIZAR REPONSE ENTITY
		enderecoService.deleteEndereco(id);
		return ResponseEntity.noContent().build();
		
	}
}
