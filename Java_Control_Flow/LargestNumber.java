import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number1, number2, number3;
		
		System.out.print("Enter first number : ");
		number1 = sc.nextInt();
		System.out.print("Enter second number : ");
		number2 = sc.nextInt();
		System.out.print("Enter third number : ");
		number3 = sc.nextInt();
		boolean isFirstLargest = false;
		boolean isSecondLargest = false;
		boolean isThirdLargest = false;
		
		if(number1 > number2 && number1 > number3) {
			isFirstLargest = true;
		} else if(number2 > number1 && number2 > number3) {
			isSecondLargest = true;
		} else if(number3 > number1 && number3 > number2) {
			isThirdLargest = true;
		}
		System.out.println("Is the first number the largest ? " + isFirstLargest);
		System.out.println("Is the second number the largest ? " + isSecondLargest);
		System.out.println("Is the third number the largest ? " + isThirdLargest);
	}

}
