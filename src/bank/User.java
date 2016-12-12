package bank;

import java.util.UUID;

public class User {
	private String FirstName;
	private String LastName;
	private UUID id;
	
	public User() {
		id = UUID.randomUUID();
	}
	
	public User(String firstName, String lastName){
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	
	public String toString(){
		return "User: " + FirstName + " " + LastName + " | ID: " + id + " | ";
	}
}
