/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers
 */

import java.io.*;
import java.util.*;


public class cacheSimulator {
    
    private int accessCount;
    private int hitCount;
    
    public cacheSimulator() {
        
        
    }
    
    
    public static void main(String[] args) {
        
        cacheSimulator CS = new cacheSimulator();
        Cache c = new Cache();
        
        System.out.println("Test");
        
        try {
        
        FileInputStream FS = new FileInputStream("trace");
        InputStreamReader IS = new InputStreamReader(FS);
        
        
        }
        
        catch(Exception e) {
            
            
        }
        
        System.out.println("\t" + " " +  c.getBlocksize());
  
        
        
    }
    
}
