import java.util.Scanner;
public class SquareSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double perimeter;
		
		System.out.print("Enter the perimeter of the square : ");
		perimeter = sc.nextDouble();
		
		double side = perimeter / 4;
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	}

}
