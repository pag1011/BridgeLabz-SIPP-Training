import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double number1, number2;
		
		System.out.print("Enter number one : ");
		number1 = sc.nextDouble();
		
		System.out.print("Enter number second : ");
		number2 = sc.nextDouble();
		
		double addition = number1 + number2;
		double subtraction = number1 - number2;
		double multiplication = number1 * number2;
		double division = number1 / number2;
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
		+ number1 + " and " + number2 + " is " + addition + " , " + subtraction + " , " 
				+ multiplication + " , " + division);
	}

}
