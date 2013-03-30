/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew Meyers, Andrew Gari
 */
import java.lang.String;

public class Block{
    
    public long blockTag;
    public boolean blockValid;
    public int blockLru;
//    private String fileIndex;
//    private String fileOffset;
//    private String fileTag;
    
    
    public Block(int tag) {
        blockValid = false;
        blockTag = tag;
        compareTag(blockTag);
    }
    
//    public void calculateAddress(String address, int tag, int index, int offset){
//        fileTag = address.substring(0, tag);
//        fileIndex = address.substring(tag, tag+index);
//        fileOffset = address.substring(tag+index, address.length());
//        System.out.println("Address From Block:\t" + address + "Length:\t" + address.length());
//        System.out.println("Tag From Block:\t" + fileTag + "Length:\t" + fileTag.length());
//        System.out.println("Index From Block:\t" + fileIndex + "Length:\t" + fileIndex.length());
//        System.out.println("Offset From Block:\t" + fileOffset + "Length:\t" + fileOffset.length());
//        System.out.println("\n");
//    }
    
    
    
    
    void compareTag(long tag) {
     
    }
    
    void setTag() {
        
        
    }
    
}
