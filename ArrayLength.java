import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ������ �Է��Ͻÿ�.");
		int intArray[] = new int[5];
		
		double sum = 0;
		for(int i=0; i<intArray.length; i++)
			intArray[i] = sc.nextInt();
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i];
		System.out.println("����� " + sum/intArray.length);
		
		sc.close();
	}

}
