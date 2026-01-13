import java.util.Scanner;
public class FactorialUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Enter the number : ");
		n = sc.nextInt();
		if(n < 0) {
			System.out.println("Please enter a positive integer.");
		} 
		else {
			long factorial = 1;
			for(int i = 1; i <= n; i++) {
				factorial *= i;
			}
			System.out.println("The factorial of " + n + " is : " + factorial);
		}
	}

}
