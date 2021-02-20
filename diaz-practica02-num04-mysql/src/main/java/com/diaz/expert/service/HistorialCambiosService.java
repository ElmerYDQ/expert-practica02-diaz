package com.diaz.expert.service;

import java.util.Optional;

import com.diaz.expert.model.Socio;

public interface HistorialCambiosService {
	
	Optional<Socio> cambiarEstado(String dni, String estado);

}
