/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator5.Exercitii_LaboratorPart3;

/**
 *
 * @author Ceachi Bogdan
 */
public class Dog implements Animal {
    
    String name;
    
    Dog(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
     return name;   
    }

    @Override
    public void eat(Food food) {
        System.out.println("Cainele a mancat : " + food.getName());
    }
    
}
