import java.util.*;
import java.io.*;

public class WhichAngledTriangle {

    public static void main(String args[]) {
        // input
    	Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        
        // finding MAXIMUM side
        int maxSide1 = Math.max(side1, side2);
        int maxSide2 = Math.max(side2, side3);
        int maxSide = Math.max(maxSide1, maxSide2);
        
        // condition
        double lhs = 2 * Math.pow(maxSide, 2);
        double rhs = ((Math.pow(side1, 2)) + (Math.pow(side2, 2)) + (Math.pow(side3, 2)));
        if (lhs < rhs)
        	System.out.println(1);
        else if (lhs == rhs)
        	System.out.println(2);
        else
        	System.out.println(3);
    }

}

