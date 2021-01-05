
public class LoopEx_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, sum=0;

		while(i<=10) {
			sum += i;
			if(i<=9)
				System.out.print(i + "+");
			else
				System.out.print(i + "=");
			i++;
			
		}
		System.out.println(sum);
	}

}
