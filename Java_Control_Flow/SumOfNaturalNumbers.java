import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter the number : ");
		n = sc.nextInt();
		
		if(n >= 1) {
			int sum = 0;
			sum = (n * (n + 1) / 2);
			System.out.println("The sum of " + n + " natural numbers is " + sum);
		} 
		else {
			System.out.println("The number " + n + " is not a natural number");
		}
	}

}
