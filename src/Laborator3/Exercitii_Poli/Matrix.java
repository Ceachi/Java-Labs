/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator3.Exercitii_Poli;

/**
 *
 * @author Ceachi Bogdan
 */
public class Matrix {
    
    
    public static float[][] sum(float [][] a, float[][] b) {
        float suma[][] = new float[a.length][a.length];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        return suma;
    }
    
    public static float[][] multiplication(float[][] a, float[][] b) {
        float m[][] = new float[a.length][a.length];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                m[i][j] = m[i][j] + a[i][j] + b[j][i];
            }
        }
        return m;
    }
    
    public static float[][] pow(float [][] a, int exponent) {
        float [][] c = a;
        while(exponent != 0) {
             c = Matrix.multiplication(c, a);
             exponent--;
        }
        return c;
    }
}
