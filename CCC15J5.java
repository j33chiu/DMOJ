import java.io.*;
import java.util.*;

public class CCC15J5 {
    
    static int[][][] got = new int[1][1][1];
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int pie = scan.nextInt();
        int ppl = scan.nextInt();
        got = new int[pie+1][ppl+1][pie+1];
        System.out.println(distributions(pie, ppl, 1));

    }
    
    public static int distributions(int n, int k, int i)
	{
        if(got[n][k][i] == 0){
            if(n == k || k == 1){
                got[n][k][i] = 1;
                return 1;
            } 
            int out = 0;
            for(int min = i; min < (n/k) + 1; min++){
			    out += distributions(n-min, k-1, min);
		    }
		    got[n][k][i] = out;
        }
        return got[n][k][i];

	}
}