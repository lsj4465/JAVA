/*���� 1076
 * 
 * ���� ��ǰ���� ������ ����. ������ �� 3���� �̿��ؼ� �� ������ �� ������ ��Ÿ����.
     ó�� �� 2���� ������ ���̰�, ������ ���� ���ؾ� �ϴ� ���̴�.
 * 
 * �Է� : ù° �ٿ� ù ��° ��, ��° �ٿ� �� ��° ��, ��° �ٿ� �� ��° ���� �־�����. ���� ��� ���� ǥ�� ���� �ִ� ���� �־�����.
 * ��� : �Է����� �־��� ������ ���װ��� ����Ͽ� ù° �ٿ� ����Ѵ�.
 */
import java.util.Scanner;

public class resistance {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		String[] colors = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
		int[] resist = new int[10];
		int ra=0, rb=0, rc=0;
		
		for( int i = 0; i<10 ;i++) {
			resist[i] = i * (10^i);	
		}
		
		
		for(int j = 0; j<10; j++) {
			if (a.equals(colors[j])) {
				ra = resist[j];
			}else if (b.equals(colors[j])) {
		    		rb = resist[j];
				}else if (c.equals(colors[j])) {
						rc = resist[j];
					}
		}
		
		System.out.println(ra + rb + rc);
	}
}

