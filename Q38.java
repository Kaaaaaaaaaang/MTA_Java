
public class Q38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pickle pickle = new Pickle();
		pickle.isCreated = true;
		pickle.preserve();
	}

}

class Pickle {
	   boolean isPreserved = false;
	   boolean isCreated = false;
	   void preserve() {
	      isPreserved = true;
	   }
}