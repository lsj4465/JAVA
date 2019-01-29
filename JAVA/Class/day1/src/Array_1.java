
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
			System.out.println("합 :" +sum);
			System.out.println("평균 :" +aver);
			System.out.println("최대 :" +max);
			System.out.println("최소 :" +min);
		}
	}
