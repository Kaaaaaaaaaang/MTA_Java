import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է�");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean single = sc.nextBoolean();
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ��� ���ô� " + city + "�Դϴ�.");
		System.out.println("����� ���̴� " + age + "�Դϴ�.");
		System.out.println("����� ü�� " + weight + "�Դϴ�.");
		System.out.println("����� ���� ���δ� " + single + "�Դϴ�.");
		
		sc.close();
	}

}
