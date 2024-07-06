package com.exemple.gestioncandidatures.services;

import com.exemple.gestioncandidatures.adapters.SuiviAdapter;
import com.exemple.gestioncandidatures.dtos.SuiviDto;
import com.exemple.gestioncandidatures.models.SuiviModel;
import com.exemple.gestioncandidatures.repositories.SuiviRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SuiviService {
    private final SuiviRepository suiviRepository;

    private final SuiviAdapter suiviAdapter;

    public List<SuiviDto> getAll() {
        return suiviRepository.findAll()
                .stream().map(suiviAdapter::toDto)
                .collect(Collectors.toList());
    }

    public SuiviDto add(SuiviDto suiviDto) {
        SuiviModel suiviModel = suiviAdapter.toModel(suiviDto);

        suiviDto.setId(suiviModel.getId().toString());
        return suiviDto;
    }
}
