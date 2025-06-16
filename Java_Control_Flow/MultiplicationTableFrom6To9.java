import java.util.Scanner;
public class MultiplicationTableFrom6To9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		
		for(int i = 6; i <= 9; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
	}

}
