/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin_28;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author dam1
 */
public class Componentes {
    JFrame marco;
    JPanel panel;
    JLabel etiqueta1,etiqueta2;
    JButton boton1,boton2;
    JTextField lTexto1;
    JPasswordField lTexto2;
    JTextArea aTexto;
    
    public void iniciar(){
        marco= new JFrame("Boletin 28");
        panel=new JPanel();
        etiqueta1=new JLabel("NOME");
        etiqueta2=new JLabel("PASSWORD");
        boton1=new JButton("PREMER");
        boton2=new JButton("LIMPAR");
        lTexto1=new JTextField();
        lTexto2=new JPasswordField();
        aTexto=new JTextArea("      Area de Texto");
        
        //marco:
        marco.setBounds(0,0,800,800);
        marco.setDefaultCloseOperation(3);
        marco.setVisible(true);
        
        //panel:
        panel.setBounds(5,5,750,750);
        panel.setBackground(Color.lightGray);
        
        //componentes:
        etiqueta1.setBounds(100,80,100,50);
        etiqueta2.setBounds(100,140,100,50);
        lTexto1.setBounds(300,80,300,50);
        lTexto2.setBounds(300,140,300,50);
        lTexto2.setEchoChar('•');
        aTexto.setBounds(80,250,400,200);
        boton1.setBounds(180,600,180,50);
        boton2.setBounds(450,600,180,50);
        
        //añadir componentes al panel
        panel.setLayout(null);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(lTexto1);
        panel.add(lTexto2);
        panel.add(aTexto);
        panel.add(boton1);
        panel.add(boton2);
        
        marco.add(panel);
    }
    
    
}
