import java.io.*;
import java.util.*;

public class APlusBHard {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int lines = userInput.nextInt();
        String[] AIN = new String[lines];
        String[] BIN = new String[lines];
        for(int N = 0; N < lines; N++){

			AIN[N] = userInput.next();
			BIN[N] = userInput.next();

		}
        for(int q = 0; q < lines; q++){

            String a = AIN[q];
            String b = BIN[q];
            String[] Aarray = new String[a.length()];
            String[] Barray = new String[b.length()];

            for(int aChar = 0; aChar < a.length(); aChar++){

                Aarray[aChar] = Character.toString(a.charAt(aChar));

            }
            for(int bChar = 0; bChar < b.length(); bChar++){

                Barray[bChar] = Character.toString(b.charAt(bChar));

            }
            boolean ANeg = false;
            boolean BNeg = false;
            boolean bothNeg = false;
            boolean bothPos = false;
            if(Aarray[0].matches("-")){
                Aarray[0] = "0";
                ANeg = true;
            }
            if(Barray[0].matches("-")){
                Barray[0] = "0";
                BNeg = true;
            }
            if(ANeg == true && BNeg == true){
            	bothNeg = true;
			}
			if(ANeg == false && BNeg == false){
				bothPos = true;
			}
            int N = 0;
            if(a.length() > b.length()){

                N = a.length();

            }
            else{

                N = b.length();

            }
            int[] AInt = new int[N];
            int[] BInt = new int[N];
            int counter = N;
            int index = 0;
            while(counter > Aarray.length){
                AInt[index] = 0;
                counter--;
                index++;
            }
            for(int StrI = 0; StrI < Aarray.length; StrI++){
                AInt[index] = Integer.parseInt(Aarray[StrI]);
                index++;
            }
            counter = N;
            index = 0;
            while(counter > Barray.length){
                BInt[index] = 0;
                counter--;
                index++;
            }
            for(int StrI = 0; StrI < Barray.length; StrI++){
                BInt[index] = Integer.parseInt(Barray[StrI]);
                index++;
            }
            //we have AInt and BInt as equal length integer arrays
            boolean aLarger = false;
            if(AInt.length > BInt.length){
                aLarger = true;
            } //determines which number (abs val) is larger
            else if(AInt.length == BInt.length){

				boolean same = false;
				if(AInt[0] == BInt[0]){
					same = true;
				}
				else if(AInt[0] > BInt[0]){
					aLarger = true;
				}
				int checkCount = 1;
				while(same == true && checkCount < AInt.length){

					if(AInt[checkCount] != BInt[checkCount]){
						same = false;
					}
					if(AInt[checkCount] > BInt[checkCount]){
						aLarger = true;
					}
					checkCount++;

				}

			}
			if(aLarger == false){

				int[] tempA = new int[AInt.length];
				tempA = AInt;
				int[] tempB = new int[BInt.length];
				tempB = BInt;
				AInt = new int[tempB.length];
				AInt = tempB;
				BInt = new int[tempA.length];
				BInt = tempA;
				boolean tempTF = ANeg;
				ANeg = BNeg;
				BNeg = tempTF;

			}
            //see other version for cases......
            //if bothNeg == true: add numbers, then add "-" sign
			//if bothPos == true: add numbers
			//if ANeg == true && BNeg == false: -(a-b)
			//if ANeg == false && BNeg == true: a-b
			int[] finalNum = new int[AInt.length];
			if(bothNeg == true || bothPos == true){ //a+b

				String preNum = "";
				int carryover = 0;
				for(int addIN = AInt.length-1; addIN >= 0; addIN--){

					int sum = AInt[addIN] + BInt[addIN] + carryover;
					carryover = 0;
					if(sum > 9){
						sum -= 10;
						carryover = 1;
					}
					finalNum[addIN] = sum;
					if(carryover == 1 && addIN == 0){
						preNum = "1";
					}

				}
				if(bothNeg == true){
					System.out.print("-");
				}
				boolean leadZ = false;
				if(finalNum[0] == 0){
					leadZ = true;
				}
				System.out.print(preNum);
				for(int i = 0; i < finalNum.length; i++){
					if(i == finalNum.length -1){
						System.out.println(finalNum[i]);
					}

					else if(leadZ == true && finalNum[i] != 0){
						leadZ = false;
						System.out.print(finalNum[i]);
					}
					else if(leadZ == false){
						System.out.print(finalNum[i]);
					}

				}

			}
			//eliminate leading zeroes
			else{ //a-b

				String preNum = "";
				for(int addIN = AInt.length -1; addIN >= 0; addIN--){

					int sum = 0;
					if(AInt[addIN] < BInt[addIN]){ //borrowing

						sum = (AInt[addIN] + 10) - BInt[addIN];
						AInt[addIN - 1] -= 1;
						finalNum[addIN] = sum;

					}
					else{
						sum = AInt[addIN] - BInt[addIN];
						finalNum[addIN] = sum;
					}

				}
				if(ANeg == true){
					System.out.print("-");
				}
				boolean leadZ = false;
				if(finalNum[0] == 0){
					leadZ = true;
				}
				for(int i = 0; i < finalNum.length; i++){

					if(i == finalNum.length -1){
						System.out.println(finalNum[i]);
					}
					else if(leadZ == true && finalNum[i] != 0){
						leadZ = false;
						System.out.print(finalNum[i]);
					}
					else if(leadZ == false){
						System.out.print(finalNum[i]);
					}
				}

			}

        }
    }
}