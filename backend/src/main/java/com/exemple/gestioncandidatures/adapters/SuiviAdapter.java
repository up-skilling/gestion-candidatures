package com.exemple.gestioncandidatures.adapters;

import com.exemple.gestioncandidatures.dtos.SuiviDto;
import com.exemple.gestioncandidatures.models.SuiviModel;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class SuiviAdapter {

    public SuiviDto toDto(SuiviModel model) {
        if (model == null) {
            return null;
        }

        return SuiviDto.builder()
                .id(model.getId().toString())
                .postuler(model.getPostuler())
                .datePostulation(model.getDatePostulation())
                .relancer(model.getRelancer())
                .dateRelance(model.getDateRelance())
                .dateEntretien(model.getDateEntretien())
                .reponse(model.getReponse())
                .dateReponse(model.getDateReponse())
                .offreId(model.getOffreId().toString())
                .build();
    }

    public SuiviModel toModel(SuiviDto dto) {
        if (dto == null) {
            return null;
        }

        return SuiviModel.builder()
                .id(ObjectId.get())
                .postuler(dto.getPostuler())
                .datePostulation(dto.getDatePostulation())
                .relancer(dto.getRelancer())
                .dateRelance(dto.getDateRelance())
                .dateEntretien(dto.getDateEntretien())
                .reponse(dto.getReponse())
                .dateReponse(dto.getDateReponse())
                .offreId(ObjectId.get()).build();
    }
}
