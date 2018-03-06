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
public class Student extends Persoana {
    int nota;

    public Student() {
        
    }

    public Student(String newName, int nota) {
        super(newName);
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString() + ". Nota: " +  nota;
    }
    
    
}
