import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력>>>");
		try {
			int n = sc.nextInt(); // 정수 입력
			System.out.println("입력한 정수 값 : " + n);
		}catch (java.util.InputMismatchException e) {
			// TODO: handle exception
			System.out.println("정수가 아닙니다.");
		}finally {
			System.out.println("프로그램 종료합니다.");
		}
		
	}

}
