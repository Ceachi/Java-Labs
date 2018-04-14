package Laborator3.Exercitii_Laborator;

public class TSA  extends AngajatUTM{
    String functie;

    public TSA(String nume, float salariuBaza, String functie) {
        super(nume, salariuBaza);
        this.functie = functie;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    @Override
    public String toString() {
        return "TSA{" +
                "nume='" + nume + '\'' +
                ", functie='" + functie + '\'' +
                ", salariuBaza=" + salariuBaza +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        if(o instanceof AngajatUTM) {
            TSA tsa = (TSA) o;
            return this.functie.equals(tsa.functie);
        }
        return false;
    }

    @Override
    public float salariu(){
        return 0.15f * super.getSalariuBaza() + super.getSalariuBaza();
    }
}
