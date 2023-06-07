package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.AsistenteDao;
import com.example.dao.ConversacionDao;
import com.example.entities.Asistente;
import com.example.entities.Conversacion;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConversacionServiceImpl implements ConversacionService{

    private final ConversacionDao conversacionDao;
    private final AsistenteDao asistenteDao; 
    @Override
    public List<Conversacion> findAll() {

        return  conversacionDao.findAll();
    }

    @Override
    public Conversacion findById(int idConversacion) {
        
        return conversacionDao.findById(idConversacion).get();
    }

    @Override
    @Transactional
    public void delete(int idConversacion) {
        
        conversacionDao.deleteById(idConversacion);
    }

    @Override
    @Transactional
    public void save(Conversacion conversacion) {
        
        conversacionDao.save(conversacion);    
    }

    @Override
    public Asistente findByIdAsistente(int idAsistente) {
        return asistenteDao.findById(idAsistente).get();
    }


    
}