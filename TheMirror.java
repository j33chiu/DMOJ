import java.io.*;
import java.util.*;

public class TheMirror {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int cases = userInput.nextInt();
        for(int i = 0; i < cases; i++){
            
            int a = userInput.nextInt();
            int b = userInput.nextInt();
            
            int primes = 0;
            if(a%2 == 0){
                a++;
            }
            if(a == 2 || a == 1){
                primes++;
            }
            for(int number = a; number < b; number+=2){
                
                for(int div = 3; div <= number; div += 2){
                    
                    if(number%div == 0 && div != number){
                        break;
                    }
                    else if(div == number){
                        primes++;
                    }
                    
                }
                
            }
            System.out.println(primes);
            
        }
        
    }
}