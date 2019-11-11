import java.util.*;

public class CCC18J5
{
	static int[] path = new int[1];
	static int[][] altmatrix = new int[1][1];

	public static void paths(int from, int length)
	{
		if(altmatrix[from][0] == 0){
			if(length < path[from] || path[from] == 0) path[from] = length;
		}
		else{
			if(path[from] == 0 || length < path[from]){
				path[from] = length;
				for(int page = 0; page < altmatrix[from].length; page++){
					paths(altmatrix[from][page], length+1);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int pages = in.nextInt();
		path = new int[pages +1];
		altmatrix = new int[pages+1][1];
		for(int i = 1; i < pages + 1; i++){ //0 page not counted
			int choices = in.nextInt();
			if(choices != 0){
				altmatrix[i] = new int[choices];
				for(int j = 0; j < choices; j++){
					int link = in.nextInt();
					altmatrix[i][j] = link;
				}
			}
		}
		paths(1, 1);
		boolean reachable = true;
		for(int i = 1; i < path.length; i++){
			if(path[i] == 0) reachable = false;
		}
		if(reachable) System.out.println("Y");
		else System.out.println("N");

		int min = 10001;
		
		for(int i = 1; i < path.length; i++){
			if(path[i] < min && altmatrix[i][0] == 0 && path[i] != 0) min = path[i];
		}		
		System.out.println(min);
	}
}