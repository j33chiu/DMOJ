import java.util.*;

public class S2
{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int question = input.nextInt();
		int N = input.nextInt();
		int[] dmojSpeed = new int[N];
		int[] pegSpeed = new int[N];
		for(int i = 0; i < N; i++){
			dmojSpeed[i] = input.nextInt();
		}
		for(int i = 0; i < N; i++){
			pegSpeed[i] = input.nextInt();
		}
		Arrays.sort(dmojSpeed);
		Arrays.sort(pegSpeed);
		
		if(question == 1){
			int minSum = 0;
			for(int i = 0; i < N; i++){
				minSum += Math.max(dmojSpeed[i], pegSpeed[i]);
			}
			System.out.println(minSum);
		}
		else if(question == 2){
			int maxSum = 0;
			for(int i = 0, j = N-1; i < N && j >= 0; i++, j--){
				maxSum += Math.max(dmojSpeed[i], pegSpeed[j]);
			}
			System.out.println(maxSum);
		}
	}
}