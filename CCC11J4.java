import java.util.*;

public class CCC11J4
{
	public static int convertx(int a){
		return a + 200;
	}
	public static int converty(int a){
		return -a;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[][] ground = new int[401][401];
		ground[convertx(-1)][converty(-5)] = 1;
		ground[convertx(-1)][converty(-6)] = 1;
		ground[convertx(-1)][converty(-7)] = 1;
		ground[convertx(0)][converty(-7)] = 1;
		ground[convertx(1)][converty(-7)] = 1;
		ground[convertx(2)][converty(-7)] = 1;
		ground[convertx(3)][converty(-7)] = 1;
		ground[convertx(4)][converty(-7)] = 1;
		ground[convertx(5)][converty(-7)] = 1;
		ground[convertx(6)][converty(-7)] = 1;
		ground[convertx(7)][converty(-7)] = 1;
		ground[convertx(7)][converty(-6)] = 1;
		ground[convertx(7)][converty(-5)] = 1;
		ground[convertx(7)][converty(-4)] = 1;
		ground[convertx(7)][converty(-3)] = 1;
		ground[convertx(6)][converty(-3)] = 1;
		ground[convertx(5)][converty(-3)] = 1;
		ground[convertx(5)][converty(-4)] = 1;
		ground[convertx(5)][converty(-5)] = 1;
		ground[convertx(4)][converty(-5)] = 1;
		ground[convertx(3)][converty(-5)] = 1;
		ground[convertx(3)][converty(-4)] = 1;
		ground[convertx(3)][converty(-3)] = 1;	
		ground[convertx(2)][converty(-3)] = 1;
		ground[convertx(1)][converty(-3)] = 1;
		ground[convertx(0)][converty(-3)] = 1;
		ground[convertx(0)][converty(-2)] = 1;
		ground[convertx(0)][converty(-1)] = 1;


		int curX = convertx(-1);
		int curY = converty(-5);
		while(true){
			String direction = in.next();
			int value = in.nextInt();
			boolean danger = false;
			if(direction.equals("l")){
				for(int i = 0; i < value; i++){
					curX --;
					if(ground[curX][curY] == 1){
						danger = true;
					}
					else{
						ground[curX][curY] = 1;
					}
				}
				if(danger == false){
					System.out.println((curX-200) + " " + -curY + " safe");
				}
				else{
					System.out.println((curX-200) + " " + -curY + " DANGER");
				}
			}
			else if(direction.equals("d")){
				for(int i = 0; i < value; i++){
					curY ++;
					if(ground[curX][curY] == 1){
						danger = true;
					}
					else{
						ground[curX][curY] = 1;
					}
				}
				if(danger == false){
					System.out.println((curX-200) + " " + -curY + " safe");
				}
				else{
					System.out.println((curX-200) + " " + -curY + " DANGER");
				}
			}
			else if(direction.equals("r")){
				for(int i = 0; i < value; i++){
					curX ++;
					if(ground[curX][curY] == 1){
						danger = true;
					}
					else{
						ground[curX][curY] = 1;
					}
				}
				if(danger == false){
					System.out.println((curX-200) + " " + -curY + " safe");
				}
				else{
					System.out.println((curX-200) + " " + -curY + " DANGER");
				}
			}
			else if(direction.equals("u")){
				for(int i = 0; i < value; i++){
					curY --;
					if(ground[curX][curY] == 1){
						danger = true;
					}
					else{
						ground[curX][curY] = 1;
					}
				}
				if(danger == false){
					System.out.println((curX-200) + " " + -curY + " safe");
				}
				else{
					System.out.println((curX-200) + " " + -curY + " DANGER");
				}
			}
			else{
				break;
			}
			if(danger) break;
		}

	}

}