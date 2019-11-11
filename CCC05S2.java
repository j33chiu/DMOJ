import java.io.*;
import java.util.*;

public class CCC05S2 { //Mouse Move
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int c = userInput.nextInt();
        int r = userInput.nextInt();
        int x = userInput.nextInt();
        int y = userInput.nextInt();
        int curX = 0;
        int curY = 0;
        while(x != 0 || y != 0){

            curX += x;
            curY += y;

            if(curX < 0){
                curX = 0;
            }
            if(curX > c){
                curX = c;
            }
            if(curY < 0){
                curY = 0;
            }
            if(curY > r){
                curY = r;
            }

            System.out.println(curX + " " + curY);

            x = userInput.nextInt();
            y = userInput.nextInt();

        }

    }
}