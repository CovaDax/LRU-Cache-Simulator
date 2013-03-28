/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers, Andrew Gari
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;


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
 
        // Creating Objects as arrays for each possible combination of caches
        int cache[] = {1024,2048,4096,8192};
        int block[] = {8,16,32};
        int associativity[] = {1,2,4,8};
        Cache obj = new Cache(cache[1],block[1],associativity[1]);
        //Cache caches[]; //Makes an array of class objects to store objects
        
        Vector<Cache> caches=new Vector<Cache>(3);
        Cache tempCache;
        
        for(int c=0;c<cache.length -1;c++){
            for(int b=0;b<block.length -1;b++){
                for(int n=0;n<associativity.length -1; n++){
                     tempCache= new Cache(cache[c], block[b],associativity[n]);
                     caches.add(tempCache);
                    
                }
            }
        }
        
        
        /*
        Iterator i = caches.iterator();
        while (i.hasNext()){
               tempCache=(Cache) i.next();
        System.out.println("Cahce size: " + tempCache.cacheSize
                           + "\nBlock Size: " + tempCache.blockSize
                           + "\nAssociativity:  " + tempCache.Associativity
                           + "\nNumber of Blocks:   " + tempCache.numBlocks
                           + "\nNumber of Sets: " + tempCache.numSets);
        }
        */
        readFile f = new readFile();
        
        System.out.print("Please enter the path to your trace file:\t");
        Scanner in = new Scanner(System.in);
        String file;
        file = in.nextLine();
        
       String dataFile[];
       dataFile = f.openFile(file);
       
       for(int d =0; d< dataFile.length-1; d++){
           System.out.println(dataFile[d]);
       }
        
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


