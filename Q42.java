
public class Q42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = safeRoot(3.0, 2.0);
		System.out.println(a);
	}
	public static double safeRoot(double radicand, double index) {
		if(radicand>=0) {
			return Math.pow(radicand, 1/index);
		}else {
			if(index%2==0) {
				return (Double)null;
			}else {
				return -Math.pow(-radicand, 1/index);
			}
		}
	}
}
