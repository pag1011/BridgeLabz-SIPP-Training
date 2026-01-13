import java.util.Scanner;
public class MeanHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[11];
		double sum = 0.0;
		
		System.out.print("Enter heights of 11 football players : ");
		for(int i = 0; i < heights.length; i++) {
			System.out.print("\nHeight of players " + (i + 1) + " : ");
			heights[i] = sc.nextDouble();
			sum += heights[i];
		}
		double mean = sum / 11;
		System.out.println("\nMean height of team = " + mean);
	}

}
