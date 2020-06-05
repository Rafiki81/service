package com.rafiki.service.services;

import com.rafiki.service.entities.Alumno;

import java.util.List;

public interface AlumnoService {

    List<Alumno> findAll();
    Alumno findById(Long id);
    Alumno save(Alumno alumno);
    void delete(Alumno alumno);



}
