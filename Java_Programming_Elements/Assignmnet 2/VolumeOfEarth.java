import java.util.Scanner;
public class VolumeOfEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radiusKms = 6378;
		double volumeKms = (4/3) * Math.PI * Math.pow(radiusKms, 3);
		double milesKms = volumeKms / Math.pow(1.609, 3);  // 1 miles = 1.609 kms.
		
		System.out.println("The volume of earth in cubic kilometers is " + volumeKms +
				" and cubic miles is " + milesKms);
	}
}
