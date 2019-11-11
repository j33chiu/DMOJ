import java.io.*;
import java.util.*;

public class knighthop {
    
    static int[][] chessBoard = new int[8][8];
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int startX = userInput.nextInt();
        int startY = userInput.nextInt();
        int endX = userInput.nextInt();
        int endY = userInput.nextInt();
        
        for(int row = 0; row < 8; row++) for(int col = 0; col < 8; col++) chessBoard[row][col] = Integer.MAX_VALUE;
        
        minMoves(startX, startY, 0);
        System.out.println(chessBoard[endX-1][endY-1]);
        
    }
    
    public static void minMoves(int a, int b, int moves)
    {
        
        if(a > 0 && a <= 8 && b > 0 && b <= 8 && moves < chessBoard[a-1][b-1]){

			chessBoard[a-1][b-1] = moves;
			minMoves(a+1, b+2, moves+1);
			minMoves(a+1, b-2, moves+1);
			minMoves(a+2, b+1, moves+1);
			minMoves(a+2, b-1, moves+1);
			minMoves(a-1, b+2, moves+1);
			minMoves(a-1, b-2, moves+1);
			minMoves(a-2, b+1, moves+1);
			minMoves(a-2, b-1, moves+1);

		}
        
    }

    
}