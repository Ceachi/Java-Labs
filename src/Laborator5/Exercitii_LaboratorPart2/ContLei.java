/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator5.Exercitii_LaboratorPart2;

public class ContLei extends ContBancar implements SumaTotala{
    
    public ContLei(String numarCont, float suma) {
        super(numarCont, suma);
    }
    public void transfer(ContBancar contDestinatie, float suma) throws EmpyAccountException {
        float diferenta = this.getSuma() - suma;
        if(diferenta < 0) throw new EmpyAccountException();
        if(contDestinatie instanceof ContLei)
        {
            this.setSuma(this.getSuma() - suma);
            contDestinatie.setSuma(contDestinatie.getSuma() + suma);
        }
        else {
            return;     // ar trebui aruncata o exceptie      
        }
    }

    @Override
    public float getSumaTotala() {
        return super.getSuma();
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

class EmpyAccountException extends Exception {
    public EmpyAccountException() {
        super(" EmpyAccountException");
    }  
}

