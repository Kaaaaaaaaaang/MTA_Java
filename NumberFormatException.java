
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
			System.out.println(s + "를 정수로 변환 할 수 없습니다.");
		}finally {
			System.out.println("계산을 끝냅니다.");
		}
	}

}
