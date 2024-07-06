package com.exemple.gestioncandidatures.models;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Document(collection = "offres")
public class OffreModel {
    @Id
    @Field(name = "_id")
    private ObjectId id;

    @NonNull
    private String poste;

    @NonNull
    private String societe;

    @NonNull
    private String ville;

    @Field(name = "date_publication")
    private LocalDate datePublication;

    @NonNull
    private String lien;
}
