import java.util.Random;
import java.util.ArrayList;

	

public class UserGroup { 
    String[] names = {"Brody", "Alexi", "Connor", "Josh", "Emmi", "Harry", "Kane", "James", "Tom", "Pawel"};
    String[] usernames = {"Bro", "Ale", "Con", "Jos", "Emi", "Har", "Kan", "Jam", "Tom", "Paw"};
	String[] userTypes = {"user", "editor", "admin"};
	private ArrayList<User> users;
	
	 					
	
	public UserGroup() {
        this.users = new ArrayList<User>();
    }
    
	//constructor that instantiates ArrayList<User>
	public ArrayList<User> getUsers() {
        return users;
    }
    
	
    //creates 10 Users and uses add() to put the 10 user objects into the ArrayList
	//getUser method that returns 3rd User in the list
	//enhanced for loop that loops through ArrayList and prints username/userType of each user
    public void addSampleData() {
        Random randIntGenerator = new Random();
		for (int i = 0 ; i <10 ; i++) {
		User newUser = new User(usernames[i], userTypes[randIntGenerator.nextInt(3)], names[i]);
				users.add(newUser);
		}
	}
	
	//method that takes int as parameter and returns the User in that slot of the ArrayList
	public User getUser(int index) {
        System.out.println(users.get(index));
        return users.get(index);
	}

	//print usernames
    public void printUsernames() {
        for (User element : users) {
            System.out.println(element.getUsername() + " " + element.getUserType());
        }

	}

}