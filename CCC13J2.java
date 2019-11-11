import java.io.*;
import java.util.*;

public class CCC13J2 { //rotating letters
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String word = userInput.next();
        char[] ch = word.toCharArray();
        boolean yes = true;
        for(int i = 0; i < ch.length; i++){
           if(ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'S' && ch[i] != 'H' && ch[i] != 'Z' && ch[i] != 'X' && ch[i] != 'N'){ 
               System.out.println("NO");
               yes = false;
               break;
           }
        }
        if(yes) System.out.println("YES");
        
    }
}