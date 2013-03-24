
/**
 *
 * @author Andrew Meyers,Andrew Gari
 * 
 *  Cache.java Class
 */


import java.util.*;

public class Cache {
    
    private int cacheSize;
    private int blockSize;
    private int numSets = 0;
    private int Associativity;
    
    int[] setsInCache = new int[numSets];
    
    public Cache() {
        
        
    }
    
    public void accessMemory() {
        
        
        System.out.println("method to access memory");
        
    }
    
    public int getBlocksize() {
       
        System.out.println("Chooe Block Size: '8-Bytes', '16-Bytes' or '32-Bytes'");
                
        Scanner in = new Scanner(System.in);
        blockSize = in.nextInt();
        return blockSize; 
    }
    
    public int getCachesize() {
        System.out.println("Chooe Cache Size: '1024-Bytes', '2048-Bytes', '4096-Bytes' or '8192-Bytes'");
        Scanner in =  new Scanner(System.in);
        cacheSize = in.nextInt();
        return cacheSize;
    }
     
    public int getAssociativity() {
        System.out.println("Please choose Associativity: 0 for 'Direct Mapped', 2 for 'TwoWay', 4 for 'FourWay' or 8 for 'EightWay'");
        Scanner in = new Scanner(System.in);
        Associativity = in.nextInt();
        return Associativity;
    }
    
}
