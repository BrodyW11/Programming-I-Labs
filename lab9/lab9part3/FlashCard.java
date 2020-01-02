
public class FlashCard {
    
    String question,answer;
    
	//constructor that takes 2 strings, question and answer
    public FlashCard(String question, String answer){
        this.question = question;
        this.answer = answer;
    }
    
	
	//get method
    public String getQuestion(){
        return this.question;
    }
    
	
	//get method
    public String getAnswer(){
        return this.answer;
    }
}
