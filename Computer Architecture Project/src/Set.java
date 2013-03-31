
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers
 */
public class Set{
    
    private int N, numBlocks,lru=0;
    public int[] blocksInSet = new int[N];
    private Block blocks[];
    
    List<Block> blockss=new ArrayList<Block>();
    
    public Set(int N, int numBlocks) {
        System.out.println("Set Constructor Made");
        this.N=N;
        this.numBlocks=numBlocks;
        if(N==1){
            this.N=this.numBlocks;
        }
        
        blocks = new Block[numBlocks];
        //System.out.println("Number of Blocks\t" + this.numBlocks);
        for(int b=0;b<this.numBlocks;b++){
            
            System.out.println("Making Block Constructor");
            Block block = new Block();
            blockss.add(block);
            //blocks[b] = new Block();
        }
        
        
    }
    
    void searchBlocksInSet(int index, long tag) {   
        System.out.println("===========================Function in Set Called");
        blocks[index].compareTag(tag);
        blocks[index].setTag(tag);
        
        
    }
    
    void writeBlock() {  
    }

    
}




