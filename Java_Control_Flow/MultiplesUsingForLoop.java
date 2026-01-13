import java.util.Scanner;
public class MultiplesUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		if(number <= 0 || number >= 100) {
			System.out.println("Please enter a positive integer and less than 100.");
		} else {
			System.out.println("Multiples of " + number + " below 100 : ");
			for(int i = 100; i >= 1; i--) {
				if(i % number == 0) {
					System.out.println(i);
				}
			}
		}
	}

}
