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
public class Profesor extends Persoana {
    String materie;

    public Profesor() {
        
    }

    public Profesor(String materie, String newName) {
        super(newName);
        this.materie = materie;
    }

    @Override
    public String toString() {
        return super.toString() + ". Nota: " +  materie;
    }
    
    
    
}
