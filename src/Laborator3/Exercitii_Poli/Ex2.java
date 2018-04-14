/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator3.Exercitii_Poli;

/**
 * Sa se defineasca o clasa "Stiva" pentru stive de numere intregi,
 * reprezentate prin vectori intrinseci.
 * Datele clasei:
 * - Un vector de intregi
 * - indicele elementului din varful stivei (ultimul introdus)
 * Metodele clasei : 
 * - Constructor fara parametrii (dimensiunea implicita a stivei = 100)
 * - Constructor cu parametru dimensiunea stivei
 * - void push(int) ; pune intreg dat pe stiva
 * - int pop() : scoate elementul din varful stivei
 * - boolean isEmpty() : verifica daca stiva este goala
 * Considerati cazurile de stiva plina (la push) si stiva goala (la pop). 
 * Metoda statica main pentru verificarea operatiilor cu o stiva va fi inclusa
 * in clasa Stiva
 *
 * @author Ceachi Bogdan
 */
public class Ex2 {
    
   public static void main(String args[]) {
       Stack stack = new Stack(5);
       stack.push(3);
       stack.push(4);
       stack.push(6);
       stack.push(7);
       stack.push(8);
       
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
       stack.pop();
       
       stack.toString();
       //stack.push(9);

       
       
   }
    
}
