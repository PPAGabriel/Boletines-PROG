/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.GregorianCalendar;

/**
 *
 * @author dam1
 */
public class Empregado {
    
    private String dni;
    private String nome;
    private String apelidos;
    private GregorianCalendar data;
    
    public Empregado(){}
    
    public Empregado(String id, String n,String ap,GregorianCalendar d){
        this.dni=id;
        this.nome=n;
        this.apelidos=ap;
        this.data=d;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public GregorianCalendar getData() {
        return data;
    }

    public void setData(GregorianCalendar data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "dni: " + dni + ", nome:" + nome + ", apelidos:" + apelidos + ", data:" + data;
    }
    
    
    
}
