/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers
 */
public class Set{
    
    public int numBlocks, hitS;
    private int lru = 0;
    protected boolean[] LRU;
    public Block block[];
    public int setNumber;
    
    public Set(int numBlocks, int n, int num) {
        this.setNumber = num;
        this.numBlocks=numBlocks;
        this.block = new Block[numBlocks];
            LRU = new boolean[n];
            for(int i=0;i<n;i++){
                if(i==0){
                    LRU[0]=true;
                }
                else{
                    LRU[i]=false;
                }
            }
            
            for (int x = 0; x < numBlocks; x++) {
                block[x]=new Block(x);//Creates the Block Objects
            }
//            
//            System.out.println("Set " + setNumber + " has " + block.length + " blocks");
  }
    
    void searchBlocksInSet(int index, long tag, int n) {
        boolean hitB=false;
        int i=0;
        int finali=0;
        int temp=Integer.MAX_VALUE;
        
    if(n==1){//Direct Mapped
               if(block[index].compareTag(tag)==true){
                    block[index].bHitCount();
                }
                else{
                   writeBlock(index, tag, n);
                }
    }
  //==============================================n-WAY=========================      
        else{
            //Check every block for a hit, if you get one, then incriment the hit counter.
            for(i=0;i<numBlocks;i++){//search every block
                if(block[i].compareTag(tag)==true){//if the blockTag is equal to the current tag
                    hitB=true;//set the hit marker to true
                     block[i].bHitCount();//incriment the set's hit counter
                    finali = i;//save the loop counter
                    break;//end the loop
                }
             }//there were no hits
 //=============================================================================
            for(int j=0;j<numBlocks;j++){//search every block
                if(hitB==true){//if you had a hit earlier
                        if(finali==j){//and it was in the LRU
                            block[j].blockLru=+n;//update the LRU in the current block
                        }
                        else{
                            block[i].blockLru=+n;//update whatever block was hit
                        }
                if(block[j].blockLru < temp){//check the block LRU's counter with the temp variable
                    temp=block[j].blockLru;//if the LRU< temp make temp equal to the smallest element in the block
                    
                    }
                }
                if(hitB==false){
                    writeBlock(j,tag,n);
                    block[j].blockLru=+n;
                }
                
            }
            
       i=finali;
            
    } 
    }
    
    void writeBlock(int blockNumber, long tag, int n) {
        block[blockNumber].setTag(tag);
        
    }
    
    int sHitCount() {
        for (int i = 0; i < numBlocks; i++) {
            hitS = hitS + block[i].bHitAdd();
        }
        return hitS;
    }
         
 
    
}




