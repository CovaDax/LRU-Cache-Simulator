
/**
 *
 * @author Andrew Meyers
 * 
 *  Cache.java Class
 */


import java.util.*;

public class Cache {
    
    private int cacheSize;
    private int blockSize;
    private int numSets = 0;
    private int setAssociativity;
    
    int[] setsInCache = new int[numSets];
    
    public Cache() {
        
        
    }
    
    public void accessMemory() {
        
        
        System.out.println("method to access memory");
        
    }
    
    public int getBlocksize() {
       
        System.out.println("\tenter a block size: ");
                
        Scanner in = new Scanner(System.in);
        blockSize = in.nextInt();
        
        
        return blockSize; 
        
    }
     
    
}
