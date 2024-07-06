package com.exemple.gestioncandidatures.dtos;

import com.exemple.gestioncandidatures.models.enums.EtatEnum;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class SuiviDto {
    private String id;
    private EtatEnum postuler;
    private LocalDate datePostulation;
    private EtatEnum relancer;
    private LocalDate dateRelance;
    private LocalDateTime dateEntretien;
    private EtatEnum reponse;
    private LocalDate dateReponse;
    private String offreId;
}
