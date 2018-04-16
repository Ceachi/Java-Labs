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
public class ContBancar {
    String numarCont;
    float suma;

    public ContBancar(String numarCont, float suma) {
        this.numarCont = numarCont;
        this.suma = suma;
    }

    public float getSuma() {
        return suma;
    }
    public void setSuma(float suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "ContBancar{" + "numarCont=" + numarCont + ", suma=" + suma + '}';
    }
    
    
    
}
