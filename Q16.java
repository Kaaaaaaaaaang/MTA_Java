
class StaticTest{
	int age; // �Ϲ� ��� �ʵ� (non-static)
	static int age2; // static ��� (Ŭ���� ���)
	public static final double RATE = 0.2; // static ��� (Ŭ���� ���)
	
	public void sum() {} // �Ϲ� �޼��� (non-static �޼���)
	public static void avg() { int x = age2+1000; avg2(); } // static �޼���
	public static void avg2() {} // static �޼���
	// static �޼���� static ��������� ����ؼ� ���� ����
}
public class Q16 {

	public static void main(String[] args) {
		StaticTest.age2 = 18; // ��ü ���� ���� �ٷ� Ŭ���� �̸����� ���� ����
		
		StaticTest s1 = new StaticTest(); // ��ü ���� (Ŭ���� Ÿ���� ���� ��ü �ʱ�ȭ)
		s1.age = 19; // �ν��ͽ� ���� �� ��� ���� (�Ϲ� ���)
	}

}
