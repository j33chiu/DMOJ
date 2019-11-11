import java.io.*;
import java.util.*;

public class LexicographicallyLeast {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String str = userInput.next();
        int subLen = userInput.nextInt();
        char[] ch = str.toCharArray();
        int[] letterNum = new int[ch.length];
        for(int i = 0; i < ch.length; i++){
            letterNum[i] = alpha.indexOf(ch[i]);
        }
        int smallest = letterNum[0];
        int smallestIN = 0;
        for(int i = 1; i < letterNum.length - subLen+1; i++){


			if(letterNum[i] < smallest){
				smallest = letterNum[i];
				smallestIN = i;
			}
			else if(letterNum[i] == smallest){

				for(int check = i, checkPrev = smallestIN; check < i + subLen; check++, checkPrev++){
				
					if(letterNum[check] < letterNum[checkPrev]){

						smallest = letterNum[i];
						smallestIN = i;
						break;

					}
					else if(letterNum[check] > letterNum[checkPrev]) break;

				}

			}

		}
		for(int i = 0; i < subLen; i++){

			System.out.print(ch[smallestIN]);
			smallestIN++;

		}

    }
}