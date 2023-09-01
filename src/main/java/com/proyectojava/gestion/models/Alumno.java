package com.proyectojava.gestion.models;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="alumnos")
@ToString @EqualsAndHashCode
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    private Long id;

    @Getter @Setter @Column(name="nombre")
    private String nombre;

    @Getter @Setter @Column(name="apellido")
    private String apellido;

    @Getter @Setter @Column(name="cedula")
    private String cedula;

    @Getter @Setter @Column(name="correo")
    private String correo;

    @Getter @Setter @Column(name="celular")
    private String celular;

    @Getter @Setter @Column(name="ciudad")
    private String ciudad;

    @Getter @Setter @Column(name="contrasenia")
    private String contrasenia;


}
