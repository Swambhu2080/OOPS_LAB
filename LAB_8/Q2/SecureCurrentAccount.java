package current;
import current.*;
public class SecureCurrentAccount extends Curr_acc{
	public SecureCurrentAccount(int x, String cust_id, String cust_name){
		super(x,cust_id, cust_name);
	}
	public void withdraw(double amount){
		if(amount<0)
			System.out.println("withdraw amount cannot be negative");
		else if(amount > getBalance())
			System.out.println("cannot withdraw more than your balance");
		else if(amount < 10000)
			System.out.println("Your withdraw should be greater than 10,000");
		else{
			this.setBalance(this.getBalance() - amount); 
			System.out.println(amount+"withdraw. Your balance is: "+this.getBalance());
		}
	}
}