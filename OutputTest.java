
public class OutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�μ� �ֱ�");
		System.out.print("\\n�� �ڵ����� ó�� �ȵ�!!");
		System.out.println(); // enter ó��(\n)
		System.out.println("�ڵ� �� �ٲ� ó�� ����\n");
		
		int x = 205;
		double y = 10.52368;
		String s = "�̸����а�";
		System.out.printf("������ = %d, �Ǽ��� = %f, ���ڿ� = %s\n", x, y, s);
		System.out.printf("������ = %5d, �Ǽ��� = %10.2f, ���ڿ� = %10s\n", x, y, s);
		System.out.printf("������ = %05d, �Ǽ��� = %010.2f, ���ڿ� = %10s", x, y, s);

		System.out.println("\n\nprintf ��� format���� ���");
		
		System.out.format("������ = %d, �Ǽ��� = %f, ���ڿ� = %s\n", x, y, s);
		System.out.format("������ = %5d, �Ǽ��� = %10.2f, ���ڿ� = %10s\n", x, y, s);
		System.out.format("������ = %05d, �Ǽ��� = %010.2f, ���ڿ� = %10s", x, y, s);

	}

}
