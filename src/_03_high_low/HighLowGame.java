//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		String guessString;
		// 3. Change this line to give you a random number between 1 - 100. 
		Random random = new Random();
		int yeet = random.nextInt(99) + 1;
		
		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		for(int x = 9; x>-1; x-=1) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
guessString = JOptionPane.showInputDialog("Try to guess the number between one and one hundred.");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guess = (Integer.parseInt(guessString));
			// 5. if the guess is correct
				// 6. Win
			if(guess == yeet) {
				JOptionPane.showMessageDialog(null, "Technically you won but you don't get to play anymore so you really lose");
			System.exit(0);
			}
			
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
		else if(guess>yeet) {
		JOptionPane.showMessageDialog(null, "Your guess is incorrect. The secret number is lower than " + guess + ". You have " + x + " guesses left.");	
		}
		
			// 9. if the guess is low
				// 10. Tell them it's too low
		else {
			JOptionPane.showMessageDialog(null, "Your guess is incorrect. The secret number is higher than " + guess + ". You have " + x + " guesses left.");
		}
	}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "You lost so now you are a manbaby");
		
	}

}


