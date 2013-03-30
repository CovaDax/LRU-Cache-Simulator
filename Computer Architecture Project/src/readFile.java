/*
 * The class takes the path from the user in the main method and 
 * converts the addresses to binary.
 */

/**
 *
 * @author Andrew Gari
 */
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



public class readFile {
    public readFile(){
    }
    
    public String[] openFile(String file) throws IOException {
        //String file="src//trace";
        String line = null;
        Long Address = null;
        List<String> lines = new ArrayList<String>();
        String zero = null;
        try{
            FileReader fr = new FileReader(file);
            try (BufferedReader br = new BufferedReader(fr)) {
                while((line=br.readLine()) != null){
                    Address = Long.parseLong(line,16);
                    line = Long.toBinaryString(Address);
                    if(line.length()<32){
                        zero="0";
                        for(int p = 32-line.length()-1; p>0;p--){
                            zero = zero + "0";
                        }
                        line = zero+line;
                    }
                lines.add(line);
                }
                
            }
        }
        
        catch(FileNotFoundException ex){
            System.out.println("Unable to open file '" + file + "'");
        }
        catch(IOException ex){
            System.out.println("Error reading file '" + file + "'");
        }
        
       return lines.toArray(new String[lines.size()]);

    }

    
}
