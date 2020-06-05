package com.rafiki.service.controller;


import com.rafiki.service.entities.Alumno;
import com.rafiki.service.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AlumnoController {
    @Autowired
    AlumnoService service;


    @GetMapping("/alumnos")
    public ResponseEntity<?> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping("/alumnos")
    public ResponseEntity save(@RequestBody Alumno alumno){
        return new ResponseEntity(service.save(alumno),HttpStatus.OK);
    }

}
