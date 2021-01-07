
public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = showGreeting("hello");
		System.out.println(a);
	}
	
	public static String showGreeting(String firstName) {
		String welcomeMsg = "æ»≥Á«œººø‰";
		welcomeMsg += firstName.substring(0, 1).toUpperCase() + 
				firstName.substring(1).toLowerCase();
		
		return welcomeMsg;
	}

}
