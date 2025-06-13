import java.util.Scanner;
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number1, number2;
		
		System.out.print("Enter first number : ");
		number1 = sc.nextInt();
		System.out.print("Enter second number : ");
		number2 = sc.nextInt();
		
		int swap = number1;
		number1 = number2;
		number2 = swap;
		
		System.out.println("The swap numbers are " + number1 + " and " + number2);
	}

}
