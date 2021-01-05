
public class Q44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = fee('C');
		System.out.println(result);
	}
	
	public static int fee(char model) {
		int price = 0;
		switch(model) {
		case 'A' :
			price = 50;
			break;
		case 'T' :
			price = 20;
		case 'C' :
			price = 5;
			break;
		default :
			price = 100;
			break;
		}
		return price;
	}
}
