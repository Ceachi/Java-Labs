/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator2;

import java.util.Scanner;

/*

(1 punct) S˘a se scrie un program pentru c˘autarea tuturor aparit¸iilor unui ¸sir dat s1 ca sub¸sir ˆıntr-un alt
¸sir s. Se va afi¸sa num˘arul de aparit¸ii
*/

/**
 * @see Person
 * @author Ceachi Bogdan
 */
public class Ex1 {
    
    
    int a ;
    int b;
    
    
    static int ceva(int i, int j) {
        
        
        int x;
        int y;
                
        return i + j;
    }
    /**
     *
     * @param args the line comment
     */
    public static void main(String [] args) {
        
        Scanner read = new Scanner(System.in);
        
        String s = read.nextLine();
        
        String s2 = read.next();
        
        int count = 0;
        int aux = 0;
        while (aux != -1 ) {
            aux = s.indexOf(s2,aux);
            if(aux != -1) {
                count++;
                aux = aux + s2.length();
            }
        }
        System.out.println(count);       
        
    }
    
}
