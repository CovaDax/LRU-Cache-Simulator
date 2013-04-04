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
        String file;
        Cache cache = null; 
        readFile f = new readFile();
        List<Cache> caches=new ArrayList<Cache>();
        String dataFile[];
        

        System.out.print("Please enter the path to your trace file:\t");
        Scanner in = new Scanner(System.in);
        file = in.nextLine();
        file = "src//trace";
        dataFile = f.openFile(file);
        
        /*================================================
         *                    Calculations     
         *================================================*/
        for(int b=0;b<bSize.length;b++){
            for(int N=0;N<n.length;N++){     
                for(int c=0;c<cSize.length;c++){
                      cache = new Cache(cSize[c], bSize[b], n[N]);  
                        for (int i=0; i<dataFile.length;i++) {
                            long Tag = cache.Tag(dataFile[i]);
                            int Index = cache.Index(dataFile[i]);
                            cache.accessMemory(Index, Tag);
                        }
                    cache.missRatio();
                    caches.add(cache);
                 }
            }
        }
      /* ====================================================================*
       *                        Final Display                                *
       * ====================================================================*/

        System.out.println("\t\t\t\t\tMiss rates for an 8-Byte block");
        System.out.println("\t\t1024,   2048,   4096,   8192");
        System.out.println("Direct Mapped: <" + caches.get(0).miss+ ", " +caches.get(1).miss + ", " +caches.get(2).miss+", " + caches.get(3).miss + ">");
        System.out.println("2-Way:         <" + caches.get(4).miss+ ", " +caches.get(5).miss + ", " +caches.get(6).miss+", " + caches.get(7).miss + ">");
        System.out.println("4-Way:         <" + caches.get(8).miss+ ", " +caches.get(9).miss +", " +caches.get(10).miss+ ", " +caches.get(11).miss + ">");
        System.out.println("8-Way:         <" + caches.get(12).miss+", " +caches.get(13).miss + ", " +caches.get(14).miss+ ", " + caches.get(15).miss + ">\n\n");
        
        System.out.println("\t\t\t\t\tMiss rates for a 16-Byte block");
        System.out.println("\t\t1024,   2048,   4096,   8192");
        System.out.println("Direct Mapped: <" + caches.get(16).miss+", " + caches.get(17).miss + ", " +caches.get(18).miss+ ", " +caches.get(19).miss + ">");
        System.out.println("2-Way:         <" + caches.get(20).miss+ ", " +caches.get(21).miss + ", " +caches.get(22).miss+ ", " +caches.get(23).miss + ">");
        System.out.println("4-Way:         <" + caches.get(24).miss+ ", " +caches.get(25).miss + ", " +caches.get(26).miss+ ", " +caches.get(27).miss + ">");
        System.out.println("8-Way:         <" + caches.get(28).miss+ ", " +caches.get(29).miss + ", " +caches.get(30).miss+ ", " +caches.get(31).miss + ">\n\n");

        System.out.println("\t\t\t\t\tMiss rates for a 32-Byte block");
        System.out.println("\t\t1024,   2048,   4096,   8192");
        System.out.println("Direct Mapped: <" + caches.get(32).miss+ ", " +caches.get(33).miss + ", " +caches.get(34).miss+ ", " +caches.get(35).miss + ">");
        System.out.println("2-Way:         <" + caches.get(36).miss+ ", " +caches.get(37).miss + ", " +caches.get(38).miss+ ", " +caches.get(39).miss + ">");
        System.out.println("4-Way:         <" + caches.get(40).miss+ ", " +caches.get(41).miss + ", " +caches.get(42).miss+ ", " +caches.get(43).miss + ">");
        System.out.println("8-Way:         <" + caches.get(44).miss+ ", " +caches.get(45).miss + ", " +caches.get(46).miss+ ", " +caches.get(47).miss + ">\n\n");

}

}


