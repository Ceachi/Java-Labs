/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA.LinkedList;

/**
 *
 * @author Ceachi Bogdan
 */
public class MainClass {
    
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        
        //list.deleteItem(5);
       // list.deleteItem(7);
       list.deleteItem(3);
        list.printList();
    }
    
}
