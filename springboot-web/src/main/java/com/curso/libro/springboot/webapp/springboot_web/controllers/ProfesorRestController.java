package com.curso.libro.springboot.webapp.springboot_web.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.libro.springboot.webapp.springboot_web.models.Profesor;
import com.curso.libro.springboot.webapp.springboot_web.models.dto.ProfesorDto;

@RestController
@RequestMapping("/api")
public class ProfesorRestController {
    
    @GetMapping(path = "/datos")
    public ProfesorDto datos(){
        
        //Profesor profesor = new Profesor("Albert", "Einstein", "40");
        ProfesorDto profesordto = new ProfesorDto();
        //profesordto.setPro(profesor);
        profesordto.setTitulo("Físico Teórico");

        return profesordto;
    }

    @GetMapping("/listado")
    public List<ProfesorDto> lista(){

        List<Profesor> objList = List.of(
            new Profesor("Nicola", "Tesla", "35"),
            new Profesor("John", "Hopfield", "45"),
            new Profesor("James", "Peebles", "40")
        );

         /*List<ProfesorDto> objListDto = objList.stream()
         .map(ProfesorDto::new)
         //.map(obj -> new ProfesorDto(obj))
         .collect(Collectors.toList());*/

         /*List<ProfesorDto> objListDto = objList.stream()
         .map(obj -> {
           ProfesorDto dto = new ProfesorDto();
           dto.setPro(obj);
           dto.setTitulo("Investigador Científico"); // Valor por defecto o dinámico
           //pero la forma màs correcta es enviarlo por el contructor de la clase.
           return dto;
          })
        .collect(Collectors.toList()); */

        List<ProfesorDto> objListDto = objList.stream()
         .map(p -> new ProfesorDto(p, "Investigador Científico"))
        .collect(Collectors.toList());

        return objListDto;
    }
}
