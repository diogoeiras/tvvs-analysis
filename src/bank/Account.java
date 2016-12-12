package bank;

public class Account {
	private User owner;
	private Double balance;
	
	public Account() {
		balance = 0.0;
	}
	
	public Account(User owner){
		balance = 0.0;
		this.owner = owner;
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
	
	public void addFunds(double value){
		this.balance += value;
	}
	
	public void removeFunds(double value){
		//TODO
		/*
		if((this.balance -= value) < 0.0){
			this.balance = 0.0;
		}
		*/
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getBalanceDollars(){
		return (getBalance())*(1.064164);
	}
}
