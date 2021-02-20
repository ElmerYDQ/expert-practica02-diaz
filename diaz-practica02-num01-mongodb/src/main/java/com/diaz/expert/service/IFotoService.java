package com.diaz.expert.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.diaz.expert.model.Foto;

public interface IFotoService {

	String addFoto(String id, String nombre, MultipartFile imagen) throws IOException;
	
	Foto getFoto(String id);
}
