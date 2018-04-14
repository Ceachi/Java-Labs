/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator5.Exercitii_Laborator;

/**
 *
 * @author Ceachi Bogdan
 */
public class Cerc extends FiguraGeometricaPlan {
    private double raza;
    @Override
    double arie() {
       return ConstanteMatematice.PI * Math.pow(raza,2);
    }
    
}
