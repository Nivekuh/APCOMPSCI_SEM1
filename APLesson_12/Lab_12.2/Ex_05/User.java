public class User{
	private String fName, lName, avatar;
	private int userID;
	
	public User(){
		fName = "Undefined";
		lName = "Undefined";
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN){
		fName = fN;
		lName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public User(String fN, String lN, String av){
	    fName = fN;
	    lName = lN;
	    avatar = av;
	    userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void setAvatar(String av){
		avatar = av;
	}
	
	public String toString(){
	    return "Customer Info...\nFirst Name: " + fName +
							   "\nLast Name: " + lName +
							   "\nAvatar: " + avatar +
							   "\nUser ID#: " + userID;
	}
}