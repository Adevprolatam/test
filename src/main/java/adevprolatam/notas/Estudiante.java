/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adevprolatam.notas;

/**
 *
 * @author dell
 */
class Estudiante {
    private float nota;
    private int semestre;

    public Estudiante(float nota, int semestre) {
        this.nota = nota;
        this.semestre = semestre;
    }

    public float obtenerNota() {
        return nota;
    }

    public int obtenerSemestre() {
        return semestre;
    }
}