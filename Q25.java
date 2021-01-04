
public class Q25 {
	public static void main(String[] args) {
		double number = 27;
		number %= -3d;
		number += 10f;
		number *= -4;
		System.out.println(number);
		
		int x = 10%-3; // % 연산자는 나머지를 구해주는 것으로 음수 부호 없이 양수로 처리한다.
		System.out.println(x);
	}
}
