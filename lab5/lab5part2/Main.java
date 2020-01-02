import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main{
	
	
	//create 2 wordgroups initialized with famous quotes
	//make 2 arrays of Strings
	public static void main(String[] args){
		WordGroup wordgroup1 = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup wordgroup2 = new WordGroup("When you play play hard when you work dont play at all");
		String[] str1 = wordgroup1.getWordArray();
		String[] str2 = wordgroup2.getWordArray();
		
		//for loop to loop over the arrays and print out each word from quotes
		for(String ss:str1){
			System.out.println(ss);
		}
		
		for(String ss:str2){
			System.out.println(ss);
		}
		
		
		// loop over the HashSet returned and print the words from it
		HashSet<String> hashset = new HashSet<String>();
		hashset = wordgroup1.getWordSet(wordgroup2);
		for(String ss:hashset){
			System.out.println(ss);
		}

	}

}	