/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator3.Exercitii_Laborator;

/**
 *
 * @author Ceachi Bogdan
 */
public class Angajat {
    String nume;
    int varsta;
    String firma;
    float salariu;
    static int numberOfEmployees= 0;
   
    public Angajat(String nume, int varsta, String firma, float salariu) {
        this.nume = nume;
        this.varsta = varsta;
        this.firma = firma;
        this.salariu = salariu;
        numberOfEmployees ++;
    }

    @Override
    public String toString() {
        return "Angajat{" + "nume=" + nume + ", varsta=" + varsta + ", firma=" + firma + ", salariu=" + salariu + '}';
    }

    @Override
     public void finalize(){
         numberOfEmployees --;
         System.out.println("object is garbage collected");
     }  
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }
    
    
}
