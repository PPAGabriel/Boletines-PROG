/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabriel.paquete2;

/**
 *
 * @author dam1
 */
public class Personal {
    private String telefono;
    private String correo;
    
    public Personal(String tlf,String mail){
    telefono=tlf;
    correo=mail;
    }
    public Personal(){};
   
    
    public void setTelefono(String tlf){
    telefono=tlf;
    }
    
    public String getTelefono(){
    String tlf=telefono;
    return tlf;
    }
    
    public void setCorreo(String mail){
    correo=mail;
    }
    
    public String getCorreo(){
     String mail=correo;
    return mail;
    }

    @Override
    public String toString() {
        return "telefono: "+telefono + ", correo: " + correo;
    }

    
}
    
    
    
