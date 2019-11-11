import java.io.*;
import java.util.*;


public class Golf
{

    public static void main (String [] args)
    {

		Scanner userInput = new Scanner(System.in);

		int distance, clubs, result;

		distance = userInput.nextInt();
		clubs = userInput.nextInt();
		int hits[] = new int[clubs];

		for(int i = 0 ; i < clubs ; i++)
	   		hits[i] = userInput.nextInt();
		result = alg(distance, hits);
		if (result == -1)
		{
	    	System.out.println ("Roberta acknowledges defeat.");
		}
		else
		{
	   		System.out.println ("Roberta wins in " + result + " strokes.");
		}

    }

    public static int alg(int distance, int[] hits)
    {
		int[] function;
		int min, t;

		function = new int [distance + 1];
		function[0] = 0;

		for (int i = 1 ; i <= distance ; i++)
		{
	    	min = 9999;
	    	for (int j = 0 ; j < hits.length; j++)
	    	{
			t = i - hits[j];
			if (t >= 0 && function[t] >= 0 && function[t] < min)
		    	min = function[t];
	    	}

	    	if (min < 9999) function[i] = min + 1;
	    	else function[i] = -1;

		}
		return function[distance];
    }
}