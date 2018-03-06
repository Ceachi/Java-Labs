/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator4.Exercitii_Laborator;

/**
 *
 * @author Ceachi Bogdan
 */
public class Persoana {
    String nume;
    
    Persoana() {
        System.out.println("Apelare construcot Persoana");
    }
    
    Persoana(String newName) {
        nume = newName;
    }
    @Override
    public String toString() {
        return  "Persoana{" + "nume=" + nume + '}';
    }
    
    
    
}
