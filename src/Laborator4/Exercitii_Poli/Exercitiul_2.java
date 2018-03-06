package Laborator4.Exercitii_Poli;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Exercitiul_2 {
}

class SortedVector extends java.util.Vector{
    /*public boolean addElement(Object o){
        boolean check = super.add(o);
        if(check == true){
            Collections.sort(super.elementData, new Sortare());
        }
    }*/
}

class Sortare implements Comparator<Object>{
    @Override
    public int compare(Object o1, Object o2) {
        if(o1.equals(o2))
            return 0;
        else
            return -1;
    }
}