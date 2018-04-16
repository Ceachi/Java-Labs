
package Laborator5.Exercitii_LaboratorPart2;

import java.util.ArrayList;
import java.util.List;

public class Banca {
    
    List<Client> clienti;
    String codBanca;
    
    Banca() {
        clienti = new ArrayList<Client>();
    }
    
    public void add(Client c) {
        clienti.add(c);
    }
    
    public void afisareClient(String nume) {
        for (Client i : clienti) {
            if(i.nume.equals(nume)) {
                System.out.println(i.getNume() + " " + i.getAdresa());
                System.out.println(i.toString());
            }
        }
    }
}
