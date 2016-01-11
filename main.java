//Phil Vasseur and Jack Stange
//1/11/16
/*
Write a program with the partner assigned below. You and your partner should agree to what part of the program to implement. 
Then take turns to update both your local and remote repositories.

Jack and Phil --> GuessANumber1.java
Nick and Daphne --> GuessANumber2.java
Jack and Leon --> GuessANumber3.java
Andy and Aaron --> GuessANumber4.java
Justin and Peter --> GuessANumber5.java
Alex and Martha --> GuessANumber6.java

Implement this program to play the game of “guess the number” as follows:
I have a number between 1 and 100.
Can you guess my number?
Please type your first guess.

Followed by one of following responses:

1. Excellent! You guessed the number! You guessed in 4 tries.
Would you like to play again (y/n)?
2. Too low. Try again.
3. Too high. Try again.

If the player’s is incorrect, your program should loop until the player finally gets the number right. Your program should keep telling the player Too high or Too low to help the player “zero in” on the correct answer. After a game ends, the program should report the number of games the player played and prompt the user to enter “y” to play again or “n” to exit the game
*/
//Input: 5, 50, 25, 30
//Output: t00 low, too high, too low, You got it right!

import java.util.Scanner;
import java.util.Random;

public class main{
	public static void main(String[] args) {
		boolean start=true;
		while(start==true){
			System.out.println("Guess a number!");
			Scanner x = new Scanner(System.in);
			int count=1;
			int guess = Integer.parseInt(x.nextLine());
			int answer = genNumber();
			String response = checkInt(guess,answer);
			while(!response.equals("winner winner chicken dinner")){
				count++;
				System.out.println(response);
				guess = Integer.parseInt(x.nextLine());
				response = checkInt(guess,answer);
			}
			System.out.println("You got it right! It only took you "+count+" attempts!");
			System.out.println("Do you want to continue? (y/n)");
			if(x.nextLine().toLowerCase().equals("n"))
				start=false;
		}
	}
	public  static String checkInt(int guess, int answer){
		String response1="";
		if(guess==answer)
			response1 = "winner winner chicken dinner";
		if(guess>answer)
			response1 = "too high";
		if(guess<answer)
			response1 = "too low";
		return response1;				
	}
	public static int genNumber(){
		Random gen = new Random();
		return gen.nextInt(100);
	}
}
