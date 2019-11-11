import java.io.*;
import java.util.*;

public class CCC04J4 { //simple encryption
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = userInput.nextLine();
        String word = userInput.nextLine();
        int[] shift = new int[key.length()];
        for(int i = 0; i < key.length(); i++){

            shift[i] = alpha.indexOf(key.charAt(i));

        }
        String newWord = "";
        for(int i = 0; i < word.length(); i++){

            if(alpha.contains(Character.toString(word.charAt(i)))){
                newWord = newWord + Character.toString(word.charAt(i));
            }

        }
        String [][] chars = new String[(int)Math.ceil((double)newWord.length()/(double)key.length())][key.length()];
		int newWIN = 0;
        for(int row = 0; row < chars.length; row++){

			int col = 0;
			while(newWIN < newWord.length() && col < key.length()){
				int shiftBy = shift[col];
				chars[row][col] = Character.toString(newWord.charAt(newWIN));
				newWIN++;
				chars[row][col] = Character.toString(alpha.charAt(alpha.indexOf(chars[row][col]) + shiftBy));//letter shifted
				System.out.print(chars[row][col]);
				col++;
			}

        }

    }
}