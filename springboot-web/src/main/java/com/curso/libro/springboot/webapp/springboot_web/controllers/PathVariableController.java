package com.curso.libro.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.libro.springboot.webapp.springboot_web.models.Profesor;
import com.curso.libro.springboot.webapp.springboot_web.models.dto.ParamDto;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    //Inyectamos estos valores
    @Value("${config.usuario}")
    private String usuario;
    
    //@Value("${config.mensaje}")
    //private String mensaje;
    
    @Value("${config.listOfValue}")
    private String[] listOfValue;

    @Value("${config.codigo}")
    private Integer codigo;

    @Value("#{'${config.listaValor}'.split(',')}")
    private String[] listaValor;

    @Value("#{'${config.listaValor}'.toUpperCase()}")
    private String valorString;

    @Value("#{${config.valorMap}}")
    private Map<String, Object> valoresMap;

    @Value("#{${config.valorMap}.apellido}")
    private String apellido;

    @Value("#{${config.valorMap}.curso}")
    private String curso;

    @Autowired
    private Environment environment;



    @GetMapping("/cadena/{anuncio}")
    public ParamDto variable(@PathVariable String anuncio){

        ParamDto param = new ParamDto();
        param.setAnuncio(anuncio);
        return param;
    }

@GetMapping("/producto/{categoria}/{id}")
public Map<String, Object> obtenerProducto(
            @PathVariable String categoria,
            @PathVariable Long id) {
        
       Map<String, Object> response = new HashMap<>();
       response.put("categoria", categoria);
       response.put("id", id);
       response.put("mensaje", "Detalle del producto " + id + " en la sección " + categoria);
       
       return response;
   }

@PostMapping("/crear")
public Profesor crear(@RequestBody Profesor profesor){
//transformamos todos los caracteres a mayúsculas ("EINSTEIN").
profesor.setApellido(profesor.getApellido().toUpperCase());
return profesor;
}

@GetMapping("/valores")
public Map<String, Object> valores(@Value("${config.mensaje}") String mensaje){

    Map<String, Object> json = new  HashMap<>();
    json.put("codigo", codigo);
    json.put("usuario", usuario);
    json.put("mensaje", mensaje);
    json.put("listOfValue", listOfValue);
    json.put("listaValor", listaValor);
    json.put("valorString", valorString);
    json.put("valoresMap", valoresMap);
    json.put("apellido", apellido);
    json.put("curso", curso);

    json.put("dni", environment.getProperty("config.dni", Long.class));

    
    return json;
}

}
