import java.util.Scanner;
public class SumUntilZeroOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		int sum = 0;
		
		while(true) {
			System.out.print("Enter a number : ");
			number = sc.nextInt();
			
			if(number <= 0) {
				break;
			}
			sum += number;
		}
		System.out.println("Sum = " + sum);	
	}
}
