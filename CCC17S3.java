import java.util.*;

public class CCC17S3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int boards = in.nextInt();
		int[] boardLength = new int[2001];

		int[] heightFence = new int[4001]; //value represents the length of fence with height = index
		for(int i = 0; i < boards; i++){
			int len = in.nextInt();
			boardLength[len]++;
		}
		for(int i = 2; i <= 4000; i++){ //i represents possible heights
			for(int j = Math.max(1, i - 2000); j < (i+1)/2 && (i - j) < 2001; j++){ //j represents individual boards
				int match = Math.min(boardLength[j], boardLength[i - j]);
				heightFence[i] += match;
			}
			if(i%2==0) heightFence[i] += boardLength[i/2]/2;
		}
		int max = 0;
		int ways = 0;
		for(int i = 1; i <= 4000; i++){
			if(heightFence[i] == max){
				ways++;
			}
			if(heightFence[i] > max){
				max = heightFence[i];
				ways = 1;
			}
		}
		System.out.println(max + " " + ways);
	}
}