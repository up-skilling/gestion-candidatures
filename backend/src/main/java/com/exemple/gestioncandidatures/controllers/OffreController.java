package com.exemple.gestioncandidatures.controllers;

import com.exemple.gestioncandidatures.dtos.OffreDto;
import com.exemple.gestioncandidatures.services.OffreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/offres")
public class OffreController {
    private final OffreService offreService;

    @GetMapping
    public List<OffreDto> getAll() {
        return offreService.getAll();
    }

    @PostMapping
    public OffreDto add(@RequestBody OffreDto offreDto) {
        return offreService.add(offreDto);
    }
}
