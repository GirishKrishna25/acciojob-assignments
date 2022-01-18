
import java.util.*;
import java.io.*;

public class CelsiusToFahrenheit {

	public static void main(String args[]) {
    	Scanner scanner = new Scanner(System.in);
    	int celsius = scanner.nextInt();
    	
    	int farenheit = (celsius * 9 / 5 + 32);
    	System.out.println(farenheit);
    }
	
}