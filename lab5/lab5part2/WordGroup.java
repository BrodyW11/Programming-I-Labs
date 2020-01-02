import java.util.HashSet;

public class WordGroup{
	
	//instance variable of type String
	private String words;
	
	
	//constructor which takes a string which is converted to lowercase
	public WordGroup(String lower){
		this.words = new String();
		this.words = lower.toLowerCase();
	}
	
	
	//method to return a String, uses split() method to seperate
	public String[] getWordArray(){
		String[] wordarray = this.words.split("\\s+");
		return wordarray;
	}
    
	
	//creates a HashSet<String>
	public HashSet<String> getWordSet(WordGroup wordgroup){
		HashSet<String> hashset = new HashSet<String>();
		String[] split1 = this.getWordArray();
		String[] split2 = wordgroup.getWordArray();
		
		//for loops to put all words from this
		for(int j=0; j<split1.length; j++){
			hashset.add(split1[j]);
		}
		
		for(int i=0; i<split2.length; i++){
			hashset.add(split2[i]);
		}
		
		// returns hashset
		return hashset;
		
	}	

	
	
}	