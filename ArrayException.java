
public class ArrayException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		try {
			intArray[3] = 10; // 예외 발생하지 않음
			//intArray[6] = 5; // 예외 발생
			System.out.println("10을 0로 나누면 몫은 " + 10/0 + "입니다.");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
