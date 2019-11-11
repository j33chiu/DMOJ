import java.io.*;
import java.util.*;

public class CCC03S1 { //snakes and ladders
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int roll = userInput.nextInt();
        boolean won = false;
        int location = 1;
        while(roll != 0 && won == false){
            location += roll;
            if(location == 9) location = 34;
            else if(location == 40) location = 64;
            else if(location == 67) location = 86;
            else if(location == 54) location = 19;
            else if(location == 90) location = 48;
            else if(location == 99) location = 77;
            else if(location > 100) location -= roll;
            else if(location == 100){
                System.out.println("You are now on square 100");
                System.out.println("You Win!");
                won = true;
                break;
            } 
            System.out.println("You are now on square " + location);
            roll = userInput.nextInt();
            if(roll == 0) System.out.println("You Quit!");
        }
        
        
    }
}