package com.mycompany.programa;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

abstract class Trabajador {

    private String nombre;
    private String cedula;

    public Trabajador(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    void registrarJornada(int horas, LocalDateTime inicio, LocalDateTime fin) {
    }

}
