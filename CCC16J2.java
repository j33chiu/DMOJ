import java.util.*;

public class CCC16J2 //magic squares
{

	public static void main(String[] args)
	{

		Scanner userInput = new Scanner(System.in);
		int compSum = 0;
		int[][] arr = new int[4][4];
		for(int row = 0; row < 4; row++){

			for(int col = 0; col < 4; col++){

				arr[row][col] = userInput.nextInt();

			}

		}
		boolean magic = true;
		int counter = 0;
		for(int col = 0; col < 4; col++){

			compSum += arr[0][col];

		}
		int sum = 0;
		while(magic == true && counter < 4){

			sum = 0;
			for(int i = 0; i < 4; i++){

				sum+=arr[counter][i];

			}
			if(sum != compSum){
				System.out.println("not magic");
				magic = false;
			}
			counter++;

		}
		counter = 0;
		while(magic == true && counter < 4){

			sum = 0;
			for(int i = 0; i < 4; i++){

				sum+= arr[i][counter];

			}
			if(sum != compSum){
				System.out.println("not magic");
				magic = false;
			}
			counter++;

		}
		if(magic == true)
			System.out.println("magic");

	}

}