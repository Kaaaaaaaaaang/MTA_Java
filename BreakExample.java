import java.util.Scanner;
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print("�Է�>>");
			String text = sc.next();
			if(text.equals("exit"))
				break;
			if(text.equals("skip"))
				continue;
			System.out.println("�Է��� ���� : " + text);
		}
		System.out.println("�����մϴ�...");
		sc.close();
	}

}
