package Laborator3.Exercitii_Laborator;

/**
 *1.	Construiți un proiect Java care cuprinde într-un pachet Surse o clasă 
 * care modelează noțiunea de angajat al firmei BestIT. Clasa conține date membre
 * precum: nume, varsta, firma, salariu. Într-un pachet de aplicații, scrieți o sursă 
 * Java care în care definiți un obiect de tip Angajat. Testați pentru obiectul creat 
 * metodele moștenite din clasa Object. În același pachet de aplicații scrieți o sursă 
 * Java care definește un tablou de obiecte de tip Angajat și afișează în fereastra 
 * System câți angajați sunt într-un stagiu de internship. 
 * Un angajat se consideră a fi într-un stagiu de internship dacă are vârsta mai mica decât 25.
 * 
 * @author Ceachi Bogdan
 */
public class Ex1 {
    
    public static void main(String [] args) {
        Angajat angj = new Angajat("Ionel", 35, "Google", 2.0f);
        Angajat angj2 = new Angajat("Ionel", 35, "Android", 2.0f);
        System.out.println(angj.getClass());
        System.out.println(angj.equals(angj2));
        
        angj = null;
        System.gc(); // calling garbage collector
        System.out.println(angj2.toString());
        
        Angajat [] angajati = new Angajat[2];
        angajati[0] = new Angajat("Ionel", 35, "Google", 2.0f);
        angajati[1] = new Angajat("George", 8, "Google", 2.0f);
        int count = 0;
        for (Angajat a : angajati) {
            if(a.varsta < 25) {
                count++;
            }
        }
        System.gc();  
        angajati[0] = null;
        System.out.println("In stadiul de internship sunt = " + count);
        System.out.println("Number of employees = " + Angajat.numberOfEmployees);
        
    }
    
}
