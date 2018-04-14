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
public class Cat implements Animal {
    String name;
    
    Cat(String name) {
        this.name = name;
    }
    
    @Override
    public String getName() {
     return name;   
    }

    @Override
    public void eat(Food food) {
        if(food instanceof DogFood) {
            System.out.println("Pisica nu poate manca mancare de caine");
        }else {
            System.out.println("Pisica a mancat:" + food.getName());
        }
    }
    
}
