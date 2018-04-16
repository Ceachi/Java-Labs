package Laborator6.Exercitii_PoliPart1;

import java.io.*;
import java.util.Scanner;

/**
 *Sa se scrie un program pentru afisarea pe ecran a liniilor dintr-un fisier text, fiecare linie
precedata de numarul liniei ¸si de un spatiu. Se va folosi clasa LineNumberReader. Numele fisierului se
dafla in linia de comanda.
 * @author Ceachi Bogdan
 */
public class Ex1 {
    
    
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Ceachi Bogdan\\Documents\\NetBeansProjects\\LaboratoareJava\\src\\Laborator6\\Exercitii_PoliPart1" +
                           "\\ex1.txt";  
        FileReader file = null;
        LineNumberReader line = null;
        try {
            file = new FileReader(fileName);
            line = new LineNumberReader(file);
            String str;
            
            while((str = line.readLine()) != null) {
                System.out.print("(" + line.getLineNumber() + ") ");
                System.out.println(str);
            }
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(file != null) {
                file.close();
            }
        }
    }
    
}
