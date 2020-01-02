public class GuessingGame{
 
	public static void main(String[] args){
		System.out.println("Welcome to Guessing Game");
		Integer numberToGuess;
		Integer guessedNumber;
		Toolbox myToolbox = new Toolbox();
        guessedNumber = myToolbox.readIntegerFromCmd();
		numberToGuess = myToolbox.getRandomInteger(10);
		
		
		if (numberToGuess.equals(guessedNumber)){
		   System.out.println("right");
		}
		else if (numberToGuess>guessedNumber){
			System.out.println("too low");
		}
	    else if (numberToGuess<guessedNumber){
			 System.out.println("too high");
		 }
	}
	
 
}
