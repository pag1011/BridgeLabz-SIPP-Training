import java.util.Scanner;
public class RocketLaunchWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter;
		
		System.out.print("Enter the countdown starting number : ");
		counter = sc.nextInt();
		
		while(counter >= 1) {
			System.out.println(counter);
			counter--;
		}
		System.out.println("Lift off!");
	}
}
