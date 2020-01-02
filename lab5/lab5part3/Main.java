import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main{
	
	public static void main(String[] args){
		WordGroup wordgroup1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup wordgroup2 = new WordGroup("When you play play hard when you work dont play at all");
		String[] str1 = wordgroup1.getWordArray();
		String[] str2 = wordgroup2.getWordArray();
		
		for(String ss:str1){
			System.out.println(ss);
		}
		
		for(String ss:str2){
			System.out.println(ss);
		}
		
		HashSet<String> hashset = new HashSet<String>();
		hashset = wordgroup1.getWordSet(wordgroup2);
		
		for(String ss;hashset){
			System.out.println(ss);
		}

	}

	
	HashMap<String, Integer> hashmap1 = wordgroup1.getWordCounts();
	HashMap<String, Integer> hashmap2 = wordgroup2.getWordCounts();
	
	for(String key : hashmap1.keySet()){
		
		int value = hashmap1.get(key);
		System.out.println(key + ": " + value);
	}
	
	for (String key : hashmap2.keySet()){
		
		int value = hashmap2.get(key);
		System.out.println(key + ": " + value);
	}
	
	System.out.println("*****************");
	
	
	Iterator<String> iter3 = hashset.iterator();
	while(iter3.hasNext()){
		
		int value1=0;
		int value2=0;
		int value=0;
		String key = iter3.next();
		
		if(hashmap1.containsKey(key)&&hashmap2.containsKey(key)){
			
			value1 = hashmap1.get(key);
			value2 = hashmap.get(key);
			value = value1+valu2;
		}
		
		if(!hashmap1.containsKey(key)){
			
			value = hashmap2.get(key);
		}
		
		if (!hashmap2.containsKey(key));{
			
			value = hashmap1.get(key);
		}

        System.out.println(key + ": " + value);

    }



}	