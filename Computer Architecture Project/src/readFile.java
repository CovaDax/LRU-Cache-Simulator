/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author covadax
 */
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class readFile {
    private String path;
    public readFile(String file_path){
        path=file_path;
        
    }
    
    public String openFile() throws IOException{
       FileReader fr = new FileReader(path); 
       BufferedReader traceReader = new BufferedReader(fr);
        
       int numLines = 5;
       String[] traced = new String[numLines];
       traceReader.readLine();
       
       return path;
    }
}
