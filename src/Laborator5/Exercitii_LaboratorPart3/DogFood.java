
package Laborator5.Exercitii_LaboratorPart3;

public class DogFood implements Food {
    String typeFood;
    int calories;

    DogFood(String tipMancare, int calories) {
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
