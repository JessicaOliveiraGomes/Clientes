package com.example.demo.mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.example.demo.dto.EnderecoDTO;
import com.example.demo.entities.Endereco;


@Component
public class EnderecoMapper {

	public EnderecoDTO entidadeParaDTO(Endereco entidade) {
		if (Objects.nonNull(entidade)) {
			return new EnderecoDTO(entidade.getId(), entidade.getComplemento(), entidade.getNumero(), entidade.getRua(), entidade.getCep());			
		}
		return null;
	}

	public List<EnderecoDTO> entidadesParaDTO(List<Endereco> entidades) {
		List<EnderecoDTO> dtos = new ArrayList<>();
		
		for (int i = 0; i < entidades.size(); i++) {
			Endereco entidade = entidades.get(i);
			
			if (Objects.nonNull(entidade)) {
				EnderecoDTO dto = new EnderecoDTO(
						entidade.getId(), entidade.getComplemento(), entidade.getNumero(), entidade.getRua(),entidade.getCep());
				dtos.add(dto);		
			}			
		}
		return dtos;
	}
}
