package com.diaz.expert.clientes;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.diaz.expert.model.Socio;

@FeignClient(name = "man-socios")
public interface SocioClienteRest {
	
	@PostMapping("/socio/cambiarEstado")
	public Optional<Socio> cambiarEstado(@RequestParam("dni") String dni,
			@RequestParam("estado") String estado);
	
}
