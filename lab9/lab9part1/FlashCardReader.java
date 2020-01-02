import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Exception;


public class FlashCardReader {
    BufferedReader reader;
    
	//Constructor to provide a filename
    public FlashCardReader(String fileName){
        
		//try-catch code to compile error
		//IO exception 
		try{
        reader = new BufferedReader(new FileReader(fileName));
        }catch(IOException ex){
            System.out.println("There is an exception when initializing the buffered reader.");
        }
    }
    
	//method to return next line of contents of the file
    public String getLine(){
		try{
			return reader.readLine();
		}catch(IOException ex){
			return null;
		}
        
    }
    
	//boolean method to find out whether file is ready to be read
    public boolean fileIsReady(){
		try{
			return reader.ready();
		}catch(Exception e){
			return false;
		}
        
		
    }
    

}
