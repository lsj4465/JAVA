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
		
		double sum = 0;
		double max = 0;
		double aver = 0;
		int input = sc.nextInt();
		double[] subject= new double[input];
		
		//SCORE
		for(int i = 0; i<input ; i++) {
			subject[i] = sc.nextInt();	
		}
		
		//MAX
		for(int j = 0; j<subject.length ; j++) {	
			if(max<subject[j]) {
				max = subject[j];
			}	
		}

		//SUM
		for(int k = 0; k<subject.length; k++) {
		subject[k] = subject[k] / max * 100;
		sum += subject[k];
		}
		
		//AVERAGE
		aver = sum / input;
		System.out.println(aver);
		
	}
}




