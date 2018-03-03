/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator3.Exercitii_Poli;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
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
