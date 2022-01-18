import java.util.*;
import java.io.*;

public class AngryProfessor {
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();
        
        for (int j=0; j<numberOfInputs; j++) {
        	int arraySize = scanner.nextInt();
	        int threshold = scanner.nextInt();
	        
	        int counter = 0;
	        int[] studentsTimingsArray = new int[arraySize];
	        for (int i=0; i<arraySize; i++) {
	        	studentsTimingsArray[i] = scanner.nextInt();
	        	if (studentsTimingsArray[i] <= 0) {
	        		counter++;
	        	}
	        }
	        String result = (counter >= threshold) ? "YES" : "NO";
	        System.out.println(result);
        }
	        
    }
}
