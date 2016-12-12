package bank;

public class User {
	private String FirstName;
	private String LastName;
	private int id;
	private static int idCounter = 0;
	
	public User() {
		id = idCounter;
		idCounter++;
	}
	
	public User(String firstName, String lastName){
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	
	public String toString(){
		return "User: " + FirstName + " " + LastName + " | ID: " + id + " | ";
	}
}
