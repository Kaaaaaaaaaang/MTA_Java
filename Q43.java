
public class Q43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		String[] a = {"hello", "h", "e", "hellohelloo", "l"};
		boolean b = validateEntries(a);
		System.out.println(b);
	}
	public static boolean validateEntries(String[] entries) {
		boolean allValidEntries = true;
		for(String entry : entries) {
			if(entry.length() > 10) {
				allValidEntries = false;
				break;
			}
		}
		return allValidEntries;
	}
}
