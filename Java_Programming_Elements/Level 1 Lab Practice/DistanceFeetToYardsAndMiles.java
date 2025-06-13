import java.util.Scanner;
public class DistanceFeetToYardsAndMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double feet;
		
		System.out.print("Distance of yards in feets : ");
		feet = sc.nextDouble();
		
		double yards = feet / 3;
		double miles = yards / 1760;
		
		System.out.println("The distance in yards is " + yards + " and in miles is " + miles 
				+ " for the given distance in feet is " + feet);
	}

}
