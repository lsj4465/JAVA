import java.util.Random;
import java.util.Arrays;


public class Array_3 {
	public static void main(String [] args) {
		int[] arr = new int[10];
		for (int i = 0; i <arr.length; i++) {
			arr[i] = i;
		}
		
		Random random = new Random();
		for (int i = 1; i < arr.length; i ++) {
			int j = random.nextInt(i+1);
			if(i !=j) {
				arr[i] = arr[i]^arr[j];
				arr[j] = arr[i]^arr[j];
				arr[i] = arr[i]^arr[j];

				
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
