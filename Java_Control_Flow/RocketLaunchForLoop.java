import java.util.Scanner;
public class RocketLaunchForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter;
		
		System.out.print("Enter the countdown starting number : ");
		counter = sc.nextInt();
		
		for(int i = counter; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("Lift off!");
	}

}
