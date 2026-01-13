import java.util.Scanner;
public class FactorsUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		if(number > 0) {
			int counter = 1;
			System.out.println("Factors : ");
			while (counter < number) {
				if (number % counter == 0) {
					System.out.println(counter);
				}
				counter++;
			}
		}
		else {
			System.out.println("Not a positive number.");
		}
	}

}
