import java.util.Scanner;
public class KilometersToMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double kms;
		
		System.out.print("Enter the distance in kms : ");
		kms = input.nextDouble();
		double miles = kms / 1.6;
		
		System.out.println("The total miles is " + miles + " mile for the given " + kms);
		
	}

}
