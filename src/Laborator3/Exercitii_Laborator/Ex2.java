/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator3.Exercitii_Laborator;

import java.util.Scanner;

/**
 *
 * @author Ceachi Bogdan
 */
public class Ex2 {
    
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);       
        int n = read.nextInt();
        
        int tablou[][] = new int[n][];
         
        for (int i = 0; i < n; i++) {
            tablou[i] = new int[i+1];
            int coloana = 0;
            for (int j = 1; j <= tablou[i].length; j++) {
                tablou[i][coloana] = j;
                coloana++;
            }
        }
        
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tablou[i].length; j++) {
                System.out.print(tablou[i][j] + " ");
            }
            System.out.println("");
        }
        
       

    }
}
