import java.util.Scanner;
public class NumberIdentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[5];
		System.out.print("Enter 5 numbers : ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("\nNumbers : ");
			numbers[i] = sc.nextInt();
		}
		System.out.println("Number Identification : ");
		for(int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			System.out.println("Number at index " + i + " ( " + num + " ) is : ");
			
			if(num > 0) {
				if(num % 2 == 0) {
					System.out.println("The number is positive and even.");
				} else {
					System.out.println("The number is positive and odd.");
				}
			} else if (num < 0) {
				System.out.println("Negative.");
			} else {
				System.out.println("Zero.");
			}
		}
		int first = numbers[0];
		int last = numbers[numbers.length - 1];
		
		System.out.println("Comparison between first and last element : ");
		if(first == last) {
			System.out.println("First and Last elements are equal.");
		} else if (first > last) {
			System.out.println("First element is greater than the last element.");
		} else {
			System.out.println("Last element is greater than the first element.");
		}
	}

}
