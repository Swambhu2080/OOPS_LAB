package banking;
abstract public class Accounts{

	protected String cust_id;
	protected String cust_name;
	protected double balance;

	public Accounts(){}
	public Accounts(double x, String cust_id, String cust_name){
		balance=x;
		this.cust_id=cust_id;
		this.cust_name=cust_name;
	}
	public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
	 public String getCust_id() {
        return cust_id;
    }
    public String getCust_name() {
        return cust_name;
    }
	public abstract void display();
}