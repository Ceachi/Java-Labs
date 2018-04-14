package Laborator3.Exercitii_Laborator;

public class CadruDidactic extends AngajatUTM{
    int ore; // numarul de ore
    float tarif; // tariful lunar alocat

    public CadruDidactic(String nume, float salariuBaza, int ore, float tarif) {
        super(nume, salariuBaza);
        this.ore = ore;
        this.tarif = tarif;
    }

    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public float getTarif() {
        return tarif;
    }

    public void setTarif(float tarif) {
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return "CadruDidactic{" +
                "nume='" + nume + '\'' +
                ", salariuBaza=" + salariuBaza +
                ", ore=" + ore +
                ", tarif=" + tarif +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }   
        if(o instanceof CadruDidactic) {
            CadruDidactic cadruDidactic = (CadruDidactic) o;
            return this.ore == cadruDidactic.ore && this.tarif == cadruDidactic.tarif;
        }
        return false;
    }
    
    @Override
    public float salariu() {
        return super.getSalariuBaza()+ore*tarif;
    }
    
}
