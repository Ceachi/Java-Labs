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
public class TestClass {
    public static void main(String[] args) {
        CatFood c1 = new CatFood("Wiscas", 50);
        CatFood c2 = new CatFood("Pastrama", 900);
        DogFood d1 = new DogFood("Shaorma", 20);
        DogFood d2 = new DogFood("Cartofi", 30);
        
        Cat cat = new Cat("Miky");
        Dog dog = new Dog("Azorel");
        
        cat.eat(c1);
        cat.eat(d1);
        
        dog.eat(c2);
        dog.eat(d2);
        
    }
}
