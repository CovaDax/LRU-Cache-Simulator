
/**
 *
 * @author Andrew Meyers,Andrew Gari
 * 
 *  Cache.java Class
 */


import java.util.*;

public class Cache {
    
    public int cacheSize;
    public int blockSize;
    public int numSets = 0;
    public int numBlocks = 0;
    public int Associativity;
    public Set set[];
    
    int[] setsInCache = new int[numSets];
    
    public Cache(int cache, int block, int N) {
        cacheSize = cache;
        blockSize = block;
        Associativity = N;
        numBlocks = cache/block;
        numSets = numBlocks/N;
    }

    Cache(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void accessMemory() {
        
        
        System.out.println("method to access memory");
        
    } 
}
