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
public class ContEuro extends ContBancar implements SumaTotala{
    private float dobanda;
    ContEuro(String numar, float suma){
        super(numar, suma);
        if(super.getSuma() > 500)
            dobanda = 0.3f;
        else
            dobanda = 0f;
    }

    public float getDobanda() {
        return dobanda;
    }   

    @Override
    public float getSumaTotala() {
        return 4.5f * super.getSuma();
    }

    public String getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }
    
    
}