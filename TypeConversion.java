// 강소리
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 127;
		int i = 100;
		
		System.out.println(b+i); // b가 int 타입으로 자동 변환
		System.out.println(10.0/4); // 4가 4.0으로 자동 변환
		System.out.println((int)2.9+1.8);
		System.out.println((int)(2.9+1.8));
		System.out.println((int)2.9+(int)1.8);
	}

}
