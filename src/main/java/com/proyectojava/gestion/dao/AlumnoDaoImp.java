package com.proyectojava.gestion.dao;

import com.proyectojava.gestion.models.Alumno;
import jakarta.persistence.EntityManager;

import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AlumnoDaoImp implements AlumnoDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Alumno> getAlumno() {
        String query="FROM Alumno";
        return entityManager.createQuery(query).getResultList();
    }
}