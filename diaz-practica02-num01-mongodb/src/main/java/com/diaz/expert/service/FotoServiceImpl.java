package com.diaz.expert.service;

import java.io.IOException;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.diaz.expert.dao.FotoDAO;
import com.diaz.expert.model.Foto;

@Service
public class FotoServiceImpl implements IFotoService {
	
	@Autowired
	private FotoDAO dao;

	@Override
	public String addFoto(String id, String nombre, MultipartFile imagen) throws IOException {
		Foto foto = new Foto(id, nombre);
		foto.setImagen(new Binary(BsonBinarySubType.BINARY, imagen.getBytes()));
		foto = dao.save(foto);
		return foto.getId();
	}

	@Override
	public Foto getFoto(String id) {
		return dao.findById(id).get();
	}

}
