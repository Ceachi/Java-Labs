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
        //a
        Student student = new Student(10,"Ionel", 18);
        Profesor profesor = new Profesor("Mircea", 30, "mate");
        
        System.out.println(profesor.toString());
        
        // b
        System.out.println("Puctul b : ");
        Persoana p[] = new Persoana[3];
        p[0] = student;
        p[1] = profesor;
        p[2] = new Student(10, "Mircea", 18);
        
        for (Persoana i : p) {
            if(i instanceof Student) {
                Student s = (Student) i;
                s.invata();
            }
            if(i instanceof Profesor) {
                Profesor prof = (Profesor)i;
                prof.preda();
            }
            //System.out.println(i);
        }
        
        for (Persoana i : p) {
            
            if(i instanceof Profesor) {
                Profesor prof = (Profesor)i;
                prof.preda();
            }
            
            //System.out.println(i);
        }
        
        
        
    }
}

