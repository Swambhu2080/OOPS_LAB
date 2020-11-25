package savings;
import banking.*;
public class Sav_acc extends Accounts{
	double dwl;
	
	private double minBalance;
	public Sav_acc(){}
	public Sav_acc(int x, String cust_id, String cust_name){
		super(x,cust_id, cust_name);
		dwl = 0.5*x;
		minBalance = 1000.00;
	}
	public void display(){
		System.out.println("\nID:" + this.getCust_id());
        System.out.println("\nName:" + this.getCust_name());
		System.out.println("\nbalance: "+this.getBalance());
	}
	public void withdraw(double amount){
		if(amount > dwl)
			System.out.println("withdrawal limit is 50% of the current balance.");
		else if (amount > (this.getBalance()-minBalance))
			System.out.println("you need to maintain minimum balance as 1000 Rs.");
		else{
			this.setBalance(this.getBalance() - amount); 
			System.out.println(amount+" withdrawn from your account");
			dwl = 0.5*this.getBalance();
		}
	}
	public void deposit(double amount){
		this.setBalance(this.getBalance() + amount); 
		System.out.println(amount+" added to your accout. Your balance is : "+this.getBalance());
	}
}