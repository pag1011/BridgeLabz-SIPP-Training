import java.util.Scanner;
public class DoubleOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("Enter the value of a : ");
		a = sc.nextDouble();
		System.out.print("Enter the value of b : ");
		b = sc.nextDouble();
		System.out.print("Enter the value of c : ");
		c = sc.nextDouble();
		
		double result1 = a + b * c;
		double result2 = a * b + c;
		double result3 = c + a / b;
		double result4 = a % b + c;
		
		System.out.println("The result of Double Opterations are " + result1 + ", " + result2 + ", " 
				+ result3 + " and " + result4);
	}

}
