import java.util.*;

public class CCC17J2 //shifty sum
{

	public static void main(String[] args)
	{

		Scanner userInput = new Scanner(System.in);
		//number
		int num = userInput.nextInt();
		//shift by
		int shift = userInput.nextInt();
		int sum = num;
		for(int i = 0; i < shift; i ++){

			num = num*10;
			sum += num;

		}
		System.out.println(sum);

	}

}