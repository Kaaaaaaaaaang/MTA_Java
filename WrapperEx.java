
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.parseInt("28")); // ���ڿ� "28"�� 10������ ��ȯ
		System.out.println(Integer.toString(28)); // ���� 28�� ���ڿ��� ��ȯ
		Integer i =Integer.valueOf(28);
		
		Double d  = Double.valueOf(3.14);
		System.out.println(d.toString()); // Double�� ���ڿ� "3.14"�� ��ȯ
		System.out.println(Double.parseDouble("3.14")); // ���ڿ��� �Ǽ� 3.14�� ��ȯ
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b)); // true�� ���ڿ� "true"�� ��ȥ
		System.out.println(Boolean.parseBoolean("false")); // ���ڿ��� false�� ��ȯ
	}

}
