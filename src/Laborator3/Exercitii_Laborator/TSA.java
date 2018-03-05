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
        if (this == o) return true;
        if (!(o instanceof TSA)) return false;
        if (!super.equals(o)) return false;

        TSA tsa = (TSA) o;

        return getFunctie() != null ? getFunctie().equals(tsa.getFunctie()) : tsa.getFunctie() == null;
    }

    public float salariu(){
        return 0.15f * super.getSalariuBaza() + super.getSalariuBaza();
    }
}
