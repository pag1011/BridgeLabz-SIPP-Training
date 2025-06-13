import java.util.Scanner;
public class QuotientAndRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double number1, number2;
		
		System.out.print("Enter first number : ");
		number1 = sc.nextDouble();
		System.out.print("Enter second number : ");
		number2 = sc.nextDouble();
		
		double quotient = number1 / number2;
		double remainder = number1 % number2;
		
		System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder 
				+ " of two number " + number1 + " and " + number2);

	}

}
