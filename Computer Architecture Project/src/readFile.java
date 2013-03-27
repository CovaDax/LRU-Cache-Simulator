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
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.File;


public class readFile {
    public readFile(){
    }
    
    public void openFile() throws IOException{
    File file = new File("trace");
    FileInputStream fis = null;
    BufferedInputStream bis = null;
    DataInputStream dis = null;
    
    try{
        fis = new FileInputStream(file);
        
        bis = new BufferedInputStream(fis);
        dis = new DataInputStream(bis);
        
        while (dis.available()!=0){
            System.out.println(dis.readLine());
        }
        
        fis.close();
        bis.close();
        dis.close();
    }
    catch(FileNotFoundException e){
        e.printStackTrace();
    }
    catch(IOException e){
        e.printStackTrace();
    }
}
