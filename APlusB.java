import java.io.*;
import java.util.*;

public class AplusB {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int N = userInput.nextInt();
        for(int i = 0; i < N; i++){
            
            int a = userInput.nextInt();
            int b = userInput.nextInt();
            System.out.println(a+b);
            
        }
        
    }
}