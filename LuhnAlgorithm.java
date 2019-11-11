import java.util.*;

public class LuhnAlgorithm
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[][] numbers = new String[5][5];
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				numbers[i][j] = in.next();
			}
		}
		for(int i = 0; i < 5; i++){
			String out = "";
			for(int j = 0; j < 5; j++){
				String num = numbers[i][j];
				char[] num1 = num.toCharArray();
				int start = num1.length-1;
				int total = 0;
				for(int add = start; add >= 0; add-=2){
					int doubled = (Character.getNumericValue(num1[add]))*2;
					String num2 = Integer.toString(doubled);
					if(num2.length() > 1){
						total += Character.getNumericValue(num2.charAt(0)) + Character.getNumericValue(num2.charAt(1));
					}
					else{
						total += Character.getNumericValue(num2.charAt(0));
					}
				}
				for(int k = start-1; k >= 0; k-= 2){
					total += Character.getNumericValue(num1[k]);
				}
				int check = 10 - (total%10);
				if(check == 10) out += Integer.toString(0);
				else out += Integer.toString(check);
			}
			System.out.println(out);
		}
	}
}