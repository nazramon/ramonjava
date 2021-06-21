package assignment3;

public class question7 {
	public static void main(String[] args) {
		int productCost;
		productCost=35;
		
		int change;
		change=100-productCost;
				
		int change50;
		change50=change/50;
		
		int change25;
		change25=(change%50)/25;
		
		int change5;
		change5=(change%25)/5;
		
		System.out.println("Your cahbe is "+change25+" puarters, "+change50+" dimes, and "+change5+" nickles");
				
			
	}

}
