package Laborator6.Exercitii_PoliPart1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

/**
 *Sa se scrie un program pentru afi¸sarea num˘arului de linii ¸si num˘arului de cuvinte dintr-un fi¸sier
text. Cuvintele sunt separate prin spat¸ii albe. Exemplu de utilizare a clasei StringTokenizer (pachetul
java.util) pentru extragere de cuvinte separate prin delimitatori din ¸sirul delim, dintr-un ¸sir sir :
 * @author Ceachi Bogdan
 */
public class Ex2 {
    
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Ceachi Bogdan\\Documents\\NetBeansProjects\\LaboratoareJava\\src\\Laborator6\\Exercitii_PoliPart1" +
                           "\\ex1.txt";  
       
         int nrOfLines = 0;
         int nrOfWords = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            
            String line;
            
            while( (line = br.readLine()) != null) {
                nrOfLines++;
                StringTokenizer st = new StringTokenizer(line, " ");
                while(st.hasMoreTokens()) {
                    String token = st.nextToken();
                    nrOfWords++;
                    
                }
            }
         
            System.out.println("Nr de linii = " + nrOfLines);
            System.out.println("Nr de cuvinte = " + nrOfWords);
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
        }
         
    }
}
