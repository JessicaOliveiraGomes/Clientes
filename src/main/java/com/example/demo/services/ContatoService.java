package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.dto.ContatoDTO;
import com.example.demo.entities.Contato;
import com.example.demo.mappers.ContatoMapper;
import com.example.demo.repositorie.ContatoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ContatoService {

	private final ContatoRepository contatoRepository;
	private final ContatoMapper contatoMapper;
	
	public List<ContatoDTO> getContato() {
		return contatoMapper.entidadesParaDTO(contatoRepository.findAll());
	}
	
	public ContatoDTO saveContato (Contato contato) {
		return contatoMapper.entidadesParaDTO(contatoRepository.save(contato));
	}
	
	public ContatoDTO updateContato(Contato contato) {
		return contatoMapper.entidadesParaDTO(contatoRepository.save(contato));
	}
	
	public void deleteContato(Long id) {
		contatoRepository.deleteById(id);
	}
	
	
}
