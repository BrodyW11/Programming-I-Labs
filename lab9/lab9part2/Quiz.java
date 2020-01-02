import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Quiz {
	
	//main method that makes Quiz a new object
	 public static void main(String[] args) {

            Quiz quiz = new Quiz("Questions.txt");
        }

	
    ArrayList<FlashCard> flashCards;
    FlashCardReader flashCardReader;
    
	
	//constructor to create and fill the ArrayList with FlashCards
	//call to play
    public Quiz(String filename){
        this.flashCardReader = new FlashCardReader(filename);
        this.flashCards = flashCardReader.getFlashCards();
        
        this.play();
    }
    
	
	//method that shows user question , awaits for the user's input and tells them whether they are right or wrong
    public void play(){
        Toolbox toolbox = new Toolbox();
		
		
        
       
        //displays questions from quiz and takes user' input as answer
        for(FlashCard flashCard : flashCards){
            System.out.print(flashCard.getQuestion());
            String readAnswer = toolbox.readStringFromCmd();
           
			//if method that tells user whether their answer is correct, else their answer is wrong
            boolean answerCorrect = false;
			
            if(readAnswer.trim().equalsIgnoreCase(flashCard.getAnswer().trim())){
                System.out.println("Answer is right!");
                answerCorrect = true;
                
            }else{
                System.out.println(readAnswer + " is wrong! Correct answer is : "+flashCard.getAnswer());
            }
            
        }
		
	}

}	
