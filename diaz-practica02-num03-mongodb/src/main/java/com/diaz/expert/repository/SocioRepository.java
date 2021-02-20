package com.diaz.expert.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.diaz.expert.model.Socio;

public interface SocioRepository extends MongoRepository<Socio, String> {

}
