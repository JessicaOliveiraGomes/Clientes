package com.example.demo.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EnderecoDTO;
import com.example.demo.entities.Endereco;
import com.example.demo.mappers.EnderecoMapper;
import com.example.demo.repositorie.EnderecoRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EnderecoService {
	
	private final EnderecoRepository enderecoRepository; 
	private final EnderecoMapper enderecoMapper;
	
	public List<EnderecoDTO> getEndereco() {
		return enderecoMapper.entidadesParaDTO(enderecoRepository.findAll());
	}
	
	public EnderecoDTO saveEndereco (Endereco endereco) {
		return enderecoMapper.entidadeParaDTO(enderecoRepository.save(endereco));
	}
	
	public EnderecoDTO updateEndereco(Endereco endereco) {
		return enderecoMapper.entidadeParaDTO(enderecoRepository.save(endereco));
	}
	
	public void deleteEndereco(Long id) {
		enderecoRepository.deleteById(id);
	}
	

}