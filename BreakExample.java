import java.util.Scanner;
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) {
			System.out.print("입력>>");
			String text = sc.next();
			if(text.equals("exit"))
				break;
			if(text.equals("skip"))
				continue;
			System.out.println("입력한 내용 : " + text);
		}
		System.out.println("종료합니다...");
		sc.close();
	}

}
