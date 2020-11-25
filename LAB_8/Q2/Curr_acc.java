package current;
import banking.*;
public class Curr_acc extends Accounts{
	private double balance;
	private double minBalance;
	public Curr_acc(){}
	public Curr_acc(int x, String cust_id, String cust_name){
		super(x,cust_id, cust_name);
		minBalance=0;
	}
	public void display(){
		System.out.println("ID:" + this.getCust_id());
        System.out.println("Name:" + this.getCust_name());
		System.out.println(" balance: "+this.getBalance());
	}
	public void withdraw(double amount){
		
		if(amount < 10000)
			System.out.println("Your withdraw should be greater than 10,000");
		else{
			this.setBalance(this.getBalance() - amount); 
			System.out.println(amount+"withdraw. Your balance is: "+this.getBalance());
		}
	}
	public void deposit(double amount){
		this.setBalance(this.getBalance() + amount); 
		System.out.println(amount+" deposited. Your balance is: "+this.getBalance());
	}
}