package com.exampleCRUD.demo.repository;

import com.exampleCRUD.demo.model.EntidadeExemplo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadeExemploRepository extends JpaRepository<EntidadeExemplo,Long> {
}
