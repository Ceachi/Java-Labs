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
    private static final String MATERIE_IMPLICITA = "Info";

    private String materie;


    public Profesor(String nume, int varsta) {
        super(nume, varsta);
        this.materie = MATERIE_IMPLICITA;
    }

    public Profesor(String nume, int varsta, String materie) {
        super(nume, varsta);
        this.materie = materie;
    }

    public void preda() {
        System.out.println("Profesorul" + super.toString() + " preda " + materie);
    }

    @Override
     public String toString() {
        return "Profesor: " + super.toString() + ", " + materie;
    }
    
    
    
}
