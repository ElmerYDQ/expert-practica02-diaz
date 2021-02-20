package com.diaz.expert.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diaz.expert.model.Socio;
import com.diaz.expert.service.HistorialCambiosService;

@RestController
public class HistorialCambiosController {

	@Autowired
	HistorialCambiosService service;
	
	@PostMapping("/cambiarEstado")
	public Optional<Socio> cambiarEstado(@RequestParam("dni") String dni,
			@RequestParam("estado") String estado) {
		return service.cambiarEstado(dni, estado);
	}
}
