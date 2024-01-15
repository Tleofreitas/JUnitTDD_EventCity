package com.devsuperior.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.dto.CityDTO;
import com.devsuperior.demo.services.CityService;

@RestController
@RequestMapping(value = "/cities")
public class CityController {

	@Autowired // Padrão Camadas
	private CityService service;

	@GetMapping // Buscar todos as Cidades
	public ResponseEntity<List<CityDTO>> findAll() {
		List<CityDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
