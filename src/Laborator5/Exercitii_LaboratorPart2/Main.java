/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator5.Exercitii_LaboratorPart2;

/**
 *
 * @author Ceachi Bogdan
 */
public class Main {
    public static void main(String[] args) {
        //String nume, String adresa, ContBancar c[]
        ContBancar c[] = new ContBancar[5];
        //String numarCont, float sum
        c[0] = new ContBancar("1", 10);
        c[1] = new ContBancar("2", 20);
        c[2] = new ContBancar("3", 30);
        c[3] = new ContBancar("4", 50);
        c[4] = new ContBancar("4", 50);
        
        ContBancar c2[] = new ContBancar[5];
        //String numarCont, float sum
        c2[0] = new ContBancar("1x", 10);
        c2[1] = new ContBancar("2x", 20);
        c2[2] = new ContBancar("3x", 30);
        c2[3] = new ContBancar("4x", 50);
        c2[4] = new ContBancar("5x", 50);
                
        
        Banca banca = new Banca();
        banca.add(new Client("Georgel", "Bucuresti", c));
        banca.add(new Client("Ionica", "Nazdravan", c2));
        
       

        banca.afisareClient("Georgel");
    }
    
}
