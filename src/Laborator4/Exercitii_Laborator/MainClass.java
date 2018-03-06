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
public class MainClass {
    
    public static void main(String[] args) {
        Student student = new Student("Ionel", 10);
        Profesor profesor = new Profesor("mate", "Mircea");
        
        System.out.println(profesor.toString());
    }
}

