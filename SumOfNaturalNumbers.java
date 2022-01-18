import java.util.*;
import java.io.*;

public class SumOfNaturalNumbers {
	public static void main(String args[]) {
        // input
        Scanner scanner = new Scanner(System.in);
        long upto = scanner.nextInt();

        // output
        long sum = 0;
        for (int i=1; i<=upto; i++)
            sum = sum + i;
        System.out.println(sum);
    }
}
