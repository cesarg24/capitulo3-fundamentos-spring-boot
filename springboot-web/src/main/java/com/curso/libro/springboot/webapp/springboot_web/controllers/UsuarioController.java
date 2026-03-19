package com.curso.libro.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
    @GetMapping("/miruta")
    public String informe(Map<String, Object> model){
        
        model.put("title", "Hola Mundo");
        model.put("name", "Albert");
        model.put("lastname", "Einstein");

        return "informe";
    }
}
