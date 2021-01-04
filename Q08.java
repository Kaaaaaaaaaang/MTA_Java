// 강소리
import java.util.Scanner;
public class Q08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("생년 월일 : " + getBirthDate());
	}
	public static String getBirthDate() {
		System.out.println("생일을 MMDDYYYY 형식으로 입력하십시오.");
		Scanner sc = new Scanner(System.in);
		String birthdate = sc.next();
		sc.close();
		return birthdate;
	}
}
