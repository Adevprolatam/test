/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adevprolatam.notas;
import java.util.Arrays;
/**
 *
 * @author dell
 */
class Curso {
    private String nombreCurso;
    private int numeroDeEstudiantes;
    private Estudiante[] estudiantes;
    private float notaPromedio;
    private int pasados;
    private int reprobados;
    private int semestreComun;

    public Curso(String nombreCurso, int numeroDeEstudiantes) {
        this.nombreCurso = nombreCurso;
        this.numeroDeEstudiantes = numeroDeEstudiantes;
        this.estudiantes = new Estudiante[numeroDeEstudiantes];
        this.notaPromedio = 0;
        this.pasados = 0;
        this.reprobados = 0;
        this.semestreComun = 0;
    }

    public void crearEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void calcularEstadisticas() {
        if (numeroDeEstudiantes > 0) {
            float sumaNotas = 0;
            int[] semestres = new int[estudiantes.length];
            for (int i = 0; i < estudiantes.length; i++) {
                sumaNotas += estudiantes[i].obtenerNota();
                if (estudiantes[i].obtenerNota() >= 14) {
                    pasados++;
                } else {
                    reprobados++;
                }
                semestres[i] = estudiantes[i].obtenerSemestre();
            }
            notaPromedio = sumaNotas / numeroDeEstudiantes;
            calcularModa(semestres);
        }
    }

    private void calcularModa(int[] array) {
        int maxCount = 0;
        int moda = 0;

        for (int i = 0; i < array.length; ++i) {
            int count = 0;

            for (int j = 0; j < array.length; ++j) {
                if (array[j] == array[i]) {
                    ++count;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                moda = array[i];
            }
        }

        semestreComun = moda;
    }

    public float obtenerNotaPromedio() {
        return notaPromedio;
    }

    public int obtenerPasados() {
        return pasados;
    }

    public int obtenerReprobados() {
        return reprobados;
    }

    public int obtenerSemestreComun() {
        return semestreComun;
    }
}