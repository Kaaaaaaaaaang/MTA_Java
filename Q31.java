
public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertStringtoNumber("100.5");
	}
	
	public static void convertStringtoNumber(String numberAsString)
	{
		double number = Double.parseDouble(numberAsString);
		System.out.println(number);
	}
}
