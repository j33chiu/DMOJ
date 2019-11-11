import java.io.*;
import java.util.*;

public class CCC06J1 { //Canadian Calorie Counting
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int burger = userInput.nextInt();
        int side = userInput.nextInt();
        int drink = userInput.nextInt();
        int dessert = userInput.nextInt();
        int calories = 0;
        if(burger == 1) calories += 461;
        else if(burger == 2) calories += 431;
        else if(burger == 3) calories += 420;
        if(side == 1) calories += 100;
        else if(side == 2) calories += 57;
        else if(side == 3) calories += 70;
        if(drink == 1) calories += 130;
        else if(drink == 2) calories += 160;
        else if(drink == 3) calories += 118;
        if(dessert == 1) calories += 167;
        else if(dessert == 2) calories += 266;
        else if(dessert == 3) calories += 75;
        
        System.out.println("Your total Calorie count is " + calories + ".");
        
        
    }
}