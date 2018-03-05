package Laborator3.Exercitii_Laborator;

public class AngajatUTM {
    String nume;
    float salariuBaza;
    static String universitate = "UTM";

    public AngajatUTM(String nume, float salariuBaza) {
        this.nume = nume;
        this.salariuBaza = salariuBaza;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getSalariuBaza() {
        return salariuBaza;
    }

    public void setSalariuBaza(float salariuBaza) {
        this.salariuBaza = salariuBaza;
    }

    public static String getUniversitate() {
        return universitate;
    }

    public static void setUniversitate(String universitate) {
        AngajatUTM.universitate = universitate;
    }

    @Override
    public String toString() {
        return "AngajatUTM{" +
                "nume='" + nume + '\'' +
                ", salariuBaza=" + salariuBaza +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AngajatUTM)) return false;

        AngajatUTM that = (AngajatUTM) o;

        if (Float.compare(that.getSalariuBaza(), getSalariuBaza()) != 0)
            return false;
        return getNume() != null ? getNume().equals(that.getNume()) : that.getNume() == null;
    }
}
