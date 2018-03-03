/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA.Queue;

/**
 *
 * @author Ceachi Bogdan
 */
public class MainClass {
    
    public static void main(String [] args) {
        Queue obj = new Queue(4);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.enqueue(6);
        System.out.println(obj.dequeue());
    } 
}
