
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
        FileWriter fileWriter = null;
        try {
            List<String> lines = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new FileReader("in.txt"));
            String line;
            while((line = br.readLine() )!= null) {
                lines.add(line);
            }
            
            Collections.sort(lines);
            
            fileWriter = new FileWriter("out.txt");
            //BufferedWriter wr = new BufferedWriter(new FileWriter("out.txt"));
            for (String i : lines) {
              fileWriter.write(i + "\n");
            }
           
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(IOException e) {
            e.printStackTrace();
        }
        finally {
            fileWriter.close();
            
        }
    }
}
