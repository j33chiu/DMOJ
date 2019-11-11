import java.io.*;
import java.util.*;

public class CCC01S4 { //Cookies
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int chips = userInput.nextInt();
        double[] x = new double[chips];
        double[] y = new double[chips];
        for(int i = 0; i < chips; i++){
            x[i] = userInput.nextDouble();
            y[i] = userInput.nextDouble();
        }
        double finDi = 0;
        
        //every triangle possibility
        double a, b, c, s, d;
        for(int i = 0; i < chips; i++){
            for(int j = 0; j < chips; j++){
                for(int k = 0; k < chips; k++){
                    //semiperimeter
                    a = Math.sqrt((x[i]-x[j]) * (x[i]-x[j]) + (y[i]-y[j]) * (y[i]-y[j]));
                    b = Math.sqrt((x[j]-x[k]) * (x[j]-x[k]) + (y[j]-y[k]) * (y[j]-y[k]));
                    c = Math.sqrt((x[k]-x[i]) * (x[k]-x[i]) + (y[k]-y[i]) * (y[k]-y[i]));
                    s = (a + b + c)/2;
                    d = 0;
                    if((s==0)||(a*a + b*b - c*c <0)||(b*b + c*c - a*a <0)||(c*c + a*a - b*b <0)){
                        if(a > d) d = a;
                        if(b > d) d = b;
                        if(c > d) d = c;
                    }
                    else{
                        d = 2*(a*b*c)/(4*Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                    }
                    if(d > finDi) finDi = d;
                    
                }
            }
        }
        System.out.printf("%.2f", finDi);
        
    }
}