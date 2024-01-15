package com.devsuperior.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devsuperior.demo.dto.CityDTO;
import com.devsuperior.demo.entities.City;
import com.devsuperior.demo.repositories.CityRepository;

@Service
public class CityService {
	
	@Autowired // Acesso ao Banco de Dados
	private CityRepository repository;

	// Buscar todos as Cidades
	public List<CityDTO> findAll() {
		// Busca ordenada por nome
		List<City> list = repository.findAll(Sort.by("name"));
		// Converter Lista para DTO
		return list.stream().map(x -> new CityDTO(x)).toList();
	}
}
