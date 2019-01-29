
public class Array_2 {

   public static void main(String[] args) {
      
      int[][] matrix1 = {
            {15,43},             
            {-2,38},                
            {72,-48},
      };

      int[][] matrix2 = {
            {34,0,42},
            {4,49,40},
      };
      
      int[][] matrix3 = new int [3][3];
      
      int sum;
      
    		  for(int i=0; i<1; i++){
  		        for(int j=0; j<2; j++){
  		            sum=0;
  		            for(int k=0; k<3; k++){
  		                sum+=matrix1[i][k]*matrix2[k][j];
  		            }
  		            matrix3[i][j]=sum;
  		        }
  		    }
  		 
  		    for(int i=0; i<2; i++){
  		        for(int j=0; j<2; j++){
  		            System.out.println(matrix3[i][j] + "\t");
  		            }
  		        System.out.println("\n");
  		        }

     

   	}
   
}