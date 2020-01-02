public class FizzBuzz {
      public static void main(string[] args){
	  System.out.print(i);
	  for(Integer i = new Integer(1); i <61; i++){
	  
	  //Check to see if a number is divisble by 3 and print "Fizz" if true
	  if ( i % 3 ==0){
	     System.out.println("Fizz");
		}
		
	  //Check to see if a number is divisible by 5 and print "Buzz" if true
	  else if (i % 5 == 0){
	     System.out.println("Buzz");
		} 
	  
	  //Check to see if a number is divisible by both 3 and 5 and print "FizzBuzz" if true
	  //ensure that it checks the divisiblity for both numbers or it could simply just print "Fizz" or "Buzz" if one is true
	  else if ( i % 3 ==0 && i % 5 ==0){
	     System.out.println("FizzBuzz");
	    }
		
		//If a number is not divisble by 3 or 5 then print the number normally
	  else (i % 3 != 0 && i % 5 != 0){
          System.out.println(i);
	  }		  
	
	
	} 

	
}		 