/**
 *
 * @author Andrew Meyers,Andrew Gari
 * 
 *  Cache.java Class
 */


//import java.util.*;

public class Cache {
    
        public int blockSize, numSets, numBlocks
                ,N,offsetWidth,indexWidth,tagWidth, hitC, memC;
        public double hitRatio;
        public Set set[];
        //int[] setsInCache = new int[numSets];
    
    public Cache(int cache, int block, int N) {
        blockSize = block;
        this.N = N;
        numBlocks = cache/block; 
        offsetWidth = (int)log2((double)blockSize);

        if(N==1){
            indexWidth = log2((double)numBlocks);
            numSets=1;
        }
        else{
           
            numSets = numBlocks/N;
            indexWidth = log2((double)numSets);
        }    
        tagWidth = 32 - offsetWidth - indexWidth;
        set = new Set[numSets];
        for(int s=0;s<numSets;s++){
                if(N>1){
                    set[s] = new Set(N,N,s);
                }
                else{
                    set[s] = new Set(numBlocks, N,s);
            }
        }

    }
    
    //Checks associativity made by the constructor, then sends in the appropriate index
    public void accessMemory(int index, long tag) {
        memC++;
        if(N>1){
                set[index].searchBlocksInSet(index, tag, N);     
        }
        else{
                set[0].searchBlocksInSet(index,tag,N);
        }
        }
    
    
    //Calculates the Index/Offset
    private static int logb(double a, double b){
        return (int)(Math.log(a)/Math.log(b));
    }
    private static int log2(double a){
       return (int)logb(a,2);
    }
    
    //Extracts the string of bits from the address that represent the TAG
    public long Tag(String address){
        String fileTag=address.substring(0,tagWidth);
        
          // System.out.println("Tag:\t" + fileTag);
        return Long.parseLong(fileTag,2);//returns to main
    }
    //Extracts the string of bits from the address that represent the INDEX
    public int Index(String address){
        String fileIndex = address.substring(tagWidth, tagWidth+indexWidth); 
        
          //  System.out.println("Index:\t" + fileIndex);
        return Integer.parseInt(fileIndex, 2);//returns to main
    }
    
    public double hitRatio(int hitCount, int accessCount){
        double hit=(double)hitCount/(double)accessCount;
        return hit;
    }
    
    //Counts the hitCounter of every set and adds them together, then returns to main
    public int cHitSets() {
        for (int i = 0; i < numSets; i++) {
            hitC = hitC + set[i].sHitCount();
        }
        return hitC;
    }
    //Counts the number of times memory was accessed in every set, then returns to main
    public int cMemSets() {
          return memC;
        }
    
    }