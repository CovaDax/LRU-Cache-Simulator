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
import java.util.List;
import java.util.Scanner;


public class cacheSimulator {
    
    /* Creates two variables to determine how many times the cache has been
     * accessed so far, and one for how many hits you have so far.
     */
    private int accessCount;
    private int hitCount;
    
    
    public static void main(String[] args) throws IOException{
        
      /* ====================================================================*
       *                        Welcome Message                              *
       * ====================================================================*/
        System.out.println("\t\t\t\t\t ________________________________ ");
        System.out.println("\t\t\t\t\t|                                |");
        System.out.println("\t\t\t\t\t|            Welcome To          |");
        System.out.println("\t\t\t\t\t|         Cache Simulator        |");
        System.out.println("\t\t\t\t\t|________________________________|");
 
        // Creating Objects as arrays for each possible combination of caches
        int cSize[] = {1024,2048,4096,8192};
        int bSize[] = {8,16,32};
        int n[] = {1,2,4,8};
        Cache cache = null;
        List<Cache> caches=new ArrayList<Cache>();
        
        for(int b=0;b<bSize.length;b++){
                for(int k=0;k<n.length ; k++){
                    for(int c=0;c<cSize.length;c++){
                        cache= new Cache(cSize[c], bSize[b],n[k]);
                        caches.add(cache); 
                }
            }
        }
        
        readFile f = new readFile();
        System.out.print("Please enter the path to your trace file:\t");
        Scanner in = new Scanner(System.in);
        String file; Long Address;
        file = in.nextLine();
       
     
       String dataFile[];
       dataFile = f.openFile(file);

//       for(int d =0; d< dataFile.length; d++){
//           if(dataFile[d].length()!=32)
//            System.out.println(dataFile[d].length());
//       }
       
       
       
       
       int combinations =0;
           //Probe to display the Combinations
       for (Cache c: caches) {
           combinations++;
            System.out.println("\tCombination #" + " "  + combinations);
            System.out.println("Cahce size: " + c.cacheSize
                           + "\nBlock Size: " + c.blockSize
                           + "\nAssociativity:  " + c.N
                           + "\nNumber of Blocks:   " + c.numBlocks
                           + "\nNumber of Sets: " + c.numSets
                           + "\nIndex Width is: " + c.indexWidth
                           +"\nOffset is: " + c.offsetWidth
                           +"\nTag Width: " + c.tagWidth
                           + "\n\n"); 
            Block block =new Block();
            for(int s=0;s<c.numSets;s++){
                for(int b=0;b<c.numBlocks;b++){
                    for(int d=0; d< dataFile.length; d++){
                          block.calculateAddress(dataFile[d],c.tagWidth,c.indexWidth, c.offsetWidth);
                    }
                }
            }
                
        }
       
      /* ====================================================================*
       *                        Final Display                                *
       * ====================================================================*/
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


