/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
/**
 *
 * @author dam1
 */
public class Layouts {
      JFrame marco;
    JPanel panel;
    JButton b1, b2, b3, b4, b5;
    
    public void flowLayout(){
        //declaración compoñentes:
        marco = new JFrame("FlowLayout");
        panel = new JPanel();
        b1 = new JButton("Botón 1");
        b2 = new JButton("Botón 2");
        b3 = new JButton("Botón 3");
        b4 = new JButton("Botón 4");
        b5 = new JButton("Botón 5");
        
        //marco:
        marco.setDefaultCloseOperation(3);
        marco.setVisible(true);
        marco.setSize(800, 800);
        
        //panel:
        panel.setLayout(new FlowLayout());
        
        //engadir os compoñentes:
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        marco.add(panel);
    }
    
    public void flowLayout2(){
        iniciarCompoñentes();
        panel.setLayout(new FlowLayout());
        
        //engadir os compoñentes
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        marco.add(panel);
        pecharVentana();
    }
    
    public void iniciarCompoñentes(){
        //declaración compoñentes:
        marco = new JFrame("FlowLayout");
        panel = new JPanel();
        
        b1 = new JButton("Botón 1");
        b2 = new JButton("Botón 2");
        b3 = new JButton("Botón 3");
        b4 = new JButton("Botón 4");
        b5 = new JButton("Botón 5");
        
        //marco:
        /*Manera que me gusta, sin pechar ventana
        marco.setVisible(true);
        marco.setSize(800, 800);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(3);
        */
        marco.setSize(800, 800);
    }
    public void pecharVentana(){
        marco.setVisible(true);
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(3);
    }
    
    public void disBoxLayout(){
        iniciarCompoñentes();
        //aplicar o Layout
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        
         //engadir os compoñentes
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        marco.add(panel);
        
        pecharVentana();
    }
    
    public void borderLayout(){
        iniciarCompoñentes();
        panel.setLayout(new BorderLayout());
        
        //engadimos compoñentes
        panel.add(b1,BorderLayout.NORTH);
        panel.add(b2,BorderLayout.WEST);
        panel.add(b3,BorderLayout.EAST);
        panel.add(b4,BorderLayout.SOUTH);
        panel.add(b5);
        
        marco.add(panel);
        pecharVentana();
    }
}
