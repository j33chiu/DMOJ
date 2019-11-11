import java.util.*;
import java.io.*;

public class InverseFactorial
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		String num = in.next();
		int len = num.length();
		int zeroes = 0;
		for(int i = len-1; i >= 0; i--){
			if((Character.toString(num.charAt(i))).matches("0"))
				zeroes++;
			else
				break;
		}
		int nRange = (zeroes - (int)Math.floor(zeroes/5))*5;
		int[] pos = new int[]{nRange, nRange + 1, nRange + 2, nRange + 3, nRange + 4};
		int c = 0;

		if(zeroes == 0){
			if(num.matches("0")) System.out.println(0);
			else if(num.matches("1")) System.out.println(1);
			else if(num.matches("2")) System.out.println(2);
			else if(num.matches("6")) System.out.println(3);
			else if(num.matches("24")) System.out.println(4);
		}
		else{
			while(true){
				double lnFact = 0.0;
				for(int j = 1; j <= nRange + c; j++){
					lnFact += Math.log(j);
				}
				double digits = lnFact;
				digits = digits/Math.log(10);
				int d = (int)Math.floor(digits) + 1;
				if(d == len){
					System.out.println(nRange + c);
					break;
				}
				c++;
			}	
		}
	}
}