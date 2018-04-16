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
public class CatFood implements Food {
    String typeFood;
    int calories;

    CatFood(String tipMancare, int calories) {
        this.typeFood = tipMancare;
        this.calories = calories;
    }
    
    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public String getName() {
       return typeFood;
    }
    
}
