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
    
    private int numBlocks=0;
    double hitS=0;
    protected List<Block> blocks = new ArrayList<Block>();
    
    public Set(int numBlocks, int n, int num) {
        this.numBlocks=numBlocks;
            for (int x=0; x<numBlocks; x++) {
                blocks.add(new Block(x));
            }
  }
    
    void searchBlocksInSet(int blockNumber, long tag, int numSets) {
            boolean hitB=false;
            if(numSets>1){
                int blockHit=0;
                for(int i=0;i<numBlocks;i++){
                    if(blocks.get(i).compareTag(tag)==true){
//                        blocks.get(i).hitAdd();
                        hitS++;
                        hitB=true;
                        blockHit=i;
                        break;
                    }
                }
                nWay(blockHit,tag,hitB);
            }
  
            else{
                if(blocks.get(blockNumber).compareTag(tag)==true){
                    hitS++;
                }
                blocks.get(blockNumber).setTag(tag);
            }
    }
 
    
    void nWay(int Hitindex, long tag, boolean hit){
        Block tempBlock;
        if(hit==true){
                tempBlock=blocks.remove(Hitindex);
                blocks.add(tempBlock);
        }
        else{
            blocks.get(0).setTag(tag);
            tempBlock=blocks.remove(0);
            blocks.add(tempBlock);
        }
    }
    
    double sHitCount() {
        return hitS;
    }
}




