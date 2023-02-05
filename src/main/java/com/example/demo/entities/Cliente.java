package com.example.demo.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@ApiModelProperty(value = "Código do cliente")
	private Long id;
	
	@ApiModelProperty(value = "Nome completo do cliente")
	private String nome;
	
	private String cpf;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Contato> contato;
	
	private String senha;
	
}
