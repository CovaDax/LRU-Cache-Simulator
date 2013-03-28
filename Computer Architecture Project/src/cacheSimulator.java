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
    
    
    public static void main(String[] args) throws IOException {
        
        // Welcome Message
       
        System.out.println("--------------------");
        System.out.println("|    Welcome To    |");
        System.out.println("|  Cache Simulator |");
        System.out.println("--------------------");
 
        // Creating Objects
        
        Cache c = new Cache(); 
        Set s = new Set();
        Block b = new Block();
        readFile f = new readFile();
        
        
        String dataFile[];
        dataFile = f.openFile();
       
        
        
        
     
        
    }


}


