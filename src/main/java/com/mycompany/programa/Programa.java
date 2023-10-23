package com.mycompany.programa;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Usuario
 */
public class Programa {

    public static void main(String[] args) {
        try (Scanner Scanner = new Scanner(System.in)) {
            Map<String, Trabajador> trabajadores = new HashMap<>();
            boolean continuar = true;

            while (continuar) {
                System.out.println("1. Ingresar jornada laboral");
                System.out.println("2. Ingresar novedad");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: \n");
                int opcion = Scanner.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el nombre del trabajador: ");
                        String nombre = Scanner.next();
                        System.out.print("Ingrese la cedula del trabajador: ");
                        String cedula = Scanner.next();

                        Trabajador trabajador = trabajadores.get(cedula);
                        if (trabajador == null) {
                            trabajador = new TrabajadorNormal(nombre, cedula);
                            trabajadores.put(cedula, trabajador);
                        }

                        System.out.print("Ingrese la cantidad de horas trabajadas:\n ");
                        int horas = Scanner.nextInt();
                        LocalDateTime inicio = LocalDateTime.now();
                        LocalDateTime fin = inicio.plusHours(horas);

                        trabajador.registrarJornada(horas, inicio, fin);
                    }
                    case 2 -> {
                        // Ingresar novedad
                        System.out.println("Seleccione la novedad:\n");
                        System.out.println("1. Licencia");
                        System.out.println("2. Incapacidad");
                        System.out.println("3. Vacaciones");
                        System.out.println("4. Permisos");
                        int novedad = Scanner.nextInt();

                        switch (novedad) {
                            case 1 -> {
                                // Licencia
                                System.out.println("Seleccione el tipo de licencia\n:");
                                System.out.println("1. Temporal");
                                System.out.println("2. Maternidad");
                                System.out.println("3. Paternidad\n");
                                int tipoLicencia = Scanner.nextInt();

                                switch (tipoLicencia) {
                                    case 1 -> {
                                        // Licencia temporal
                                        System.out.println("Ingrese la cantidad de días (1-4):");
                                        int diasLicenciaTemporal = Scanner.nextInt();

                                        if (diasLicenciaTemporal >= 1 && diasLicenciaTemporal <= 4) {
                                            // Procesar licencia temporal
                                        } else {
                                            System.out.println("\nAlerta: Debes tomar vacaciones en lugar de una licencia temporal.");
                                        }
                                    }

                                    case 2 -> {
                                        // Maternidad
                                        System.out.println("Ingrese la cantidad de días (1-180):\n");
                                        int diasMaternidad = Scanner.nextInt();

                                        if (diasMaternidad >= 1 && diasMaternidad <= 180) {
                                            // Procesar licencia por maternidad
                                        } else {
                                            System.out.println("\nAlerta: No puedes tomar más de 180 días de licencia por maternidad.");
                                        }
                                    }

                                    case 3 -> {
                                        // Paternidad
                                        System.out.println("Ingrese la cantidad de días (1-15):");
                                        int diasPaternidad = Scanner.nextInt();

                                        if (diasPaternidad >= 1 && diasPaternidad <= 15) {
                                            // Procesar licencia por paternidad
                                        } else {
                                            System.out.println("\nAlerta: No puedes tomar más de 15 días de licencia por paternidad.");
                                        }
                                    }
                                }
                            }

                            case 2 -> {
                                // Incapacidad
                                System.out.println("Ingrese la cantidad de días (1-20):");
                                int diasIncapacidad = Scanner.nextInt();

                                if (diasIncapacidad >= 1 && diasIncapacidad <= 20) {
                                    // Procesar incapacidad
                                } else {
                                    System.out.println("\nAlerta: No puedes tomar más de 20 días de incapacidad.");
                                }
                            }

                            case 3 -> {
                                // Vacaciones
                                System.out.println("Ingrese la cantidad de días (1-15):");
                                int diasVacaciones = Scanner.nextInt();

                                if (diasVacaciones >= 1 && diasVacaciones <= 15) {
                                    // Procesar vacaciones
                                } else {
                                    System.out.println("\nAlerta: No puedes tomar más de 15 días de vacaciones.");
                                }
                            }

                            case 4 -> {
                                // Permisos
                                System.out.println("Ingrese la cantidad de horas (1-5):");
                                int horasPermisos = Scanner.nextInt();

                                if (horasPermisos >= 1 && horasPermisos <= 5) {
                                    // Procesar permisos
                                } else {
                                    System.out.println("\nAlerta: Debes tomar 1 día de vacaciones o una licencia temporal en lugar de un permiso.");
                                }
                            }
                        }
                    }
                    case 3 ->
                        continuar = false;
                    default ->
                        System.out.println("Opción inválida");
                }

            }
        }

    }
}
