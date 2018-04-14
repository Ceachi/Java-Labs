package Laborator8.Exercitii_LaboratorPart1_Colectii;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Dandu-se un fisier, sa se afiseze frecventa cuvintelor care apar in el.
 * De exemplu, daca fisierul contine "Ana are mere", se va afisa:
 * Ana - 1
 * are - 1
 * mere - 1
 * 
 * Observatie: Nu uitati de FileNotFoundException
 * 
 * 
 * @author CeachiBogdan
 */
public class Ex1 {
    
    public static void main(String[] args) {
        
        
        try {
            
             Scanner fin=new Scanner(new File("lab8Colectii.txt"));
             
             Map<String, Integer> map = new HashMap<>();
             
            while(fin.hasNextLine()) {
                String  linie = fin.nextLine();
                String cuvinte[]=linie.split("[., \n!]+");
               
                 for(int i=0;i<cuvinte.length;i++) {
                    if(map.containsKey(cuvinte[i])) {
                        map.put(cuvinte[i], map.get(cuvinte[i]) + 1);
                        
                    }else {
                        map.put(cuvinte[i], 1);
                        
                    }
                 }
            }
            
            for(Map.Entry<String, Integer> obj : map.entrySet()) {
                System.out.println(obj.getKey() + " - " + obj.getValue());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        
        
    }
    
}
