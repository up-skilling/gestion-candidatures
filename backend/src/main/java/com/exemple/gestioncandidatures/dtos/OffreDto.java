package com.exemple.gestioncandidatures.dtos;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class OffreDto {
    private String id;
    private String poste;
    private String societe;
    private String ville;
    private LocalDate datePublication;
    private String lien;
}
