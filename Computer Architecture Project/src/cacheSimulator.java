/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers, Andrew Gari
 */

import java.io.*;
import java.util.Scanner;


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
        String File = null;
        System.out.println("Please enter the path to your trace file:\t");
        Scanner in = new Scanner(System.in);
        
       String dataFile[];
       dataFile = f.openFile();
        
     /*
        System.out.println("Miss rates for a 8-Byte block");
        System.out.println("\t1024, 2048, 4096, 8192");
        System.out.println("direct: <value, value, value, value>");
        System.out.println("2-way:  <value, value, value, value>");
        System.out.println("4-way:  <value, value, value, value>");
        System.out.println("8-way:  <value, value, value, value>");
        
        System.out.println("");
        
        System.out.println("Miss rates for a 16-Byte block");
        System.out.println("\t1024, 2048, 4096, 8192");
        System.out.println("direct: <value, value, value, value>");
        System.out.println("2-way:  <value, value, value, value>");
        System.out.println("4-way:  <value, value, value, value>");
        System.out.println("8-way:  <value, value, value, value>");
       
        System.out.println("");
        
        System.out.println("Miss rates for a 32-Byte block");
        System.out.println("\t1024, 2048, 4096, 8192");
        System.out.println("direct: <value, value, value, value>");
        System.out.println("2-way:  <value, value, value, value>");
        System.out.println("4-way:  <value, value, value, value>");
        System.out.println("8-way:  <value, value, value, value>");
       */
       
        
        
        
    }


}


