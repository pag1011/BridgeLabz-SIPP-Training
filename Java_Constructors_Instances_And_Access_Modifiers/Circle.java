import java.util.Scanner;

class Circles {
	double radius;
	
	//Default Constructor
	Circles() {
		this(1.0);
	}
	
	//Parameterized Constructor
	Circles(double radius) {
		this.radius = radius;
	}
	
//	Method to calculate the area of the circle
//	double getArea() {
//		return Math.PI * radius * radius;
//	}
	
	//Method to display the details of the circle
	void display() {
		System.out.println("Radius : " + radius);
//		System.out.println("Area   : " + getArea());
	}
}

public class Circle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius;
		
		System.out.println("Enter the radius of the circle : ");
		radius = sc.nextDouble();
		
		//Create objects for class circle
		Circles c1 = new Circles();
		Circles c2 = new Circles(radius);
		System.out.println("Default Circle");
		c1.display();
		
		System.out.println("Custom Circle");
		c2.display();
	}

}
