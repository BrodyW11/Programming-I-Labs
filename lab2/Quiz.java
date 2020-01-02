
package brod;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    ArrayList<FlashCard> flashCards;
    FlashCardReader flashCardReader;
    
    public Quiz(){
        this.flashCardReader = new FlashCardReader("data.txt");
        this.flashCards = flashCardReader.getFlashCards();
        
        this.play();
    }
    
    public void play(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Do you want to save your results (Y/N)? ");
        boolean doSave = sc.nextLine().toUpperCase().equals("Y");
        PrintStream printStream = null;
        if(doSave){
            try{
                printStream = new PrintStream(new FileOutputStream("save.txt", true)); 
            }catch(Exception e){
                System.out.println("There is an error creating save file.");
            }
        }
        
        float correctAnswerCount = 0;
        float totalQuestionsAnswered = 0;
        
        for(FlashCard flashCard : flashCards){
            System.out.print(flashCard.getQuestion());
            String readAnswer = sc.nextLine();
            
            if(readAnswer.trim().equals("")){
                continue;
            }
            
            boolean answerCorrect = false;
            if(readAnswer.toUpperCase().equals(flashCard.getAnswer().toUpperCase())){
                System.out.println("Answer is Correct!");
                answerCorrect = true;
                correctAnswerCount++;
            }else{
                System.out.println("Answer is Wrong! Correct answer is : "+flashCard.getAnswer());
            }
            totalQuestionsAnswered++;
            
            if(doSave){
                printStream.println(flashCard.getQuestion()+","+readAnswer+","+((answerCorrect)?"Correct":"Wrong"));
            }
        }
        
        if(doSave){
            printStream.println("");
            printStream.println("Score : "+correctAnswerCount);
            printStream.println("Questions answered : "+totalQuestionsAnswered);
            printStream.println("Correct answer percentage : "+correctAnswerCount/totalQuestionsAnswered);
        }
    }
    
    public void save(){
    
    }
}
