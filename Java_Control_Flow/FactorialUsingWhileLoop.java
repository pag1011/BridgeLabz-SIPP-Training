import java.util.Scanner;
public class FactorialUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		
		if(n < 0) {
			System.out.println("Please enter a positive integer.");
		} 
		else {
			int i =1;
			long factorial = 1;
			while (i <= n) {
				factorial *= i;
				i++;
			}
			System.out.println("Factorial of " + n + " is " + factorial);
		} 
	}

}
