/*���� 1546
 * 
 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է�
 * ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
 * ���
 * ù° �ٿ� ���ο� ����� ����Ѵ�. ������� ����/��� ������ 10-2���� ����Ѵ�.
 
 
 */

import java.util.Scanner;

public class Average {
		
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		long[] subject= new long[input];
		
		for(int i = 0; i<input ; i++) {
		
			int score = sc.nextInt();
			subject[i] = score;
		}
		
		for(int j = 0; j<input ; j++) {
			
			if(subject[j]>subject[j+1]) {
				long max = subject[j];
			}
			
		}

		for(int k = 0; k<input; k++) {
			
		subject[k] = subject[k]/max*100;
			
		}
		
		for(int l= 0; l<input; l++) {
			sum =+ subject[l];
		}
		
		System.out.println(sum/input);
		
	}
}
