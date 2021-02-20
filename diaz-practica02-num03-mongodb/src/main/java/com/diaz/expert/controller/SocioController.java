package com.diaz.expert.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diaz.expert.model.Socio;
import com.diaz.expert.repository.SocioRepository;

@RestController
public class SocioController {

	@Autowired
	private SocioRepository socioRepository;

	@GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
	public String getHealthCheck()
	{
		return "{ \"todoOk\" : true }";
	}
	
	@GetMapping("/socios")
	public List<Socio> getSocios()
	{
		List<Socio> sociosList = (List<Socio>) socioRepository.findAll();
		return sociosList;
	}

	@GetMapping("/socio/{dni}")
	public Optional<Socio> getSocio(@PathVariable String dni)
	{
		Optional<Socio> emp = socioRepository.findById(dni);
		return emp;
	}

	@PutMapping("/socio/{id}")
	public Optional<Socio> updateSocio(@RequestBody Socio newSocio, @PathVariable String dni)
	{
		Optional<Socio> optionalSo = socioRepository.findById(dni);
		if (optionalSo.isPresent()) {
			Socio so = optionalSo.get();
			so.setCorreo(newSocio.getCorreo());
			so.setTelefono(newSocio.getTelefono());
			socioRepository.save(so);
		}
		return optionalSo;
	}

	@DeleteMapping(value = "/socio/{id}", produces = "application/json; charset=utf-8")
	public String deleteSocio(@PathVariable String dni) {
		Boolean result = socioRepository.existsById(dni);
		socioRepository.deleteById(dni);
		return "{ \"operacionExitosa\" : "+ (result ? "true" : "false") +" }";
	}

	@PostMapping("/socio")
	public Socio addSocio(@RequestBody Socio newSocio)
	{
		Socio so = new Socio(newSocio.getDni(), newSocio.getNombre(), 
				newSocio.getPaterno(), newSocio.getMaterno(), newSocio.getCorreo(),
				newSocio.getTelefono(), newSocio.getEstado(), newSocio.getTipoMembresia());
		socioRepository.save(so);
		return so;
	}
	
	@PostMapping("/socio/cambiarEstado")
	public Optional<Socio> cambiarEstado(@RequestParam("dni") String dni,
			@RequestParam("estado") String estado) {
		Optional<Socio> optionalSo = socioRepository.findById(dni);
		if (optionalSo.isPresent()) {
			Socio so = optionalSo.get();
			so.setEstado(estado);
			socioRepository.save(so);
		}
		return optionalSo;
	}
	
}
