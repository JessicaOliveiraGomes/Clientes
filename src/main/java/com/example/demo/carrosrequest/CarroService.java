package com.example.demo.carrosrequest;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.CarroDTO;

@FeignClient(value="carro", url = "http://localhost:8081/carros")
public interface CarroService {
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
    List<CarroDTO> buscarCarros();
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
    CarroDTO buscarCarroById(@PathVariable("id") Long id);

}
