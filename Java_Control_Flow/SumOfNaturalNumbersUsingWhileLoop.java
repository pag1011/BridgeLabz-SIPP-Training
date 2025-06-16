import java.util.Scanner;
public class SumOfNaturalNumbersUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Enter a natural number : ");
		n = sc.nextInt();
		
		if(n <= 0) {
			System.out.println("Please enter a valid natural number.");
		} else {
			int i = 1;
			int sumLoop = 0;
			while (i <= n) {
				sumLoop += i;
				i++;
			}
			int sum = (n * (n + 1) / 2);
			
			System.out.println("Sum using while loop : " + sumLoop);
            System.out.println("Sum using formula : " + sum);
            System.out.println("Do both match? " + (sumLoop == sum));
		}
	}
}
