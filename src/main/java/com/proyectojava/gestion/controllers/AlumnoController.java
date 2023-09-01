package com.proyectojava.gestion.controllers;

import com.proyectojava.gestion.models.Alumno;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlumnoController {
    @RequestMapping(value = "alumno/{id}")
    public Alumno getAlumnoID(@PathVariable String id){
        Alumno alumno = new Alumno();
        alumno.setId(id);
        alumno.setNombre("Nestor");
        alumno.setApellido("Tigasi");
        alumno.setCedula("0503915522");
        alumno.setCorreo("nestortigasi085@gmail.com");
        alumno.setCelular("0992749081");
        alumno.setCiudad("Quito");
        alumno.setContrasenia("NestorTigasi");
        return alumno;
    }
    @RequestMapping(value = "alumnos")
    public List<Alumno>  getAlumno(){
        List<Alumno> alumnos= new ArrayList<>();
        Alumno alumno = new Alumno();
        alumno.setId("1");
        alumno.setNombre("Nestor");
        alumno.setApellido("Tigasi");
        alumno.setCedula("0503915522");
        alumno.setCorreo("nestortigasi085@gmail.com");
        alumno.setCelular("0992749081");
        alumno.setCiudad("Quito");
        alumno.setContrasenia("NestorTigasi");

        Alumno alumno2 = new Alumno();
        alumno2.setId("2");
        alumno2.setNombre("Alex");
        alumno2.setApellido("Conde");
        alumno2.setCedula("0507856456");
        alumno2.setCorreo("alexconde@gmail.com");
        alumno2.setCelular("0998645822");
        alumno2.setCiudad("Quito");
        alumno2.setContrasenia("AlexConde");

        alumnos.add(alumno);
        alumnos.add(alumno2);
        return alumnos;
    }
    @RequestMapping(value = "alumno1")
    public Alumno putAlumno(){
        Alumno alumno = new Alumno();
        alumno.setId("1");
        alumno.setNombre("Nestor");
        alumno.setApellido("Tigasi");
        alumno.setCedula("0503915522");
        alumno.setCorreo("nestortigasi085@gmail.com");
        alumno.setCelular("0992749081");
        alumno.setCiudad("Quito");
        alumno.setContrasenia("NestorTigasi");
        return alumno;
    }
    @RequestMapping(value = "alumno2")
    public Alumno deleteAlumno(){
        Alumno alumno = new Alumno();
        alumno.setId("1");
        alumno.setNombre("Nestor");
        alumno.setApellido("Tigasi");
        alumno.setCedula("0503915522");
        alumno.setCorreo("nestortigasi085@gmail.com");
        alumno.setCelular("0992749081");
        alumno.setCiudad("Quito");
        alumno.setContrasenia("NestorTigasi");
        return alumno;
    }
    @RequestMapping(value = "alumno3")
    public Alumno buscarAlumno(){
        Alumno alumno = new Alumno();
        alumno.setId("1");
        alumno.setNombre("Nestor");
        alumno.setApellido("Tigasi");
        alumno.setCedula("0503915522");
        alumno.setCorreo("nestortigasi085@gmail.com");
        alumno.setCelular("0992749081");
        alumno.setCiudad("Quito");
        alumno.setContrasenia("NestorTigasi");
        return alumno;
    }
}
