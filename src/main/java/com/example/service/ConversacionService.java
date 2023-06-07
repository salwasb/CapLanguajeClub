package com.example.service;

import java.util.List;

import com.example.entities.Asistente;
import com.example.entities.Conversacion;

public interface ConversacionService {
    public List<Conversacion> findAll(); 
    public Conversacion findById(int idConversacion);
    public void delete(int idConversacion);
    public void save (Conversacion conversacion); 
    public Asistente findByIdAsistente (int idAsistente); 
}