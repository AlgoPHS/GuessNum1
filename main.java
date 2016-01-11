//Phil Vasseur and Jack Stange
//1/11/16
//Guess a number program using git
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
