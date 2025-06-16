import java.util.*;
public class FizzBuzzUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num;
		
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		
		if(num <= 0) {
			System.out.print("Please enter a positive number.");
			return;
		}
		for(int i = 1;i <= num; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if ( i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if ( i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
			System.out.println(i);
		}

	}

}
}