package com.curso.libro.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

    @GetMapping("/json")
    public Map<String, Object> datos(){
        Map<String, Object> body = new HashMap<>();
        
        body.put("title", "Hola Mundo");
        body.put("name", "Albert");
        body.put("lastname", "Einstein");

        return body;
    }
}
