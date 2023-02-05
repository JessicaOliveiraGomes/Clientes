package com.example.demo.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Contato {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String telefone;
	private String email;
	
}
