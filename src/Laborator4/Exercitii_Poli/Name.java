/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator4.Exercitii_Poli;

import java.util.Objects;

/**
 *
 * @author Ceachi Bogdan
 */
public class Name implements Comparable<Name> {
    String nume, prenume;
    Name(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
    
    public int compareTo(Name obj) {
           int c = nume.compareTo(obj.nume);
           return (c == 0) ? prenume.compareTo(obj.prenume) : c;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nume);
        hash = 59 * hash + Objects.hashCode(this.prenume);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Name other = (Name) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Name{" + "nume=" + nume + ", prenume=" + prenume + '}';
    }

    
    
    
}
