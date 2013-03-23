
/**
 *
 * @author Andrew Meyers
 * 
 *  Cache.java Class
 */
public class Cache {
    
    private int cacheSize;
    private int blockSize;
    private int numSets = 0;
    private int setAssociativity;
    
    int[] setsInCache = new int[numSets];
    
    void accessMemory() {
        
        System.out.println("method to access memory");
        
    }
     
    
}
