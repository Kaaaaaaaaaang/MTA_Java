
public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123";
		try {
			int n = Integer.parseInt(s);
			n++;
			System.out.println(n);
		}catch (java.lang.NumberFormatException e) {
			// TODO: handle exception
			System.out.println(s + "�� ������ ��ȯ �� �� �����ϴ�.");
		}finally {
			System.out.println("����� �����ϴ�.");
		}
	}

}
