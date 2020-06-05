package com.rafiki.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public ResponseEntity index(){

        return new ResponseEntity("Bienvenidos a nuerstro servidor Web", HttpStatus.OK);

    }
}
