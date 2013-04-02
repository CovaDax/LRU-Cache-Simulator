/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers
 */
import java.util.ArrayList;
import java.util.List;
public class Set{
    
    public int numBlocks=0;
    protected int hitS;
    protected Block block[];
    protected static int setNumber;
    protected List<Block> blocks = new ArrayList<Block>();
    
    public Set(int numBlocks, int n, int num) {
        this.setNumber = num;
        this.numBlocks=numBlocks;
        this.block = new Block[numBlocks];
            for (int x = 0; x < numBlocks; x++) {
                blocks.add(new Block(x));
            }
  }
    
    void searchBlocksInSet(int index, long tag, int n) {
        boolean hitB=false;
        int blockHit=0;
        Block tempBlock;
        
    if(n==1){//Direct Mapped
               if(block[index].compareTag(tag)==true){
                    hitS++;
                }
                else{
                   block[index].setTag(tag);
                }
    }
  //==============================================n-WAY=========================      
    
    else{
        //Check for a hit
        for(int i=0;i<numBlocks;i++){
            if(blocks.get(i).compareTag(tag)==true){
                hitB=true;
                blockHit=blocks.get(i).identity;
                break;
            }
        }
        
        if(hitB==true){
            hitS++;
            blocks.get(blockHit).setTag(tag);
            tempBlock=blocks.get(blockHit);
            blocks.add(0, tempBlock);
        }
        
        else{
            blocks.get(blocks.size()-1).setTag(tag);
            tempBlock=blocks.remove(blocks.size()-1);
            blocks.add(0, tempBlock);
        }
        
    }
 }
    
    void writeBlock(int blockNumber, long tag, int n) {
        block[blockNumber].setTag(tag);
        
    }
    
    int sHitCount() {
        return hitS;
    }
         
 
    
}




