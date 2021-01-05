import java.util.Scanner;
public class Grading_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(0~100)>>>");
		int score = sc.nextInt();
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
					
		}
		System.out.println("학점은 " + grade + "입니다.");
		sc.close();
	}

}
