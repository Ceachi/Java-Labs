/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator3.Exercitii_Poli;

/**
 * Sa se defineasca o clasa "Complex" pentru operatii cu numere complexe si
 * sa se testeze metodele implementate. Clasa va avea doi constructori astfe:
 * 1) cu doua argumente (partea reala, partea imaginara)
 * 2) fara argumente
 * 
 * Metodele necesare sunt: adunare, inmultire, ridicare la putere naturala
 * equals, toString
 * 
 * (a,b) + (c,d) = (a + c, b + d);
 * (a,b) * (c,d) = (ac - bd, bc + ad);
 * @author Ceachi Bogdan
 */
public class Ex1 {
    
    
    public static void main(String args[]) {
        Complex complex1 = new Complex(2,-5);
        Complex complex2 = new Complex(1, -6);

       // Complex sum = complex1.adunare(complex2);
        //Complex produs = complex1.multiplication(complex2);
        
       // System.out.println(sum.toString());
       // System.out.println(produs.toString());
       
       Complex produs = complex1.multiplication(complex1);
       System.out.println(produs.toString());
       produs = produs.multiplication(complex1);
       System.out.println(produs.toString());
        
        System.out.println((complex1.pow(2)).toString());
    
    }
}
