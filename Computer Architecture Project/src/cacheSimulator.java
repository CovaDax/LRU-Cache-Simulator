/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers, Andrew Gari
 */

import java.io.*;


public class cacheSimulator {
    
    /*Creates two variables to determine how many times the cache has been
     * accessed so far, and one for how many hits you have so far.
     */
    private int accessCount;
    private int hitCount;
    
    
    public static void main(String[] args) {
        
        cacheSimulator CS = new cacheSimulator();
        Cache c = new Cache(); //create a class object
        
        try {
        FileInputStream FS = new FileInputStream("trace");
        InputStreamReader IS = new InputStreamReader(FS);
        }
       
        catch(Exception e) {
                    
        }
        
        System.out.println("\t" + " " + c.getCachesize() + "-Bytes.");
        System.out.println("\t" + " " +  c.getBlocksize() + "-Bytes.");
        int Associativity = c.getAssociativity();
        if (Associativity==0){
            System.out.println("\t" + " Direct Mapped Cache");
        }
        else if (Associativity==2){
            System.out.println("\t" + "Two-Way Associativity");
        }
        else if (Associativity==4){
            System.out.println("\t" + "Four-Way Associativity");
        }
        else if (Associativity==8){
            System.out.println("\t" + "Eight-Way Associativity");
        }
        else{
            Associativity=c.getAssociativity();
        }
        
            
  
        
        
    }
    
}
