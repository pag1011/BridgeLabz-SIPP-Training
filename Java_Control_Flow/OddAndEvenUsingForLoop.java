import java.util.Scanner;
public class OddAndEvenUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		if(number <= 0) {
			System.out.println("Please enter avalid number.");
		} else {
			for(int i = 1; i <= number; i++) {
				if(i % 2 == 0) {
					System.out.println(i + " is an Even number.");
				}
				else {
					System.out.println(i + " is an Odd number.");
				}
			}
		}
	}

}
