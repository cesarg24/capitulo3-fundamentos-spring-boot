package com.curso.libro.springboot.webapp.springboot_web.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.libro.springboot.webapp.springboot_web.models.Alumno;
import com.curso.libro.springboot.webapp.springboot_web.models.dto.AlumnoResponseDto;

@RestController
@RequestMapping("/api")
public class AlumnoRestController {

    @GetMapping("/detalle")
    public Alumno detalle() {
        /* Retornamos directamente el objeto */ 
        return new Alumno("Juan", "Perez", "Primero");
    }

    @GetMapping("/detalle2")
    public AlumnoResponseDto detalle2() {
    Alumno objAlumno = new Alumno("Michael", "Faraday", "Primero");
    return new AlumnoResponseDto("CURSO DE PHYTON", objAlumno);
    }

}

