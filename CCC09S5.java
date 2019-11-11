import java.io.*;
import java.util.*;
//have 2d array, initial 0
//array represents max bit rate at the shop
//for each network, find the coffeshops within the range, add bit rate to corr. in array.
//array to hold current max bitrate, number at the maxbitrate. resets if new max bitrate, number = 1.

public class CCC09S5 { // wireless
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int EW = userInput.nextInt();
        int NS = userInput.nextInt();
        int[][] city = new int[EW][NS];
        int netW = userInput.nextInt();
        int[] out = new int[2]; //in: 0 (current max bitrate) in: 1 (number of shops with that max bitrate)
        int endAdd = 0;
        for(int i = 0; i < netW; i++){
            int x = userInput.nextInt()-1;
            int y = userInput.nextInt()-1;
            int r = userInput.nextInt();
            int b = userInput.nextInt();
            
            int iil = x - r;
            if(iil < 0) iil = 0;
            int iih = x + r;
            if(iih >= city[0].length) iih = city[0].length -1;
            int iiil = y - r;
            if(iiil < 0) iiil = 0;
            int iiih = y + r;
            if(iiih >= city.length) iiih = city.length -1;

            if(y + r > 30033 && r > y) endAdd += b;
            else{
                for(int t1 = iil; t1 <= iih; t1++){
                    for(int t2 = y; t2 <= iiih; t2++){
                        if(r*r >= ((t1 - x)*(t1 - x)) + ((t2 - y)*(t2 - y))){
                            city[t2][t1] += b;
                            if(out[0] < city[t2][t1]){
                                out[0] = city[t2][t1];
                                out[1] = 1;
                            } 
                            else if(out[0] == city[t2][t1]){
                                out[1]++;
                            }
                        }    
                        else break;
                    }
                    for(int t2 = y-1; t2 >= iiil; t2--){
                        if(r*r >= ((t1 - x)*(t1 - x)) + ((t2 - y)*(t2 - y))){
                            city[t2][t1] += b;
                            if(out[0] < city[t2][t1]){
                                out[0] = city[t2][t1];
                                out[1] = 1;
                            } 
                            else if(out[0] == city[t2][t1]){
                                out[1]++;
                            }
                        } 
                        else break;
                    }
                } 
            }
        }
        System.out.println(out[0] + endAdd);
        System.out.println(out[1]);
    }
}