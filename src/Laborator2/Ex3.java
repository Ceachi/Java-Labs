/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator2;

/**
 *
 * @author Ceachi Bogdan
 */
public class Ex3 {
    
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        
        String s = "Ana are mere pere si nuci ";
        String cuvinte[] = new String[s.length()];
        
        
        int index = 0;
        
        int startCuvant = 0;
        int endCuvant = 0;
        int i = 0;
        while(index != -1) {
            
            index = s.indexOf(" ", index);
            System.out.printf("index = %d \n", index);
            if(index != -1) {
                endCuvant = index;
                cuvinte[i] = s.substring(startCuvant, endCuvant);
                System.out.println(cuvinte[i]);
                i++;
                index += 1;
                startCuvant = index;
            }
        }
        System.out.printf("startCuvant = %d si endCuvant = %d", startCuvant, endCuvant);
        if(endCuvant < s.length()) {
            endCuvant = s.length();
          
            cuvinte[i] = s.substring(startCuvant, endCuvant);
            i++;
        }
        
        for (int j = 0; j < i; j++) {
            System.out.println(cuvinte[j]);
        }
    }
    
}
