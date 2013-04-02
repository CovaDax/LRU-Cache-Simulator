/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers, Andrew Gari
 */


public class Block{
    
    protected long blockTag=0;
    protected boolean blockValid;
    protected int hitB, memB;
    protected int blockLru=0;
    
    
    public Block(int i) {
        this.blockLru=i;
    }
    
    
    
    
    public boolean compareTag(long tag) {
        if(tag==blockTag){
            return true;
        }
        else{
            return false;
        }
    }
    
    void setTag(long tag) {
        blockTag=tag;
    }
    
    void bHitCount(){
        hitB++;
        //return hitB;
    }
    
   
    
    int bHitAdd(){
        return hitB;
    }
 
            
}   
