import java.util.*;

public class CCC17J1 //quadrant selection
{

	public static void main(String[] args)
	{

		Scanner userInput = new Scanner(System.in);
		//x integer
		int x = userInput.nextInt();
		//y integer
		int y = userInput.nextInt();
		int output = 0;
		if(x < 0 && y < 0)
			output = 3;
		else if(x < 0 && y > 0)
			output = 2;
		else if(x > 0 && y < 0)
			output = 4;
		else if(x > 0 && y > 0)
			output = 1;
		System.out.println(output);

	}

}