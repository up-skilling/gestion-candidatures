package com.exemple.gestioncandidatures.controllers;

import com.exemple.gestioncandidatures.dtos.SuiviDto;
import com.exemple.gestioncandidatures.services.SuiviService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/suivis")
public class SuiviController {
    private final SuiviService suiviService;

    @GetMapping
    public List<SuiviDto> getAll() {
        return suiviService.getAll();
    }

    @PostMapping
    public SuiviDto add(@RequestBody SuiviDto suiviDto) {
        return suiviService.add(suiviDto);
    }
}
