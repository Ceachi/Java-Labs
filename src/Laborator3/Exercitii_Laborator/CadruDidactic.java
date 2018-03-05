package Laborator3.Exercitii_Laborator;

public class CadruDidactic extends AngajatUTM{
    int ore;
    float tarif;

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
        if (this == o) return true;
        if (!(o instanceof CadruDidactic)) return false;
        if (!super.equals(o)) return false;

        CadruDidactic that = (CadruDidactic) o;

        if (getOre() != that.getOre()) return false;
        return Float.compare(that.getTarif(), getTarif()) == 0;
    }

    public float salariu(){
        return super.getSalariuBaza()+ore*tarif;
    }
}
