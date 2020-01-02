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

}	