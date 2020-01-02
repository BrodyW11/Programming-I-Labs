import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;




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
	//option for user to save their results
    public void play(){
        Toolbox toolbox = new Toolbox();
        
        System.out.print("Do you want to save your results (Y/N)? ");
        boolean doSave = toolbox.readStringFromCmd().equalsIgnoreCase("Y");
        PrintStream printStream = null;
        
		//writes the question, the answer the user gave and whether the answer is right or wrong separated by commas on a line, into another file called "save.txt"
		if(doSave){
            try{
				printStream = new PrintStream(new FileOutputStream("save.txt")); 
            }catch(Exception e){
                System.out.println("There is an error creating save file.");
            }
        }
        
        float correctAnswerCount = 0;
        float totalQuestionsAnswered = 0;
        
		
		
		
		//displays questions from quiz and takes user' input as answer
        for(FlashCard flashCard : flashCards){
            System.out.print(flashCard.getQuestion());
            String readAnswer = toolbox.readStringFromCmd();
            
            
			//if method that tells user whether their answer is correct, else their answer is wrong
            //tallies the user's score
			boolean answerCorrect = false;
           if(readAnswer.trim().equalsIgnoreCase(flashCard.getAnswer().trim())){
                System.out.println("Answer is right!");
                answerCorrect = true;
                correctAnswerCount++;
            }else{
                System.out.println("Answer is Wrong! Correct answer is : "+flashCard.getAnswer());
            }
            totalQuestionsAnswered++;
            
            if(doSave){
                printStream.println(flashCard.getQuestion().replace(",","")+","+readAnswer+","+((answerCorrect)?"Correct":"Wrong"));
            }
        }
        
		
		//prints users score and percentage of questions they got correct
        if(doSave){
           
            printStream.print(""+(int)correctAnswerCount+",");
            printStream.print(""+(int)totalQuestionsAnswered+",");
            printStream.print(""+	((correctAnswerCount*1.0)/(totalQuestionsAnswered*1.0))*100.0);
			printStream.println("");
        }
		printStream.close();
    }
    
	
	//save method
    public void save(){
    
    }
}
