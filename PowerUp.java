import java.util.*;
import java.io.*;

public class PowerUp {
	public static void main(String args[]) {
        // input
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();

        // output
        long total = (long)Math.pow(number, power);
        System.out.println(total);
    }
}
