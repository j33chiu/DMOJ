import java.io.*;
import java.util.*;
import java.text.*;

public class CCC04S4 { //space turtle
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double[] turtleLoc = new double[3];
        turtleLoc[0] = userInput.nextDouble();
        turtleLoc[1] = userInput.nextDouble();
        turtleLoc[2] = userInput.nextDouble();
        double px = userInput.nextDouble();
        double py = userInput.nextDouble();
        double pz = userInput.nextDouble();
        double shortestDistance = distance(turtleLoc[0], turtleLoc[1], turtleLoc[2], px, py, pz);
        //forward is pos x, backward is neg x, right is neg y, left is pos y, up: pos z, down: neg z
        String[] orientation = new String[]{"x+", "y-", "x-", "y+", "z+", "z-"}; //[facing,right,behind,left,up,down]
        String direction = orientation[0];
        while(direction.matches("E") == false){

            double distanceT = userInput.nextDouble(); //takes number distance
            turtleLoc = travel(turtleLoc, distanceT, direction); //moves turtle given current turtle and direction and distance
            double distanceBetween = distance(turtleLoc[0], turtleLoc[1], turtleLoc[2], px, py, pz);
            if(distanceBetween < shortestDistance) shortestDistance = distanceBetween;
            String turnDirection = userInput.next();
            if(turnDirection.matches("E")) break;
            orientation = turn(orientation, turnDirection); // takes current orientation and turns L, R, U, D
            direction = orientation[0]; //function returns x, -x, y, -y, z, -z

        }
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println(df.format(shortestDistance));

    }

    public static double distance(double turtleX, double turtleY, double turtleZ, double planetX, double planetY, double planetZ){

        double horizontal = Math.sqrt(Math.pow(planetX - turtleX, 2) + Math.pow(planetY - turtleY, 2));
        double vertical = planetZ - turtleZ;
        double distance = Math.sqrt(Math.pow(horizontal, 2) + Math.pow(vertical, 2));
        return distance;

    }

    public static String[] turn(String[] orientation, String turnDir){

        String temp = "";
        if(turnDir.matches("L")){//shift orientation 1 to the right but eave up and down [4,5]
            temp = orientation[3];

            orientation[3] = orientation[2];
            orientation[2] = orientation[1];
            orientation[1] = orientation[0];
            orientation[0] = temp;

        }
        else if(turnDir.matches("R")){//shift orientation 1 to the left but leave up and down [4,5]
            temp = orientation[0];

            orientation[0] = orientation[1];
            orientation[1] = orientation[2];
            orientation[2] = orientation[3];
            orientation[3] = temp;
        }
        else if(turnDir.matches("U")){
            temp = orientation[0];
            orientation[0] = orientation[4];
            orientation[4] = orientation[2];
            orientation[2] = orientation[5];
            orientation[5] = temp;
        }
        else if(turnDir.matches("D")){
            temp = orientation[0];
            orientation[0] = orientation[5];
            orientation[5] = orientation[2];
            orientation[2] = orientation[4];
            orientation[4] = temp;
        }
        return orientation;

    }

    public static double[] travel(double[] turtleLoc, double travelDist, String direction){

        if(direction == "x+") turtleLoc[0] += travelDist;
        else if(direction == "x-") turtleLoc[0] -= travelDist;
        else if(direction == "y+") turtleLoc[1] += travelDist;
        else if(direction == "y-") turtleLoc[1] -= travelDist;
        else if(direction == "z+") turtleLoc[2] += travelDist;
        else if(direction == "z-") turtleLoc[2] -= travelDist;
        return turtleLoc;

    }

}