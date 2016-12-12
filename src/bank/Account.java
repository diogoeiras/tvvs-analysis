package bank;

public class Account {
	private User owner;
	private Double balance;
	
	public Account() {
		balance = 0.0;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
	
	public String toString(){
		return owner.toString() + "Balance: " + balance + " | ";
	}
}
