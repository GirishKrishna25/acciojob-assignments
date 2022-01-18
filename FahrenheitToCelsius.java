
import java.util.*;
import java.io.*;

public class FahrenheitToCelsius {

	public static void main(String args[]) {
    	Scanner scanner = new Scanner(System.in);
    	float fahrenheit = scanner.nextFloat();
    	
    	int celsius = (int)((fahrenheit - 32) * 5 / 9);
    	System.out.println(celsius);
    }
	
}