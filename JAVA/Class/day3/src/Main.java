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
			System.out.println("명령어 : 1.add() 2.add(idx) 3.get(idx) 4.remove(idx) 5.size()  6.show()  7.exit()");
			System.out.print("입력 : ");
			int command = Integer.parseInt(br.readLine());
			System.out.println("=================================================================================");
			switch (command) {
			case 1:
				System.out.print("리스트에 추가할 데이터를 입력하세요 : ");
				str = br.readLine();
				list.add(str);
				break;
			case 2:
				System.out.print("리스트에 추가할 데이터를 입력하세요 : ");
				str = br.readLine();
				System.out.print("데이터를 추가할 인덱스를 입력하세요 : ");
				index = Integer.parseInt(br.readLine());
				list.add(index, str);
				break;
			case 3:
				System.out.print("데이터를 확인할 인덱스를 입력하세요 : ");
				index = Integer.parseInt(br.readLine());
				System.out.println("[확인 데이터] : " + list.get(index));
				break;
			case 4:
				System.out.print("데이터를 삭제할 인덱스를 입력하세요 : ");
				index = Integer.parseInt(br.readLine());
				System.out.println("[삭제 데이터] : " + list.get(index));
				list.remove(index);
				break;
			case 5:
				System.out.println("[리스트의 크기] : " + list.size());
				break;
			case 6:
				for (int i = 0; i <list.capacity; i++)
					System.out.print(list.arrList[i] +" ");
				break;
			case 7:
				System.out.println("[종료합니다.]");
				return;
			default:
				System.out.println("명령어를 잘못 입력하였습니다. (1~6)");
				break;
			}
			System.out.println();
		}
	}
}
