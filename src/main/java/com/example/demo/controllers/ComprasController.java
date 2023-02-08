package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cliente;
import com.example.demo.services.CompraService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/compra")
@AllArgsConstructor
public class ComprasController {
	
	private final CompraService compraService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/{clientId}/{carroId}")
	public Cliente venderCarroIdParaClienteId(@PathVariable("clientId") Long clientId, @PathVariable("carroId") Long carroId) {
		return compraService.venderCarroById(carroId, clientId);
	}

}
