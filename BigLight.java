
import java.util.*;
import java.io.*;

public class BigLight {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int gianHeight = scanner.nextInt();
        int suneoHeight = scanner.nextInt();
        int gianHeightIncrementRate = scanner.nextInt();
        int suneoHeightIncrementRate = scanner.nextInt();
        
        int count = 25;
        int limit = 25;
        // increment height of Gian
        int[] gianHeightArray = new int[limit];
        for (int i=0; i<count; i++) {
        	gianHeight = gianHeight + gianHeightIncrementRate;
        	gianHeightArray[i] = gianHeight;
        }
        // System.out.println(Arrays.toString(gianHeightArray));
        
        // increment height of Suneo
        int[] suneoHeightArray = new int[limit];
        for (int i=0; i<count; i++) {
        	suneoHeight = suneoHeight + suneoHeightIncrementRate;
        	suneoHeightArray[i] = suneoHeight;
        }
        // System.out.println(Arrays.toString(suneoHeightArray));
        
        //check heights equal or not
        int i;
        for (i=0; i<count; i++) { 
    		if (gianHeightArray[i] == suneoHeightArray[i]) {
    			System.out.println(true);
    			break;
        	}
    		else
    			continue;
        }
        if (i == gianHeightArray.length)
        	System.out.println(false);
    }
}