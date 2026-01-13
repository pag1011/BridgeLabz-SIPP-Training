import java.util.Scanner;
public class MultiplesUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		if(number > 0 && number < 100) {
			int counter = number - 1;
            System.out.println("Multiples of " + number + " below 100:");
            while (counter > 1) {
                int multiple = number * counter;
                if (multiple < 100) {
                    System.out.println(multiple);
                }
                counter--;
            }
		}
		else {
			System.out.println("Invalid input. Please enter a positive number less than 100.");
		}
	}

}
