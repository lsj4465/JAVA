
public class Array_1 {

	public static void main(String[] args) {
		
			int[] score = {76, 80, 55, 74, 81};
			int sum = 0;
			int aver = 0;
			int max = score[0];
			int min = score[0];
			
			for (int i = 0; i<score.length; i++ ) {
				sum += score[i];
			}
			
			aver = sum/5;
			
			for (int j = 0; j<score.length; j++) {
				if (max<score[j]) {
					max = score[j];
					
				}else if(min>score[j]) {
					min = score[j];
				}
			}	
			System.out.println("�� :" +sum);
			System.out.println("��� :" +aver);
			System.out.println("�ִ� :" +max);
			System.out.println("�ּ� :" +min);
		}
	}
