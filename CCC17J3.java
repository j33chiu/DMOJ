import java.util.*;

public class CCC17J3 //Exactly Electrical
{

	public static void main(String[] args)
	{

		Scanner userInput = new Scanner(System.in);
		int a = userInput.nextInt(); //startX
		int b = userInput.nextInt(); //startY
		int c = userInput.nextInt(); //endX
		int d = userInput.nextInt(); //endY
		int electric = userInput.nextInt();
		int hor = a - c;
		if(hor < 0)
			hor = hor * (-1);
		int ver = b - d;
		if(ver < 0)
			ver = ver * (-1);
		int length = hor + ver;
		if(length%2 == 0 && electric%2 == 0 && electric >= length){

			System.out.println("Y");

		}
		else if(length%2 != 0 && electric%2 != 0 && electric >= length){

			System.out.println("Y");

		}
		else{

			System.out.println("N");

		}


	}

}