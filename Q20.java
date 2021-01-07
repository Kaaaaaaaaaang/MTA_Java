
public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Christopher";
		firstName = firstName.substring(0, 5);
		String output = String.format("%s is %d characters long", firstName, firstName.length());
		System.out.println(output);
	}

}
