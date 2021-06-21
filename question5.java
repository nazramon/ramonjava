package assignment3;

public class question5 {
	public static void main(String[] args) {
		int second=67985;
		
		int min;
		min=(second%3600)/60;
		
		int hour; 
		hour=second/3600;
		
		int finalsecond;		
		finalsecond=second%60;
		
		System.out.println(hour+" hour "+min+" minutes, "+"and "+finalsecond+" seconds");
				
				
	}
}
