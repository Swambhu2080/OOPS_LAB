package banking;
import savings.*;
import current.*;
public class bank{
	public static void main(String[] args) {
		Sav_acc sa=new Sav_acc(30000,"er34","walter");
		sa.withdraw(5000.0);
		sa.withdraw(25000.0);
		sa.withdraw(15000.0);
		sa.deposit(50000);
		sa.display();
		Curr_acc ca=new Curr_acc(30000,"rt341","jesse");
		ca.withdraw(5000.0);
		ca.withdraw(15000.0);
		ca.deposit(50000);
		ca.display();
	}
}