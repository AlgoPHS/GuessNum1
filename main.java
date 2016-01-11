import java.util.Scanner;
import java.util.Random;

public class main{
	private
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int guess = Integer.parseInt(x.nextLine());
		int answer = genNumber();
		String response = checkInt(guess,answer);
	}
	public String checkInt(int guess, int answer){
	String response1;
	if(guess=answer)
		response1 = "winner winner chicken dinner";
	if(guess>answer)
		response1 = "too high";
	if(guess<answer)
		response1 = "too low";				
	}
	public int genNumber(){
		Random
	}
}
