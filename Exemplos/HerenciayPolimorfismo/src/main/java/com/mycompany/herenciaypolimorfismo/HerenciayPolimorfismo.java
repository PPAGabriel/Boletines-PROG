/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaypolimorfismo;

/**
 *
 * @author dam1
 */
public class HerenciayPolimorfismo {

    public static void main(String[] args) {
        Fillo f=new Fillo();
        Nai n=new Nai();
        Avo a=new Avo();
        
        System.out.println(f.m1());
        System.out.println("*****");
        f.m2();
        System.out.println("*****");
        f.m3();
        System.out.println("*****");
        n.m4();
        System.out.println("*****");
        System.out.println(n.m1());
        System.out.println("*****");
        System.out.println(a.m1());
        System.out.println("*****");
        a.m2();
    }
}
