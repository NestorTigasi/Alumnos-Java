package com.proyectojava.gestion.controllers;

import com.proyectojava.gestion.dao.AlumnoDao;
import com.proyectojava.gestion.models.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlumnoController {
    @Autowired
    private AlumnoDao alumnoDao;
    @RequestMapping(value = "alumno/{id}")
    public Alumno getAlumnoID(@PathVariable Long id){
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
    @RequestMapping(value = "api/alumnos")
    public List<Alumno>  getAlumno(){
       return alumnoDao.getAlumno();
    }
    @RequestMapping(value = "alumno1")
    public Alumno putAlumno(){
        Alumno alumno = new Alumno();
        alumno.setId(1L);
        alumno.setNombre("Nestor");
        alumno.setApellido("Tigasi");
        alumno.setCedula("0503915522");
        alumno.setCorreo("nestortigasi085@gmail.com");
        alumno.setCelular("0992749081");
        alumno.setCiudad("Quito");
        alumno.setContrasenia("NestorTigasi");
        return alumno;
    }
    @RequestMapping(value = "api/alumnos/{id}", method = RequestMethod.DELETE)
    public void deleteAlumno(@PathVariable Long id){
        alumnoDao.eliminar(id);
    }
    @RequestMapping(value = "alumno3")
    public Alumno buscarAlumno(){
        Alumno alumno = new Alumno();
        alumno.setId(1L);
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
