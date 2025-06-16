import java.util.Scanner;
public class PowerUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base, power;
		
		System.out.print("Enter the base value : ");
		base = sc.nextInt();
		System.out.print("Enter the power value : ");
		power = sc.nextInt();
		
		int result = 1;
		int counter = 0;
		
		while (counter < power) {
			result *= base;
			counter++;
		}
		System.out.println(base + " raised to power " + power + " is : " + result);
	}
}
