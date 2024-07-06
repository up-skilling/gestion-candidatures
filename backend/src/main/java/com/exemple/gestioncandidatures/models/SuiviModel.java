package com.exemple.gestioncandidatures.models;

import com.exemple.gestioncandidatures.models.enums.EtatEnum;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Document(collection = "suivis")
public class SuiviModel {
    @Id
    @Field(name = "_id")
    private ObjectId id;

    @NonNull
    private EtatEnum postuler;

    @Field(name = "date_postulation")
    private LocalDate datePostulation;

    private EtatEnum relancer;

    @Field(name = "date_relance")
    private LocalDate dateRelance;

    @Field(name = "date_entretien")
    private LocalDateTime dateEntretien;

    private EtatEnum reponse;

    @Field(name = "date_reponse")
    private LocalDate dateReponse;

    private ObjectId offreId;
}
