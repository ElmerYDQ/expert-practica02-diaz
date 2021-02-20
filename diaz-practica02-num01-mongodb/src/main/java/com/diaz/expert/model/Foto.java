package com.diaz.expert.model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Document(collection="foto")
public class Foto {

	@Id
	private String id;
	
	private String nombre;
	
	private Binary imagen;
	
	public Foto(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
}
