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
public class LinkedList {
    Nod start;
    Nod end;
        
    public void add(int info) {
        Nod newNod = new Nod(info);
        if(start == null) {
            start = newNod;
            end = newNod;
        }else {
            end.next = newNod;
            end = newNod;
        } 
    }
    public void printList() {
        Nod aux = start;
        while(aux != null) {
            System.out.println(aux.info);
            aux = aux.next;
        }
    }
    
    public void deleteItem(int item) {
        Nod aux = start;
        
        if(aux.info == item) {
            start = aux.next;
            aux.next = null;
            return;
        }
        while(aux.next.info != item && aux != null) {
            aux = aux.next;
        }
        if(aux.next.info == item) {
            if(aux.next == end) {
                end = aux.next;
                aux.next = null;
                return;
            }
            Nod y = aux.next;
            aux.next = y.next;
            y.next = null;
        }
        
    }
    
    class Nod { 
       private  int info;
       private Nod next;
        public Nod(int info) {
            this.info = info;
        }
    }
}
