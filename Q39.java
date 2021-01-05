
public class Q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=1/0;
			System.out.println("try");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("catch ArithmeticException");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch Exception");
		}finally {
			System.out.println("finally");
		}
	}

}
