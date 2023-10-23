package com.mycompany.programa;

import java.time.LocalDateTime;

/**
 * @author Usuario
 */
public class TrabajadorNormal extends Trabajador {

    private int horasTrabajadas;

    public TrabajadorNormal(String nombre, String cedula) {
        super(nombre, cedula);
        horasTrabajadas = 0;
    }

    @Override
    public void registrarJornada(int horas, LocalDateTime inicio, LocalDateTime fin) {
        horasTrabajadas += horas;
    }
}
