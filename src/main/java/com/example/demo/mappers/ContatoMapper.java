package com.example.demo.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.example.demo.dto.ContatoDTO;
import com.example.demo.entities.Contato;



@Component
public class ContatoMapper {
	
	public ContatoDTO entidadesParaDTO(Contato entidade) {
		if (Objects.nonNull(entidade)) {
			return new ContatoDTO (entidade.getId(), entidade.getTelefone(), entidade.getEmail());
		}
		return null;
	}
	
	public List<ContatoDTO> entidadesParaDTO(List<Contato> entidades) {
		List<ContatoDTO> dtos = new ArrayList<>();
		
		for (int i = 0; i < entidades.size(); i++) {
			Contato entidade = entidades.get(i);
			
			if (Objects.nonNull(entidade)) {
				ContatoDTO dto = new ContatoDTO(
						entidade.getId(), entidade.getTelefone(), entidade.getEmail());
				dtos.add(dto);		
			}			
		}
		return dtos;
	}
}
