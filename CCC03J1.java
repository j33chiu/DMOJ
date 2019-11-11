import java.io.*;
import java.util.*;

public class CCC03J1 { //trident
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int t = userInput.nextInt();
        int s = userInput.nextInt();
        int h = userInput.nextInt();
        String space = "";
        for(int gap = 0; gap < s; gap++){
            
            space += " ";
            
        }
        for(int tines = 0; tines < t; tines++){
            
            System.out.println("*" + space + "*" + space + "*");
            
        }
        space = space.replace(" ", "*");
        if(t != 0 && s != 0 && h!= 0){
            System.out.println("*" + space + "*" + space + "*");
        }
        else{
            System.out.println("***");
        }
        space = space.replace("*", " ");
        for(int handle = 0; handle < h; handle++){
            
            System.out.println(" " + space + "*" + space + " ");
            
        }
        
    }
}