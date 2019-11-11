import java.io.*;
import java.util.*;

public class CCC03S4 { //substrings
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int strings = userInput.nextInt();
        for(int j = 0; j < strings; j++){
            
            String str = userInput.next();
            String [] suffix = new String[str.length()];
            for(int i = 0; i < str.length(); i++){
                suffix[i] = str.substring(i);
            }
            Arrays.sort(suffix);
            int count = suffix[0].length() + 1; //first substrings, and the "" substring
            for(int i = 1; i < suffix.length; i++){
                
                int lcp = LCP(suffix[i], suffix[i-1]);
                count = count + suffix[i].length() - lcp;
                
            }
            System.out.println(count);
            
        }
        
    }
    
    public static int LCP(String cur, String prev)
    {
        
        int n = Math.min(cur.length(), prev.length());
        for(int i = 0; i < n; i++){
            if(cur.substring(i, i+1).matches(prev.substring(i, i+1)) == false){
                return i;
            }
        }
        return n;
        
    }
    
}