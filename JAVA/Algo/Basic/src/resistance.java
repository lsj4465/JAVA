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
		int[] resist = {0,1,2,3,4,5,6,7,8,9};
		long ra=0, rb=0, rc=0;
		
		for(int i = 0; i<10; i++) {
			
		if (a.equals(colors[i])) {
				ra = resist[i] * 10;
			}
			
		if (b.equals(colors[i])) {
		    	rb = resist[i];
			}
		
		if (c.equals(colors[i])) {
				rc = (int)Math.pow(10, i);
			}
		}
		
		System.out.println((ra + rb) * rc);
	}
}

