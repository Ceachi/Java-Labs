/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator8.Exercitii_LaboratorPart1_Colectii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *Creati o lista inlantuita de elemente de tip Persoana(presupunem ca aveti
 * o clasa Persoana implementata, daca nu, o puteti implementa).
 * Adaugati 5 elemente in lista. Ordonati persoanele dupa nume si,
 * pentru nume egale, dupa varsta. Hint: Folositi interfata Comparator
 * @author CeachiBogdan
 */

class Persoana {

    int varsta;
    String nume;

     Persoana(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Person{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                 '}';
    }
}




public class Ex3 {
    
    
    public static void main(String[] args) {
      List<Persoana> list = new ArrayList<>();
    
       list.add(new Persoana(12,"R"));
       list.add(new Persoana(16,"B"));
       list.add(new Persoana(15,"A"));
       list.add(new Persoana(14,"G"));
       list.add(new Persoana(13,"A"));
       
       
       Collections.sort(list, new Comparator<Persoana>() {
          public int compare(Persoana o1, Persoana o2) {
              return o1.nume.compareTo(o2.nume);
          }       
       });
       
       
        for (Persoana persoana : list) {
            System.out.println(persoana);
        }
       
       
    }
    
}
