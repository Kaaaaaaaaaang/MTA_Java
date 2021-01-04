
public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = Math.PI; //3.141593
		double pi2 = 3.14;
		System.out.format("Pi is %.3f%n", pi); // 3.142
		System.out.format("Pi is %.0f%n", pi); // 3
		System.out.format("Pi is %.06f%n", pi); // 3.141593
		
		System.out.format("Pi is %.3f%n", pi2); // 3.140
		System.out.format("Pi is %.0f%n", pi2); // 3
		System.out.format("Pi is %.06f%n", pi2); // 3.140000
	}

}
