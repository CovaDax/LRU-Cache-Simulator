/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers
 */
public class Set{
    
    private int numBlocks = 0;
    private int[] blocksInSet = new int[numBlocks];
    private int lru;
    
    private int offsetWidth;
    private int indexWidth; 
    private int tagWidth;
    
    public Set(int bSize, int NoSets) {
        
        
        offsetWidth = (int)Math.log(bSize) / (int)Math.log(2);
        indexWidth = (int)Math.log(NoSets) / (int)Math.log(2);
        tagWidth = 32 - offsetWidth - indexWidth; 
        
        
    }
    
    void searchBlocksInSet() {
        
        
    }
    
    void writeBlock() {
        
        
    }
}
