package com.example.demo.mappers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dto.CarroDTO;
import com.example.demo.entities.Carro;
import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class CarroMapper {
	

	public CarroDTO entidadesParaDTO(Carro entidade) {
		
		return CarroDTO.builder()
		.id(entidade.getId())
		.modelo(entidade.getModelo())
		.ano(entidade.getAno())
		.cor(entidade.getCor())
		.build();
	}
	
	public Carro dtoParaEntidade(CarroDTO dto) {
		return Carro.builder()
				.id(dto.getId())
				.modelo(dto.getModelo())
				.ano(dto.getAno())
				.cor(dto.getCor())
				.build();
	}

	public List<CarroDTO> entidadesParaDTO(List<Carro> entidades) {
		List<CarroDTO> dtos = new ArrayList<>();
		
		for (int i = 0; i < entidades.size(); i++) {
			
			Carro entidade = entidades.get(i);
					
			CarroDTO dto = 	CarroDTO.builder()
					.id(entidade.getId())
					.modelo(entidade.getModelo())
					.ano(entidade.getAno())
					.cor(entidade.getCor())

					.build();
			dtos.add(dto);
		}
		return dtos;
	}

}
