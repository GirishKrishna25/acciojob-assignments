import java.util.*;
import java.io.*;

public class AverageCalculator {

	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
        int subjects = scanner.nextInt();
        int totalMarks = 0;
        for (int i=0; i<subjects; i++) {
        	int subject = scanner.nextInt();
        	totalMarks = totalMarks + subject;
        }
        
        // output
        float average = totalMarks / subjects;
        System.out.println((int)Math.ceil(average));
	}

}
