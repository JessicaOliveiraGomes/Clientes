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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClienteDTO;
import com.example.demo.entities.Cliente;
import com.example.demo.services.ClienteService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor
public class ClienteController {
	
	private final ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>> buscarClinetes() {
		return ResponseEntity.ok(clienteService.getClientes());
	}
	
	@GetMapping("/cpf")
	public ResponseEntity<ClienteDTO> buscarClinetePorCpf(@RequestParam String cpf) {
		//trocar reResponseEntity<Cliente> por ResponseEntity<ClienteDTO>
		return ResponseEntity.ok(clienteService.getClienteByCpf(cpf));
	}
	
	@GetMapping("/cep")
	public ResponseEntity<List<ClienteDTO>> buscarClientePorCep(@RequestParam String cep) {
		//trocar reResponseEntity<Cliente> por ResponseEntity<ClienteDTO>
		return ResponseEntity.ok(clienteService.getEnderecoByCep(cep));
	}
	
	@PostMapping
	public ResponseEntity<ClienteDTO> saveCliente(@RequestBody Cliente cliente) {
		//trocar reResponseEntity<Cliente> por ResponseEntity<ClienteDTO>
		return ResponseEntity.ok(clienteService.saveCliente(cliente));
	}
	
	@PutMapping
	public ResponseEntity<ClienteDTO> updateCliente(@RequestBody Cliente cliete) {
		//trocar reResponseEntity<Cliente> por ResponseEntity<ClienteDTO>
		return ResponseEntity.ok(clienteService.updateCliente(cliete));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id) {
		clienteService.deleteCliente(id);
		return ResponseEntity.noContent().build();
	}
	
}
