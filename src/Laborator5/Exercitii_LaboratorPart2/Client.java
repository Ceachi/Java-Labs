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
public class Client {
    String nume;
    String adresa;
    ContBancar conturi[] = new ContBancar[5];

    public Client(String nume, String adresa, ContBancar c[]) {
        this.nume = nume;
        this.adresa = adresa;
        
        for (int i = 0; i < c.length; i++) {
            conturi[i] = c[i];
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ContBancar[] getConturi() {
        return conturi;
    }

    public void setConturi(ContBancar[] conturi) {
        this.conturi = conturi;
    }

    @Override
    public String toString() {
        String afisare = "";
        
        for (ContBancar  i : conturi) {
            afisare += i.toString() + " ";
        }
            
        return "Client{" + "nume=" + nume + ", adresa=" + adresa + ","
                + " conturi=" + afisare + '}';
    }
    
    
    
}
