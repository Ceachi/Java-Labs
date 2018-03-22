/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator4.Exercitii_Poli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Ceachi Bogdan
 */



class Compare1  implements Comparator<Name> {

    @Override
    public int compare(Name o1, Name o2) {
       return -1;
    }
}

public class MainTest {
    public static void main(String[] args) {
        
       ArrayList<Name> tab2 = new ArrayList<Name>();
       tab2.add(new Name("Vasile", "Mihai"));
       tab2.add(new Name("Ana", "Ion"));
       
       Collections.sort(tab2, new Compare1());
        for (Name i : tab2) {
            System.out.println(i);
        }
        Name tab[] = {
            new Name("Vasile", "Mihai"),
            new Name("Ana", "Ion"),
            new Name("Ana", "Ana"),
            new Name ("Jaja", "Mihai")
        };
        
       
        //Arrays.sort(tab);
       
        /*
        Arrays.sort(tab, new Comparator<Name>() {
         
            @Override
            public int compare(Name o1, Name o2) {
                 int c = o1.nume.compareTo(o2.nume);
                 return (c == 0) ? o1.prenume.compareTo(o2.prenume) : c;
            }
        });
*/
                
        for (Name i : tab) {
            System.out.println(i);
            
        }
             
    }
}
