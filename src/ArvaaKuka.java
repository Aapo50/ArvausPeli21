import java.util.Random;
import java.util.Scanner;
public class ArvaaKuka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		String vastaus;
		int guess = 0;
		do
		{
			System.out.println("Guess my name (type stop to exit)");
			vastaus = in.nextLine();
			guess++;
			if (!vastaus.equals("Mike"))
			{
				
			}
			else
			{
				System.out.println("Congrats!\nYou guessed " + guess + " times");
				break;
			}
		}
		
		while(!vastaus.equals("stop"));
		
		if (vastaus.equals("stop"))
			{
			guess--;
			System.out.println("You guessed " + guess + "times");
			}
		
		
		
		
		
		
	}

}
