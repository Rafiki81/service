package com.rafiki.service.services;

import com.rafiki.service.entities.Alumno;
import com.rafiki.service.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoRepository repository;


    @Override
    public List<Alumno> findAll() {
        return (List<Alumno>) repository.findAll();
    }

    @Override
    public Alumno findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Alumno save(Alumno alumno) {
        return repository.save(alumno);
    }

    @Override
    public void delete(Alumno alumno) {
        repository.delete(alumno);
    }
}
