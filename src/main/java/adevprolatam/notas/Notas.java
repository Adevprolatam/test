/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package adevprolatam.notas;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author dell
 */
public class Notas {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int op= 0;
        
        do {
            System.out.println("============================");
            System.out.println("MENU");
            System.out.println("1. Registrar ");
            System.out.println("2. Salir");
            System.out.println("============================");
            System.out.println("Elija una opción: ");
            op = scanner.nextInt();
              
            switch (op) {
                case 1:   
                  System.out.println("Ingrese el nombre del curso:");
                  String nombreCurso = scanner.next();

                  System.out.println("Ingrese el número de estudiantes:");
                 int numeroDeEstudiantes = scanner.nextInt();

                 // Crear objeto Curso
                Estudiante[] estudiantes = new Estudiante[numeroDeEstudiantes]; 
                Curso curso = new Curso(nombreCurso, numeroDeEstudiantes);

                // Crear array de objetos Estudiante
                
        for (int i = 0; i < numeroDeEstudiantes; i++) {
            System.out.println("\nIngrese la nota del estudiante " + (i + 1) + ":");
            float nota = scanner.nextFloat();

            System.out.println("Ingrese el semestre del estudiante " + (i + 1) + ":");
            int semestre = scanner.nextInt();

            estudiantes[i] = new Estudiante(nota, semestre);
        }

        // Asignar el array de estudiantes al curso
        curso.crearEstudiantes(estudiantes);

        // Calcular estadísticas del curso
        curso.calcularEstadisticas();

        // Obtener y mostrar estadísticas del curso
        float notaPromedio = curso.obtenerNotaPromedio();
        int pasados = curso.obtenerPasados();
        int reprobados = curso.obtenerReprobados();
        int semestreComun = curso.obtenerSemestreComun();

        System.out.println("\nEstadísticas del curso:" + nombreCurso);
        System.out.println("Nota promedio del curso: " + notaPromedio);
        System.out.println("Estudiantes aprobados: " + pasados);
        System.out.println("Estudiantes reprobados: " + reprobados);
        System.out.println("Semestre más común: " + semestreComun);

                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (op != 2);
    }
}

