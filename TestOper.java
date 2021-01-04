
public class TestOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=3;
		a+=3; // a=6
		b%=2; // b=1
		System.out.println("a = " + a + ", b = " + b);
		int c=2, d=3;
		a = d++ + c; // a=5 d=4
		System.out.println("a = " + a + ", d = " + d);
		d = 3;
		a = ++d + c; // a=6 d=4
		System.out.println("a = " + a + ", d = " + d);
		d = 3;
		a = d-- + c; // a=5 d=2
		System.out.println("a = " + a + ", d = " + d);
		d = 3;
		a = --d + c; // a=4 d=2
		System.out.println("a = " + a + ", d = " + d);
		
		int x=2, y=10, z=0;
		z = x++ *2 + --y -5 + x * (y%2);
		System.out.println(z);
	}

}
