import java.io.*;
import java.util.*;

public class FractionAction {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double num = userInput.nextInt();
        double den = userInput.nextInt();
        if(num%den == 0){
            double whole = num/den;
            System.out.println((int)whole);
        }
        else{
            
            if((int)Math.floor(num/den) != 0){
                double whole = Math.floor(num/den);
                System.out.print((int)whole + " ");
            }
            int gcd = GCD((int)(num%den), (int)den);
            System.out.print(((int)(num%den))/gcd + "/");
            System.out.println(((int)den)/gcd);
            
        }
        
    }
    public static int GCD(int a, int b)
    {
        
        if(b == 0) return a;
        return GCD(b, a%b);
        
    }
}