import java.util.Scanner;

public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double celsius = sc.nextDouble();
		System.out.println("Enter the temprature in Celcius : " + celsius);
		
		double fahrenheit = (celsius + 9/5) + 32;
		System.out.println("Temprature in Fahrenheit : " + fahrenheit);
	}
}