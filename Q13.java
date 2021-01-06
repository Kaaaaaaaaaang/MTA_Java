
public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount(1000);
		System.out.println(sa.toString());
	}

}


class Account3 {
	private double balance;
	public Account3(double startingBalance) {
		this.balance = startingBalance;
	}
	public double getBalance() {return balance;}
	public void setBalance(double balcance) {this.balance = balance;}
	
}
class SavingAccount extends Account3{
	double rate = 0.02;
	SavingAccount(double startingBalance){
		super(startingBalance);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Savings Current Balance : $%.2f", this.getBalance());
	}
	
}