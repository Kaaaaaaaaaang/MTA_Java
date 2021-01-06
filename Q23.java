
public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 1};
		if(duplicate(array)) System.out.println("중복 있음");
		else System.out.println("중복 없음");
	}

	public static boolean duplicate(int[] array) {
		  boolean isDuplicate = false;
		  for (int x=0; x<array.length-1; x++) {
		    for (int y = x + 1; y < array.length; y++)
		      if (array[x] == array[y])
		        isDuplicate = true;
		    if (isDuplicate)
		       break;
		  }
		  return isDuplicate;
	}
}
