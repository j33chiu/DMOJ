import java.util.*;

public class CCC03S3
{
	static int[][] rooms;
	static int tiles, rows, col;
	static int rmArea = 0;
	static ArrayList<Integer> roomAreas;

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		tiles = in.nextInt();
		rows = in.nextInt();
		col = in.nextInt();
		rooms = new int[rows][col];
		String line;
		for(int i = 0; i < rows; i++){
			line = in.next();
			for(int j = 0; j < col; j++){
				if(line.charAt(j) == 'I')
					rooms[i][j] = 0;
				else
					rooms[i][j] = 1;
			}
		}
		roomAreas = new ArrayList<Integer>();
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < col; j++){
				if(rooms[i][j] == 1){
					area(i, j);
					roomAreas.add(rmArea);
					rmArea = 0;
				}
			}
		}
		Collections.sort(roomAreas);
		int floored = 0;
		for(int i = roomAreas.size()-1; i >= 0; i--){
			if(tiles - roomAreas.get(i) >= 0){
				tiles -= roomAreas.get(i);
				floored ++;
			}
			else
				break;
		}
		if(floored == 1)
			System.out.print(floored + " room, " + tiles + " square metre(s) left over");
		else
			System.out.print(floored + " rooms, " + tiles + " square metre(s) left over");
	}

	public static void area(int r, int c)
	{
		if(r >= 0 && r < rows && c >= 0 && c < col && rooms[r][c] == 1){
			rmArea++;
			rooms[r][c] = 2;
			area(r - 1, c);
			area(r + 1, c);
			area(r, c - 1);
			area(r, c + 1);
		}
	}
}