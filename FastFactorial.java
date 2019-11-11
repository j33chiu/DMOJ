import java.io.*;
import java.util.*;

public class FastFactorial {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int N = userInput.nextInt();
        for(int c = 0; c < N; c++){

            String in = userInput.next();
            if(in.length() > 2) in = "34";
            int n = Integer.parseInt(in);
            if(n > 33) System.out.println(0);
            else if(n >= 0 && n <= 12){
                long result = 1;
                for(int i = 1; i <= n; i++){
                    result *= i;
                }
                System.out.println(result);
            }
            else{
                double result = 1.0;
                for(int i = 1; i <= 13; i++){
                    result *= i;
                }
                for(int div = 0; div < 32; div++){
					result = result/2.0;
				}
				int min = (int)result;
				result -= min;
				if(min < 0) min++;
				for(int i = 14; i <= n; i++){
					result *= i;
					min = (int)result;
					result -= min;
					if(min < 0) min++;

				}

                double ans = result * Math.pow(2, 32);
                long newAns = (long)ans;

                System.out.println(newAns);
            }

        }

    }
}