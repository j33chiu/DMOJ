import java.io.*;
import java.util.*;

public class CCC05J5 { //bananas
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.next();
        while(input.matches("X") == false){
            boolean wasReplaced = true;
            while(wasReplaced == true){
                wasReplaced = false;
                while(input.contains("ANA")){
                    String newIn = input.replace("ANA", "A");
                    input = newIn;
                    wasReplaced = true;
                }
                while(input.contains("BAS")){
                    String newIn = input.replace("BAS", "A");
                    input = newIn;
                    wasReplaced = true;
                }
            }
            if(input.matches("A")) System.out.println("YES");
            else System.out.println("NO");
            input = userInput.next();
        }

    }
}