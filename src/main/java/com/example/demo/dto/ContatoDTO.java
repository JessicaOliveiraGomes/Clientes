package com.example.demo.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ContatoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String telefone;
	private String email;
		
}
