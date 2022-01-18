import java.util.*;
import java.io.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int numberCopy = number;
		int numberInReverse = 0;
		
		while (numberCopy > 0) {
			int individualDigit = numberCopy % 10;
			numberCopy = numberCopy / 10;
			numberInReverse =  numberInReverse * 10 + individualDigit;
		}
		boolean result = (number == numberInReverse) ? true : false;
		System.out.println(result);
	}

}
