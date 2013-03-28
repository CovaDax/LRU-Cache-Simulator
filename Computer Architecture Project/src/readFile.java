/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author covadax
 */
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



public class readFile {
    public readFile(){
    }
    
    public String[] openFile() throws IOException {
        String file="src\\trace";
        String line = null;
        List<String> lines = new ArrayList<String>();
        
        try{
            FileReader fr = new FileReader(file);
            try (BufferedReader br = new BufferedReader(fr)) {
                while((line=br.readLine()) != null){
                lines.add(line);
                System.out.println(line);
              
                }
            }
        }
        
        catch(FileNotFoundException ex){
            System.out.println("Unable to open file '" + file + "'");
        }
        catch(IOException ex){
            System.out.println("Error reading file '" + file + "'");
        }
        
       return lines.toArray(new String[lines.size()]);

    }
    
}
