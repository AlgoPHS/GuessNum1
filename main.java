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
	public String checkInt(int guess){

	}
	public int genNumber(){
		Random gen = new Random();
		return gen.nextInt(100);
	}
}