
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 a = new Account2();
		Account2 b = new Account2(100);
	}
}

class Account2{
	protected int balance;
	
	public Account2() { // 기본 생성자(default 생성자)
		balance = 0;
	}
	
	public Account2(int amount) { // 매개변수가 하나 있는 생성자
		balance = amount;
	}
}