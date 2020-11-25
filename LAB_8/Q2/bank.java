package banking;
import current.Curr_acc;
import current.SecureCurrentAccount;
public class bank{
	public static void main(String[] args) {
		Curr_acc ca=new SecureCurrentAccount(30000,"rt341","jesse");
		ca.withdraw(-40000.0);
		ca.withdraw(40000.0);
		ca.withdraw(20000.0);
		ca.display();
	}
}