/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA.Stacks;

import java.util.EmptyStackException;

/**
 *
 * @author Ceachi Bogdan
 */
public class PersonStack {
    private Person stack[];
    private int top;
    
    public PersonStack() {
        top = -1;
        stack = new Person[50];
    }
    public PersonStack(int size) {
        top = -1;
        stack = new Person[size];
    }
    
    public void push(Person x) {
        if(!isFull()) {
             top++;
            stack[top] = x;
        }else {
             System.out.println("The stack is full");
        }
    }
    
    public Person pop() {
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
            System.out.println(stack[i].toString());
        }
        return stack.toString();
    }
}
