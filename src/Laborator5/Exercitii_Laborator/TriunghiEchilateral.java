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
public class TriunghiEchilateral extends FiguraGeometricaPlan {
    double latura;

    @Override
    double arie() {
      return (Math.pow(latura,2) * Math.sqrt(3) ) / 4;
    } 

}
