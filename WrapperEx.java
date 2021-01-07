
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.parseInt("28")); // 문자열 "28"을 10진수로 변환
		System.out.println(Integer.toString(28)); // 정수 28을 문자열로 변환
		Integer i =Integer.valueOf(28);
		
		Double d  = Double.valueOf(3.14);
		System.out.println(d.toString()); // Double을 문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14")); // 문자열을 실수 3.14로 변환
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b)); // true를 문자열 "true"로 변혼
		System.out.println(Boolean.parseBoolean("false")); // 문자열을 false로 변환
	}

}
