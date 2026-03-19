package com.curso.libro.springboot.webapp.springboot_web.models.dto;

import com.curso.libro.springboot.webapp.springboot_web.models.Alumno;

public class AlumnoResponseDto {
    private String title;
    private Alumno alumno;

    public AlumnoResponseDto(String title, Alumno alumno) {
        this.title = title;
        this.alumno = alumno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }


    
}
