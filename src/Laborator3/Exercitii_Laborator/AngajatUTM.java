package Laborator3.Exercitii_Laborator;

public abstract class AngajatUTM {
    String nume;
    float salariuBaza;
    static String universitate = "UTM"; // Universitatea Titu Maiorescu

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
        if(o == null) {
            return false;
        }
        if(o instanceof AngajatUTM) {
            AngajatUTM angajat = (AngajatUTM) o;
            return this.nume == angajat.nume && this.salariuBaza == angajat.salariuBaza;
        }
        return false;
    }
    
    public abstract float salariu();
}
