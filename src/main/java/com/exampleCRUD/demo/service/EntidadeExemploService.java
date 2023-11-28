package com.exampleCRUD.demo.service;

import com.exampleCRUD.demo.repository.EntidadeExemploRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntidadeExemploService {
    private final EntidadeExemploRepository repository;

    @Autowired
    public EntidadeExemploService(EntidadeExemploRepository repository) {
        this.repository = repository;
    }
}
