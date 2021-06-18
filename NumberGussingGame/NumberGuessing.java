/* Java game “Guess a Number” that allows user to guess a random
   number that has been generated.
*/
package Game;
import javax.swing.*;
public class NumberGuessing {
	public static void main(String[] args) {
		int compNumber = (int)(Math.random()*60+1);    
		int userAnswer = 0;
		
		System.out.println("The correct guess would be "+compNumber);
		int count = 1;
		
		while (userAnswer != compNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100"
                + ""
                + ""
                + "", "Guess Game",3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ DetermineGuess(userAnswer, compNumber, count));
            count++;
        }  
    }
	
	public static String DetermineGuess(int userAnswer,int compNumber,int count) {
		if(userAnswer<0 || userAnswer>100) {
			return "Your guess id s invalid";
		}
		else if (userAnswer == compNumber ){
            return "whoooho!!! You have guessed the Correct Number...\nTotal Guesses: " + count;
        }
        else if (userAnswer > compNumber) {
            return "Your Number guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < compNumber) {
            return "Oooops!!!! Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}