package guessGame;
import javax.swing.*;

public class GuessingGame {

	public static void main(String[] args) {
		int computerNumber = (int)(Math.random()*100 + 1); //for Generating Random Number;
		int userResponse = 0;
		System.out.println("The Correct guess would be: " + computerNumber);
		int count =  1;  //To store Number of Guess's by User
		
		while(userResponse != computerNumber) {
			//JoptionPane is used to show dialog box for user input
			String response = JOptionPane.showInputDialog(null, "Enter a Number between 1 and 100 :", "GuessingGame",3);
		    userResponse = Integer.parseInt(response);
		    //it shows message to user for their guess
			JOptionPane.showMessageDialog(null, ""+determineguess(userResponse, computerNumber, count));
			count++;
		}
	}
	//function to determine guess
	public static String determineguess(int userAnswer, int computerAns, int count) {
		if(userAnswer <= 0 || userAnswer >100) {
			return "Your Guess is Invalid";
		}else if(userAnswer == computerAns) {
			return "Congratulations Correct!...." + count;
		}else if(userAnswer > computerAns) {
			return "Your Guess is too High.\n try again." + count;
		}else if(userAnswer < computerAns) {
			return "Your Guess is too Low.\n try again." + count;
		}else {
			return "Invalid Guess\ntry again." + count;
		}
		
	}

}
