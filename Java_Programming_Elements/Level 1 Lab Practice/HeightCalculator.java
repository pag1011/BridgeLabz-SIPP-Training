import java.util.Scanner;
public class HeightCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double heightCms;
		
		System.out.print("Enter the height in cms : ");
		heightCms = sc.nextDouble();
		double totalInches = heightCms / 2.54;
		int heightFeet = (int)(totalInches / 12);
		double heightInches = totalInches % 12;
		
		System.out.println("Your Height in cm is " + heightCms + 
				" while in feet is " + heightFeet + " and inches is " + heightInches);
	}

}
