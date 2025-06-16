import java.util.Scanner;
public class GreatestFactorUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num;
		
		System.out.print("Enter a number : ");
		num = sc.nextInt();
		int greatestFactor = 1;
		int counter = num - 1;
		
		while(counter >= 1) {
			if(num % counter == 0) {
				greatestFactor = counter;
				break;
			}
			counter --;
		}
		System.out.println("Greatest Factor : " + greatestFactor);
	}

}
