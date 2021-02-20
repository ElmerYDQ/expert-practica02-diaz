package com.diaz.expert.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.diaz.expert.model.Foto;
import com.diaz.expert.service.FotoServiceImpl;

@RestController
public class FotoController {
	
	@Autowired
	private FotoServiceImpl service;
	
	@PostMapping("/fotos")
	public String addFoto(@RequestParam("id") String id,
			@RequestParam("nombre") String nombre,
			@RequestParam("imagen") MultipartFile imagen) throws IOException {
		return service.addFoto(id, nombre, imagen);
	}
	
	@GetMapping("/fotos/{id}")
	public Foto getFoto(@PathVariable String id) {
		return service.getFoto(id);
	}

}
