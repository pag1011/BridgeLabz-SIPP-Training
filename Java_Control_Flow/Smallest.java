import java.util.Scanner;
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number1, number2, number3;
		
		System.out.print("Enter the first number : ");
		number1 = sc.nextInt();
		System.out.print("Enter the second number : ");
		number2 = sc.nextInt();
		System.out.print("Enter the third number : ");
		number3 = sc.nextInt();
		
		boolean isFirstSmallest = false;
		
		if(number1 < number2 && number1 < number3) {
			isFirstSmallest = true;
		}
		
		System.out.println("Is the first number the smallest? " + isFirstSmallest);
	}

}
