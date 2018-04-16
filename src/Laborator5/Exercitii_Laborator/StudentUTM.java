
package Laborator5.Exercitii_Laborator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Ceachi Bogdan
 */
public class StudentUTM implements Comparable<StudentUTM> {

    private String nume;
    private String prenume;
    @Override
    
    public int compareTo(StudentUTM student) {
        // < 0  this < o
        // 0  this = 0
        // > 0 this > 0
        int comparare = nume.compareTo(student.nume);
        return (comparare != 0 ? comparare : prenume.compareTo(student.prenume));
    }

    public StudentUTM(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "StudentUTM{" + "nume=" + nume + ", prenume=" + prenume + '}';
    }
    
    public static void main(String[] args) {
        Vector<StudentUTM> v = new Vector<StudentUTM>();
        v.add(new StudentUTM("Ion", "Popescu"));
        v.add( new StudentUTM("Ion", "Ana"));
        v.add(new StudentUTM("Ana", "Ion"));
        Collections.sort(v);
        for (StudentUTM i : v) {
            System.out.println(i);
        }
    }
    
}

