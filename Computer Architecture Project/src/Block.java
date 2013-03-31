/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers, Andrew Gari
 */
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Block{
    
    public long blockTag;
    public boolean blockValid;
    public int blockLru;
    
    
    public Block() {
        System.out.println("Block Constructor Made");
    }
    
    
    
    
    void compareTag(long tag) {
        System.out.println("Function in Block Called.");
        if(tag==blockTag){
            System.out.println("HIT MOTHERFUCKER!!!");
        }
        
        blockLru+=blockLru;
    }
    
    void setTag(long tag) {
        blockTag=tag;
    }
    
}
