/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator4.Exercitii_Laborator;

import java.util.Objects;

/**
 *
 * @author Ceachi Bogdan
 */
public class Persoana {
    String nume;
    int varsta;

    public Persoana(String nume) {
        this.nume = nume;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        if(o instanceof Persoana) {
            Persoana persoana = (Persoana) o;
            return varsta == persoana.varsta && nume.equals(persoana.nume);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + varsta;
        return result;
    }

    @Override
    public String toString() {
        return nume + ", " + varsta;
    }
    
    
    
    
    
}
