package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ClienteDTO;
import com.example.demo.entities.Cliente;
import com.example.demo.mappers.ClientMapper;
import com.example.demo.repositorie.ClienteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteService {
	
	private final ClienteRepository clienteRepository; 
	private final ClientMapper clientMapper;

	public List<ClienteDTO> getClientes() {
		return clientMapper.entidadesParaDTO(clienteRepository.findAll());
	}
	
	public ClienteDTO saveCliente(Cliente cliente) {
		return clientMapper.entidadesParaDTO(clienteRepository.save(cliente));
	}
	
	public ClienteDTO updateCliente(Cliente cliente) {
		return clientMapper.entidadesParaDTO(clienteRepository.save(cliente));
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}

	public ClienteDTO getClienteByCpf(String cpf) {
		return clientMapper.entidadesParaDTO(clienteRepository.findClienteByCpf(cpf));
	}
	
	public List<ClienteDTO> getEnderecoByCep(String cep) {
		return clientMapper.entidadesParaDTO(clienteRepository.findByEnderecoCep(cep));
	}
}
