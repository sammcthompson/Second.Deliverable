package guessingGame;

import java.util.Scanner;

public class coinflip {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
				System.out.println("Guess: which will have more heads or tails?");
				String headsOrTailsGuess = input.nextLine();
				
				System.out.println ("How many times will the coin flip?");
				float numberOfFlips = input.nextInt();
				int headsCount = 0;
				int tailsCount = 0;
				
				for (int i=0; i < numberOfFlips; i++) {
					if (Math.random() < 0.5) {
						System.out.println("heads");
						headsCount++;
						
					
					} else {
						System.out.println("tails");
						tailsCount++;
						
					}
				}
					float correctCount;
					if (headsOrTailsGuess.contains("heads")) {
						correctCount = headsCount;
					} else {
						correctCount = tailsCount;
					}
				
					
				System.out.println("Num of Heads: " + headsCount);
				System.out.println("Num of Tails: " + tailsCount);
				System.out.println("Your guess, " + headsOrTailsGuess + " came up " + correctCount + " times(s) ");
				
				float percentage;
		
				
			      percentage = (float)((correctCount / numberOfFlips) * 100);
			      System.out.println("Percentage: "+ String.format("%.1f", percentage) + " % ");
		
	}

    }

		
	
	
		

