package bank;
import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts = new ArrayList<>();

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void addAccount(Account acc){
		accounts.add(acc);
	}
	
	public String toString(){
		String result = ""; 
		for (int i = 0; i < accounts.size(); i++) {
			result += accounts.get(i).toString();
			result += "\n";
			i++;
		}
		return result;
	}
}
