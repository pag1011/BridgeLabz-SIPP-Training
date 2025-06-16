import java.util.Scanner;
public class SumUntilZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double number;
		double total = 0.0;
		
		while(true) {
			System.out.print("Enter a number : ");
			number = sc.nextDouble();
			if(number == 0.0) {
				break;
			}
			total += number;
		}
		System.out.println("Total sum = " + total);
	}

}
