
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 a = new Account2();
		Account2 b = new Account2(100);
	}
}

class Account2{
	protected int balance;
	
	public Account2() { // �⺻ ������(default ������)
		balance = 0;
	}
	
	public Account2(int amount) { // �Ű������� �ϳ� �ִ� ������
		balance = amount;
	}
}