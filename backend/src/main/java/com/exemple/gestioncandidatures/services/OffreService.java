package com.exemple.gestioncandidatures.services;

import com.exemple.gestioncandidatures.adapters.OffreAdapter;
import com.exemple.gestioncandidatures.dtos.OffreDto;
import com.exemple.gestioncandidatures.models.OffreModel;
import com.exemple.gestioncandidatures.repositories.OffreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class OffreService {
    private final OffreRepository offreRepository;

    private final OffreAdapter offreAdapter;

    public List<OffreDto> getAll() {
        return offreRepository.findAll()
                .stream().map(offreAdapter::toDto)
                .collect(Collectors.toList());
    }

    public OffreDto add(OffreDto offreDto) {
        OffreModel offreModel = offreAdapter.toModel(offreDto);
        offreModel = offreRepository.save(offreModel);

        offreDto.setId(offreModel.getId().toString());
        return offreDto;
    }
}
