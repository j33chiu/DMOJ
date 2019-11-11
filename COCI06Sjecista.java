import java.io.*;
import java.util.*;

public class COCI06Sjecista {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int in = userInput.nextInt();
        int out = (in*(in-1)*(in-2)*(in-3))/24;
        System.out.println(out);
        
    }
}