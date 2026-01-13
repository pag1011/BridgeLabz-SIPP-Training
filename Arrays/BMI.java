import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int number;
        
        System.out.println("Enter number of persons : ");
        number = sc.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number]; 

        for (int i = 0; i < number; i++) {
            System.out.println("Enter height (m) for person " + (i + 1) + " : ");
            double height = sc.nextDouble();

            System.out.println("Enter weight (kg) for person " + (i + 1) + " : ");
            double weight = sc.nextDouble();

            while (height <= 0 || weight <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                System.out.println("Enter height (m) for person " + (i + 1) + " : ");
                height = sc.nextDouble();
                System.out.println("Enter weight (kg) for person " + (i + 1) + " : ");
                weight = sc.nextDouble();
            }

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nHeight(m) | Weight(kg) | BMI | Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f     | %.2f     | %.2f | %s\n", personData[i][0], 
            		personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
