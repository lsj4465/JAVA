import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {

		StringArrayList list = new StringArrayList();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int index;
		while (true) {
			System.out.println("=================================================================================");
			System.out.println("��ɾ� : 1.add() 2.add(idx) 3.get(idx) 4.remove(idx) 5.size()  6.show()  7.exit()");
			System.out.print("�Է� : ");
			int command = Integer.parseInt(br.readLine());
			System.out.println("=================================================================================");
			switch (command) {
			case 1:
				System.out.print("����Ʈ�� �߰��� �����͸� �Է��ϼ��� : ");
				str = br.readLine();
				list.add(str);
				break;
			case 2:
				System.out.print("����Ʈ�� �߰��� �����͸� �Է��ϼ��� : ");
				str = br.readLine();
				System.out.print("�����͸� �߰��� �ε����� �Է��ϼ��� : ");
				index = Integer.parseInt(br.readLine());
				list.add(index, str);
				break;
			case 3:
				System.out.print("�����͸� Ȯ���� �ε����� �Է��ϼ��� : ");
				index = Integer.parseInt(br.readLine());
				System.out.println("[Ȯ�� ������] : " + list.get(index));
				break;
			case 4:
				System.out.print("�����͸� ������ �ε����� �Է��ϼ��� : ");
				index = Integer.parseInt(br.readLine());
				System.out.println("[���� ������] : " + list.get(index));
				list.remove(index);
				break;
			case 5:
				System.out.println("[����Ʈ�� ũ��] : " + list.size());
				break;
			case 6:
				for (int i = 0; i <list.capacity; i++)
					System.out.print(list.arrList[i] +" ");
				break;
			case 7:
				System.out.println("[�����մϴ�.]");
				return;
			default:
				System.out.println("��ɾ �߸� �Է��Ͽ����ϴ�. (1~6)");
				break;
			}
			System.out.println();
		}
	}
}
