
public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2,3);
		System.out.println(a.toString());
		System.out.println(a); // a�� a.toString()���� �ڵ� ��ȯ��
		
		Point b = new Point(2, 3);
		if(a.equals(b)) System.out.println("��ġ ����");
		else System.out.println("�ٸ�");
	}

}

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x==p.x && y == p.y) return true;
		else return false;
	}
}
