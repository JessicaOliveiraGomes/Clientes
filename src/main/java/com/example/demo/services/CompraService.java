package com.example.demo.services;

import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.carrosrequest.CarroService;
import com.example.demo.dto.CarroDTO;
import com.example.demo.entities.Carro;
import com.example.demo.entities.Cliente;
import com.example.demo.mappers.CarroMapper;
import com.example.demo.repositorie.CarroRepository;
import com.example.demo.repositorie.ClienteRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CompraService {
	
	private final CarroService carroService;
	private final ClienteService clienteService;
	private final CarroMapper carroMapper;
	private final ClienteRepository clienteRepository;
	private final CarroRepository carroRepository;
	
	
	@Transactional
	public Cliente venderCarroById(Long carroId, Long clienteId) {
		Cliente cliente = clienteService.getClienteById(clienteId);
		CarroDTO carroDTO = carroService.buscarCarroById(carroId);
		
		if (Objects.isNull(carroDTO) || Objects.isNull(cliente)) {
			throw new RuntimeException("NÃO EXISTE CARRO OU USUARIO COM ESSE ID");
		}
		
		Carro carro = carroRepository.save(carroMapper.dtoParaEntidade(carroDTO));
		cliente.getCarros().add(carro);
		
		//clienteRepository.save(cliente);
		
		return cliente;
	}
	

}
