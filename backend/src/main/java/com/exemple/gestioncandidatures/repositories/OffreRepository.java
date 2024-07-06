package com.exemple.gestioncandidatures.repositories;

import com.exemple.gestioncandidatures.models.OffreModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffreRepository extends MongoRepository<OffreModel, String> {
}
