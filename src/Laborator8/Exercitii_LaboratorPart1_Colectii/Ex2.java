/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator8.Exercitii_LaboratorPart1_Colectii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/**
 * Sa se creeze o lista care sa nu permita introducerea de elemente duplicate.
 * La introducerea unui element existent, semnalati eroare. Parcurgeti lista
 * folosind un iterator si afisati elementele sale.
 * 
 * 
 * @author CeachiBogdan
 */



class DuplicateElementException extends Exception {
    public DuplicateElementException(String message) {
        super(message);
    }
}

class NoDuplicateList<T> implements Iterable<T> {
    
    private List<T> list;
   
    // constructor ce initializeaza lista mea
    
    NoDuplicateList() {
        list = new ArrayList<>();
    }
    // metoda pentru adaugarea in lista
    
    void add(T obj) throws DuplicateElementException {
        
        if(list.contains(obj)) {
            throw new DuplicateElementException("Ai adaugat un element existent");
        }else {
            list.add(obj);
        }
    }
    
    public Iterator<T> iterator() {
            Iterator<T> iterator = new Iterator<T>() {
            
            public int currentIndex = 0;
            
            @Override
            public boolean hasNext() { // check 
                return currentIndex < list.size() // daca nu am ajuns la capat
                        && list.get(currentIndex) != null; // si lista nu e goala
            }

            @Override
            public T next() {
                
                return list.get(currentIndex++);
            }

            @Override
            public void remove() {
                Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
            }
         
        };
        
        return iterator;
    }

    
   void printValues() {
       list.forEach(item -> System.out.println(item));
   }
}





public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please insert the number of elements: ");
        int dim = sc.nextInt();
        int counter = 0;
        
        
        // your list of elements
        NoDuplicateList<Integer> list = new NoDuplicateList<>();
        
        // insert the elements
        
        System.out.println("Please insert your elements : ");
        while(counter < dim) {
            
            try {
                int x = sc.nextInt();
                list.add(x);              
                counter++;   
            } catch (DuplicateElementException e) {
                System.out.println(e.getMessage());
            }
        }
        
        
        
        
        //System.out.println("Print elements using lambda:");
       // list.printValues();
        
        
        System.out.println("Print elements using your iterator()");
        
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}