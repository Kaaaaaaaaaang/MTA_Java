
public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] b = {{"a", "b", "c"}, {"d", "f", "e"}};
		traverse(b);
	}
	
	public static void traverse(String [][] board) {
		for(int x=0; x<board.length; x++) {
			for(int y=0; y<board[x].length; y++) {
				System.out.println(board[x][y]);
			}
		}
	}
}
