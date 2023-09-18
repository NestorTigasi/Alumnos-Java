package com.proyectojava.gestion.dao;

import com.proyectojava.gestion.models.Alumno;

import java.util.List;

public interface AlumnoDao {
    List<Alumno> getAlumno();

    void eliminar(Long id);

    void registrarAlumno(Alumno alumno);
}
