package com.exampleCRUD.demo.controller;

import com.exampleCRUD.demo.service.EntidadeExemploService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entidadesexemplo")
public class EntidadeExemploController {

    private final EntidadeExemploService service;

    @Autowired
    public EntidadeExemploController(EntidadeExemploService service) {
        this.service = service;
    }
}
