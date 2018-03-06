/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Singleton;

/**
 *In acest document am prezentat Design Patternul Singleton
 * Singleton1 :  bun dar ineficient
 * Singleton2 : mai eficient, dar nu e bun pt multithreading
 * Singleton3 : eficient pentru multithreading
 * 
 * Un exemplu clar de singleton este : enum
 * @author Ceachi Bogdan
 */
public class Singleton2 {
    public static void main(String args[]) {
        Abc2 obj1 = Abc2.getInstance();
        Abc2 obj2 = Abc2.getInstance();
    }
}

/**
 * Metoda este mai eficienta decat Singleton 1;
 * Problema apare la multithreading:
 *  - daca faci un thread ce apeleaza getInstance()
 *  - si alt thread care apeleaza getInstance() ,
 *  - practic se apeleaza constructorul de 2 ori, solutia este
 * sa facem metoda getInstance synchronized, asa cum o sa vedem in Singleton3
 * @author Ceachi Bogdan
 */
class Abc2 {
    private static Abc2 obj;
    
    private Abc2() {
        System.out.println("Apel construcor");
    }
    public static Abc2 getInstance() {
        if(obj == null) {
            obj = new Abc2();
        }
        
        return obj;
    }
}
