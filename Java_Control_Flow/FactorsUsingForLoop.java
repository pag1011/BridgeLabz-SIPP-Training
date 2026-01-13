import java.util.Scanner;
public class FactorsUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		if(number > 0) {
			System.out.println("Factors : ");
			for(int i = 1; i < number; i++) {
				if(number % i == 0) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Not a positive integer.");
		}
	}

}
