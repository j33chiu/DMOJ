import java.util.*;
import java.io.*;

public class CCC13S5
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cost = 0;
		while(N > 1){
			int check = 2;
			int root = (int)Math.sqrt(N) + 1;
			while(check <= root && N % check != 0){
				check++;
			}
			if(check < N && N % check == 0){
				int b = N/check;
				N -= b;
				cost += N/b;
			}
			else{
			    N--;
			    cost += N;
			}
		}
		System.out.println(cost);
	}
}