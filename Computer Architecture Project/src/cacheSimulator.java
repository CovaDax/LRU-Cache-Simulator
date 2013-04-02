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

    
    private int cacheSize, blockSize, numSets, numBlocks
                ,N,offsetWidth,indexWidth,tagWidth, index;
    private String fileTag,fileIndex;
    
    
    
    public static void main(String[] args) throws IOException{
        
     
        int accessCount = 0; 
        int hitCount = 0;
        
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
        String file; Long Address;
        Cache cache = null; readFile f = new readFile();
        List<Cache> caches=new ArrayList<Cache>(); String dataFile[];
        

        //System.out.print("Please enter the path to your trace file:\t");
        //Scanner in = new Scanner(System.in);
        //file = in.nextLine();
        file = "src//trace";
        dataFile = f.openFile(file);
        
        /*================================================
         *                    2-Way     
         *================================================*/
        for(int b=0;b<1;b++){
            for(int c=0;c<1;c++){
                for(int N=0;N<1;N++){
                        cache = new Cache(cSize[0], bSize[1], n[1]);
                        System.out.println("For Block size: " + bSize[1] + " and cache size: " + cSize[0]);    
                    for (int i = 0; i < dataFile.length ;i++) {
                        long Tag = cache.Tag(dataFile[i]);
                        int Index = cache.Index(dataFile[i]);
                        cache.accessMemory(Index, Tag);
                    }
                 }
            }
        }
        
        hitCount = cache.cHitSets();
        accessCount = cache.cMemSets();
        System.out.println("From Main HIT C:\t" + hitCount);
        System.out.println("From Main ACCESS C:\t" + accessCount);
        double HR = cache.hitRatio(hitCount, accessCount);
        double miss = (1-HR)*100;
       System.out.println("Miss Count =\t" + (double)Math.round(miss*100)/100 +"%");
            
        
       
//        for(int b=0;b<bSize.length;b++){
//                for(int k=0;k<n.length ; k++){
//                    for(int c=0;c<cSize.length;c++){
//                        for(int d=0;d<dataFile.length;d++){
//                            if(d<1)
//                                System.out.println("Getting Address");
//                                
//                                
//                            System.out.println("Making Cache Constructor");
//                            cache= new Cache(cSize[c], bSize[b],n[k],dataFile[d]);
//                            long Tag = cache.Tag(dataFile[d]);
//                                    System.out.println("Tag for this address is:\t" + Tag);
//                            int Index = cache.Index(dataFile[d]);
//                                    System.out.println("Index for this address is:\t" + Index);
//                        }
//                        caches.add(cache); 
//                }
//            }
//        }
             
       
       
//       int combinations =0;
           //Probe to display the Combinations
//       for (Cache c: caches) {
//           combinations++;
//            System.out.println("\tCombination #" + " "  + combinations);
//            System.out.println("Cahce size: " + c.cacheSize
//                           + "\nBlock Size: " + c.blockSize
//                           + "\nAssociativity:  " + c.N
//                           + "\nNumber of Blocks:   " + c.numBlocks
//                           + "\nNumber of Sets: " + c.numSets
//                           + "\nIndex Width is: " + c.indexWidth
//                           +"\nOffset is: " + c.offsetWidth
//                           +"\nTag Width: " + c.tagWidth
//                           + "\n\n"); 
//            Block block =new Block();
//            for(int s=0;s<c.numSets;s++){
//                for(int b=0;b<c.numBlocks;b++){
//                    for(int d=0; d< dataFile.length; d++){
//                          block.calculateAddress(dataFile[d],c.tagWidth,c.indexWidth, c.offsetWidth);
//                    }
//                }
//            }
//                
//        }
       
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
    
    
        public void calculateAddress(String address){
        fileTag = address.substring(0, tagWidth);
            tag = Long.parseLong(fileTag,2);
        fileIndex = address.substring(tagWidth, tagWidth+indexWidth);
            index = Integer.parseInt(fileIndex,2);
        fileOffset = address.substring(tagWidth+indexWidth, address.length());
//        System.out.println("Address From Block:\t" + address + "  Length:\t" + address.length());
//        System.out.println("Tag From Block:\t" + fileTag + "  Length:\t" + fileTag.length());
//        System.out.println("Index From Block:\t" + fileIndex + "  Length:\t" + fileIndex.length());
//        System.out.println("Offset From Block:\t" + fileOffset + " Length:\t" + fileOffset.length());
//        System.out.println("\n");
    }
        


}


