/*백준 1076
 * 
 * 전자 제품에는 저항이 들어간다. 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다.
     처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다.
 * 
 * 입력 : 첫째 줄에 첫 번째 색, 둘째 줄에 두 번째 색, 셋째 줄에 세 번째 색이 주어진다. 색은 모두 위의 표에 쓰여 있는 색만 주어진다.
 * 출력 : 입력으로 주어진 저항의 저항값을 계산하여 첫째 줄에 출력한다.
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

