
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		try {
			intArray[3] = 10; // ���� �߻����� ����
			//intArray[6] = 5; // ���� �߻�
			System.out.println("10�� 0�� ������ ���� " + 10/0 + "�Դϴ�.");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("�迭�� ������ �ʰ��Ͽ� ���Ҹ� �����Ͽ����ϴ�.");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}

}
