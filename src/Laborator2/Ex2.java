/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator2;

import java.util.Scanner;

/*
S˘a se scrie o funct¸ie pentru ˆınlocuirea tuturor aparit¸iilor unui ¸sir dat s1 printr-un alt ¸sir
s2 ˆın cadrul unui ¸sir s, folosind numai metode ale clasei String.
*/

/**
 *
 * @author Ceachi Bogdan
 */

public class Ex2 {
    
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
       /* // Inlocuirea tuturor subsirurilr intr-un String
        String s = "Ana are mere, mere , mere";
        String s1 = "mere";
        String s2 = "pere";
        String s4  = s.replace(s1, s2);
        System.out.println(s4);
        */
       
       // Folosind String Buffer
       StringBuffer s = new StringBuffer("Ana are mere, mere , mere");
       String s1 = "mere";
       String s2 = "pere";
          
       int index = 0;
       
       while (index != -1) {
           
           index = s.indexOf(s1, index);
           
           if(index != -1) {
               s.replace(index, index + s1.length(), s2);
               index += s2.length();       
           }
       }
        System.out.println(s);
       
    }
}
