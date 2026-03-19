package com.curso.libro.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.libro.springboot.webapp.springboot_web.models.dto.ParamDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    @GetMapping("/cadena")
    public ParamDto getMethodName(@RequestParam(required = false) String anuncio) {
        
        ParamDto objParam = new ParamDto();
        objParam.setAnuncio(anuncio!=null? anuncio: "Hello");

        return objParam;
    }
    
}
