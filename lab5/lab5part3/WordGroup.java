import java.util.HashMap;
import java.util.HashSet;

public class WordGroup{
	
	private String words;
	
	public WordGroup(String lower){
		this.words = new String();
		this.words = lower.toLowerCase();
	}
	
	public String[] getWordArray(){
		String[] wordarray = this.words.split("\\s+");
		return wordarray;
	}

	public HashSet<String> getWordSet(WordGroup wordgroup){
		HashSet<String> hashset = new HashSet<String>();
		String[] split1 = this.getWordArray();
		String[] split2 = wordgroup.getWordArray();
		
		for(int j=0; j<split1.length; j++){
			hashset.add(split1[j]);
		}
		
		for(int i=0; i<split2.length; i++);{
			hashset.add(split2[i]);
		}
		return hashset;
		
	}	

	 
	 public HashMap<String, Integer> getWordCounts(){
		 
		 HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		 String[] split = this.getWordArray();
		 
		 for(int i=0;i<split.length;i++){
			 if(hashmap.containsKey(split[i])){
				 
				 int value=0;
				 value = hashmap.get(split[i]));
				 hashmap.put(split[i], value+1);
			 }
			 
			 else{
				 hashmap.put(split[i], 1);
			 }
		 }

           return hashmap;
      
	 }

}	 
				 
