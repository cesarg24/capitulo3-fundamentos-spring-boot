package com.curso.libro.springboot.webapp.springboot_web.models.dto;

import com.curso.libro.springboot.webapp.springboot_web.models.Profesor;

public class ProfesorDto {

    private String titulo;
    //private Profesor profesor;
    private String apellido;
    private String edad;

    
    public ProfesorDto() {
    }

    /*public ProfesorDto(Profesor profesor) {
        this.profesor = profesor;
    }*/

    // Constructor Maestro: Crea el objeto completo en un paso
    public ProfesorDto(Profesor profesor, String titulo) {
        this.apellido = profesor.getApellido();
        this.edad = profesor.getEdad();
        this.titulo = titulo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /*   public Profesor getPro() {
        return profesor;
    }
    public void setPro(Profesor profesor) {
        this.profesor = profesor;
    }  */

    

}
