package com.example.demo.mappers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.example.demo.dto.ClienteDTO;
import com.example.demo.dto.ContatoDTO;
import com.example.demo.dto.EnderecoDTO;
import com.example.demo.entities.Cliente;



@Component
public class ClientMapper {
	
	private final ContatoMapper contatoMapper;
	private final EnderecoMapper enderecoMapper;
	
	
	public ClientMapper(EnderecoMapper enderecoMapper, ContatoMapper contatoMapper) {
		this.enderecoMapper = enderecoMapper;
		this.contatoMapper = contatoMapper;
	}
	
	
	public ClienteDTO entidadesParaDTO(Cliente entidade) {
		EnderecoDTO enderecoDTO = enderecoMapper.entidadeParaDTO(entidade.getEndereco());
		List<ContatoDTO> contatoDTO = contatoMapper.entidadesParaDTO(entidade.getContato());
		
		return new ClienteDTO (entidade.getId(), entidade.getNome(), entidade.getCpf(), enderecoDTO, contatoDTO);
	}

	
	public List<ClienteDTO> entidadesParaDTO(List<Cliente> entidades) {
		List<ClienteDTO> dtos = new ArrayList<>();
		
		for (int i = 0; i < entidades.size(); i++) {
			
			Cliente entidade = entidades.get(i);
					
			EnderecoDTO enderecoDTO = enderecoMapper.entidadeParaDTO(entidade.getEndereco());
			List<ContatoDTO> contatoDTO = contatoMapper.entidadesParaDTO(entidade.getContato());
			ClienteDTO dto = new ClienteDTO(entidade.getId(), entidade.getNome(), entidade.getCpf(),enderecoDTO, contatoDTO);
			dtos.add(dto);
		}
		return dtos;
	}
	
}
