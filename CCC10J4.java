import java.io.*;
import java.util.*;

public class CCC10J4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n != 0)
		{
			int[] temperatures = new int[n];
			int[] diff = new int[n-1];
			for(int i = 0; i < n; i++){
				temperatures[i] = in.nextInt();
				if(i > 0){
					diff[i - 1] = temperatures[i] - temperatures[i-1];
				}
			}
			int out = 1;
			boolean repeat = false;
			boolean printed = false;
			for(int i = 1; i < diff.length; i++){
				boolean works = true;
				boolean finalcheck = true;
				if(diff[i] == diff[0]){
					repeat = true;
					for(int j = 1; j < i && j + i < diff.length; j++){
						if(diff[j] != diff[j + i]){
							works = false;
							break;
						}
					}
					if(works == true){
						finalcheck = true;
						for(int j = i + 1; j < diff.length; j++){
							if(diff[j - i] != diff[j]){
								finalcheck = false;
							}
						}
						if(finalcheck == false){
							System.out.println(diff.length);
							printed = true;
							break;
						}
						else{
							System.out.println(i);
							printed = true;
							break;
						}
					}
				}
			}
			if(repeat == false){
				System.out.println(diff.length);
				printed = true;
			}
			if(printed == false){ //catches if a repeat was found but did not work
				System.out.println(diff.length);
			}
			n = in.nextInt();
		}		
	}	
}