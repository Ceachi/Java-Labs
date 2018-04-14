package Laborator3.Exercitii_Laborator;
import java.util.Scanner;

/**
 * Exercitiul 3 din Aplicatii Laborator
 * 3.	In pachetul Clase definiți următoarea ierarhie de clase:
-	Clasa AngajatUTM, care modelează concepul de angajat UTM, cu datele membre: nume, salariuBaza, universitate cu valoarea UTM.  Încapsulați în clasă metode constructor, metode de tip setter și getter, redefinirea metodelor toString() si equals() din clasa Object, precum și o metodă care calculează salariul (acesta are o formulă de calcul diferită pentru diferite categorii de angajați UTM )
-	Clasa CadruDidactic care extinde clasa AngajatUTM. Fiecare cadru didactic predă un curs, iar pentru a calcula salariul acestuia se cunosc numărul de ore 
* alocate, precum și tariful lunar. Încapsulați în clasă metode constructor, metode de tip setter și getter, redefinirea metodelor toString() și equals(), precum și o metodă care calculează salariul.
-	Clasa TSA care extinde clasa AngajatUTM. Fiecare anagajat de tip TSA are o funcție (economist, portar etc.), iar pentru calculul salariului se cunoaște sporul alocat acestuia , i.e.  15% din salariu de bază.
Definiți în pachetul Instante definiți o sursă Java care conține un tablou de angajați ai Universității Titu Maiorescu. În funcție de o opțiune intodusă de utlizator, tabloul conține obiecte de tip CadruDidactic sau TSA. Afișați pe ecran datele fiecărui Angajat, împreună cu salariul acestuia. 

* 
 * @author Ceachi Bogdan
 */
public class Ex3 {
    public static void main(String[] args) {
        int n, op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ce dimensiune doriti sa aiba tabloul?");
        n = sc.nextInt();
        System.out.println("Ce tip de obiecte doriti? Cadru didactic = 1 / TSA = 2");
        op = sc.nextInt();
        
        AngajatUTM angajati [] = new AngajatUTM[n];
        
        switch (op){
            case 1:
                //CadruDidactic[] tablouCD = new CadruDidactic[n];
                for(int i=0;i<n;i++)
                {
                    System.out.println( "nume, salariuBaza, ore, tarif");
                    String nume = sc.next();
                    float salariu = sc.nextFloat();
                    int ore = sc.nextInt();
                    float tarif = sc.nextFloat();
                   // tablouCD[i] = new CadruDidactic(nume, salariu, ore, tarif);
                   angajati[i] = new CadruDidactic(nume, salariu, ore, tarif);
                }
                for(int i=0;i<n;i++)
                {
                   // System.out.println(tablouCD[i].toString() + ". Are salariu: " + tablouCD[i].salariu());
                    System.out.println(angajati[i].toString() + ". Are salariu: " + angajati[i].salariu());
                }
                break;
            case 2:
               // TSA[] tablouTSA = new TSA[n];
                for(int i=0;i<n;i++)
                {
                    System.out.println( "nume, salariuBaza, functie");
                    String nume = sc.next();
                    float salariu = sc.nextFloat();
                    String functie = sc.next();
                    //tablouTSA[i] = new TSA(nume, salariu, functie);
                    angajati[i] = new TSA(nume, salariu, functie);
                    
                }
                for(int i=0;i<n;i++)
                {
                    //System.out.println(tablouTSA[i].toString() + ". Are salariu: " + tablouTSA[i].salariu());
                    System.out.println(angajati[i].toString() + ". Are salariu: " + angajati[i].salariu());
                }
                break;
            default:
                System.out.println("Opt invalida");
        }
    }
}
