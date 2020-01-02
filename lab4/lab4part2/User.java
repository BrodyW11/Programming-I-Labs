import java.util.Random;


public class User
{
	private String username;
	private String userType;
	private String name;
	
	//constructor which takes username, userType and name as parameters
	public User(String username, String userType, String name){
		this.username = username;
		this.userType = userType;
		this.name = name;
	}

	
    //creating get methods for them
    public String getUsername(){
        return username;
	}

    public String getUserType(){
        return userType;
	}

    public String getName(){
        return name;
	}	
    
	//set method which takes one of the user types as a parameter
    public void setUserType(String newUserType){
		userType = newUserType;
	}	
	
	
	
	
}