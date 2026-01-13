import java.util.Scanner;
public class GreatestFactorUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int greatestFactor = 1;
		
		for(int i = num - 1; i >= 1; i--) {
			if(num % i == 0) {
				greatestFactor = i;
				break;
			}
		}
		System.out.println("Greatest Farctor : " + greatestFactor);
	}

}
