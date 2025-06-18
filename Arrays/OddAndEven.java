import java.util.Scanner;
public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		if(number <= 0) {
			System.out.println("Please enter a positive number.");
			return;
		}
		int[] odd = new int[number / 2 + 1];
		int[] even = new int[number / 2 + 1];
		int oddIndex = 0;
		int evenIndex = 0;
		
		for(int i = 1; i <number; i++) {
			if(i % 2 == 0) {
				even[evenIndex++] = i;
			} else {
				odd[oddIndex++] = i;
			}
		}
		System.out.println("\nEven Numbers : ");
		for(int i = 0; i < evenIndex; i++) {
			System.out.println(even[i] + " ");
		}
		System.out.println("\nOdd Numbers : ");
		for(int i = 0; i < oddIndex; i++) {
			System.out.println(odd[i] + " ");
		}
	}

}
