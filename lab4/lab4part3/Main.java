public class Main{


//call addSampleData to populate usergroup
//call printusernames to print out usernames in usergroup
public static void main(String[] args) {
	    UserGroup userGroup = new UserGroup();
        userGroup.addSampleData();
		userGroup.printUsernames();
    
	UserGroup administrators = new UserGroup();
	administrators.getUserIterator();
	
	Iterator<User> iterAdministrator = userGroup.getUserIterator();
	
	for (int i = 0; i< userGroup.getUsers().size(); i++) {
		if (iterAdministrator.next().getUserType().equals("admin") {
			administrators.getUsers().add(new User(userGroup.getUsers().get(i).getUsername(),
			userGroup.getUsers().get(i).getUserType(),userGroup.getUsers().get(i).getName()));
		}
	}

    administrators.printUsernames();
    administrators.getUsers().get(administrators.getUsers().size()-1).setUserType("user");

    System.out.println(usergroup.getUsers());
    System.out.println(administrators.getUsers());



    }


	
}		