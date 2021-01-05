import java.util.Scanner;
public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 >>");
		int month = sc.nextInt();
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다.");
			break;
		case 9:
		case 10:
		case 11 :
			System.out.println("가을 입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울 입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			
		sc.close();
		}

	}

}
