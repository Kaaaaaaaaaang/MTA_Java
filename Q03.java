
public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<args.length; i++) {
			handleArgument(args[i]);
		}
	}
	// �޼��� ���� : ���ϰ��� Ÿ�� �޼��� �̸�(�Ű�������) { ó���� ��ɾ�� }
	// ����������, final/static/abstract Ű���� �߰� ����
	// final : �������̵� �Ұ��� (Ŭ���� ��ӿ��� �θ��� �޼��� �ٽ� ���� ���ϰ�)
	// static : static �޼ҵ忡���� static ����� ȣ���ϰų� ���� ����
	// 			Ŭ�������� static ����� �Ϲ� ����� �޸� �Ҵ�(�ε�)�Ǵ� ������ �ٸ��� ����
	// abstract : �߻� �޼��带 ������� �� �� ���
	public static void handleArgument(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

}
