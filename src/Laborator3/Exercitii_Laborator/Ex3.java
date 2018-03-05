package Laborator3.Exercitii_Laborator;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n, op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ce dimensiune doriti sa aiba tabloul?");
        n = sc.nextInt();
        System.out.println("Ce tip de obiecte doriti? Cadru didactic = 1 / TSA = 2");
        op = sc.nextInt();
        switch (op){
            case 1:
                CadruDidactic[] tablouCD = new CadruDidactic[n];
                for(int i=0;i<n;i++)
                {
                    System.out.println( "nume, salariuBaza, ore, tarif");
                    String nume = sc.next();
                    float salariu = sc.nextFloat();
                    int ore = sc.nextInt();
                    float tarif = sc.nextFloat();
                    tablouCD[i] = new CadruDidactic(nume, salariu, ore, tarif);
                }
                for(int i=0;i<n;i++)
                {
                    System.out.println(tablouCD[i].toString() + ". Are salariu: " + tablouCD[i].salariu());
                }
                break;
            case 2:
                TSA[] tablouTSA = new TSA[n];
                for(int i=0;i<n;i++)
                {
                    System.out.println( "nume, salariuBaza, functie");
                    String nume = sc.next();
                    float salariu = sc.nextFloat();
                    String functie = sc.next();
                    tablouTSA[i] = new TSA(nume, salariu, functie);
                }
                for(int i=0;i<n;i++)
                {
                    System.out.println(tablouTSA[i].toString() + ". Are salariu: " + tablouTSA[i].salariu());
                }
                break;
            default:
                System.out.println("Opt invalida");
        }
    }
}
