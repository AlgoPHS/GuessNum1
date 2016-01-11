import java.util.Scanner;
import java.util.Random;

public class main{
	public static void main(String[] args) {
		start=true;
		while(start=true){
			Scanner x = new Scanner(System.in);
			int count=0;
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
			if(x.nextLine().equals("n").ignoreCase())
				start=false;
		}
	}
	public String checkInt(int guess, int answer){
	String response1;
	if(guess==answer)
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
