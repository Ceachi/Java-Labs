package Laborator6.Exercitii_LaboratorPart1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Se dă un fișier cu mai multe numere separate prin spațiu. Citiți de la tastatură un număr x
și apoi afisați din x în x numerele din fișier.
 * @author Ceachi Bogdan
 */
    
public class Ex2 {
    
    public static void main(String[] args) throws IOException  {
        String path = "C:\\Users\\Ceachi Bogdan\\Documents\\NetBeansProjects\\LaboratoareJava\\src\\Laborator6\\Exercitii_LaboratorPart1";
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        File file = new File(path + "\\" + "in2.txt");
        if (!file.exists()) {
          System.out.println(path + " does not exist.");
          return;
        }
        if (!(file.isFile() && file.canRead())) {
          System.out.println(file.getName() + " cannot be read from.");
          return;
        }
        try {
          FileInputStream fis = new FileInputStream(file);
          char current;
          while (fis.available() > 0) {
            current = (char) fis.read();
            if(current != ' ')
                System.out.println(current);
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
    } 
}
