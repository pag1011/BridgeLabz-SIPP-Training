import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double base, height;
		
		System.out.print("Enter the base of triangle : ");
		base = sc.nextDouble();
		System.out.print("Enter the height of triangle : ");
		height = sc.nextDouble();
		
		double areaInInches = 0.5 * base * height;
		double areaInCms = areaInInches * 6.4516;
		
		System.out.println("The area in square inches is " + areaInInches 
				+ " and in square centimeters is " + areaInCms);
	}

}
