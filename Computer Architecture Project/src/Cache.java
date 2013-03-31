/**
 *
 * @author Andrew Meyers,Andrew Gari
 * 
 *  Cache.java Class
 */


//import java.util.*;

public class Cache {
    
        private int cacheSize, blockSize, numSets, numBlocks
                ,N,offsetWidth,indexWidth,tagWidth, index;
        private long tag;
        private Set set[];
        private String fileTag,fileIndex,fileOffset;
        int[] setsInCache = new int[numSets];
    
    public Cache(int cache, int block, int N,String address) {
        System.out.println("Cache Constructor Made");
        cacheSize = cache;blockSize = block;this.N = N;
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
        calculateAddress(address);
        

        set = new Set[numSets];
            for(int s=0;s<numBlocks;s++){
                System.out.println("Making Set Constructor");
                set[s] = new Set(N, numBlocks);
                if(N==1){
                    //s.blocks[set].compareTag(tag);
                    System.out.println("Made a set element");
                    set[s].searchBlocksInSet(index, tag);
                }
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