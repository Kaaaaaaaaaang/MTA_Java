
class StaticTest{
	int age; // 일반 멤버 필드 (non-static)
	static int age2; // static 멤버 (클래스 멤버)
	public static final double RATE = 0.2; // static 멤버 (클래스 멤버)
	
	public void sum() {} // 일반 메서드 (non-static 메서드)
	public static void avg() { int x = age2+1000; avg2(); } // static 메서드
	public static void avg2() {} // static 메서드
	// static 메서드는 static 멤버끼리만 사용해서 정의 가능
}
public class Q16 {

	public static void main(String[] args) {
		StaticTest.age2 = 18; // 객체 생성 없이 바로 클래스 이름으로 접근 가능
		
		StaticTest s1 = new StaticTest(); // 객체 생성 (클래스 타입을 갖는 객체 초기화)
		s1.age = 19; // 인스터스 생성 후 사용 가능 (일반 멤버)
	}

}
