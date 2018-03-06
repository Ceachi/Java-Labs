package Laborator4.Exercitii_Poli;

import java.util.Vector;

/**
 * Sa se defineasca o clasa SetAsVector pentru o mul ̧time de obiecte realizata ca vector
 neordonat cu elemente distincte, în doua variante:
 • clasa SetAsVector derivata din clasa Vector (pachetul java.util)
 • clasa SetAsVector con ̧tine un obiect de tip Vector
 Metode din clasa Vector care vor fi implementate în clasa SetAsVector:
 • boolean add(Object)
 • boolean remove(Object)
 • boolean contains(Object)
 • String toString()
 Rezultatul metodelor add  ̧si remove este true daca opera ̧tia ceruta a reusit.
 Sa se scrie un program pentru crearea unei mul ̧timi de  ̧siruri prin adaugari succesive, eliminarea unor
 elemente  ̧si afi ̧sare dupa fiecare opera ̧tie, folosind clasa SetAsVector.
 */
public class Exercitiul_1 {
    public static void main(String[] args) {

        //Pentru SetAsVector_1
        /*Integer a = new Integer(3);
        String s = "hello";
        SetAsVector_1 vector = new SetAsVector_1();
        vector.add(a);
        vector.add(s);
        System.out.println(vector.toString());
        System.out.println(vector.contains(a));
        vector.remove(s);
        System.out.println(vector.toString());*/

        SetAsVector_2 vector = new SetAsVector_2();
        vector.add(new Integer(3));
        vector.add("aa");
        vector.add(new Persoana("Ionel", 5));
        System.out.println(vector.toString());


    }
}

class SetAsVector_1 extends java.util.Vector{
    public boolean add(Object o){
        return super.add(o);
    }
    public boolean remove(Object o){
        return super.remove(o);
    }
    public boolean contains(Object o){
        return super.contains(o);
    }
    public String toString(){
        return super.toString();
    }
}

class SetAsVector_2 {
    private Vector v;
    public SetAsVector_2(){
        v = new Vector();
    }
    public boolean add(Object o){
        return v.add(o);
    }
    public boolean remove(Object o){
        return v.remove(o);
    }
    public boolean contains(Object o){
        return v.contains(o);
    }
    public String toString(){
        return v.toString();
    }
}

class Persoana {
    // https://www.javaworld.com/article/2073619/core-java/java-tostring---considerations.html
    // Daca nu implementam efectiv metoda toString apeleaza toString-ul implicit de la Object care face:
    // getClass().getName() + '@' + Integer.toHexString(hashCode())
    String nume;
    int id;

    public Persoana(String nume, int id) {
        this.nume = nume;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", id=" + id +
                '}';
    }
}

