package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 200474375767177760L;

	private Long id;
	private String nome;
	private String cpf;
	private EnderecoDTO endereco;
	private List<ContatoDTO> contato;


	public List<ContatoDTO> getContato() {
		return contato;
	}

	public void setContato(List<ContatoDTO> contato) {
		this.contato = contato;
	}

}
