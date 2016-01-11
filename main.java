import java.util.Scanner;
import java.util.Random;

public class main{
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int guess = Integer.parseInt(x.nextLine());
		int answer = genNumber();
		String response = checkInt(guess,answer);
		while(!response.equals("winner winner chicken dinner")){
			
		}
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
		Random gen = new Random();
		return gen.nextInt(100);
	}
}
