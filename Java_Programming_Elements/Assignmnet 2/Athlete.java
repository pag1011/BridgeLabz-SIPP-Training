import java.util.*;
public class Athlete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double side1 = sc.nextDouble();
		double side2 =sc.nextDouble();
		double side3 = sc.nextDouble();
		double perimeter = side1 + side2 + side3;
		double distance = 5000.0;
		double rounds = distance /perimeter ; 
		System.out.println(" The total number of round the athlete will run is " + String.format("%.2f", rounds) +" to complete 5km" );
		sc.close();
	}

}