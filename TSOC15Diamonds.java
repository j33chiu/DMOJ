import java.io.*;
import java.util.*;

public class TSOC15Diamonds {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int height = userInput.nextInt();
        String topSide = "";
        if(height!= 3){
        for(int j = 0; j < (int)Math.floor(height/2.0); j++)
			topSide+= "*";

		for(int i = 0; i < height; i++){

			System.out.print("*");

		}
		System.out.println("");

		String space = " ";
		for(int i = 0; i < (int)Math.floor(height/2.0); i++){

			System.out.println(topSide + space + topSide);
			if(i!= (int)Math.floor(height/2.0)-1){
				space += "  ";
				topSide = topSide.substring(1);
			}

		}

		space = space.substring(2);
		topSide += "*";

		for(int i = 0; i < (int)Math.floor(height/2.0) - 1; i++){

			System.out.println(topSide + space + topSide);
			if(i != (int)Math.floor(height/2.0) - 2){
				space = space.substring(2);
				topSide += "*";
			}


		}

        for(int i = 0; i < height; i++){

			System.out.print("*");

		}
		}
		else{
			System.out.println("***");
			System.out.println("* *");
			System.out.println("***");
		}


    }
}