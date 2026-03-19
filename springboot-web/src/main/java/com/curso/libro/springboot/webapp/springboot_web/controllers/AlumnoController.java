package com.curso.libro.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.libro.springboot.webapp.springboot_web.models.Alumno;

@Controller
public class AlumnoController {

   @GetMapping("/detalle3")
    public String detalle(Model model) { // 2. Retornamos String y pedimos el Model
        
    Alumno alumno = new Alumno("Juan", "Perez", "Primero");
        
    // 3. "Empacamos" el objeto para la vista
    model.addAttribute("titulo", "Detalle del Alumno");
    model.addAttribute("alumno", alumno);
        
    // 4. Retornamos el nombre del archivo HTML (sin el .html)
    return "detalle-alumno"; 
    }
}
