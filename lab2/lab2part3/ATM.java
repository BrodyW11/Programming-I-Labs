public class ATM {
    public static void main(String[] args){ 
	    ATM myATM = new ATM();
	    myATM.go();
	}
	 Toolbox myToolbox = new Toolbox();
     int balance;
     
	 
	 
	 //While loop used to ensure balance is positive otherwise user will have top input money until it is positive
	 
	 public void go(){
      
	   System.out.println("Welcome to online ATM banking");
	   System.out.println("How much do you want in your account?");
	   balance = -1; 
		
                 while(balance<0){
		 System.out.println("please input a positive balance");
		 balance = myToolbox.readIntegerFromCmd(); 
		 }
	   
	   //Here we are creating a string with menu options
	   
	   //While (true) used to ensure ATM only operates while balance is positive
	   
	   System.out.println("your bank balance is " + balance); 
	       while(true){
			   String op = "What do you want to do?\n" +              
				"1 : Withdraw\n" +
				"2 : Deposit\n" +
				"3 : Inquire\n" +
				"4 : Quit";
	       System.out.println(op);
	   
	   int choice = myToolbox.readIntegerFromCmd();
	 
	 
	 
	 
	  if (choice == 1)
		  withdraw();
	  
	  else if (choice == 2)
		  deposit();
	  
	  else if (choice == 3)
		  inquire();
	  
	  else if (choice == 4)
		  quit();
		  

    }
	 }
	
    
	// While used to ensure user withdraws an amount that they can afford before going into negative
	
	public void withdraw(){
		System.out.println("*****************************************");
		System.out.println("              Withdrawal                 ");
		System.out.println("*****************************************");
		System.out.println("How much would you like to withdraw?");
		int choice = myToolbox.readIntegerFromCmd();
		while(choice>balance || choice<0) {
			System.out.println("Please request a valid amount to withdraw");
			
		choice = myToolbox.readIntegerFromCmd();
	 
      
	 
		}
		balance = balance - choice;
		System.out.println("*****************************************");
		System.out.println("Your new balance is " + balance);
		System.out.println("*****************************************");
	} 

	
	// While used to ensure user deposits a valid amount
	
	public void deposit(){
		System.out.println("*****************************************");
		System.out.println("              Deposit                 ");
		System.out.println("*****************************************");
		System.out.println("How much would you like to deposit");
		int choice = myToolbox.readIntegerFromCmd();
		while(choice<0){
			System.out.println("Please input a valid amount to deposit");
		
		choice = myToolbox.readIntegerFromCmd();
		}
		balance = balance + choice;
		
		System.out.println("*****************************************");
		System.out.println("Your new balance is " + balance);
		System.out.println("*****************************************");
	
	}	

	
	
	public void inquire(){
		System.out.println("*****************************************");
		System.out.println("Your balance is " + balance);
		System.out.println("*****************************************");
	}	
	
	//Code to exit ATM program 
	
	public void quit(){
		System.out.println("*****************************************");
		System.out.println("GoodBye!");
		System.out.println("*****************************************");
	    System.exit(0);
	
	}	

	
}  
		
		