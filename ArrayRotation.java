import java.util.*;
import java.io.*;

public class ArrayRotation {
	public static void main(String args[]) {
		// INPUT
		Scanner scanner1 = new Scanner(System.in);
		long arrayLength = scanner1.nextInt();
		int rotations = scanner1.nextInt();
		int numberOfQuieries = scanner1.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		long[] numbersArray = new long[(int) arrayLength];
		for (int i=0; i<arrayLength; i++)
			numbersArray[i] = scanner2.nextInt();
		
		long[] quieriesArray = new long[(int) numberOfQuieries];
		Scanner scanner3 = new Scanner(System.in);
		for (int i=0; i<numberOfQuieries; i++) {
			int quiery = scanner3.nextInt();
			quieriesArray[i] = quiery;			
		}		
		
		// OUTPUT
		// spliting the array
		long[] a = Arrays.copyOfRange(numbersArray, 0, (int) (arrayLength-rotations));
		long[] b = Arrays.copyOfRange(numbersArray, (int) (arrayLength-rotations), (int) arrayLength);

		// merging the array
		int aLength = a.length;
		int bLength = b.length;		
		int cLength = aLength + bLength;
		int[] c = new int[cLength];
		
		System.arraycopy(b, 0, c, 0, bLength);
		System.arraycopy(a, 0, c, bLength, aLength);
		
		// quieries
		for (int i=0; i<quieriesArray.length; i++)
			System.out.println(c[(int)quieriesArray[i]]);				
	}
}
