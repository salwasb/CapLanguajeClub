package com.example.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Asistente;


public interface AsistenteDao extends JpaRepository<Asistente, Integer> {
  
    @Query(value = "select a from Asistente a left join fetch a.conversacion")
     public List<Asistente>findAll(Sort sort);

}