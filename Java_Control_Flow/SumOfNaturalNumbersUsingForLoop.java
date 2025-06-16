import java.util.Scanner;
public class SumOfNaturalNumbersUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Enter a natural number : ");
		n = sc.nextInt();
		
		if(n <= 0) {
			System.out.println("Please enter a valid natural number");
		} else {
			int sumLoop = 0;
			for(int i = 1; i <= n; i++) {
				sumLoop += i;
			}
			int sum = (n * (n + 1) / 2);
			
			System.out.println("Sum using loop : " + sumLoop);
			System.out.println("Sum using formula : " + sum);
			
			if(sumLoop == sum) {
				System.out.println("Both results are matched and equal.");
			} else {
				System.out.println("Resuls do not match.");
			}
		}
	}

}
