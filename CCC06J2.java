import java.io.*;
import java.util.*;

public class CCC06J2 { //roll the dice
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int dice1 = userInput.nextInt();
        int dice2 = userInput.nextInt();
        if(dice1 > 10) dice1 = 10;
        if(dice2 > 10) dice2 = 10;
        if(dice1 > dice2){
            int temp = dice1;
            dice1 = dice2;
            dice2 = temp;
        }
        int ways = 0;
        for(int i = 1; i <= dice1; i++){
            
            int otherDice = 10-i;
            if(otherDice >=1 && otherDice <= dice2) ways++;
            
        }
        if(ways == 1) System.out.println("There is 1 way to get the sum 10.");
        else System.out.println("There are " + ways + " ways to get the sum 10.");
        
        
    }
}