package org.example.Model;

import java.time.LocalDate;

public class Empleado {

    String nombre;
    String apellidos;
    LocalDate fechaAlta;
    String[] telefonos;
    String supervisor;

    public Empleado(String nombre, String apellidos, LocalDate fechaAlta, String[] telefonos, String supervisor) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.telefonos = telefonos;
        this.supervisor = supervisor;
    }



}
