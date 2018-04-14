   package DSA.Stacks;
// O alta implementare interesanta : https://introcs.cs.princeton.edu/java/43stack/Stack.java.html

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * LIFO = Last IN FIRST OUT
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
public class Stack {
    
    private int stack[];
    private int top;
    
    public Stack() {
        top = -1;
        stack = new int[50];
    }
    public Stack(int size) {
        top = -1;
        stack = new int[size];
    }
    
    public void push(int x) {
        if(!isFull()) {
             top++;
            stack[top] = x;
        }else {
             System.out.println("The stack is full");
        }
    }
    
    public int pop() {
        if(top == -1)
            throw new  EmptyStackException();
        return stack[top--];
    }
    
    
    
    public boolean isFull() {
        return (top ==  stack.length - 1);  
    }

    @Override
    public String toString() {
        if(top == -1) return "Stack is empty";
        for(int  i = 0; i <= top; i++) {
            System.out.println(stack[i]);
        }
        return stack.toString();
    }
    
    
}
