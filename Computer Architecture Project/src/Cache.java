
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
    public int offsetWidth;
    public int indexWidth; 
    public int tagWidth;
    public Set set[];
    
    int[] setsInCache = new int[numSets];
    
    public Cache(int cache, int block, int N) {
        cacheSize = cache;
        blockSize = block;
        Associativity = N;
        numBlocks = cache/block;
        numSets = numBlocks/N;
        offsetWidth = (int)log2((double)blockSize);
        if(N==1){
            indexWidth = (int)log2((double)numBlocks);
        }
        else{
            indexWidth = (int)log2((double)numSets);
        }    
        tagWidth = 32 - offsetWidth - indexWidth;
        }
    public void accessMemory() {
        
        
        System.out.println("method to access memory");
        
    } 



    private static int logb(double a, double b){
        //System.out.println("From Logb:\t" + a + ",\t" + b);
        return (int)(Math.log(a)/Math.log(b));
    }
    
    private static double log2(double a){
        //System.out.println("From Log2:\t" + a);
       return logb(a,2);
    }
    
    
}