//���Ҹ�
import java.util.Scanner;
public class Twenties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���>>>");
		int age = sc.nextInt();
		if((age>=10) && (age<20)) {
			System.out.println("10�� �Դϴ�.");
			System.out.println("10��� �ູ�մϴ�.");
		}else {
			System.out.println("10�밡 �ƴմϴ�.");
		}
		sc.close();
	}

}
