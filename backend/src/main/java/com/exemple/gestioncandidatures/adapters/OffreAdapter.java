package com.exemple.gestioncandidatures.adapters;

import com.exemple.gestioncandidatures.dtos.OffreDto;
import com.exemple.gestioncandidatures.models.OffreModel;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class OffreAdapter {

    public OffreDto toDto(OffreModel model) {
        if (model == null) {
            return null;
        }

        return OffreDto.builder()
                .id(model.getId().toString())
                .poste(model.getPoste())
                .societe(model.getSociete())
                .ville(model.getVille())
                .datePublication(model.getDatePublication())
                .lien(model.getLien())
                .build();
    }

    public OffreModel toModel(OffreDto dto) {
        if (dto == null) {
            return null;
        }

        return OffreModel.builder()
                .id(ObjectId.get())
                .poste(dto.getPoste())
                .societe(dto.getSociete())
                .ville(dto.getVille())
                .datePublication(dto.getDatePublication())
                .lien(dto.getLien())
                .build();
    }
}
