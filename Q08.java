// ���Ҹ�
import java.util.Scanner;
public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ���� : " + getBirthDate());
	}
	public static String getBirthDate() {
		System.out.println("������ MMDDYYYY �������� �Է��Ͻʽÿ�.");
		Scanner sc = new Scanner(System.in);
		String birthdate = sc.next();
		sc.close();
		return birthdate;
	}
}
