/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers
 */
public class Set{
    
    public int numBlocks = 0;
    public int N;
    public int[] blocksInSet = new int[N];
    public int lru;
    public Block blocks[];
    
    public Set(int N, int numBlocks) {
        this.N=N;
        this.numBlocks=numBlocks;
        if(N==1){
            this.N=this.numBlocks;
        }
        
        blocks = new Block[numBlocks];
        
    }
    
    void searchBlocksInSet(int index, int tag) {   
        blocks[index] = new Block(tag);
    }
    
    void writeBlock() {  
    }

    
}




