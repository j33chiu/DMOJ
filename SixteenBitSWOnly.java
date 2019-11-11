import java.io.*;
import java.util.*;

public class SixteenBitSWOnly {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        long N = userInput.nextLong();
        for (int counter = 1; counter <= N; counter++ ){
            long A = userInput.nextLong();
            long B = userInput.nextLong();
            long P = userInput.nextLong();
            if (A*B == P){
                System.out.println("POSSIBLE DOUBLE SIGMA");
            }
            else
                System.out.println("16 BIT S/W ONLY");
        }
    }
}