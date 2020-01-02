public class Main{
	
	public static void main(String[] args){
		Toolbox toolbox= new Toolbox();
		
		System.out.println("pick a number for times tables");
		
		// reads the user's input
	    int num = toolbox.readIntegerFromCmd();
		System.out.println();
		
		// prints first 20 values in times table of the user's chosen number
		for(int i=1;i<21;i++){
			int x = i*num;
			System.out.println(x);
		}
		
		// count variables and initialise total
		System.out.println();
		int total=0;
		int counter=1;

        
		// calculates amount of successive integers to reach a total over 500
		while(total<500){
			counter= counter+1;
			total = total+counter;
		}

        // prints how many iterations were required to reach a total over 500
		System.out.println(total);
        System.out.println("this process took " + counter + " iterations");		
		
		
	}
}
			
		