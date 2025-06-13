import java.util.Scanner;
public class IntOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Enter the value of a : ");
		a = sc.nextInt();
		System.out.print("Enter the value of b : ");
		b = sc.nextInt();
		System.out.print("Enter the value of c : ");
		c = sc.nextInt();
		
		int result1 = a + b * c;
		int result2 = a * b + c;
		int result3 = c + a / b;
		int result4 = a % b + c;
		
		System.out.println("The result of Int Opterations are " + result1 + ", " + result2 + ", " 
				+ result3 + " and " + result4);
	}

}
