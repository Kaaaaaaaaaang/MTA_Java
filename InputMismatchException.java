import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�>>>");
		try {
			int n = sc.nextInt(); // ���� �Է�
			System.out.println("�Է��� ���� �� : " + n);
		}catch (java.util.InputMismatchException e) {
			// TODO: handle exception
			System.out.println("������ �ƴմϴ�.");
		}finally {
			System.out.println("���α׷� �����մϴ�.");
		}
		
	}

}
