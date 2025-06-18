import java.util.Scanner;
public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter the number : ");
		number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("The input number is positive.");
		}
		else if(number == 0) {
			System.out.println("The input number is zero.");
		}
		else {
			System.out.println("The input number is negative.");
		}
	}

}
