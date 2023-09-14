package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your starting amount: ");
		int startAmount = in.nextInt();
		int copy = startAmount;
		System.out.println("Enter the win probability of a single play: ");
		double winChance = in.nextDouble();
		System.out.println("Enter your win limit: ");
		int winLimit = in.nextInt(); 
		System.out.print("Number of days played");
		int totalSimulations = in.nextInt();
		int plays = 0;
		
		for(int i = 1; i <= totalSimulations; i++) {
			System.out.println("Day "+ i);
			while(startAmount < winLimit && startAmount > 0 ) {
				if(Math.random() < winChance) {
		        	startAmount = startAmount + 1;
		        	plays++;
		        }
				else {
					startAmount = startAmount -1;
					plays++;
				}
			}
	        if (startAmount == winLimit) {
	        	System.out.println("You are the champion! You have $" + startAmount);
	        	System.out.println("Games played: "+plays);
	        }
	        else {
	        	System.out.println("You lost your life savings. You have nowhere to sleep.");
	        	System.out.println("Games played: "+plays);
	        	
	        }
	     
	        startAmount = copy;
	        
		}
		double ruinRate =  
		double expectedRuin = (1-startAmount/winLimit);
		if winChance = 0.5 :
			
		
	
	
	}
		 
}
