/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA.Queue;

import java.util.EmptyStackException;

/**
 *
 * @author Ceachi Bogdan
 */
public class Queue {
    private int [] v;
    private int front;// de unde scoatem
    private int end;// pe unde bagam
    private int total; // nr total de elemente introduse
    
    public Queue(int size) {
        v = new int[size];
    }
    public Queue() {
        v = new int[3];
    }
    
    /**
     * introduce in coada 
     * @param item 
     */
    public void enqueue(int item) {
        System.out.println("am introdus in caoda");
        if(!isFull()) {
            total++;
            v[end] = item;
            end++;
        }
    }
    
    /**
     * scoate din coada 
     * @return 
     */
    public int dequeue() {
        if(total == 0) {
             throw new  EmptyStackException();
        }
        int item = v[front];
        front++;
        total--;
        return item;        
    }
    
    public boolean isFull() {
        if(v.length == total) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        for (int i = end; i < front; i++) {
            System.out.println(v[i]);
        }
        return "";
    }
    
    
}
