package com.exemple.gestioncandidatures.repositories;

import com.exemple.gestioncandidatures.models.SuiviModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuiviRepository extends MongoRepository<SuiviModel, String> {
}
