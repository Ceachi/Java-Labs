
package Laborator6.Exercitii_LaboratorPart1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *Se dă un fișier in.txt . Să se sorteze liniile acestuia și să se scrie în fișierul out.txt.
 * @author Ceachi Bogdan
 */
public class Ex1 {
    public static void main(String[] args) throws IOException {  
        
        BufferedWriter bufferWriter = null;
        BufferedReader br = null;
        String path = "C:\\Users\\Ceachi Bogdan\\Documents\\NetBeansProjects\\LaboratoareJava\\src\\Laborator6\\Exercitii_LaboratorPart1";
        
        try {
            List<String> lines = new ArrayList<String>(); // lista in care bagam
            br =  new BufferedReader(new FileReader(path + "\\" + "in2.txt"));
            String line;
            while((line = br.readLine() )!= null) {
                lines.add(line);
            }
            
            Collections.sort(lines);
            for (String i : lines) {
                System.out.println(i);
            }
             br.close();
             bufferWriter = new BufferedWriter(new FileWriter(path + "\\" + "in.txt"));
           //BufferedWriter wr = new BufferedWriter(new FileWriter("out.txt"));
            for (String i : lines) {
              bufferWriter.write(i + "\n");
            }
           
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            br.close();
            bufferWriter.close();
        }
    }
}
