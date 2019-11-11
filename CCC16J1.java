import java.util.*;

public class CCC16J1 //tournament selection
{

	public static void main(String[] args)
	{

		Scanner userInput = new Scanner(System.in);
		int out = 0;
		String in = new String("").intern();
		for(int count = 0; count < 6; count++){

			in = userInput.next();
			if(in.compareTo("W") == 0){
				out += 1;
			}

		}
		if(out == 1 || out == 2){
			System.out.println("3");
		}
		else if(out == 3 || out == 4)
			System.out.println("2");
		else if(out == 5 || out == 6)
			System.out.println("1");
		else{
			System.out.println("-1");
		}


	}

}