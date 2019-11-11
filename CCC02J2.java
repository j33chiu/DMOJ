import java.io.*;
import java.util.*;

public class CCC02J2 { //Americanadian
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.next();
        while(input.matches("quit!") == false){
			boolean consonant = false;
			int index = input.indexOf("or") - 1;
			String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
			if(cons.contains(Character.toString(input.charAt(index)))){
				consonant = true;
			}
            if(input.length() > 4 && input.contains("or") && consonant == true && index + 1 == input.length()-2){
                System.out.println(input.replaceAll("or", "our"));
            }
            else{
				System.out.println(input);
			}
            input = new String(userInput.next());
        }

    }
}