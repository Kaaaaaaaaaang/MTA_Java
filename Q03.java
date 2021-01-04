
public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<args.length; i++) {
			handleArgument(args[i]);
		}
	}
	// 메서드 형식 : 리턴값의 타입 메서드 이름(매개변수들) { 처리할 명령어들 }
	// 접근지정자, final/static/abstract 키워드 추가 가능
	// final : 오버라이딩 불가능 (클래스 상속에서 부모의 메서드 다시 구현 못하게)
	// static : static 메소드에서는 static 멤버만 호출하거나 접근 가능
	// 			클래스에서 static 멤버와 일반 멤버와 메모리 할당(로딩)되는 시점이 다르기 때문
	// abstract : 추상 메서드를 만들고자 할 때 사용
	public static void handleArgument(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

}
