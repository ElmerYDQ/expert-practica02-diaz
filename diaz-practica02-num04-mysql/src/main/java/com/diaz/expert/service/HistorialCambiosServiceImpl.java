package com.diaz.expert.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diaz.expert.clientes.SocioClienteRest;
import com.diaz.expert.model.HistorialCambios;
import com.diaz.expert.model.Socio;
import com.diaz.expert.repository.HistorialCambiosRepository;

@Service
public class HistorialCambiosServiceImpl implements HistorialCambiosService {

	@Autowired
	SocioClienteRest socioCliente;
	
	@Autowired
	HistorialCambiosRepository repository;

	@Override
	public Optional<Socio> cambiarEstado(String dni, String estado) {
		Optional<Socio> socio = socioCliente.cambiarEstado(dni, estado);
		HistorialCambios historial = new HistorialCambios();
		historial.setDni(dni);
		historial.setEstado(estado);
		historial.setFecha(new Date());
		repository.save(historial);
		return socio;
	}
	
	
}
