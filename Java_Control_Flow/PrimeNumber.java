import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		boolean isPrime = true;
		
		if(number <= 1) {
			isPrime = false;
		}
		else {
			for(int i = 2; i < number; i++) {
				if(number % 2 == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(number + " is a Prime Number.");
		} else {
			System.out.println(number + " is not a Prime Number.");
		}
	}

}
