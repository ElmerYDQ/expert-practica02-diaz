package com.diaz.expert.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.diaz.expert.model.Foto;

public interface FotoDAO extends MongoRepository<Foto, String> {

}
