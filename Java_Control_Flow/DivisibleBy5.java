import java.util.Scanner;
public class DivisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		boolean isDivisible = false;
		
		if(number % 5 == 0) {
			isDivisible = true;
		}
		System.out.println("Is the number " + number + " divisible by 5 ? " + isDivisible);
	}

}
