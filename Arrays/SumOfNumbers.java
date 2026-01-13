import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double number;
		
		double[] arr = new double[10];
		double total = 0.0;
		int index = 0;
		
		while (true) {
			System.out.print("Enter a number : ");
			number = sc.nextDouble();
			
			if(number <= 0) {
				break;
			}
			if(index == 10) {
				System.out.print("Array is completely full.");
				break;
			}
			arr[index] = number;
			index++;
		}
		System.out.println("Numbers entered : ");
		for (int i = 0; i < index; i++) {
			System.out.println(arr[i]);
			total += arr[i];
		}
		System.out.println("Total sum = " + total);
	}

}
