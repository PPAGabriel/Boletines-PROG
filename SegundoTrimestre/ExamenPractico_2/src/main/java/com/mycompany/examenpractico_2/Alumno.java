/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpractico_2;

/**
 *
 * @author dam1
 */
public class Alumno {
    
    private String nome;
    private int nota;
    
    public Alumno(){};
    
    public Alumno(String nome, int nota){
        this.nome=nome;
        this.nota=nota;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
    
}
