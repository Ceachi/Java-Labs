/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DSA.Stacks;

/**
 *
 * @author Ceachi Bogdan
 */
public class MainClass {
    
    public static void main(String args[]) {
        
    /*
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

*/
    
    Person p1 = new Person("mihai", 3);
    Person p2 = new Person("george", 4);
    Person p3 = new Person("Ionel", 2);
    Person p4 = new Person("Razvan", 3);
    Person p5 = new Person("gogu", 3);
    
    PersonStack stack = new PersonStack(4);
    stack.push(p1);
    stack.push(p2);
    stack.push(p3);
    
        System.out.println(stack.pop());
   // stack.toString();
      
    
    
    
    }
}
