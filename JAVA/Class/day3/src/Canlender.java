import java.util.Calendar;

public class Canlender {
	 public static void main(String[] args) {
	        
	        
	        Calendar cal = Calendar.getInstance(); 
	        
	        int today = cal.get(Calendar.DATE);
	        cal.set(Calendar.DATE,1); 
	        int Day = cal.get(Calendar.DAY_OF_WEEK); 
	        int Date = cal.getActualMaximum(Calendar.DATE); 
	        int Year = cal.get(Calendar.YEAR);
	        int Month = cal.get(Calendar.MONTH);
	        
	        
	        System.out.println("_____________________________");
	        System.out.println("|\t"+ Year+"³â  " + (Month+1) + "¿ù\t    |");
	        System.out.println("|SUN MON TUE WED THU FRI SAT|");  
	        System.out.println("|===========================|");
	      
	        for (int i=1; i<Day;i++){
	            System.out.printf("|%3s","  ");  
	        } 
	        for (int i = 1; i <= Date ; i++) {       
	             System.out.printf("|%3d",i);
	            if(Day%7==0) System.out.println("|");  
	            Day++; 
	        }
	        System.out.println("\n_____________________________");
	        System.out.println("\n"+ "Today is " + today);
	 }
	}
