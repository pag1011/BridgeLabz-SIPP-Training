
import java.util.Scanner;

class Circle {
	double radius;
	
	//Constructor
	Circle(double r) {
		this.radius = r;
	}
	
	//Method to calculate area
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	//Method to calculate circumference
	double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	//Method to display area and circumference
	void display() {
		System.out.println("Radius : " + radius);
		System.out.println("Area : " + getArea());
		System.out.println("Circumference : " + getCircumference());
	}
}


public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r;
		
		//Taking input for user
		System.out.println("Enter the radius of the circle : ");
		r = sc.nextDouble();
		
		//Create circle object for input user
		Circle circle = new Circle(r);
		
		//Display circle details
		circle.display();

	}

}
