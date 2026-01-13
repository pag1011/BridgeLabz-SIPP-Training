import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		if(number <= 0) {
			System.out.println("Please enter a positive integer.");
			return;
		}
		String[] results = new String[number + 1];
		for(int i = 0; i <= number; i++) {
			if(i % 3 == 0 && i % 5 == 0 && i != 0) {
				results[i] = "FizzBuzz";
			} else if (i % 3 == 0 && i !=  0) {
				results[i] = "Fizz";
			} else if (i % 5 == 0 && i != 0) {
				results[i] = "Buzz";
			} else {
				results[i] = String.valueOf(i);
			}
		}
		System.out.println("FizzBuzz Results : ");
		for(int i = 1; i<= number; i++) {
			System.out.println("Positions " + i + " = " + results[i]);
		}
	}

}
