
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
        cacheSize = cache;blockSize = block;Associativity = N;
        numBlocks = cache/block; offsetWidth = (int)log2((double)blockSize);
        if(N==1){
            indexWidth = log2((double)numBlocks);
            numSets=1;
        }
        else{
            numSets = numBlocks/N;
            indexWidth = log2((double)numSets);
        }    
        tagWidth = 32 - offsetWidth - indexWidth;
        set=new Set[numSets];
        for(Set s : set){
            s=new Set(numBlocks);
        }
    }
    
    public void accessMemory() {    
        System.out.println("method to access memory");
        
    } 



    private static int logb(double a, double b){
        return (int)(Math.log(a)/Math.log(b));
    }
    
    private static int log2(double a){
       return (int)logb(a,2);
    }
    
    
}