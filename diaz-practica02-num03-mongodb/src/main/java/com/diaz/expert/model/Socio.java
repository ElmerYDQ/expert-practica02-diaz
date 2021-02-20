package com.diaz.expert.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
@Document(collection="socios")
public class Socio {

	@Id
	private String dni;
	
	private String nombre;
	
	private String paterno;
	
	private String materno;
	
	private String correo;
	
	private String telefono;
	
	private String estado;
	
	private String tipoMembresia;
	
}
