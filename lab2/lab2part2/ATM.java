public class ATM {
    public static void main(String[] args){ 
	    ATM myATM = new ATM();
	    myATM.go();
	}
	 Toolbox myToolbox = new Toolbox();
     int balance;
     
	 
	 
	 //Method welcoming user to ATM and giving options for what they wish to do
	 
	 public void go(){
      
	   System.out.println("Welcome to online ATM banking");
	   System.out.println("How much do you want in your account?");
	   balance = myToolbox.readIntegerFromCmd();
	   System.out.println(balance);
	  
	   System.out.println("What do you want to do?");
	   System.out.println(" 1 : Withdraw");
	   System.out.println("2 : Deposit");
	   System.out.println("3 : Inquire");
	   System.out.println("4 : Quit");
	   
	   int choice = myToolbox.readIntegerFromCmd(); //Retrieving users choice
	 
	 
	 
	 //If statements used to direct user to method of their choice 
	 
	  if (choice == 1)
		  withdraw();
	  
	  else if (choice == 2)
		  deposit();
	  
	  else if (choice == 3)
		  inquire();
	  
	  else if (choice == 4)
		  quit();
		  

    }
	
	
    //Choice used to represent value of money withdrawn to subtract from balance
	
	public void withdraw(){
		System.out.println("*****************************************");
		System.out.println("              Withdrawal                 ");
		System.out.println("*****************************************");
		System.out.println("How much would you like to withdraw?");
		int choice = myToolbox.readIntegerFromCmd();
	    
		balance = balance - choice;
		System.out.println("Your new balance is " + balance);
	} 

	
	//Same as withdraw but value of choice is added to balance
	
	public void deposit(){
		System.out.println("*****************************************");
		System.out.println("              Deposit                 ");
		System.out.println("*****************************************");
		System.out.println("How much would you like to deposit");
		
		int choice = myToolbox.readIntegerFromCmd();
		balance = balance + choice;
		
		System.out.println("Your new balance is " + balance);
	}	

	// Toolbox used throughout to read value of choice
	
	public void inquire(){
		System.out.println("*****************************************");
		System.out.println("Your balance is " + balance);
		System.out.println("*****************************************");
	}	
	
	public void quit(){
		System.out.println("*****************************************");
		System.out.println("GoodBye!");
		System.out.println("*****************************************");

	}

	
}  